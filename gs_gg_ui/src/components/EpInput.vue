<template>
    <div class="input-form-container" :class="sizeAdjustment">
        <div class="input-form-label" v-if="hasLabel">
            <span>{{label}}</span>
        </div>
        <div class="input-form">
            <input class="og-input-form" type="text">
        </div>   
    </div>
</template>
<script>
export default {
    //공통컴포넌트만 리스트형으로 받기
    props:['label','size'],
    data(){
        return{
            

        }
    },
    computed:{
        hasLabel(){
            return (this.label == null || this.label == '') ? false:true;
        },
        sizeAdjustment(){
            if(!this.hasLabel) return (this.size == null || this.size == '') ? "size-1":"size-"+(this.size);
            else return (this.size == null || this.size == '') ? "size-2":"size-"+(this.size);
        }

    }
}
</script>
<style>
.input-form-container{
    display: flex;
    overflow:none;
    justify-content: flex-start;
    align-items: center;
    height:25px;

}
.input-form-container.size-1{
    width:150px;
}
.input-form-container.size-2{
    width:300px;
}
.input-form-label{
    display: flex;
}
.input-form-label{
    width:100px;
}
.input-form{
    display:flex;
    border:none;
    background-color: lightgrey;
}
.og-input-form{
    border:none;
    background-color: lightgrey;
}
.og-input-form:focus{
    outline: none;
}

</style>