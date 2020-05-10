package typingsSlinky.semanticUiDimmer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl, keyof semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplActive extends js.Object {
  var active: js.UndefOr[String] = js.native
  var dimmable: js.UndefOr[String] = js.native
  var dimmed: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var hide: js.UndefOr[String] = js.native
  var pageDimmer: js.UndefOr[String] = js.native
  var show: js.UndefOr[String] = js.native
  var transition: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplActive {
  @scala.inline
  def apply(): PartialPickImplkeyofImplActive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplActive]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplActiveOps[Self <: PartialPickImplkeyofImplActive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withDimmable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimmable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmable")(js.undefined)
        ret
    }
    @scala.inline
    def withDimmed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimmed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimmed")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withPageDimmer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageDimmer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageDimmer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageDimmer")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withTransition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transition")(js.undefined)
        ret
    }
  }
  
}

