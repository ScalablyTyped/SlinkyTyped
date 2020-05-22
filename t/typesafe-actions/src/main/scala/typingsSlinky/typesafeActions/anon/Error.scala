package typingsSlinky.typesafeActions.anon

import typingsSlinky.typesafeActions.typeHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error[T /* <: TypeConstant */, E] extends js.Object {
  var error: E
  var `type`: T
}

object Error {
  @scala.inline
  def apply[T, E](error: E, `type`: T): Error[T, E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error[T, E]]
  }
}

