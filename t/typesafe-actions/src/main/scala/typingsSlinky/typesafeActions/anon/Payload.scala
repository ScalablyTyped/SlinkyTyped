package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload[T /* <: TypeConstant */, P, E] extends js.Object {
  var error: E
  var payload: P
  var `type`: T
}

object Payload {
  @scala.inline
  def apply[T, P, E](error: E, payload: P, `type`: T): Payload[T, P, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload[T, P, E]]
  }
}

