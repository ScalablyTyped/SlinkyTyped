package typingsSlinky.stripe.mod.accounts

import typingsSlinky.stripe.mod.IAddress
import typingsSlinky.stripe.mod.IAddressKana
import typingsSlinky.stripe.mod.IAddressKanji
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompanyShared extends js.Object {
  /**
    * The company’s primary address.
    */
  var address: js.UndefOr[IAddress] = js.native
  /**
    * The Kana variation of the company’s primary address (Japan only).
    */
  var address_kana: js.UndefOr[IAddressKana] = js.native
  /**
    * The Kanji variation of the company’s primary address (Japan only).
    */
  var address_kanji: js.UndefOr[IAddressKanji] = js.native
  /**
    * Whether the company’s directors have been provided. Set this Boolean
    * to true after creating all the company’s directors with the Persons API
    * for accounts with a relationship.director requirement. This value is
    * not automatically set to true after creating directors, so it needs to
    * be updated to indicate all directors have been provided.
    */
  var directors_provided: js.UndefOr[Boolean] = js.native
  /**
    * The company’s legal name.
    * This can be unset by updating the value to null and then saving.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The Kana variation of the company’s legal name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var name_kana: js.UndefOr[String] = js.native
  /**
    * The Kanji variation of the company’s legal name (Japan only).
    * This can be unset by updating the value to null and then saving.
    */
  var name_kanji: js.UndefOr[String] = js.native
  /**
    * Whether the company’s owners have been provided. Set this Boolean
    * to true after creating all the company’s owners with the Persons API
    * for accounts with a relationship.owner requirement.
    */
  var owners_provided: js.UndefOr[Boolean] = js.native
  /**
    * The company’s phone number (used for verification).
    * This can be unset by updating the value to null and then saving.
    */
  var phone: js.UndefOr[String] = js.native
  /**
    * The jurisdiction in which the tax_id is registered (Germany-based companies only).
    * This can be unset by updating the value to null and then saving.
    */
  var tax_id_registrar: js.UndefOr[String] = js.native
}

object ICompanyShared {
  @scala.inline
  def apply(): ICompanyShared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompanyShared]
  }
  @scala.inline
  implicit class ICompanySharedOps[Self <: ICompanyShared] (val x: Self) extends AnyVal {
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
    def withDirectors_provided(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directors_provided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectors_provided: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directors_provided")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withName_kana(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name_kana")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName_kana: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name_kana")(js.undefined)
        ret
    }
    @scala.inline
    def withName_kanji(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name_kanji")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName_kanji: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name_kanji")(js.undefined)
        ret
    }
    @scala.inline
    def withOwners_provided(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners_provided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwners_provided: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners_provided")(js.undefined)
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
    def withTax_id_registrar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id_registrar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTax_id_registrar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tax_id_registrar")(js.undefined)
        ret
    }
  }
  
}

