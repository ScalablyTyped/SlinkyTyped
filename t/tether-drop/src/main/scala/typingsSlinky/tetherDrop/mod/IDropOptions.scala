package typingsSlinky.tetherDrop.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import typingsSlinky.tether.mod.ITetherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropOptions extends js.Object {
  var beforeClose: js.UndefOr[js.Function2[/* event */ Event, /* drop */ Drop, Boolean]] = js.native
  var blurDelay: js.UndefOr[Double] = js.native
  var classes: js.UndefOr[String] = js.native
  var closeDelay: js.UndefOr[Double] = js.native
  var constrainToScrollParent: js.UndefOr[Boolean] = js.native
  var constrainToWindow: js.UndefOr[Boolean] = js.native
  var content: js.UndefOr[Element | String | (js.Function1[js.UndefOr[Drop], Element | String])] = js.native
  var focusDelay: js.UndefOr[Double] = js.native
  var hoverCloseDelay: js.UndefOr[Double] = js.native
  var hoverOpenDelay: js.UndefOr[Double] = js.native
  var openDelay: js.UndefOr[Double] = js.native
  var openOn: js.UndefOr[String] = js.native
  var position: js.UndefOr[String] = js.native
  var remove: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[Element] = js.native
  var tetherOptions: js.UndefOr[ITetherOptions] = js.native
}

object IDropOptions {
  @scala.inline
  def apply(): IDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropOptions]
  }
  @scala.inline
  implicit class IDropOptionsOps[Self <: IDropOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeClose(value: (/* event */ Event, /* drop */ Drop) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBeforeClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeClose")(js.undefined)
        ret
    }
    @scala.inline
    def withBlurDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlurDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blurDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainToScrollParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainToScrollParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainToScrollParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainToScrollParent")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainToWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainToWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainToWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainToWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withContentFunction1(value: js.UndefOr[Drop] => Element | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withContentElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: Element | String | (js.Function1[js.UndefOr[Drop], Element | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverCloseDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCloseDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverCloseDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverCloseDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverOpenDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverOpenDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverOpenDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverOpenDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openOn")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTetherOptions(value: ITetherOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tetherOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTetherOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tetherOptions")(js.undefined)
        ret
    }
  }
  
}

