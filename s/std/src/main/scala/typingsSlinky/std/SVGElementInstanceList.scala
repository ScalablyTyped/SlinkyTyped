package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGElementInstanceList extends js.Object {
  /** @deprecated */
  val length: Double = js.native
  /** @deprecated */
  def item(index: Double): org.scalajs.dom.raw.SVGElementInstance = js.native
}

object SVGElementInstanceList {
  @scala.inline
  def apply(item: Double => org.scalajs.dom.raw.SVGElementInstance, length: Double): SVGElementInstanceList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGElementInstanceList]
  }
  @scala.inline
  implicit class SVGElementInstanceListOps[Self <: org.scalajs.dom.raw.SVGElementInstanceList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: Double => org.scalajs.dom.raw.SVGElementInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

