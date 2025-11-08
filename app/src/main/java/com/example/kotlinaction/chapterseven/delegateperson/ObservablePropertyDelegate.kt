package com.example.kotlinaction.chapterseven.delegateperson

import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

class ObservablePropertyDelegate(
    var propValue: Int, val changeSupport: PropertyChangeSupport
) {
    operator fun getValue(p: PersonWithDelegate, prop: KProperty<*>): Int = propValue
    operator fun setValue(p: PersonWithDelegate, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}