package typingsSlinky.typesafeActions

import typingsSlinky.std.Exclude
import typingsSlinky.std.Record
import typingsSlinky.std.ReturnType
import typingsSlinky.typesafeActions.typeHelpersMod.Action
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandleActionHandlers[TRootAction /* <: Action[TypeConstant] */, TNextNotHandledAction /* <: Exclude[TPrevNotHandledAction, Action[TType] with ReturnType[TCreator]] */, TState, TPrevNotHandledAction /* <: Action[TypeConstant] */, TType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TPrevNotHandledAction['type'] */ js.Any */, TCreator /* <: js.Function1[/* repeated */ js.Any, TPrevNotHandledAction] */] extends js.Object {
  var handleAction: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/create-reducer.CreateReducerChainApi<TState, TNextNotHandledAction, TRootAction> */ js.Object = js.native
  var handlers: Record[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<TRootAction, TNextNotHandledAction>['type'] */ js.Any, 
    js.Function2[/* state */ TState, /* action */ TRootAction, TState]
  ] = js.native
}

object AnonHandleActionHandlers {
  @scala.inline
  def apply[TRootAction, TNextNotHandledAction, TState, TPrevNotHandledAction, TType, TCreator](
    handleAction: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/create-reducer.CreateReducerChainApi<TState, TNextNotHandledAction, TRootAction> */ js.Object,
    handlers: Record[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<TRootAction, TNextNotHandledAction>['type'] */ js.Any, 
      js.Function2[/* state */ TState, /* action */ TRootAction, TState]
    ]
  ): AnonHandleActionHandlers[TRootAction, TNextNotHandledAction, TState, TPrevNotHandledAction, TType, TCreator] = {
    val __obj = js.Dynamic.literal(handleAction = handleAction.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHandleActionHandlers[TRootAction, TNextNotHandledAction, TState, TPrevNotHandledAction, TType, TCreator]]
  }
  @scala.inline
  implicit class AnonHandleActionHandlersOps[Self[trootaction, tnextnothandledaction, tstate, tprevnothandledaction, ttype, tcreator] <: AnonHandleActionHandlers[trootaction, tnextnothandledaction, tstate, tprevnothandledaction, ttype, tcreator], TRootAction, TNextNotHandledAction, TState, TPrevNotHandledAction, TType, TCreator] (val x: Self[TRootAction, TNextNotHandledAction, TState, TPrevNotHandledAction, TType, TCreator]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRootAction, TNextNotHandledAction, TState, TPrevNotHandledAction, TType, TCreator] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRootAction, TNextNotHandledAction, TState, TPrevNotHandledAction, TType, TCreator]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TRootAction, TNextNotHandledAction, TState, TPrevNotHandledAction, TType, TCreator]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TRootAction, TNextNotHandledAction, TState, TPrevNotHandledAction, TType, TCreator]) with Other]
    @scala.inline
    def withHandleAction(
      value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/create-reducer.CreateReducerChainApi<TState, TNextNotHandledAction, TRootAction> */ js.Object
    ): Self[TRootAction, TNextNotHandledAction, TState, TPrevNotHandledAction, TType, TCreator] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandlers(
      value: Record[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Exclude<TRootAction, TNextNotHandledAction>['type'] */ js.Any, 
          js.Function2[/* state */ TState, /* action */ TRootAction, TState]
        ]
    ): Self[TRootAction, TNextNotHandledAction, TState, TPrevNotHandledAction, TType, TCreator] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

