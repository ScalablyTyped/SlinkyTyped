package typingsSlinky.typesafeActions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeHelpersMod {
  type ActionCreator[TType /* <: typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant */] = js.Function1[/* repeated */ js.Any, typingsSlinky.typesafeActions.typeHelpersMod.Action[TType]]
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
  type TypeConstant = java.lang.String
}
