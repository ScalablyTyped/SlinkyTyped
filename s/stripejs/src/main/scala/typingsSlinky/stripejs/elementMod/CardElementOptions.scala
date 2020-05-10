package typingsSlinky.stripejs.elementMod

import typingsSlinky.stripejs.stripejsStrings.default
import typingsSlinky.stripejs.stripejsStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardElementOptions extends BaseOptions {
  /**
    * Whether or not to hide the postal code
    * NOTE: If you are already collecting a full billing address or postal code elsewhere, set this to `true`
    * @default false
    */
  var hidePostalCode: js.UndefOr[Boolean] = js.native
  /**
    * Appearance of the icon in the Element
    */
  var iconStyle: js.UndefOr[solid | default] = js.native
  /**
    * A placeholder text
    * NOTE: This is only available for `cardNumber`, `cardExpiry` & `cardCvc` elements
    */
  var placeholder: js.UndefOr[String] = js.native
  /**
    * A pre-filled value
    * NOTE: Sensitive card information (card number, CVC, and expiration date) cannot be pre-filled
    * @see placeholder
    *
    * @example {postalCode: '94110'}
    */
  var value: js.UndefOr[js.Any] = js.native
}

object CardElementOptions {
  @scala.inline
  def apply(): CardElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardElementOptions]
  }
  @scala.inline
  implicit class CardElementOptionsOps[Self <: CardElementOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHidePostalCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withIconStyle(value: solid | default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

