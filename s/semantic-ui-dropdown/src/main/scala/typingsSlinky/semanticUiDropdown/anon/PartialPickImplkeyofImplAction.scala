package typingsSlinky.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplAction extends js.Object {
  var action: js.UndefOr[String] = js.native
  var alreadySetup: js.UndefOr[String] = js.native
  var labels: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var noTransition: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplAction {
  @scala.inline
  def apply(): PartialPickImplkeyofImplAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplAction]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplActionOps[Self <: PartialPickImplkeyofImplAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAlreadySetup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alreadySetup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlreadySetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alreadySetup")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withNoTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noTransition")(js.undefined)
        ret
    }
  }
  
}

