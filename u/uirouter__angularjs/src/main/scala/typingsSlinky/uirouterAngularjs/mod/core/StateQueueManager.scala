package typingsSlinky.uirouterAngularjs.mod.core

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uirouterCore.stateRegistryMod.StateRegistryListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.StateQueueManager")
@js.native
class StateQueueManager protected ()
  extends typingsSlinky.uirouterCore.mod.StateQueueManager {
  def this(
    router: typingsSlinky.uirouterCore.routerMod.UIRouter,
    states: StringDictionary[typingsSlinky.uirouterCore.stateObjectMod.StateObject],
    builder: typingsSlinky.uirouterCore.stateBuilderMod.StateBuilder,
    listeners: js.Array[StateRegistryListener]
  ) = this()
}

