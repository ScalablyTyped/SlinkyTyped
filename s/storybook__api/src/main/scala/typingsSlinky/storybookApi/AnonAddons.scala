package typingsSlinky.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddons extends js.Object {
  var selectedPanel: String = js.native
}

object AnonAddons {
  @scala.inline
  def apply(selectedPanel: String): AnonAddons = {
    val __obj = js.Dynamic.literal(selectedPanel = selectedPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddons]
  }
  @scala.inline
  implicit class AnonAddonsOps[Self <: AnonAddons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedPanel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedPanel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

