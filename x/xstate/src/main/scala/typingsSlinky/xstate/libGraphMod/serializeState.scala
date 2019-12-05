package typingsSlinky.xstate.libGraphMod

import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.xstateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/graph", "serializeState")
@js.native
object serializeState extends js.Object {
  def apply[TContext](state: State[TContext, EventObject]): String = js.native
}

