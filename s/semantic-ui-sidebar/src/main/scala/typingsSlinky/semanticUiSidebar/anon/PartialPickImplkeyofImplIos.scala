package typingsSlinky.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.RegExpSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplIos extends js.Object {
  var ios: js.UndefOr[js.RegExp] = js.native
  var mobile: js.UndefOr[js.RegExp] = js.native
}

object PartialPickImplkeyofImplIos {
  @scala.inline
  def apply(): PartialPickImplkeyofImplIos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplIos]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplIosOps[Self <: PartialPickImplkeyofImplIos] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIos(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: js.RegExp): Self = {
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

