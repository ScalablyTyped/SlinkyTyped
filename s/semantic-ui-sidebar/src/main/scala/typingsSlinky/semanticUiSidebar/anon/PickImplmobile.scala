package typingsSlinky.semanticUiSidebar.anon

import typingsSlinky.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings.MobileSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.DefaultTransitionSettings._Impl, 'mobile'> */
@js.native
trait PickImplmobile extends js.Object {
  var mobile: MobileSettings = js.native
}

object PickImplmobile {
  @scala.inline
  def apply(mobile: MobileSettings): PickImplmobile = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmobile]
  }
  @scala.inline
  implicit class PickImplmobileOps[Self <: PickImplmobile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMobile(value: MobileSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

