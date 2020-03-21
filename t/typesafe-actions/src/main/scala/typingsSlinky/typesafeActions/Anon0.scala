package typingsSlinky.typesafeActions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[T /* <: String */] extends js.Object {
  var `type`: T
}

object Anon0 {
  @scala.inline
  def apply[T /* <: String */](`type`: T): Anon0[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0[T]]
  }
}

