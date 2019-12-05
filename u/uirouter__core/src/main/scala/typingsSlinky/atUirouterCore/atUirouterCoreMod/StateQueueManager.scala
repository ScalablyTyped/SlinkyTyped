package typingsSlinky.atUirouterCore.atUirouterCoreMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atUirouterCore.libStateStateRegistryMod.StateRegistryListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "StateQueueManager")
@js.native
class StateQueueManager protected ()
  extends typingsSlinky.atUirouterCore.libStateMod.StateQueueManager {
  def this(
    router: typingsSlinky.atUirouterCore.libRouterMod.UIRouter,
    states: StringDictionary[typingsSlinky.atUirouterCore.libStateStateObjectMod.StateObject],
    builder: typingsSlinky.atUirouterCore.libStateStateBuilderMod.StateBuilder,
    listeners: js.Array[StateRegistryListener]
  ) = this()
}

