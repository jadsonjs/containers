<template>
  <div>
    
    <div class="calculator">
      <input type="text" class="display" v-model="displayValue" dir="rtl" disabled>
      <br>
      <input type="button" class = "button" name="one" value="1" v-on:click="concat(1)">
      <input type="button" class = "button" name="two" value="2" v-on:click="concat(2)">
      <input type="button" class = "button" name="three" value="3" v-on:click="concat(3)">
      <input type="button" class = "button" name="plus" value="+" v-on:click="sum()">
      <br>
      <input type="button" class = "button" name="four" value="4" v-on:click="concat(4)">
      <input type="button" class = "button" name="five" value="5" v-on:click="concat(5)">
      <input type="button" class = "button" name="six" value="6" v-on:click="concat(6)">
      <input type="button" class = "button" name="minus" value="-" v-on:click="sub()">
      <br>
      <input type="button" class = "button" name="seven" value="7" v-on:click="concat(7)">
      <input type="button" class = "button" name="eight" value="8" v-on:click="concat(8)">
      <input type="button" class = "button" name="nine" value="9" v-on:click="concat(9)"> 
      <input type="button" class = "button" name="times" value="*" v-on:click="mult()">
      <br>
      <input type="button" class = "button" id="clear" name="clear" value=" C " v-on:click="clear()">
      <input type="button" class = "button" name="zero" value="0" v-on:click="concat(0)">
      <input type="button" class = "button" name="doit" value=" = " v-on:click="equals()">
      <input type="button" class = "button" name="div" value="/" v-on:click="div()">
      <br>
    </div>

  </div>
</template>

<script>
export default {
  
  name: 'Calculator',
  
  computed:{
    api(){ return 'http://localhost:8081' },
  },

  data() {
    return {
        displayValue: '0',
        accumulator : 0,
        operation : '',
    }
  },

  methods: {
    
    concat(v){
      if(this.displayValue !== '0')
        this.displayValue = this.displayValue+''+v;
      else
        this.displayValue = ''+v;
    },

    clear(){
      this.displayValue = '0';
      this.accumulator = 0;
      this.operation = '';
    },

    sum(){
      this.operation = 'sum';
      if(this.accumulator === 0){
        this.accumulator = parseInt(this.displayValue)
        this.displayValue = '0';
      }else{
        this.axios.get(this.api+'/calculator/sum?a='+this.accumulator+'&b='+parseInt(this.displayValue))
        .then((response) => {
          this.accumulator = response.data;
          this.displayValue = '0';
        })
      }
    },

    sub(){
      this.operation = 'sub';
      if(this.accumulator === 0){
        this.accumulator = parseInt(this.displayValue)
        this.displayValue = '0';
      }else{
        this.axios.get(this.api+'/calculator/sub?a='+this.accumulator+'&b='+parseInt(this.displayValue))
        .then((response) => {
          this.accumulator = response.data;
          this.displayValue = '0';
        })
      }
    },

    mult(){
      this.operation = 'mult';
      if(this.accumulator === 0){
        this.accumulator = parseInt(this.displayValue)
        this.displayValue = '0';
      }else{
        this.axios.get(this.api+'/calculator/mult?a='+this.accumulator+'&b='+parseInt(this.displayValue))
        .then((response) => {
          this.accumulator = response.data;
          this.displayValue = '0';
        })
      }
    },


    div(){
      this.operation = 'div';
      if(this.accumulator === 0){
        this.accumulator = parseInt(this.displayValue)
        this.displayValue = '0';
      }else{
        this.axios.get(this.api+'/calculator/div?a='+this.accumulator+'&b='+parseInt(this.displayValue))
        .then((response) => {
          this.accumulator = response.data;
          this.displayValue = '0';
        })
      }
    },

    equals(){
      switch (this.operation) {
        case 'sum':
          this.axios.get(this.api+'/calculator/sum?a='+this.accumulator+'&b='+parseInt(this.displayValue))
          .then((response) => {
            this.summarize(response.data);
          })
          break;
        case 'sub':
          this.axios.get(this.api+'/calculator/sub?a='+this.accumulator+'&b='+parseInt(this.displayValue))
          .then((response) => {
            this.summarize(response.data);
          })
          break;
        case 'mult':
          this.axios.get(this.api+'/calculator/mult?a='+this.accumulator+'&b='+parseInt(this.displayValue))
          .then((response) => {
            this.summarize(response.data);
          })
          break;
        case 'div':
         this.axios.get(this.api+'/calculator/div?a='+this.accumulator+'&b='+parseInt(this.displayValue))
          .then((response) => {
            this.summarize(response.data);
          })
          break;
        default:
          this.summarize(this.accumulator);
          break;  
      }
      
    },

    summarize(data){
      this.accumulator = data;
      this.displayValue = ''+this.accumulator;
      this.accumulator = 0;
      this.operation = '';
    },

  },

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

.calculator{
  padding: 10px;
  border-radius: 1em;
  height: 380px;
  width: 300px;
  margin: auto;
  background-color: #a9bd7e;
  box-shadow: rgba(0, 0, 0, 0.19) 0px 10px 20px, rgba(0, 0, 0, 0.23) 0px 6px 6px;
}

.display {
  font-family: 'Orbitron', sans-serif;
  font-size : 24px;
  background-color: #f2f2f2;
  border: solid black 0.5px;
  color: black;
  border-radius: 5px;
  width: 90%;
  height: 50px;
}

.button {
  font-family: 'Orbitron', sans-serif;
  font-size : 24px;
  background-color: #dcdbe1;
  color: black;
  border: solid black 0.5px;
  margin: 5px;
  border-radius: 3px;
  width: 60px;
  height: 60px;
  outline: none;
}

.button:active {
  background: #e5e5e5;
  -webkit-box-shadow: inset 0px 0px 5px #c1c1c1;
  -moz-box-shadow: inset 0px 0px 5px #c1c1c1;
  box-shadow: inset 0px 0px 5px #c1c1c1;
}

</style>
