<template>
    <div>
        test component
    </div>
</template>
<script>
import commonUtils from "@/components/js/common-utils.js"
import apiCall from "@/components/js/mixins/api-call.js"
export default {
    mixins:[apiCall],
    mounted(){
        //공통함수js 예시
        commonUtils.checkLog("페이지 시작 테스트");
        //mixin 예시
        this.mixinSample("믹스인샘플");
    }

}
</script>
<style>
    
</style>