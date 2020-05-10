package typingsSlinky.vsoNodeApi.profileInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProfileContext extends js.Object {
  var cIData: StringDictionary[js.Any] = js.native
  var contactWithOffers: Boolean = js.native
  var countryName: String = js.native
  var displayName: String = js.native
  var emailAddress: String = js.native
  var hasAccount: Boolean = js.native
  var language: String = js.native
  var phoneNumber: String = js.native
}

object CreateProfileContext {
  @scala.inline
  def apply(
    cIData: StringDictionary[js.Any],
    contactWithOffers: Boolean,
    countryName: String,
    displayName: String,
    emailAddress: String,
    hasAccount: Boolean,
    language: String,
    phoneNumber: String
  ): CreateProfileContext = {
    val __obj = js.Dynamic.literal(cIData = cIData.asInstanceOf[js.Any], contactWithOffers = contactWithOffers.asInstanceOf[js.Any], countryName = countryName.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], hasAccount = hasAccount.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileContext]
  }
  @scala.inline
  implicit class CreateProfileContextOps[Self <: CreateProfileContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCIData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cIData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContactWithOffers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactWithOffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasAccount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

