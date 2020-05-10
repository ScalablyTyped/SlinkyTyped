package typingsSlinky.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsEmailOptions extends js.Object {
  /**
    * If `allow_display_name` is set to `true`, the validator will also match `Display Name <email-address>`.
    *
    * @default false
    */
  var allow_display_name: js.UndefOr[Boolean] = js.native
  /**
    * If `allow_ip_domain` is set to `true`, the validator will allow IP addresses in the host part.
    *
    * @default false
    */
  var allow_ip_domain: js.UndefOr[Boolean] = js.native
  /**
    * If `allow_utf8_local_part` is set to `false`, the validator will not allow any non-English UTF8 character in email address' local part.
    *
    * @default true
    */
  var allow_utf8_local_part: js.UndefOr[Boolean] = js.native
  /**
    * If `domain_specific_validation` is `true`, some additional validation will be enabled,
    * e.g. disallowing certain syntactically valid email addresses that are rejected by GMail.
    *
    * @default false
    */
  var domain_specific_validation: js.UndefOr[Boolean] = js.native
  /**
    * If `ignore_max_length` is set to `true`, the validator will not check for the standard max length of an email.
    *
    * @default false
    */
  var ignore_max_length: js.UndefOr[Boolean] = js.native
  /**
    * If `require_display_name` is set to `true`, the validator will reject strings without the format `Display Name <email-address>`.
    *
    * @default false
    */
  var require_display_name: js.UndefOr[Boolean] = js.native
  /**
    * If `require_tld` is set to `false`, e-mail addresses without having TLD in their domain will also be matched.
    *
    * @default true
    */
  var require_tld: js.UndefOr[Boolean] = js.native
}

object IsEmailOptions {
  @scala.inline
  def apply(): IsEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsEmailOptions]
  }
  @scala.inline
  implicit class IsEmailOptionsOps[Self <: IsEmailOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_display_name(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_display_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_display_name")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_ip_domain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_ip_domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_ip_domain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_ip_domain")(js.undefined)
        ret
    }
    @scala.inline
    def withAllow_utf8_local_part(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_utf8_local_part")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_utf8_local_part: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_utf8_local_part")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain_specific_validation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain_specific_validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain_specific_validation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain_specific_validation")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore_max_length(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_max_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore_max_length: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore_max_length")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire_display_name(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire_display_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_display_name")(js.undefined)
        ret
    }
    @scala.inline
    def withRequire_tld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_tld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequire_tld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("require_tld")(js.undefined)
        ret
    }
  }
  
}

