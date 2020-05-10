package typingsSlinky.selectorSet.selectorSetNextMod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectorSetIndex extends js.Object {
  var name: String = js.native
  def element(el: Element): js.Array[String] | Unit = js.native
  def selector(selector: String): String | Unit = js.native
}

object ISelectorSetIndex {
  @scala.inline
  def apply(element: Element => js.Array[String] | Unit, name: String, selector: String => String | Unit): ISelectorSetIndex = {
    val __obj = js.Dynamic.literal(element = js.Any.fromFunction1(element), name = name.asInstanceOf[js.Any], selector = js.Any.fromFunction1(selector))
    __obj.asInstanceOf[ISelectorSetIndex]
  }
  @scala.inline
  implicit class ISelectorSetIndexOps[Self <: ISelectorSetIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: Element => js.Array[String] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: String => String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

