package typingsSlinky.sift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalQuery[T /* <: SupportedTypes */] extends Query[T]

object InternalQuery {
  @scala.inline
  def apply[T](): InternalQuery[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalQuery[T]]
  }
}

