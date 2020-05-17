package typingsSlinky.sparkpost.mod

import typingsSlinky.sparkpost.anon.Emailrfc822
import typingsSlinky.sparkpost.anon.Templateid
import typingsSlinky.sparkpost.sparkpostStrings.Canceled
import typingsSlinky.sparkpost.sparkpostStrings.Generating
import typingsSlinky.sparkpost.sparkpostStrings.Success
import typingsSlinky.sparkpost.sparkpostStrings.submitted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transmission extends js.Object {
  /** Name of the campaign */
  var campaign_id: String = js.native
  /** Content that will be used to construct a message */
  var content: InlineContent | Templateid | Emailrfc822 = js.native
  /** Description of the transmission */
  var description: String = js.native
  /** ID of the transmission */
  var id: String = js.native
  /** Transmission level metadata containing key/value pairs */
  var metadata: js.Any = js.native
  /** Computed total number of failed messages */
  var num_failed_generation: Double = js.native
  /** Computed total number of messages generated */
  var num_generated: Double = js.native
  /** Number of recipients that failed input validation */
  var num_invalid_recipients: Double = js.native
  /** JSON object in which transmission options are defined */
  var options: TransmissionOptions = js.native
  var rcpt_list_chunk_size: Double = js.native
  var rcpt_list_total_chunks: Double = js.native
  /** State of the transmission */
  var state: submitted | Generating | Success | Canceled = js.native
  /** Key/value pairs that are provided to the substitution engine */
  var substitution_data: js.Any = js.native
}

object Transmission {
  @scala.inline
  def apply(
    campaign_id: String,
    content: InlineContent | Templateid | Emailrfc822,
    description: String,
    id: String,
    metadata: js.Any,
    num_failed_generation: Double,
    num_generated: Double,
    num_invalid_recipients: Double,
    options: TransmissionOptions,
    rcpt_list_chunk_size: Double,
    rcpt_list_total_chunks: Double,
    state: submitted | Generating | Success | Canceled,
    substitution_data: js.Any
  ): Transmission = {
    val __obj = js.Dynamic.literal(campaign_id = campaign_id.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], num_failed_generation = num_failed_generation.asInstanceOf[js.Any], num_generated = num_generated.asInstanceOf[js.Any], num_invalid_recipients = num_invalid_recipients.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rcpt_list_chunk_size = rcpt_list_chunk_size.asInstanceOf[js.Any], rcpt_list_total_chunks = rcpt_list_total_chunks.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], substitution_data = substitution_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transmission]
  }
  @scala.inline
  implicit class TransmissionOps[Self <: Transmission] (val x: Self) extends AnyVal {
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
    def withContent(value: InlineContent | Templateid | Emailrfc822): Self = {
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
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_failed_generation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_failed_generation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_generated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_generated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNum_invalid_recipients(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("num_invalid_recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: TransmissionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRcpt_list_chunk_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcpt_list_chunk_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRcpt_list_total_chunks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rcpt_list_total_chunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: submitted | Generating | Success | Canceled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubstitution_data(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution_data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

