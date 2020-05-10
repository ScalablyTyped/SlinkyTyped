package typingsSlinky.stripejs.elementMod

import typingsSlinky.stripejs.stripejsStrings.`light-outline`
import typingsSlinky.stripejs.stripejsStrings.buy
import typingsSlinky.stripejs.stripejsStrings.dark
import typingsSlinky.stripejs.stripejsStrings.default
import typingsSlinky.stripejs.stripejsStrings.donate
import typingsSlinky.stripejs.stripejsStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentRequestButtonStyle extends js.Object {
  /**
    * The height of the button
    * @example '25px'
    */
  var height: js.UndefOr[String] = js.native
  /**
    * The theme of the button that should be used
    * @default 'dark'
    */
  var theme: js.UndefOr[dark | light | `light-outline`] = js.native
  /**
    * The type of button that should be shown
    * @default 'default'
    */
  var `type`: js.UndefOr[default | donate | buy] = js.native
}

object PaymentRequestButtonStyle {
  @scala.inline
  def apply(): PaymentRequestButtonStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentRequestButtonStyle]
  }
  @scala.inline
  implicit class PaymentRequestButtonStyleOps[Self <: PaymentRequestButtonStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: dark | light | `light-outline`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: default | donate | buy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

