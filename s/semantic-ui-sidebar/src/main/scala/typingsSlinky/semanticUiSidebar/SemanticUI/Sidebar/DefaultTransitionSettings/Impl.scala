package typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  var computer: ComputerSettings = js.native
  var mobile: MobileSettings = js.native
}

object Impl {
  @scala.inline
  def apply(computer: ComputerSettings, mobile: MobileSettings): Impl = {
    val __obj = js.Dynamic.literal(computer = computer.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputer(value: ComputerSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile(value: MobileSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

