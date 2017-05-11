package com.we.smart.neuro.test;

import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

/**
 * Created by shange on 2017/5/11.
 * http://blog.csdn.net/ztf312/article/details/51087821
 */
public class TestAdder {

    public static void main(String[] args) {
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile("smart-neuro/src/main/java/com/we/smart/neuro/test/TestAdder.py");

        PyFunction func = (PyFunction) interpreter.get("adder", PyFunction.class);

        int a = 2010, b = 2;
        PyObject pyobj = func.__call__(new PyInteger(a), new PyInteger(b));
        System.out.println("anwser = " + pyobj.toString());
    }

}
