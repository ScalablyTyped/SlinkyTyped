package typingsSlinky.slideout.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.slideout.slideoutStrings.left
import typingsSlinky.slideout.slideoutStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to customize a new instance of Slideout.
  */
@js.native
trait Options extends js.Object {
  /**
    * The time (milliseconds) to open/close the slideout.
    * Default: 300.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The CSS effect to use when animating the opening and closing of the slideout.
    * Default: ease.
    */
  var fx: js.UndefOr[String] = js.native
  /**
    * The DOM element that contains your menu application (.slideout-menu).
    */
  var menu: HTMLElement = js.native
  /**
    *   Default: 256.
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * The DOM element that contains all your application content (.slideout-panel).
    */
  var panel: HTMLElement = js.native
  /**
    * The side to open the slideout.
    * Default: left.
    */
  var side: js.UndefOr[left | right] = js.native
  /**
    * The number of px needed for the menu can be opened completely, otherwise it closes.
    * Default: 70.
    */
  var tolerance: js.UndefOr[Double] = js.native
  /**
    * Set this option to false to disable Slideout touch events.
    * Default: true.
    */
  var touch: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(menu: HTMLElement, panel: HTMLElement): Options = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMenu(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanel(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withFx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fx")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
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
    def withSide(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("side")(js.undefined)
        ret
    }
    @scala.inline
    def withTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.undefined)
        ret
    }
  }
  
}

