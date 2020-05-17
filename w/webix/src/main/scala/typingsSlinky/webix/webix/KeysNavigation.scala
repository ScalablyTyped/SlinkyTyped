package typingsSlinky.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeysNavigation extends js.Object {
  def moveSelection(direction: String): Unit = js.native
}

object KeysNavigation {
  @scala.inline
  def apply(moveSelection: String => Unit): KeysNavigation = {
    val __obj = js.Dynamic.literal(moveSelection = js.Any.fromFunction1(moveSelection))
    __obj.asInstanceOf[KeysNavigation]
  }
  @scala.inline
  implicit class KeysNavigationOps[Self <: KeysNavigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMoveSelection(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveSelection")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

