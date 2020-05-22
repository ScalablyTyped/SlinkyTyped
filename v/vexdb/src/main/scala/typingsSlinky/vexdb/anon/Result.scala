package typingsSlinky.vexdb.anon

import typingsSlinky.vexdb.vexdbNumbers.`0`
import typingsSlinky.vexdb.vexdbNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result[T] extends js.Object {
  var result: js.Array[T]
  var size: Double
  var status: `0` | `1`
}

object Result {
  @scala.inline
  def apply[T](result: js.Array[T], size: Double, status: `0` | `1`): Result[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result[T]]
  }
}

