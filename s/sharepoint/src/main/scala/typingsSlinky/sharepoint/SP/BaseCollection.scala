package typingsSlinky.sharepoint.SP

import typingsSlinky.sharepoint.IEnumerable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BaseCollection")
@js.native
class BaseCollection[T] () extends IEnumerable[T] {
  def get_count(): Double = js.native
  def itemAtIndex(index: Double): T = js.native
}

