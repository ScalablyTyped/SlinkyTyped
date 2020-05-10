package typingsSlinky.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizeEmailOptions extends js.Object {
  /**
    * Transforms the local part (before the @ symbol) of all email addresses to lowercase.
    * Please note that this may violate RFC 5321, which gives providers the possibility
    * to treat the local part of email addresses in a case sensitive way
    * (although in practice most - yet not all - providers don't).
    * The domain part of the email address is always lowercased, as it's case insensitive per RFC 1035.
    *
    * @default true
    */
  var all_lowercase: js.UndefOr[Boolean] = js.native
  /**
    * Converts addresses with domain `@googlemail.com` to `@gmail.com`, as they're equivalent.
    *
    * @default true
    */
  var gmail_convert_googlemaildotcom: js.UndefOr[Boolean] = js.native
  /**
    * GMail addresses are known to be case-insensitive, so this switch allows lowercasing them even when `all_lowercase` is set to `false`.
    * Please note that when `all_lowercase` is `true`, GMail addresses are lowercased regardless of the value of this setting.
    *
    * @default true
    */
  var gmail_lowercase: js.UndefOr[Boolean] = js.native
  /**
    * Removes dots from the local part of the email address, as GMail ignores them
    * (e.g. `"john.doe"` and `"johndoe"` are considered equal).
    *
    * @default true
    */
  var gmail_remove_dots: js.UndefOr[Boolean] = js.native
  /**
    * Normalizes addresses by removing "sub-addresses", which is the part following a `"+"` sign
    * (e.g. `"foo+bar@gmail.com"` becomes `"foo@gmail.com"`).
    *
    * @default true
    */
  var gmail_remove_subaddress: js.UndefOr[Boolean] = js.native
  /**
    * iCloud addresses (including MobileMe) are known to be case-insensitive, so this switch allows lowercasing them even when `all_lowercase` is set to `false`.
    * Please note that when `all_lowercase` is `true`, iCloud addresses are lowercased regardless of the value of this setting.
    *
    * @default true
    */
  var icloud_lowercase: js.UndefOr[Boolean] = js.native
  /**
    * Normalizes addresses by removing "sub-addresses", which is the part following a `"+"` sign
    * (e.g. `"foo+bar@icloud.com"` becomes `"foo@icloud.com"`).
    *
    * @default true
    */
  var icloud_remove_subaddress: js.UndefOr[Boolean] = js.native
  /**
    * Outlook.com addresses (including Windows Live and Hotmail) are known to be case-insensitive, so this switch allows lowercasing them even when `all_lowercase` is set to `false`.
    * Please note that when `all_lowercase` is `true`, Outlook.com addresses are lowercased regardless of the value of this setting.
    *
    * @default true
    */
  var outlookdotcom_lowercase: js.UndefOr[Boolean] = js.native
  /**
    * Normalizes addresses by removing "sub-addresses", which is the part following a `"+"` sign
    * (e.g. `"foo+bar@outlook.com"` becomes `"foo@outlook.com"`).
    *
    * @default true
    */
  var outlookdotcom_remove_subaddress: js.UndefOr[Boolean] = js.native
  /**
    * Yahoo Mail addresses are known to be case-insensitive, so this switch allows lowercasing them even when `all_lowercase` is set to `false`.
    * Please note that when `all_lowercase` is `true`, Yahoo Mail addresses are lowercased regardless of the value of this setting.
    *
    * @default true
    */
  var yahoo_lowercase: js.UndefOr[Boolean] = js.native
  /**
    * Normalizes addresses by removing "sub-addresses", which is the part following a `"-"` sign
    * (e.g. `"foo-bar@yahoo.com"` becomes `"foo@yahoo.com"`).
    *
    * @default true
    */
  var yahoo_remove_subaddress: js.UndefOr[Boolean] = js.native
}

object NormalizeEmailOptions {
  @scala.inline
  def apply(): NormalizeEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizeEmailOptions]
  }
  @scala.inline
  implicit class NormalizeEmailOptionsOps[Self <: NormalizeEmailOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll_lowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all_lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll_lowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all_lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withGmail_convert_googlemaildotcom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_convert_googlemaildotcom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmail_convert_googlemaildotcom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_convert_googlemaildotcom")(js.undefined)
        ret
    }
    @scala.inline
    def withGmail_lowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmail_lowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withGmail_remove_dots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_remove_dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmail_remove_dots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_remove_dots")(js.undefined)
        ret
    }
    @scala.inline
    def withGmail_remove_subaddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_remove_subaddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmail_remove_subaddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_remove_subaddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIcloud_lowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icloud_lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcloud_lowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icloud_lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withIcloud_remove_subaddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icloud_remove_subaddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcloud_remove_subaddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icloud_remove_subaddress")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlookdotcom_lowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlookdotcom_lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlookdotcom_lowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlookdotcom_lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlookdotcom_remove_subaddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlookdotcom_remove_subaddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlookdotcom_remove_subaddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlookdotcom_remove_subaddress")(js.undefined)
        ret
    }
    @scala.inline
    def withYahoo_lowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yahoo_lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYahoo_lowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yahoo_lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withYahoo_remove_subaddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yahoo_remove_subaddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYahoo_remove_subaddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yahoo_remove_subaddress")(js.undefined)
        ret
    }
  }
  
}

