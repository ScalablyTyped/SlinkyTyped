package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.anon.ContextTContext
import typingsSlinky.xstate.stateNodeMod.StateNode
import typingsSlinky.xstate.xstateStrings.deep
import typingsSlinky.xstate.xstateStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryStateNode[TContext]
  extends StateNode[TContext, js.Any, EventObject, ContextTContext[TContext]] {
  
  @JSName("history")
  var history_HistoryStateNode: shallow | deep = js.native
  
  @JSName("target")
  var target_FHistoryStateNode: js.UndefOr[StateValue] = js.native
}
