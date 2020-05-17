package typingsSlinky.winrtUwp.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a component that is being revoked and renewed with a trusted component. */
@js.native
trait RevocationAndRenewalItem extends js.Object {
  /** Returns the header hash for the component being revoked. */
  var headerHash: String = js.native
  /** Returns the name for the component being revoked. */
  var name: String = js.native
  /** Returns the public key hash for the component. */
  var publicKeyHash: String = js.native
  /** Returns the reason for revocation of component. */
  var reasons: RevocationAndRenewalReasons = js.native
  /** Returns the GUID for the renewal object. */
  var renewalId: String = js.native
}

object RevocationAndRenewalItem {
  @scala.inline
  def apply(
    headerHash: String,
    name: String,
    publicKeyHash: String,
    reasons: RevocationAndRenewalReasons,
    renewalId: String
  ): RevocationAndRenewalItem = {
    val __obj = js.Dynamic.literal(headerHash = headerHash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicKeyHash = publicKeyHash.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], renewalId = renewalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevocationAndRenewalItem]
  }
  @scala.inline
  implicit class RevocationAndRenewalItemOps[Self <: RevocationAndRenewalItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaderHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicKeyHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicKeyHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReasons(value: RevocationAndRenewalReasons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenewalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renewalId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

