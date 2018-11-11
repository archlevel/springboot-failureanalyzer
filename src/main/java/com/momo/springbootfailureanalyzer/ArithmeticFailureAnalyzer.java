package com.momo.springbootfailureanalyzer;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

public class ArithmeticFailureAnalyzer extends AbstractFailureAnalyzer<ArithmeticException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, ArithmeticException cause) {
        return new FailureAnalysis(cause.getMessage(), "Check your logic.", cause);
    }
}
