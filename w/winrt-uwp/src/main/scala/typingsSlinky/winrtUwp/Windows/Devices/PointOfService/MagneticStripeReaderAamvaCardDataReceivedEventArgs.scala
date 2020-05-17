package typingsSlinky.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the American Association of Motor Vehicle Administrators (AAMVA) card data from the AamvaCardDataReceived event. */
@js.native
trait MagneticStripeReaderAamvaCardDataReceivedEventArgs extends js.Object {
  /** Gets the address from the swiped AAMVA card. */
  var address: String = js.native
  /** Gets the birth date from the swiped AAMVA card. */
  var birthDate: String = js.native
  /** Gets the city from the swiped AAMVA card. */
  var city: String = js.native
  /** Gets the class from the swiped AAMVA card. */
  var `class`: String = js.native
  /** Gets the endorsements from the swiped AAMVA card. */
  var endorsements: String = js.native
  /** Gets the expiration date from the swiped AAMVA card. */
  var expirationDate: String = js.native
  /** Gets the eye color from the swiped AAMVA card. */
  var eyeColor: String = js.native
  /** Gets the first name from the swiped AAMVA card. */
  var firstName: String = js.native
  /** Gets the gender from the swiped AAMVA card. */
  var gender: String = js.native
  /** Gets the hair color from the swiped AAMVA card. */
  var hairColor: String = js.native
  /** Gets the height from the swiped AAMVA card. */
  var height: String = js.native
  /** Gets the license number from the swiped AAMVA card. */
  var licenseNumber: String = js.native
  /** Gets the postal code from the swiped AAMVA card. */
  var postalCode: String = js.native
  /** Gets the additional data from the swiped AAMVA card. */
  var report: MagneticStripeReaderReport = js.native
  /** Gets the restrictions from the swiped AAMVA card. */
  var restrictions: String = js.native
  /** Gets the state from the swiped AAMVA card. */
  var state: String = js.native
  /** Gets the suffix from the swiped AAMVA card. */
  var suffix: String = js.native
  /** Gets the surname from the swiped card. */
  var surname: String = js.native
  /** Gets the weight from the swiped AAMVA card. */
  var weight: String = js.native
}

object MagneticStripeReaderAamvaCardDataReceivedEventArgs {
  @scala.inline
  def apply(
    address: String,
    birthDate: String,
    city: String,
    `class`: String,
    endorsements: String,
    expirationDate: String,
    eyeColor: String,
    firstName: String,
    gender: String,
    hairColor: String,
    height: String,
    licenseNumber: String,
    postalCode: String,
    report: MagneticStripeReaderReport,
    restrictions: String,
    state: String,
    suffix: String,
    surname: String,
    weight: String
  ): MagneticStripeReaderAamvaCardDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], birthDate = birthDate.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], endorsements = endorsements.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], eyeColor = eyeColor.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], hairColor = hairColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], licenseNumber = licenseNumber.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any], surname = surname.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderAamvaCardDataReceivedEventArgs]
  }
  @scala.inline
  implicit class MagneticStripeReaderAamvaCardDataReceivedEventArgsOps[Self <: MagneticStripeReaderAamvaCardDataReceivedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBirthDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndorsements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endorsements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpirationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEyeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eyeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHairColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hairColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLicenseNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("licenseNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostalCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReport(value: MagneticStripeReaderReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrictions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

