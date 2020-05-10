package typingsSlinky.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricingVoiceResource extends js.Object {
  var countries: CountryResource = js.native
  var numbers: NumberResource = js.native
}

object PricingVoiceResource {
  @scala.inline
  def apply(countries: CountryResource, numbers: NumberResource): PricingVoiceResource = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingVoiceResource]
  }
  @scala.inline
  implicit class PricingVoiceResourceOps[Self <: PricingVoiceResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountries(value: CountryResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumbers(value: NumberResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numbers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

