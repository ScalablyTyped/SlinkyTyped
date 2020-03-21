package typingsSlinky.typesafeActions

import typingsSlinky.typesafeActions.createActionMod.PayloadMetaAction
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayloadType[T /* <: TypeConstant */, P]
  extends PayloadMetaAction[T, P, js.Any] {
  var payload: P
  var `type`: T
}

object AnonPayloadType {
  @scala.inline
  def apply[T /* <: TypeConstant */, P](payload: P, `type`: T): AnonPayloadType[T, P] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayloadType[T, P]]
  }
}

