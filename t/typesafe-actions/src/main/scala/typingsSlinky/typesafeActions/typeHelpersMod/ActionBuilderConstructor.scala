package typingsSlinky.typesafeActions.typeHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typesafeActions.typeHelpersMod.PayloadMetaAC[TType, TPayload, TMeta]
  - typingsSlinky.typesafeActions.typeHelpersMod.PayloadAC[TType, TPayload]
  - typingsSlinky.typesafeActions.typeHelpersMod.EmptyAC[TType]
*/
trait ActionBuilderConstructor[TType /* <: TypeConstant */, TPayload /* <: js.Any */, TMeta /* <: js.Any */] extends js.Object

object ActionBuilderConstructor {
  @scala.inline
  implicit def apply[TType, TPayload, TMeta](value: EmptyAC[TType]): ActionBuilderConstructor[TType, TPayload, TMeta] = value.asInstanceOf[ActionBuilderConstructor[TType, TPayload, TMeta]]
  @scala.inline
  implicit def apply[TType, TPayload, TMeta](value: PayloadAC[TType, TPayload]): ActionBuilderConstructor[TType, TPayload, TMeta] = value.asInstanceOf[ActionBuilderConstructor[TType, TPayload, TMeta]]
  @scala.inline
  implicit def apply[TType, TPayload, TMeta](value: PayloadMetaAC[TType, TPayload, TMeta]): ActionBuilderConstructor[TType, TPayload, TMeta] = value.asInstanceOf[ActionBuilderConstructor[TType, TPayload, TMeta]]
}

