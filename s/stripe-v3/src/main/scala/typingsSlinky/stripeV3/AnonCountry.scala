package typingsSlinky.stripeV3

import typingsSlinky.stripeV3.stripeV3Strings.de
import typingsSlinky.stripeV3.stripeV3Strings.en
import typingsSlinky.stripeV3.stripeV3Strings.es
import typingsSlinky.stripeV3.stripeV3Strings.fr
import typingsSlinky.stripeV3.stripeV3Strings.it
import typingsSlinky.stripeV3.stripeV3Strings.nl
import typingsSlinky.stripeV3.stripeV3Strings.pl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCountry extends js.Object {
  var country: String = js.native
  var preferred_language: js.UndefOr[de | en | es | it | fr | nl | pl] = js.native
}

object AnonCountry {
  @scala.inline
  def apply(country: String): AnonCountry = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountry]
  }
  @scala.inline
  implicit class AnonCountryOps[Self <: AnonCountry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreferred_language(value: de | en | es | it | fr | nl | pl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreferred_language: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preferred_language")(js.undefined)
        ret
    }
  }
  
}

