package typingsSlinky.typesafeActions.createActionMod

import typingsSlinky.typesafeActions.anon.MetaPayload
import typingsSlinky.typesafeActions.anon.MetaType
import typingsSlinky.typesafeActions.anon.PayloadType
import typingsSlinky.typesafeActions.anon.TypeT
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typesafeActions.anon.MetaPayload[T, P, M]
  - typingsSlinky.typesafeActions.anon.PayloadType[T, P]
  - typingsSlinky.typesafeActions.anon.MetaType[T, M]
  - typingsSlinky.typesafeActions.anon.TypeT[T]
*/
trait PayloadMetaAction[T /* <: TypeConstant */, P, M] extends js.Object

object PayloadMetaAction {
  @scala.inline
  implicit def apply[T, P, M](value: MetaPayload[T, P, M]): PayloadMetaAction[T, P, M] = value.asInstanceOf[PayloadMetaAction[T, P, M]]
  @scala.inline
  implicit def apply[T, P, M](value: MetaType[T, M]): PayloadMetaAction[T, P, M] = value.asInstanceOf[PayloadMetaAction[T, P, M]]
  @scala.inline
  implicit def apply[T, P, M](value: PayloadType[T, P]): PayloadMetaAction[T, P, M] = value.asInstanceOf[PayloadMetaAction[T, P, M]]
  @scala.inline
  implicit def apply[T, P, M](value: TypeT[T]): PayloadMetaAction[T, P, M] = value.asInstanceOf[PayloadMetaAction[T, P, M]]
}

