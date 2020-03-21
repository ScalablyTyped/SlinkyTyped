package typingsSlinky.typesafeActions

import typingsSlinky.std.Record
import typingsSlinky.typesafeActions.typeHelpersMod.Action
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandlers[TRootAction /* <: Action[TypeConstant] */, TState] extends js.Object {
  var handlers: Record[
    /* import warning: importer.ImportType#apply Failed type conversion: TRootAction['type'] */ js.Any, 
    js.Function2[/* state */ TState, /* action */ TRootAction, TState]
  ]
}

object AnonHandlers {
  @scala.inline
  def apply[TRootAction /* <: Action[TypeConstant] */, TState](
    handlers: Record[
      /* import warning: importer.ImportType#apply Failed type conversion: TRootAction['type'] */ js.Any, 
      js.Function2[/* state */ TState, /* action */ TRootAction, TState]
    ]
  ): AnonHandlers[TRootAction, TState] = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHandlers[TRootAction, TState]]
  }
}

