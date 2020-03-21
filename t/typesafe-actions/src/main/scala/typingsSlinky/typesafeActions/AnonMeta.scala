package typingsSlinky.typesafeActions

import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMeta[T /* <: TypeConstant */, M, E] extends js.Object {
  var error: E
  var meta: M
  var `type`: T
}

object AnonMeta {
  @scala.inline
  def apply[T /* <: TypeConstant */, M, E](error: E, meta: M, `type`: T): AnonMeta[T, M, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMeta[T, M, E]]
  }
}

