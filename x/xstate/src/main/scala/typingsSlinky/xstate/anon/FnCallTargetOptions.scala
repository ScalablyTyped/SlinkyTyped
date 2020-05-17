package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.SendAction
import typingsSlinky.xstate.typesMod.SendActionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallTargetOptions extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any
  ): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](
    target: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<xstate.xstate/lib/types.SendActionOptions<TContext, TEvent>>['to'] */ js.Any,
    options: SendActionOptions[TContext, TEvent]
  ): SendAction[TContext, TEvent] = js.native
}

