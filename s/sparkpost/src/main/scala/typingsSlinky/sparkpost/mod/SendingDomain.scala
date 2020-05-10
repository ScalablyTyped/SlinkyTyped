package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendingDomain extends js.Object {
  /** JSON object in which DKIM key configuration is defined. */
  var dkim: js.UndefOr[DKIM] = js.native
  /** Size, in bits, of the DKIM private key to be generated. This option only applies if generate_dkim is ‘true’. */
  var dkim_key_length: js.UndefOr[Double] = js.native
  /** Name of the sending domain. */
  var domain: String = js.native
  /** Whether to generate a DKIM keypair on creation. */
  var generate_dkim: js.UndefOr[Boolean] = js.native
  /** Setting to true allows this domain to be used by subaccounts. Defaults to false, only available to domains belonging to a master account. */
  var shared_with_subaccounts: Boolean = js.native
  /** JSON object containing status details, including whether this domain’s ownership has been verified. */
  var status: Status = js.native
  /** Associated tracking domain. */
  var tracking_domain: String = js.native
}

object SendingDomain {
  @scala.inline
  def apply(domain: String, shared_with_subaccounts: Boolean, status: Status, tracking_domain: String): SendingDomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], shared_with_subaccounts = shared_with_subaccounts.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tracking_domain = tracking_domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendingDomain]
  }
  @scala.inline
  implicit class SendingDomainOps[Self <: SendingDomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShared_with_subaccounts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared_with_subaccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTracking_domain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking_domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDkim(value: DKIM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDkim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkim")(js.undefined)
        ret
    }
    @scala.inline
    def withDkim_key_length(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkim_key_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDkim_key_length: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkim_key_length")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerate_dkim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate_dkim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerate_dkim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generate_dkim")(js.undefined)
        ret
    }
  }
  
}

