package typingsSlinky.semanticUiSidebar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, keyof semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplFixed extends js.Object {
  var fixed: js.UndefOr[String] = js.native
  var omitted: js.UndefOr[String] = js.native
  var pusher: js.UndefOr[String] = js.native
  var sidebar: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplFixed {
  @scala.inline
  def apply(): PartialPickImplkeyofImplFixed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplFixed]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplFixedOps[Self <: PartialPickImplkeyofImplFixed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
    @scala.inline
    def withOmitted(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitted")(js.undefined)
        ret
    }
    @scala.inline
    def withPusher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pusher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPusher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pusher")(js.undefined)
        ret
    }
    @scala.inline
    def withSidebar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSidebar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sidebar")(js.undefined)
        ret
    }
  }
  
}

