package typingsSlinky.stripe.mod.accounts

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.stripe.AnonDay
import typingsSlinky.stripe.AnonDetails
import typingsSlinky.stripe.mod.IAddress
import typingsSlinky.stripe.mod.IAddressKana
import typingsSlinky.stripe.mod.IAddressKanji
import typingsSlinky.stripe.stripeStrings.female
import typingsSlinky.stripe.stripeStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIndividualShared extends js.Object {
  /**
    * The individual’s primary address.
    */
  var address: js.UndefOr[IAddress] = js.native
  /**
    * The Kana variation of the the individual’s primary address (Japan only).
    */
  var address_kana: js.UndefOr[IAddressKana] = js.native
  /**
    * The Kanji variation of the the individual’s primary address (Japan only).
    */
  var address_kanji: js.UndefOr[IAddressKanji] = js.native
  /**
    * The individual’s date of birth.
    */
  var dob: js.UndefOr[AnonDay] = js.native
  /**
    * The individual's email address.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The individual’s first name.
    * This can be unset by updating the value to null and then saving.
    */
  var first_name: js.UndefOr[String] = js.native
  /**
    * The Kana variation of the the individual’s first name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var first_name_kana: js.UndefOr[String] = js.native
  /**
    * The Kanji variation of the individual’s first name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var first_name_kanji: js.UndefOr[String] = js.native
  /**
    * The individual’s gender (International regulations require either “male” or “female”).
    * This can be unset by updating the value to null and then saving.
    */
  var gender: js.UndefOr[male | female] = js.native
  /**
    * The individual’s last name.
    * This can be unset by updating the value to null and then saving.
    */
  var last_name: js.UndefOr[String] = js.native
  /**
    * The Kana variation of the individual’s last name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var last_name_kana: js.UndefOr[String] = js.native
  /**
    * The Kanji variation of the individual’s last name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var last_name_kanji: js.UndefOr[String] = js.native
  /**
    * The individual’s maiden name.
    * This can be unset by updating the value to null and then saving.
    */
  var maiden_name: js.UndefOr[String] = js.native
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful
    * for storing additional information about the object in a structured format.
    * Individual keys can be unset by posting an empty value to them.
    * All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The individual’s phone number.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * The individual’s verification document information.
    */
  var verification: js.UndefOr[AnonDetails] = js.native
}

object IIndividualShared {
  @scala.inline
  def apply(): IIndividualShared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIndividualShared]
  }
  @scala.inline
  implicit class IIndividualSharedOps[Self <: IIndividualShared] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: IAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress_kana(value: IAddressKana): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_kana")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress_kana: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_kana")(js.undefined)
        ret
    }
    @scala.inline
    def withAddress_kanji(value: IAddressKanji): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_kanji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress_kanji: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address_kanji")(js.undefined)
        ret
    }
    @scala.inline
    def withDob(value: AnonDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dob")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst_name_kana(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name_kana")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst_name_kana: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name_kana")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst_name_kanji(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name_kanji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst_name_kanji: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name_kanji")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: male | female): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_name_kana(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name_kana")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_name_kana: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name_kana")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_name_kanji(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name_kanji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_name_kanji: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name_kanji")(js.undefined)
        ret
    }
    @scala.inline
    def withMaiden_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maiden_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaiden_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maiden_name")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withPhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone")(js.undefined)
        ret
    }
    @scala.inline
    def withVerification(value: AnonDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verification")(js.undefined)
        ret
    }
  }
  
}

