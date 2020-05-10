package typingsSlinky.stripe.mod.issuing.disputes

import typingsSlinky.stripe.AnonDisputeexplanation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIssuingDisputeEvidence extends js.Object {
  /**
    * Evidence to support a fraudulent dispute. This will only be present if your dispute’s reason is fraudulent.
    */
  var fraudulent: js.UndefOr[AnonDisputeexplanation] = js.native
  var other: js.UndefOr[AnonDisputeexplanation] = js.native
}

object IIssuingDisputeEvidence {
  @scala.inline
  def apply(): IIssuingDisputeEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIssuingDisputeEvidence]
  }
  @scala.inline
  implicit class IIssuingDisputeEvidenceOps[Self <: IIssuingDisputeEvidence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFraudulent(value: AnonDisputeexplanation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraudulent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFraudulent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fraudulent")(js.undefined)
        ret
    }
    @scala.inline
    def withOther(value: AnonDisputeexplanation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOther: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(js.undefined)
        ret
    }
  }
  
}

