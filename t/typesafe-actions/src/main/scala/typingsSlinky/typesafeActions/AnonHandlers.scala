package typingsSlinky.typesafeActions

import typingsSlinky.std.Record
import typingsSlinky.typesafeActions.typeHelpersMod.Action
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandlers[TRootAction /* <: Action[TypeConstant] */, TState] extends js.Object {
  var handlers: Record[
    /* import warning: importer.ImportType#apply Failed type conversion: TRootAction['type'] */ js.Any, 
    js.Function2[/* state */ TState, /* action */ TRootAction, TState]
  ] = js.native
}

object AnonHandlers {
  @scala.inline
  def apply[TRootAction, TState](
    handlers: Record[
      /* import warning: importer.ImportType#apply Failed type conversion: TRootAction['type'] */ js.Any, 
      js.Function2[/* state */ TState, /* action */ TRootAction, TState]
    ]
  ): AnonHandlers[TRootAction, TState] = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandlers[TRootAction, TState]]
  }
  @scala.inline
  implicit class AnonHandlersOps[Self[trootaction, tstate] <: AnonHandlers[trootaction, tstate], TRootAction, TState] (val x: Self[TRootAction, TState]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRootAction, TState] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRootAction, TState]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TRootAction, TState]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TRootAction, TState]) with Other]
    @scala.inline
    def withHandlers(
      value: Record[
          /* import warning: importer.ImportType#apply Failed type conversion: TRootAction['type'] */ js.Any, 
          js.Function2[/* state */ TState, /* action */ TRootAction, TState]
        ]
    ): Self[TRootAction, TState] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

