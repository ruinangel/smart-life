package com.we.smart.common.util;

import org.python.core.PyFunction;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by shange on 2017/5/12.
 */
public class JythonUtil {

    private static Logger logger = LoggerFactory.getLogger(JythonUtil.class);

    /**
     * java调用python方法
     *
     * @param fileName
     * @param methodName
     * @return
     */
    public static PyObject callPython(String fileName, String methodName) {
        logger.debug("call python, fileName={}, methodName={}.", fileName, methodName);
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.execfile(fileName);
        PyFunction func = (PyFunction) interpreter.get(methodName, PyFunction.class);
        PyObject pyobj = func.__call__();
        return pyobj;
    }
}
