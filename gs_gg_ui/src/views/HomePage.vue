<template lang="">
    <div class="header">
        <h1>GS.GG</h1>
    </div>
    <router-view v-slot="{Component}">
        <!-- 컴포넌트 캐싱 -->
        <!-- 캐싱하지 않는 경우 routerView만 사용해도 무방  -->
        <keep-alive>
            <component :is="Component" ></component>
        </keep-alive>
    </router-view>
    <div class="search">
        <EpInput></EpInput>
    </div>
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