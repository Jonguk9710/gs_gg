import { createRouter, createWebHistory } from "vue-router";
import HomePage from "@/views/HomePage.vue";
import menus from "./menu/menus";


const mainRoutes= [];
// loadRoutes(menus);


//https://developer.mozilla.org/ko/docs/Glossary/IIFE
(function loadRoutes(menus){
  for(let menu of menus){
    menu.component = () => import(`@/views/${menu.path}.vue`);
    mainRoutes.push(menu);
  }
})(menus);

const routes = [
  {
    path: "/",
    name: "/",
    component:HomePage,
    children:mainRoutes,// Hompage 주소 '/'를 고정값으로 가지고 있는다
  },

];


//로그인 확인 여부 : 네비게이션 가드 필요
const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;