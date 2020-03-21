package typingsSlinky.typesafeActions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeHelpersMod {
  type ActionBuilderConstructor[TType /* <: typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant */, TPayload /* <: js.Any */, TMeta /* <: js.Any */] = (typingsSlinky.typesafeActions.typeHelpersMod.PayloadMetaAC[TType, TPayload, TMeta]) | (typingsSlinky.typesafeActions.typeHelpersMod.PayloadAC[TType, TPayload]) | typingsSlinky.typesafeActions.typeHelpersMod.EmptyAC[TType]
  type ActionBuilderMap[TType /* <: typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant */, TActionProps /* <: js.Any */, TPayloadArg /* <: js.Any */, TMetaArg /* <: js.Any */] = (js.Function2[
    /* payload */ TPayloadArg, 
    /* meta */ TMetaArg, 
    typingsSlinky.typesafeActions.AnonTypeTType[TType] with TActionProps
  ]) | (js.Function1[
    /* payload */ TPayloadArg, 
    typingsSlinky.typesafeActions.AnonTypeTType[TType] with TActionProps
  ]) | (js.Function0[typingsSlinky.typesafeActions.AnonTypeTType[TType] with TActionProps])
  type ActionCreator[TType /* <: typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant */] = js.Function1[/* repeated */ js.Any, typingsSlinky.typesafeActions.typeHelpersMod.Action[TType]]
  type ActionType[TActionCreatorOrMap /* <: js.Any */] = js.Any | typingsSlinky.std.ReturnType[TActionCreatorOrMap]
  type EmptyAC[TType /* <: typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant */] = js.Function0[typingsSlinky.typesafeActions.typeHelpersMod.EmptyAction[TType]]
  type PayloadAC[TType /* <: typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant */, TPayload] = js.Function1[
    /* payload */ TPayload, 
    typingsSlinky.typesafeActions.typeHelpersMod.PayloadAction[TType, TPayload]
  ]
  type PayloadMetaAC[TType /* <: typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant */, TPayload, TMeta] = js.Function2[
    /* payload */ TPayload, 
    /* meta */ TMeta, 
    typingsSlinky.typesafeActions.typeHelpersMod.PayloadMetaAction[TType, TPayload, TMeta]
  ]
  type Reducer[TState, TAction /* <: typingsSlinky.typesafeActions.typeHelpersMod.Action[typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant] */] = js.Function2[/* state */ js.UndefOr[TState], /* action */ TAction, TState]
  type StateType[TReducerOrMap /* <: js.Any */] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TReducerOrMap ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias typesafe-actions.typesafe-actions/dist/type-helpers.StateType<TReducerOrMap[K]> * / object}
    */ typingsSlinky.typesafeActions.typesafeActionsStrings.StateType with js.Any) | typingsSlinky.std.ReturnType[TReducerOrMap]
  type TypeConstant = java.lang.String
}
