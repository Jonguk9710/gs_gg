<template lang="">
    <div>
        <TabButton :arrTabBtns="arrTabBtns"/>
    </div>
</template>
<script>
import TabButton from './TabButton.vue';
export default {
    props: {
        arrTabBtns: Array
    },
    components: {
        TabButton : TabButton
    }
}
</script>
<style lang="">
    
</style>