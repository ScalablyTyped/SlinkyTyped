package typingsSlinky.stripe

import typingsSlinky.stripe.stripeStrings.document_address_mismatch
import typingsSlinky.stripe.stripeStrings.document_dob_mismatch
import typingsSlinky.stripe.stripeStrings.document_duplicate_type
import typingsSlinky.stripe.stripeStrings.document_id_number_mismatch
import typingsSlinky.stripe.stripeStrings.document_name_mismatch
import typingsSlinky.stripe.stripeStrings.failed_keyed_identity
import typingsSlinky.stripe.stripeStrings.failed_other
import typingsSlinky.stripe.stripeStrings.pending
import typingsSlinky.stripe.stripeStrings.unverified
import typingsSlinky.stripe.stripeStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetails extends js.Object {
  /**
    * A user-displayable string describing the verification state for the person.
    * For example, this may say “Provided identity information could not be verified”.
    */
  var details: js.UndefOr[String] = js.native
  /**
    * One of document_address_mismatch, document_dob_mismatch, document_duplicate_type, document_id_number_mismatch,
    * document_name_mismatch, failed_keyed_identity, or failed_other.
    * A machine-readable code specifying the verification state for the person.
    */
  var details_code: js.UndefOr[
    document_address_mismatch | document_dob_mismatch | document_duplicate_type | document_id_number_mismatch | document_name_mismatch | failed_keyed_identity | failed_other
  ] = js.native
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: js.UndefOr[AnonBack] = js.native
  /**
    * The state of verification for the person. Possible values are unverified, pending, or verified.
    */
  var status: js.UndefOr[unverified | pending | verified] = js.native
}

object AnonDetails {
  @scala.inline
  def apply(): AnonDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDetails]
  }
  @scala.inline
  implicit class AnonDetailsOps[Self <: AnonDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails_code(
      value: document_address_mismatch | document_dob_mismatch | document_duplicate_type | document_id_number_mismatch | document_name_mismatch | failed_keyed_identity | failed_other
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details_code")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument(value: AnonBack): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: unverified | pending | verified): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

