<template lang="">
    <div>
        <div>
            <button class="tabBtn" v-for="btn in arrTabBtns" :key="btn">{{btn.tabName}}</button>
        </div>
    </div>
</template>
<script>
export default {
    props: {
        arrTabBtns: Array
    },
}
</script>

<style scoped>
    .tabBtn {
        width: 100px;
        height: 30px;
        background-color: #fff; /* 초기 배경 색상 */
        border: 1px solid #ccc; /* 테두리 스타일 및 색상 */
        cursor: pointer;
        transition: background-color 0.3s; /* 호버 시 배경 색상 전환을 */
    }
    .tabBtn:hover {
        background-color: #ccc;
    }
</style>