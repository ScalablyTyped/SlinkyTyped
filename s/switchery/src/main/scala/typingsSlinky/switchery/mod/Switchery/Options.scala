package typingsSlinky.switchery.mod.Switchery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * class name for the switch element (by default styled in switchery.css)
    * @default 'switchery'
    */
  var className: js.UndefOr[String] = js.native
  /**
    * color of the switch element (HEX or RGB value)
    * @default '#64bd63'
    */
  var color: js.UndefOr[String] = js.native
  /**
    * enable or disable click events and changing the state of the switch (boolean value)
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * opacity of the switch when it's disabled (0 to 1)
    * @default 0.5
    */
  var disabledOpacity: js.UndefOr[Double] = js.native
  /**
    * color of the jack/handle element
    * @default '#fff'
    */
  var jackColor: js.UndefOr[String] = js.native
  /**
    * color of unchecked jack/handle element
    * @default 'null'
  		 */
  var jackSecondaryColor: js.UndefOr[String] = js.native
  /**
    * secondary color for background color and border, when the switch is off
    * @default '#dfdfdf'
    */
  var secondaryColor: js.UndefOr[String] = js.native
  /**
    * size of the switch element (small or large)
    * @default 'default'
    */
  var size: js.UndefOr[String] = js.native
  /**
    * length of time that the transition will take, ex. '0.4s', '1s', '2.2s' (Note: transition speed of the handle is twice shorter)
    * @default '0.1s'
    */
  var speed: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
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
    def withDisabledOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withJackColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJackColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jackColor")(js.undefined)
        ret
    }
    @scala.inline
    def withJackSecondaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jackSecondaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJackSecondaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jackSecondaryColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
  }
  
}

