package typingsSlinky.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl, keyof semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplAnimating extends js.Object {
  var animating: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[String] = js.native
  var inward: js.UndefOr[String] = js.native
  var loading: js.UndefOr[String] = js.native
  var looping: js.UndefOr[String] = js.native
  var outward: js.UndefOr[String] = js.native
  var transition: js.UndefOr[String] = js.native
  var visible: js.UndefOr[String] = js.native
}

object PartialPickImplkeyofImplAnimating {
  @scala.inline
  def apply(): PartialPickImplkeyofImplAnimating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplAnimating]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplAnimatingOps[Self <: PartialPickImplkeyofImplAnimating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animating")(js.undefined)
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
    def withHidden(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withInward(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inward")(js.undefined)
        ret
    }
    @scala.inline
    def withLoading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loading")(js.undefined)
        ret
    }
    @scala.inline
    def withLooping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("looping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLooping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("looping")(js.undefined)
        ret
    }
    @scala.inline
    def withOutward(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outward")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutward: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outward")(js.undefined)
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
    @scala.inline
    def withVisible(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

