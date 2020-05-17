package typingsSlinky.typesafeActions

import typingsSlinky.typesafeActions.anon.Error
import typingsSlinky.typesafeActions.anon.HandleAction
import typingsSlinky.typesafeActions.anon.Meta
import typingsSlinky.typesafeActions.anon.MetaPayload
import typingsSlinky.typesafeActions.anon.MetaType
import typingsSlinky.typesafeActions.anon.Payload
import typingsSlinky.typesafeActions.anon.PayloadType
import typingsSlinky.typesafeActions.anon.Type
import typingsSlinky.typesafeActions.anon.TypeString
import typingsSlinky.typesafeActions.anon.TypeT
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
  def action[T /* <: TypeConstant */](`type`: T): TypeT[T] = js.native
  def action[T /* <: TypeConstant */, P](`type`: T, payload: P): PayloadType[T, P] = js.native
  def action[T /* <: TypeConstant */, M](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M): MetaType[T, M] = js.native
  def action[T /* <: TypeConstant */, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: js.UndefOr[scala.Nothing], error: E): Error[T, E] = js.native
  def action[T /* <: TypeConstant */, P, M](`type`: T, payload: P, meta: M): MetaPayload[T, P, M] = js.native
  def action[T /* <: TypeConstant */, P, E](`type`: T, payload: P, meta: js.UndefOr[scala.Nothing], error: E): Payload[T, P, E] = js.native
  def action[T /* <: TypeConstant */, M, E](`type`: T, payload: js.UndefOr[scala.Nothing], meta: M, error: E): Meta[T, M, E] = js.native
  def action[T /* <: TypeConstant */, P, M, E](`type`: T, payload: P, meta: M, error: E): Type[T, P, M, E] = js.native
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
  def createActionDeprecated[T /* <: TypeConstant */, AC /* <: js.Function0[TypeT[T]] */](actionType: T): AC = js.native
  def createActionDeprecated[T /* <: TypeConstant */, AC /* <: js.Function1[/* repeated */ js.Any, FSA[T, js.Object, js.Object, Boolean]] */](actionType: T, creatorFunction: AC): AC = js.native
  def createAsyncAction[TType1 /* <: TypeConstant */, TType2 /* <: TypeConstant */, TType3 /* <: TypeConstant */, TType4 /* <: TypeConstant */](requestType: TType1, successType: TType2, failureType: TType3): AsyncActionBuilder[TType1, TType2, TType3, TType4] = js.native
  def createAsyncAction[TType1 /* <: TypeConstant */, TType2 /* <: TypeConstant */, TType3 /* <: TypeConstant */, TType4 /* <: TypeConstant */](requestType: TType1, successType: TType2, failureType: TType3, cancelType: TType4): AsyncActionBuilder[TType1, TType2, TType3, TType4] = js.native
  def createCustomAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](`type`: T): AC = js.native
  def createCustomAction[T /* <: TypeConstant */, AC /* <: ActionCreator[T] */](`type`: T, createHandler: js.Function1[/* type */ T, AC]): AC = js.native
  def createReducer[TState, TRootAction /* <: Action[TypeConstant] */](initialState: TState): (Reducer[TState, TRootAction]) with (HandleAction[TState, TRootAction]) = js.native
  def createReducer[TState, TRootAction /* <: Action[TypeConstant] */](initialState: TState, initialHandlers: InitialHandler[TState, TRootAction]): (Reducer[TState, TRootAction]) with (HandleAction[TState, TRootAction]) = js.native
  def createStandardAction[T /* <: TypeConstant */](`type`: T): ActionBuilder[T] = js.native
  def getType[T /* <: TypeConstant */](actionCreator: ActionCreator[T] with TypeMeta[T]): T = js.native
  def isActionOf[AC /* <: typingsSlinky.typesafeActions.isActionOfMod.ActionCreator[TypeString] */](actionCreator: AC): js.Function1[/* action */ TypeString, /* is std.ReturnType<AC> */ Boolean] = js.native
  def isActionOf[AC /* <: typingsSlinky.typesafeActions.isActionOfMod.ActionCreator[TypeString] */](actionCreator: AC, action: TypeString): /* is std.ReturnType<AC> */ Boolean = js.native
  def isActionOf[AC /* <: typingsSlinky.typesafeActions.isActionOfMod.ActionCreator[TypeString] */](actionCreator: js.Array[AC]): js.Function1[/* action */ TypeString, /* is std.ReturnType<AC> */ Boolean] = js.native
  def isActionOf[AC /* <: typingsSlinky.typesafeActions.isActionOfMod.ActionCreator[TypeString] */](actionCreator: js.Array[AC], action: TypeString): /* is std.ReturnType<AC> */ Boolean = js.native
  def isOfType[T /* <: String */](`type`: T): js.Function1[/* action */ TypeString, Boolean] = js.native
  def isOfType[T /* <: String */](`type`: js.Array[T]): js.Function1[/* action */ TypeString, Boolean] = js.native
  def isOfType[T /* <: String */, A /* <: TypeString */](`type`: T, action: A): Boolean = js.native
  def isOfType[T /* <: String */, A /* <: TypeString */](`type`: js.Array[T], action: A): Boolean = js.native
}

