package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.createActionMod.PayloadMetaAction
import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PayloadType[T /* <: TypeConstant */, P]
  extends PayloadMetaAction[T, P, js.Any] {
  var payload: P
  var `type`: T
}

object PayloadType {
  @scala.inline
  def apply[T, P](payload: P, `type`: T): PayloadType[T, P] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadType[T, P]]
  }
}

