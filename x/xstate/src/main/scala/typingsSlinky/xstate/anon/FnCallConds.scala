package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.ChooseAction
import typingsSlinky.xstate.typesMod.ChooseConditon
import typingsSlinky.xstate.typesMod.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallConds extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseConditon[TContext, TEvent]]): ChooseAction[TContext, TEvent] = js.native
}

