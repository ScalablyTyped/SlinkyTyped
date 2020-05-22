package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGElementInstanceList extends js.Object {
  /** @deprecated */
  val length: Double
  /** @deprecated */
  def item(index: Double): org.scalajs.dom.raw.SVGElementInstance
}

object SVGElementInstanceList {
  @scala.inline
  def apply(item: Double => org.scalajs.dom.raw.SVGElementInstance, length: Double): SVGElementInstanceList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGElementInstanceList]
  }
}

