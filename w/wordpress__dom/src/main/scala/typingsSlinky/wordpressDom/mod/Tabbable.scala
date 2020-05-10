package typingsSlinky.wordpressDom.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.ParentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tabbable extends Focusable {
  /**
    * Returns `true` if the specified element is tabbable, or `false` otherwise.
    *
    * @param element - Element to test.
    */
  def isTabbableIndex(element: Element): Boolean = js.native
}

object Tabbable {
  @scala.inline
  def apply(find: ParentNode => js.Array[Element], isTabbableIndex: Element => Boolean): Tabbable = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), isTabbableIndex = js.Any.fromFunction1(isTabbableIndex))
    __obj.asInstanceOf[Tabbable]
  }
  @scala.inline
  implicit class TabbableOps[Self <: Tabbable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsTabbableIndex(value: Element => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTabbableIndex")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

