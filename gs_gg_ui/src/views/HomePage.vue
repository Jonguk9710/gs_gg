<template lang="">
    <!-- header 및 logo -->
    <div class="header">
        <h1 @click="goToMainPage">GS.GG</h1>
    </div>

    <!-- 메인 탭 버튼 -->
    <div class="tab-btn-grp">
        <TabButtons v-for="objBtn in arrTabBtns" :key="objBtn"
        :objBtn="objBtn" 
        @componentChg="componentChg($event)"/>
    </div>

    <!-- test 영역 테스트 후 삭제 예정-->
    <EpInput label='검색'></EpInput>
    <button @click="test">test button12</button>
    <button @click="test2">test button2</button> 
    <!--  -->

    <!-- 컴포넌트 캐싱 -->
    <!-- 캐싱하지 않는 경우 routerView만 사용해도 무방  -->
    <router-view v-slot="{Component}">
        <keep-alive>
            <component :is="Component" ></component>
        </keep-alive>
    </router-view>


</template>
<script>
//import
import axios from 'axios';
import TabButtons from '@/components/TabButtons.vue';
import apiCall from "@/components/js/mixins/api-call.js"

export default {
    mixins:[apiCall],

    //methods
    methods: {
        //헤더 GS.GG 클릭 시 Main 화면으로 이동
        goToMainPage() {
            this.$router.push({ path: '/'});
        },

        //메인 탭 클릭시 component change 이벤트
        componentChg(idNum){
            this.$router.push(this.arrTabBtns[idNum].pagePath);
        },

        //테스트 메서드
        test() {
            console.log('axios start');
            axios.get("/api")
                .then(res => console.log(res))
        },

        test2() {
            console.log('axios2 start');
            axios.get('/api/test')
                .then(res => console.log(res))
        }
    },

    //components
    components: {
        TabButtons: TabButtons  //메인 탭
    },

    //data
    data() {
        return {
            //메인 탭
            arrTabBtns: [
                {id: 0, tabName: "tab1", pagePath: '/'},
                {id: 1, tabName: "tab2"},
                {id: 2, tabName: "tab3"},
                {id: 3, tabName: "챔피언 소개", pagePath: '/characters'},
            ],
        }
    }
}
</script>

<style>
.header{
    height:100px;
    background: black;
    color:white;
    cursor: pointer;
}
.search{
    display:flex;
    justify-content: flex-end;
}    
.tab-btn-grp{
    display: flex;
    width: fit-content;
}
</style>