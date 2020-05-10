package typingsSlinky.stripejs.elementMod

import typingsSlinky.stripejs.stripejsStrings.auto
import typingsSlinky.stripejs.stripejsStrings.da
import typingsSlinky.stripejs.stripejsStrings.de
import typingsSlinky.stripejs.stripejsStrings.en
import typingsSlinky.stripejs.stripejsStrings.es
import typingsSlinky.stripejs.stripejsStrings.fi
import typingsSlinky.stripejs.stripejsStrings.fr
import typingsSlinky.stripejs.stripejsStrings.it
import typingsSlinky.stripejs.stripejsStrings.ja
import typingsSlinky.stripejs.stripejsStrings.nl
import typingsSlinky.stripejs.stripejsStrings.no
import typingsSlinky.stripejs.stripejsStrings.sv
import typingsSlinky.stripejs.stripejsStrings.zh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementCreatorOptions extends js.Object {
  /**
    * Fonts that should be used for styling the element
    * @see https://stripe.com/docs/stripe-js/reference#stripe-elements
    */
  var fonts: js.UndefOr[js.Array[FontCSSElement | FontConfigElement]] = js.native
  /**
    * The translation that should be used for the element text
    * `auto` defaults to the browser language
    *
    * @default 'auto'
    */
  var locale: js.UndefOr[auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String] = js.native
}

object ElementCreatorOptions {
  @scala.inline
  def apply(): ElementCreatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementCreatorOptions]
  }
  @scala.inline
  implicit class ElementCreatorOptionsOps[Self <: ElementCreatorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFonts(value: js.Array[FontCSSElement | FontConfigElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFonts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fonts")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: auto | da | de | en | es | fi | fr | it | ja | no | nl | sv | zh | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
  }
  
}

