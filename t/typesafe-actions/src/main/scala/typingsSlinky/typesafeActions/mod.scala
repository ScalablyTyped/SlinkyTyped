package typingsSlinky.typesafeActions

import typingsSlinky.typesafeActions.createActionDeprecatedMod.FSA
import typingsSlinky.typesafeActions.createActionMod.PayloadMetaAction
import typingsSlinky.typesafeActions.createAsyncActionMod.AsyncActionBuilder
import typingsSlinky.typesafeActions.createReducerMod.InitialHandler
import typingsSlinky.typesafeActions.createStandardActionMod.ActionBuilder
import typingsSlinky.typesafeActions.typeHelpersMod.Action
import typingsSlinky.typesafeActions.typeHelpersMod.ActionCreator
import typingsSlinky.typesafeActions.typeHelpersMod.Reducer
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import typingsSlinky.typesafeActions.typeHelpersMod.TypeMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def action[T /* <: TypeConstant */](`type`: T): AnonTypeT[T] = js.native
  def action[T /* <: TypeConstant */, P](`type`: T, payload: P): AnonPayloadType[T, P] = js.native
  def action[T /* <: TypeConstant */, M](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M): AnonMetaType[T, M] = js.native
  def action[T /* <: TypeConstant */, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: js.UndefOr[scala.Nothing], error: E): AnonError[T, E] = js.native
  def action[T /* <: TypeConstant */, P, M](`type`: T, payload: P, meta: M): AnonMetaPayload[T, P, M] = js.native
  def action[T /* <: TypeConstant */, P, E](`type`: T, payload: P, meta: js.UndefOr[scala.Nothing], error: E): AnonPayload[T, P, E] = js.native
  def action[T /* <: TypeConstant */, M, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M, error: E): AnonMeta[T, M, E] = js.native
  def action[T /* <: TypeConstant */, P, M, E](`type`: T, payload: P, meta: M, error: E): AnonType[T, P, M, E] = js.native
  def createAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](`type`: T): AC = js.native
  def createAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](
    `type`: T,
    createHandler: js.Function1[
      /* actionCallback */ js.Function2[
        /* payload */ js.UndefOr[scala.Nothing], 
        /* meta */ js.UndefOr[scala.Nothing], 
        PayloadMetaAction[T, js.UndefOr[scala.Nothing], js.UndefOr[scala.Nothing]]
      ], 
      AC
    ]
  ): AC = js.native
  def createActionDeprecated[T /* <: TypeConstant */, AC /* <: js.Function0[AnonTypeT[T]] */](actionType: T): AC = js.native
  def createActionDeprecated[T /* <: TypeConstant */, AC /* <: js.Function1[/* repeated */ js.Any, FSA[T, js.Object, js.Object, Boolean]] */](actionType: T, creatorFunction: AC): AC = js.native
  def createAsyncAction[TType1 /* <: TypeConstant */, TType2 /* <: TypeConstant */, TType3 /* <: TypeConstant */, TType4 /* <: TypeConstant */](requestType: TType1, successType: TType2, failureType: TType3): AsyncActionBuilder[TType1, TType2, TType3, TType4] = js.native
  def createAsyncAction[TType1 /* <: TypeConstant */, TType2 /* <: TypeConstant */, TType3 /* <: TypeConstant */, TType4 /* <: TypeConstant */](requestType: TType1, successType: TType2, failureType: TType3, cancelType: TType4): AsyncActionBuilder[TType1, TType2, TType3, TType4] = js.native
  def createCustomAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](`type`: T): AC = js.native
  def createCustomAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](`type`: T, createHandler: js.Function1[/* type */ T, AC]): AC = js.native
  def createReducer[TState, TRootAction /* <: Action[TypeConstant] */](initialState: TState): (Reducer[TState, TRootAction]) with (AnonHandleAction[TState, TRootAction]) = js.native
  def createReducer[TState, TRootAction /* <: Action[TypeConstant] */](initialState: TState, initialHandlers: InitialHandler[TState, TRootAction]): (Reducer[TState, TRootAction]) with (AnonHandleAction[TState, TRootAction]) = js.native
  def createStandardAction[T /* <: TypeConstant */](`type`: T): ActionBuilder[T] = js.native
  def getType[T /* <: TypeConstant */](actionCreator: ActionCreator[T] with TypeMeta[T]): T = js.native
  def isActionOf[AC /* <: typingsSlinky.typesafeActions.isActionOfMod.ActionCreator[AnonTypeString] */](actionCreator: AC): js.Function1[/* action */ AnonTypeString, /* is std.ReturnType<AC> */ Boolean] = js.native
  def isActionOf[AC /* <: typingsSlinky.typesafeActions.isActionOfMod.ActionCreator[AnonTypeString] */](actionCreator: AC, action: AnonTypeString): /* is std.ReturnType<AC> */ Boolean = js.native
  def isActionOf[AC /* <: typingsSlinky.typesafeActions.isActionOfMod.ActionCreator[AnonTypeString] */](actionCreator: js.Array[AC]): js.Function1[/* action */ AnonTypeString, /* is std.ReturnType<AC> */ Boolean] = js.native
  def isActionOf[AC /* <: typingsSlinky.typesafeActions.isActionOfMod.ActionCreator[AnonTypeString] */](actionCreator: js.Array[AC], action: AnonTypeString): /* is std.ReturnType<AC> */ Boolean = js.native
  def isOfType[T /* <: String */](`type`: T): js.Function1[/* action */ AnonTypeString, Boolean] = js.native
  def isOfType[T /* <: String */](`type`: js.Array[T]): js.Function1[/* action */ AnonTypeString, Boolean] = js.native
  def isOfType[T /* <: String */, A /* <: AnonTypeString */](`type`: T, action: A): Boolean = js.native
  def isOfType[T /* <: String */, A /* <: AnonTypeString */](`type`: js.Array[T], action: A): Boolean = js.native
}

