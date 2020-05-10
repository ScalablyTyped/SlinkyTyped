package typingsSlinky.virtualKeyboard.mod._Global_

import typingsSlinky.virtualKeyboard.mod.KeyboardOptions
import typingsSlinky.virtualKeyboard.mod.NavigateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def addNavigation(options: NavigateOptions): this.type = js.native
  def keyboard(options: KeyboardOptions): this.type = js.native
}

object JQuery {
  @scala.inline
  def apply(addNavigation: NavigateOptions => JQuery, keyboard: KeyboardOptions => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(addNavigation = js.Any.fromFunction1(addNavigation), keyboard = js.Any.fromFunction1(keyboard))
    __obj.asInstanceOf[JQuery]
  }
  @scala.inline
  implicit class JQueryOps[Self <: JQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddNavigation(value: NavigateOptions => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNavigation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyboard(value: KeyboardOptions => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

