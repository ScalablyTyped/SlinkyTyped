package typingsSlinky.typesafeActions

import typingsSlinky.std.Exclude
import typingsSlinky.std.Record
import typingsSlinky.std.ReturnType
import typingsSlinky.typesafeActions.typeHelpersMod.Action
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandleActionHandlers[TRootAction /* <: Action[TypeConstant] */, TNextNotHandledAction /* <: Exclude[TPrevNotHandledAction, Action[TType] with ReturnType[TCreator]] */, TState] extends js.Object {
  var handleAction: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/create-reducer.CreateReducerChainApi<TState, TNextNotHandledAction, TRootAction> */ js.Object
  var handlers: Record[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<TRootAction, TNextNotHandledAction>['type'] */ js.Any, 
    js.Function2[/* state */ TState, /* action */ TRootAction, TState]
  ]
}

object AnonHandleActionHandlers {
  @scala.inline
  def apply[TRootAction /* <: Action[TypeConstant] */, TNextNotHandledAction /* <: Exclude[TPrevNotHandledAction, Action[TType] with ReturnType[TCreator]] */, TState](
    handleAction: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/create-reducer.CreateReducerChainApi<TState, TNextNotHandledAction, TRootAction> */ js.Object,
    handlers: Record[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<TRootAction, TNextNotHandledAction>['type'] */ js.Any, 
      js.Function2[/* state */ TState, /* action */ TRootAction, TState]
    ]
  ): AnonHandleActionHandlers[TRootAction, TNextNotHandledAction, TState] = {
    val __obj = js.Dynamic.literal(handleAction = handleAction.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHandleActionHandlers[TRootAction, TNextNotHandledAction, TState]]
  }
}

