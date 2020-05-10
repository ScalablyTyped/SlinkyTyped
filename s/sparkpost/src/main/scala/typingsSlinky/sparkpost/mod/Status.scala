package typingsSlinky.sparkpost.mod

import typingsSlinky.sparkpost.sparkpostStrings.blocked
import typingsSlinky.sparkpost.sparkpostStrings.invalid
import typingsSlinky.sparkpost.sparkpostStrings.pending
import typingsSlinky.sparkpost.sparkpostStrings.unverified
import typingsSlinky.sparkpost.sparkpostStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends js.Object {
  /** Verification status of abuse@ mailbox */
  var abuse_at_status: valid | invalid | unverified | pending = js.native
  /** Verification status of CNAME configuration */
  var cname_status: valid | invalid | unverified | pending = js.native
  /** Compliance status */
  var compliance_status: valid | pending | blocked = js.native
  /** Verification status of DKIM configuration */
  var dkim_status: valid | invalid | unverified | pending = js.native
  /** Verification status of MX configuration */
  var mx_status: valid | invalid | unverified | pending = js.native
  /** Whether domain ownership has been verified */
  var ownership_verified: Boolean = js.native
  /** Verification status of postmaster@ mailbox */
  var postmaster_at_status: valid | invalid | unverified | pending = js.native
  /** Verification status of SPF configuration */
  var spf_status: valid | invalid | unverified | pending = js.native
}

object Status {
  @scala.inline
  def apply(
    abuse_at_status: valid | invalid | unverified | pending,
    cname_status: valid | invalid | unverified | pending,
    compliance_status: valid | pending | blocked,
    dkim_status: valid | invalid | unverified | pending,
    mx_status: valid | invalid | unverified | pending,
    ownership_verified: Boolean,
    postmaster_at_status: valid | invalid | unverified | pending,
    spf_status: valid | invalid | unverified | pending
  ): Status = {
    val __obj = js.Dynamic.literal(abuse_at_status = abuse_at_status.asInstanceOf[js.Any], cname_status = cname_status.asInstanceOf[js.Any], compliance_status = compliance_status.asInstanceOf[js.Any], dkim_status = dkim_status.asInstanceOf[js.Any], mx_status = mx_status.asInstanceOf[js.Any], ownership_verified = ownership_verified.asInstanceOf[js.Any], postmaster_at_status = postmaster_at_status.asInstanceOf[js.Any], spf_status = spf_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbuse_at_status(value: valid | invalid | unverified | pending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abuse_at_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCname_status(value: valid | invalid | unverified | pending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cname_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompliance_status(value: valid | pending | blocked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compliance_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDkim_status(value: valid | invalid | unverified | pending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkim_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMx_status(value: valid | invalid | unverified | pending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mx_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnership_verified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownership_verified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPostmaster_at_status(value: valid | invalid | unverified | pending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postmaster_at_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpf_status(value: valid | invalid | unverified | pending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spf_status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

