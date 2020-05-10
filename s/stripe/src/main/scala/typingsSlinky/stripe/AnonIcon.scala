package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIcon extends js.Object {
  /**
    * (ID of a file) An icon for the account. Must be square and at
    * least 128px x 128px.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * (ID of a file) A logo for the account that will be used in
    * Checkout instead of the icon and without the account’s name next to it
    * if provided. Must be at least 128px x 128px. This can be unset by
    * updating the value to null and then saving.
    */
  var logo: js.UndefOr[String] = js.native
  /**
    * A CSS hex color value representing the primary branding color for this account.
    */
  var primary_color: js.UndefOr[String] = js.native
}

object AnonIcon {
  @scala.inline
  def apply(): AnonIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIcon]
  }
  @scala.inline
  implicit class AnonIconOps[Self <: AnonIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withLogo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logo")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary_color: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary_color")(js.undefined)
        ret
    }
  }
  
}

