package typingsSlinky.uirouterCore.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.uirouterCore.stateRegistryMod.StateRegistryListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "StateQueueManager")
@js.native
class StateQueueManager protected ()
  extends typingsSlinky.uirouterCore.stateMod.StateQueueManager {
  def this(
    router: typingsSlinky.uirouterCore.routerMod.UIRouter,
    states: StringDictionary[typingsSlinky.uirouterCore.stateObjectMod.StateObject],
    builder: typingsSlinky.uirouterCore.stateBuilderMod.StateBuilder,
    listeners: js.Array[StateRegistryListener]
  ) = this()
}

