package org.pandaframework.ecs.system

import org.pandaframework.ecs.component.Component
import org.pandaframework.ecs.util.Bits
import kotlin.reflect.KClass

/**
 * @author Ranie Jade Ramiso
 */
interface Aspect {
    fun all(vararg components: KClass<out Component>)
    fun any(vararg components: KClass<out Component>)
    fun exclude(vararg components: KClass<out Component>)


    fun matcher(): Matcher

    interface Matcher {
        fun matches(composition: Bits): Boolean
    }
}
