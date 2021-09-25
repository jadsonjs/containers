<template>
  <div>
    
    <div class="calculator">
      <input type="text" class="display" v-model="value" dir="rtl" disabled>
      <br>
      <input type="button" class = "button" name="one" value="1" v-on:click="concat(1)">
      <input type="button" class = "button" name="two" value="2" v-on:click="concat(2)">
      <input type="button" class = "button" name="three" value="3" v-on:click="concat(3)">
      <input type="button" class = "button" name="plus" value="+" onclick="calc.input.value += '+'">
      <br>
      <input type="button" class = "button" name="four" value="4" onclick="calc.input.value += '4'">
      <input type="button" class = "button" name="five" value="5" onclick="calc.input.value += '5'">
      <input type="button" class = "button" name="six" value="6" onclick="calc.input.value += '6'">
      <input type="button" class = "button" name="minus" value="-" onclick="calc.input.value += '-'">
      <br>
      <input type="button" class = "button" name="seven" value="7" onclick="calc.input.value += '7'">
      <input type="button" class = "button" name="eight" value="8" onclick="calc.input.value += '8'">
      <input type="button" class = "button" name="nine" value="9" onclick="calc.input.value += '9'"> 
      <input type="button" class = "button" name="times" value="*" onclick="calc.input.value += '*'">
      <br>
      <input type="button" class = "button" id="clear" name="clear" value=" C " v-on:click="clear()">
      <input type="button" class = "button" name="zero" value="0" onclick="clac.input.value +='0'">
      <input type="button" class = "button" name="doit" value=" = " onclick="calc.input.value=eval(calc.input.value)">
      <input type="button" class = "button" name="div" value="/" onclick="calc.input.value += '/'">
      <br>
    </div>

  </div>
</template>

<script>
export default {
  name: 'Calculator',
  

  data() {
    return {
        value: '',
    }
  },

  methods: {
    concat(v){
      this.value = this.value+''+v;
    },

    clear(){
      this.value = '';
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
