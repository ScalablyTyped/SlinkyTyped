package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type[T /* <: TypeConstant */, P, M, E] extends js.Object {
  var error: E
  var meta: M
  var payload: P
  var `type`: T
}

object Type {
  @scala.inline
  def apply[T, P, M, E](error: E, meta: M, payload: P, `type`: T): Type[T, P, M, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[T, P, M, E]]
  }
}

