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
    <EpInput label='검색'></EpInput>
</template>
<script>

export default {

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