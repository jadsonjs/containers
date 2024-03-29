/*
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 *
 * pipeline-demo
 * br.com.jadson.pipelinedemo.controller
 * CalcController
 * 29/08/20
 */
package br.com.jadson.calculator.controllers;

import br.com.jadson.calculator.domain.ports.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller with calculator operations
 *
 * Jadson Santos - jadsonjs@gmail.com
 */
@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    /**
     * Sum of 2 numbers
     *
     * http://localhost:8081/calculator/sum?a=1&b=1
     *
     * @param a
     * @param b
     * @return
     */
    @GetMapping("/sum")
    public ResponseEntity<Integer> sum(
            @RequestParam(value = "a", required = true, defaultValue = "0") int a,
            @RequestParam( value = "b", required = true, defaultValue = "0") int b) {

        int sum = calculatorService.sum(a, b);

        return new ResponseEntity<>(sum, HttpStatus.OK);
    }


    /**
     * sub of 2 numbers
     *
     * http://localhost:8081/calculator/sub?a=1&b=1
     *
     * @param a
     * @param b
     * @return
     */
    @GetMapping("/sub")
    public ResponseEntity<Integer> sub(
            @RequestParam(value = "a", required = true, defaultValue = "0") int a,
            @RequestParam( value = "b", required = true, defaultValue = "0") int b) {

        int sub = calculatorService.sub(a, b);

        return new ResponseEntity<>(sub, HttpStatus.OK);
    }

    @GetMapping("/mult")
    public ResponseEntity<Integer> mult(
            @RequestParam(value = "a", required = true, defaultValue = "0") int a,
            @RequestParam( value = "b", required = true, defaultValue = "0") int b) {

        int mult = calculatorService.mult(a, b);

        return new ResponseEntity<>(mult, HttpStatus.OK);
    }

    @GetMapping("/div")
    public ResponseEntity<Integer> div(
            @RequestParam(value = "a", required = true, defaultValue = "0") int a,
            @RequestParam( value = "b", required = true, defaultValue = "0") int b) {

        int div = calculatorService.div(a, b);

        return new ResponseEntity<>(div, HttpStatus.OK);
    }

}
