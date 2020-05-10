package typingsSlinky.terminalMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminalMenuOptions extends js.Object {
  /**
    * Background color for the menu.
    * Default = 'blue'
    */
  var bg: js.UndefOr[String] = js.native
  /**
    * Foreground color for the menu.
    * Default = 'white'
    */
  var fg: js.UndefOr[String] = js.native
  /**
    * Padding for the bounding rectangle.
    * If a number is passed, all elements of the Thickness structure will be set to
    * that value.
    * Default = {
    *      left: 2,
    *      right: 2,
    *      top: 1,
    *      bottom: 1
    * }
    */
  var padding: js.UndefOr[Double | Thickness] = js.native
  /**
    * Index of the menu item to be selected.
    * Default = 0
    */
  var selected: js.UndefOr[Double] = js.native
  /**
    * Menu width in columns.
    * Default = 50.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * Horizontal offset for top-left corner.
    * Default = 1
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Vertical offset for top-left corner.
    * Default = 1
    */
  var y: js.UndefOr[Double] = js.native
}

object TerminalMenuOptions {
  @scala.inline
  def apply(): TerminalMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalMenuOptions]
  }
  @scala.inline
  implicit class TerminalMenuOptionsOps[Self <: TerminalMenuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bg")(js.undefined)
        ret
    }
    @scala.inline
    def withFg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fg")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double | Thickness): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
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

