package calculator;

import javafx.beans.property.*;

enum CalculatorType {Simple, Engineering}

enum Operator {Add, Minus, Multiple, Divide}

public abstract class CalculatorState {
    public static ObjectProperty<CalculatorType> calculatorType = new SimpleObjectProperty<>(CalculatorType.Simple);
    public static DoubleProperty value = new SimpleDoubleProperty(0.0);
    public static DoubleProperty PerValue = new SimpleDoubleProperty(0.0);
    public static ObjectProperty<Operator> operator = new SimpleObjectProperty<>();
    public static StringProperty history = new SimpleStringProperty("");
}
