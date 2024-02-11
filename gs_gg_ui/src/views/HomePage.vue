<template lang="">
    <div class="header">
        <h1>GS.GG</h1>
    </div>

    <!-- 컴포넌트 캐싱 -->
    <!-- 캐싱하지 않는 경우 routerView만 사용해도 무방  -->
    <router-view v-slot="{Component}">
        <keep-alive>
            <component :is="Component" ></component>
        </keep-alive>
    </router-view>

    <!-- 메인 탭 버튼 -->
    <div>
        <TabGrp :arrTabBtns="arrTabBtns"/>
    </div>

    <EpInput label='검색'></EpInput>
    <button @click="test">button12</button>

    <button @click="test2">button2</button> 
</template>
<script>
//import
import axios from 'axios';
import TabGrp from '@/components/TabGrp.vue';

export default {
    //methods
    methods: {
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
        TabGrp: TabGrp  //메인 탭
    },
    //data
    data() {
        return {
            arrTabBtns: [
                {id: 1, tabName: "tab1"},
                {id: 2, tabName: "tab2"},
                {id: 3, tabName: "tab3"},
                {id: 4, tabName: "tab4"},
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
}
.search{
    display:flex;
    justify-content: flex-end;
}    
</style>