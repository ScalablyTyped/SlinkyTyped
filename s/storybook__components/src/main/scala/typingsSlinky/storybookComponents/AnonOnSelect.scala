package typingsSlinky.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnSelect extends js.Object {
  def onSelect(id: String): Unit = js.native
}

object AnonOnSelect {
  @scala.inline
  def apply(onSelect: String => Unit): AnonOnSelect = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[AnonOnSelect]
  }
  @scala.inline
  implicit class AnonOnSelectOps[Self <: AnonOnSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSelect(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

