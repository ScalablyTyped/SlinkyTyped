package typingsSlinky.sparkpost.mod

import typingsSlinky.sparkpost.AnonTemplateidString
import typingsSlinky.sparkpost.sparkpostStrings.Canceled
import typingsSlinky.sparkpost.sparkpostStrings.Generating
import typingsSlinky.sparkpost.sparkpostStrings.Success
import typingsSlinky.sparkpost.sparkpostStrings.submitted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransmissionSummary extends js.Object {
  /** Name of the campaign */
  var campaign_id: String = js.native
  /** Content that will be used to construct a message */
  var content: AnonTemplateidString = js.native
  /** Description of the transmission */
  var description: String = js.native
  /** ID of the transmission */
  var id: String = js.native
  /** State of the transmission */
  var state: submitted | Generating | Success | Canceled = js.native
}

object TransmissionSummary {
  @scala.inline
  def apply(
    campaign_id: String,
    content: AnonTemplateidString,
    description: String,
    id: String,
    state: submitted | Generating | Success | Canceled
  ): TransmissionSummary = {
    val __obj = js.Dynamic.literal(campaign_id = campaign_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransmissionSummary]
  }
  @scala.inline
  implicit class TransmissionSummaryOps[Self <: TransmissionSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCampaign_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaign_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: AnonTemplateidString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: submitted | Generating | Success | Canceled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

