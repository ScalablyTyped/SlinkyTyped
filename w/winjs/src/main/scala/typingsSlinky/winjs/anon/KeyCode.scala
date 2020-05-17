package typingsSlinky.winjs.anon

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyCode extends js.Object {
  var keyCode: Double = js.native
  var nextFocusElement: HTMLElement = js.native
  var previousFocusElement: HTMLElement = js.native
}

object KeyCode {
  @scala.inline
  def apply(keyCode: Double, nextFocusElement: HTMLElement, previousFocusElement: HTMLElement): KeyCode = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any], nextFocusElement = nextFocusElement.asInstanceOf[js.Any], previousFocusElement = previousFocusElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCode]
  }
  @scala.inline
  implicit class KeyCodeOps[Self <: KeyCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextFocusElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextFocusElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousFocusElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousFocusElement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

