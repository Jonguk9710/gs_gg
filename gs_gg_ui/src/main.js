import { createApp, defineAsyncComponent } from 'vue'
import App from './App.vue'
import router from "@/js/router"

const app = createApp(App);
const COMMON_COMPONENTS=['EpInput']

function loadComponents(){

    for (let component of COMMON_COMPONENTS){
        app.component(
          component,
          //동적import
          defineAsyncComponent(() => import(`@/components/${component}.vue`))
        );
    }
}

loadComponents();
app.use(router);
app.mount('#app')

