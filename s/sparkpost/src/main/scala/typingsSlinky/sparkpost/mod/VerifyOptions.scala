package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyOptions extends js.Object {
  /**
    * A token retrieved from the verification link contained in the abuse@ verification email.
    *
    */
  var abuse_at_token: js.UndefOr[String] = js.native
  /**
    * Request an email with a verification link to be sent to the sending domain’s abuse@ mailbox.
    *
    */
  var abuse_at_verify: js.UndefOr[Boolean] = js.native
  /**
    * Request verification of CNAME record
    */
  var cname_verify: js.UndefOr[Boolean] = js.native
  /**
    * Request verification of DKIM record
    *
    */
  var dkim_verify: js.UndefOr[Boolean] = js.native
  /**
    * A token retrieved from the verification link contained in the postmaster@ verification email.
    *
    */
  var postmaster_at_token: js.UndefOr[String] = js.native
  /**
    * Request an email with a verification link to be sent to the sending domain’s postmaster@ mailbox.
    *
    */
  var postmaster_at_verify: js.UndefOr[Boolean] = js.native
  /**
    * Request verification of SPF record
    *
    * @deprecated
    */
  var spf_verify: js.UndefOr[Boolean] = js.native
}

object VerifyOptions {
  @scala.inline
  def apply(): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyOptions]
  }
  @scala.inline
  implicit class VerifyOptionsOps[Self <: VerifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbuse_at_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abuse_at_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbuse_at_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abuse_at_token")(js.undefined)
        ret
    }
    @scala.inline
    def withAbuse_at_verify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abuse_at_verify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbuse_at_verify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abuse_at_verify")(js.undefined)
        ret
    }
    @scala.inline
    def withCname_verify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cname_verify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCname_verify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cname_verify")(js.undefined)
        ret
    }
    @scala.inline
    def withDkim_verify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkim_verify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDkim_verify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkim_verify")(js.undefined)
        ret
    }
    @scala.inline
    def withPostmaster_at_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postmaster_at_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostmaster_at_token: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postmaster_at_token")(js.undefined)
        ret
    }
    @scala.inline
    def withPostmaster_at_verify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postmaster_at_verify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostmaster_at_verify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postmaster_at_verify")(js.undefined)
        ret
    }
    @scala.inline
    def withSpf_verify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spf_verify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpf_verify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spf_verify")(js.undefined)
        ret
    }
  }
  
}

