package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Meta[T /* <: TypeConstant */, M, E] extends js.Object {
  var error: E
  var meta: M
  var `type`: T
}

object Meta {
  @scala.inline
  def apply[T, M, E](error: E, meta: M, `type`: T): Meta[T, M, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta[T, M, E]]
  }
}

