package typingsSlinky.stripe.mod.accounts

import typingsSlinky.stripe.AnonDay
import typingsSlinky.stripe.AnonDirector
import typingsSlinky.stripe.mod.IAddress
import typingsSlinky.stripe.mod.IAddressKana
import typingsSlinky.stripe.mod.IAddressKanji
import typingsSlinky.stripe.stripeStrings.female
import typingsSlinky.stripe.stripeStrings.male
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonShared extends js.Object {
  /**
    * The account the person is associated with.
    */
  var account: js.UndefOr[String] = js.native
  /**
    * The person’s address.
    */
  var address: js.UndefOr[IAddress] = js.native
  /**
    * The Kana variation of the person’s address (Japan only).
    */
  var address_kana: js.UndefOr[IAddressKana] = js.native
  /**
    * The Kanji variation of the person’s address (Japan only).
    */
  var address_kanji: js.UndefOr[IAddressKanji] = js.native
  /**
    * The person’s date of birth.
    */
  var dob: js.UndefOr[AnonDay] = js.native
  /**
    * The person’s email address.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The person’s first name.
    */
  var first_name: js.UndefOr[String] = js.native
  /**
    * The Kana variation of the the person’s first name (Japan only).
    */
  var first_name_kana: js.UndefOr[String] = js.native
  /**
    * The Kanji variation of the person’s first name (Japan only).
    */
  var first_name_kanji: js.UndefOr[String] = js.native
  /**
    * The person’s gender (International regulations require either “male” or “female”).
    */
  var gender: js.UndefOr[male | female] = js.native
  /**
    * The person’s last name.
    */
  var last_name: js.UndefOr[String] = js.native
  /**
    * The Kana variation of the person’s last name (Japan only).
    */
  var last_name_kana: js.UndefOr[String] = js.native
  /**
    * The Kanji variation of the person’s last name (Japan only).
    */
  var last_name_kanji: js.UndefOr[String] = js.native
  /**
    * The person’s maiden name.
    */
  var maiden_name: js.UndefOr[String] = js.native
  /**
    * The person’s phone number.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * Describes the person’s relationship to the account.
    */
  var relationship: js.UndefOr[AnonDirector] = js.native
}

object IPersonShared {
  @scala.inline
  def apply(): IPersonShared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonShared]
  }
  @scala.inline
  implicit class IPersonSharedOps[Self <: IPersonShared] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account")(js.undefined)
        ret
    }
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
    def withRelationship(value: AnonDirector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationship: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationship")(js.undefined)
        ret
    }
  }
  
}

