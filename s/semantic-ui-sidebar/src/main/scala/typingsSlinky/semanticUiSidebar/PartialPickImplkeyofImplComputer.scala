package typingsSlinky.semanticUiSidebar

import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.ComputerSettings
import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplComputer extends js.Object {
  var computer: js.UndefOr[ComputerSettings] = js.native
  var mobile: js.UndefOr[MobileSettings] = js.native
}

object PartialPickImplkeyofImplComputer {
  @scala.inline
  def apply(): PartialPickImplkeyofImplComputer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplComputer]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplComputerOps[Self <: PartialPickImplkeyofImplComputer] (val x: Self) extends AnyVal {
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
    def withoutComputer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computer")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: MobileSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.undefined)
        ret
    }
  }
  
}

