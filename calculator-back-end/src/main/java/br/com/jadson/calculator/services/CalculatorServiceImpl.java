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
 * br.com.jadson.pipelinedemo.domain.ports
 * CalculateServiceImpl
 * 29/08/20
 */
package br.com.jadson.calculator.services;

import br.com.jadson.calculator.domain.model.Calculator;
import br.com.jadson.calculator.domain.ports.CalculatorService;

/**
 * Service Implementation
 *
 * Jadson Santos - jadsonjs@gmail.com
 */
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int sum(int a, int b) {
        return new Calculator().sum(a,b);
    }

    @Override
    public int sub(int a, int b) { return  new Calculator().sub(a,b); }

    @Override
    public int mult(int a, int b) {return  new Calculator().mult(a,b);}

    @Override
    public int div(int a, int b) {return  new Calculator().div(a,b);}

}
