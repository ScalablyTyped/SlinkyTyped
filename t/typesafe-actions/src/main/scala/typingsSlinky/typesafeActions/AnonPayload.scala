package typingsSlinky.typesafeActions

import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload[T /* <: TypeConstant */, P, E] extends js.Object {
  var error: E
  var payload: P
  var `type`: T
}

object AnonPayload {
  @scala.inline
  def apply[T /* <: TypeConstant */, P, E](error: E, payload: P, `type`: T): AnonPayload[T, P, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPayload[T, P, E]]
  }
}

