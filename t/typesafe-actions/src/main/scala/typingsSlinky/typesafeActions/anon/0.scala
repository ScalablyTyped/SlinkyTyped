package typingsSlinky.typesafeActions.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[T /* <: String */] extends js.Object {
  var `type`: T
}

object `0` {
  @scala.inline
  def apply[T](`type`: T): `0`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[T]]
  }
}

