package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XElement extends js.Object {
  def get_attributes(): js.Any = js.native
  def get_children(): js.Any = js.native
  def get_name(): String = js.native
  def set_attributes(value: js.Any): Unit = js.native
  def set_children(value: js.Any): Unit = js.native
  def set_name(value: String): Unit = js.native
}

object XElement {
  @scala.inline
  def apply(
    get_attributes: () => js.Any,
    get_children: () => js.Any,
    get_name: () => String,
    set_attributes: js.Any => Unit,
    set_children: js.Any => Unit,
    set_name: String => Unit
  ): XElement = {
    val __obj = js.Dynamic.literal(get_attributes = js.Any.fromFunction0(get_attributes), get_children = js.Any.fromFunction0(get_children), get_name = js.Any.fromFunction0(get_name), set_attributes = js.Any.fromFunction1(set_attributes), set_children = js.Any.fromFunction1(set_children), set_name = js.Any.fromFunction1(set_name))
    __obj.asInstanceOf[XElement]
  }
  @scala.inline
  implicit class XElementOps[Self <: XElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_attributes(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_attributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_children(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_children")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_name(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_name")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_attributes(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_attributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_children(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_name(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_name")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

