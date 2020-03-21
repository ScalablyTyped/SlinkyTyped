package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateNodeMod.StateNode
import typingsSlinky.xstate.xstateStrings.deep
import typingsSlinky.xstate.xstateStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryStateNode[TContext]
  extends StateNode[TContext, js.Any, EventObject, js.Any] {
  @JSName("history")
  var history_HistoryStateNode: shallow | deep = js.native
  @JSName("target")
  var target_FHistoryStateNode: js.UndefOr[StateValue] = js.native
}

