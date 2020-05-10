package typingsSlinky.terminalKit.terminalMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridMenuOptions extends js.Object {
  var exitOnUnexpectedKey: js.UndefOr[Boolean] = js.native
  var itemMaxWidth: js.UndefOr[Double] = js.native
  var keyBindings: js.UndefOr[StringDictionary[String]] = js.native
  var leftPadding: js.UndefOr[String] = js.native
  var rightPadding: js.UndefOr[String] = js.native
  var selectedLeftPadding: js.UndefOr[String] = js.native
  var selectedRightPadding: js.UndefOr[String] = js.native
  var selectedStyle: js.UndefOr[CTerminal] = js.native
  var style: js.UndefOr[CTerminal] = js.native
  var width: js.UndefOr[Double] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object GridMenuOptions {
  @scala.inline
  def apply(): GridMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridMenuOptions]
  }
  @scala.inline
  implicit class GridMenuOptionsOps[Self <: GridMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRightPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightPadding")(js.undefined)
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
    def withSelectedRightPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRightPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRightPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRightPadding")(js.undefined)
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
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

