package typingsSlinky.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleColumnMenuOptions extends js.Object {
  var cancelable: js.UndefOr[Boolean] = js.native
  var continueOnSubmit: js.UndefOr[Boolean] = js.native
  var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.native
  var extraLines: js.UndefOr[Double] = js.native
  var itemMaxWidth: js.UndefOr[Double] = js.native
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.native
  var leftPadding: js.UndefOr[String] = js.native
  var oneLineItem: js.UndefOr[Boolean] = js.native
  var selectedIndex: js.UndefOr[Double] = js.native
  var selectedLeftPadding: js.UndefOr[String] = js.native
  var selectedStyle: js.UndefOr[CTerminal] = js.native
  var style: js.UndefOr[CTerminal] = js.native
  var submittedLeftPadding: js.UndefOr[String] = js.native
  var submittedStyle: js.UndefOr[CTerminal] = js.native
  var y: js.UndefOr[Double] = js.native
}

object SingleColumnMenuOptions {
  @scala.inline
  def apply(): SingleColumnMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleColumnMenuOptions]
  }
  @scala.inline
  implicit class SingleColumnMenuOptionsOps[Self <: SingleColumnMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelable")(js.undefined)
        ret
    }
    @scala.inline
    def withContinueOnSubmit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueOnSubmit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueOnSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withExitOnUnexpectedKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnUnexpectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitOnUnexpectedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitOnUnexpectedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraLines")(js.undefined)
        ret
    }
    @scala.inline
    def withItemMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyBindings(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBindings")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withOneLineItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneLineItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneLineItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneLineItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedLeftPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedLeftPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedLeftPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedLeftPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmittedLeftPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedLeftPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmittedLeftPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedLeftPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmittedStyle(value: CTerminal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmittedStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

