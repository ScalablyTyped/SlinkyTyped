package typingsSlinky.typesafeActions.anon

import typingsSlinky.std.Exclude
import typingsSlinky.std.ReturnType
import typingsSlinky.typesafeActions.typeHelpersMod.Action
import typingsSlinky.typesafeActions.typeHelpersMod.Reducer
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleAction[TState, TRootAction /* <: Action[TypeConstant] */] extends js.Object {
  val handlers: js.Any = js.native
  def handleAction[TType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TRootAction['type'] */ js.Any */, TCreator /* <: js.Function1[/* repeated */ js.Any, TRootAction] */, TNextNotHandledAction /* <: Exclude[TRootAction, Action[TType] with ReturnType[TCreator]] */, TAction /* <: TRootAction */](
    singleOrMultipleCreatorsAndTypes: TCreator | TType,
    reducer: js.Function2[/* state */ TState, /* action */ TAction, TState]
  ): ((Reducer[TState, TRootAction]) with (HandleActionHandlers[TRootAction, TNextNotHandledAction, TState, TRootAction, TType, TCreator])) | ((Reducer[TState, TRootAction]) with (Handlers[TRootAction, TState])) = js.native
  def handleAction[TType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TRootAction['type'] */ js.Any */, TCreator /* <: js.Function1[/* repeated */ js.Any, TRootAction] */, TNextNotHandledAction /* <: Exclude[TRootAction, Action[TType] with ReturnType[TCreator]] */, TAction /* <: TRootAction */](
    singleOrMultipleCreatorsAndTypes: js.Array[TCreator | TType],
    reducer: js.Function2[/* state */ TState, /* action */ TAction, TState]
  ): ((Reducer[TState, TRootAction]) with (HandleActionHandlers[TRootAction, TNextNotHandledAction, TState, TRootAction, TType, TCreator])) | ((Reducer[TState, TRootAction]) with (Handlers[TRootAction, TState])) = js.native
}

