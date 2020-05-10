package typingsSlinky.simplemde.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusBarItem extends js.Object {
  var className: String = js.native
  def defaultValue(element: HTMLElement): Unit = js.native
  def onUpdate(element: HTMLElement): Unit = js.native
}

object StatusBarItem {
  @scala.inline
  def apply(className: String, defaultValue: HTMLElement => Unit, onUpdate: HTMLElement => Unit): StatusBarItem = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], defaultValue = js.Any.fromFunction1(defaultValue), onUpdate = js.Any.fromFunction1(onUpdate))
    __obj.asInstanceOf[StatusBarItem]
  }
  @scala.inline
  implicit class StatusBarItemOps[Self <: StatusBarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultValue(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnUpdate(value: HTMLElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

