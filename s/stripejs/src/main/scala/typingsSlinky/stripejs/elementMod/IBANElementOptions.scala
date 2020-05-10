package typingsSlinky.stripejs.elementMod

import typingsSlinky.stripejs.stripejsStrings.default
import typingsSlinky.stripejs.stripejsStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBANElementOptions extends BaseOptions {
  /**
    * Appearance of the icon in the Element
    */
  var iconStyle: js.UndefOr[solid | default] = js.native
  /**
    * Customize the country and format of the placeholder IBAN
    * @default 'DE"
    */
  var placeholderCountry: js.UndefOr[String] = js.native
  /**
    * Specify the list of countries or country-groups whose IBANs you want to allow
    */
  var supportedCountries: js.UndefOr[js.Array[String]] = js.native
}

object IBANElementOptions {
  @scala.inline
  def apply(): IBANElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBANElementOptions]
  }
  @scala.inline
  implicit class IBANElementOptionsOps[Self <: IBANElementOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPlaceholderCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedCountries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCountries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedCountries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCountries")(js.undefined)
        ret
    }
  }
  
}

