package org.pandaframework.ecs.support

import org.pandaframework.ecs.state.State

/**
 * @author Ranie Jade Ramiso
 */

sealed class TestState: State {
    object State1: TestState()
    object State2: TestState()
}
