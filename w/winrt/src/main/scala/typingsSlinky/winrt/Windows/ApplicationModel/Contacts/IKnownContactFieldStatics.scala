package typingsSlinky.winrt.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKnownContactFieldStatics extends js.Object {
  var email: String = js.native
  var instantMessage: String = js.native
  var location: String = js.native
  var phoneNumber: String = js.native
  def convertNameToType(name: String): ContactFieldType = js.native
  def convertTypeToName(`type`: ContactFieldType): String = js.native
}

object IKnownContactFieldStatics {
  @scala.inline
  def apply(
    convertNameToType: String => ContactFieldType,
    convertTypeToName: ContactFieldType => String,
    email: String,
    instantMessage: String,
    location: String,
    phoneNumber: String
  ): IKnownContactFieldStatics = {
    val __obj = js.Dynamic.literal(convertNameToType = js.Any.fromFunction1(convertNameToType), convertTypeToName = js.Any.fromFunction1(convertTypeToName), email = email.asInstanceOf[js.Any], instantMessage = instantMessage.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKnownContactFieldStatics]
  }
  @scala.inline
  implicit class IKnownContactFieldStaticsOps[Self <: IKnownContactFieldStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvertNameToType(value: String => ContactFieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertNameToType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConvertTypeToName(value: ContactFieldType => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertTypeToName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstantMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instantMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
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

