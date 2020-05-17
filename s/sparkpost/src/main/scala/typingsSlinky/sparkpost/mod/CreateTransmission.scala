package typingsSlinky.sparkpost.mod

import typingsSlinky.sparkpost.anon.Emailrfc822
import typingsSlinky.sparkpost.anon.Listid
import typingsSlinky.sparkpost.anon.Templateid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransmission extends js.Object {
  /**
    * Recipients to discreetly receive a carbon copy of the transmission
    *
    */
  var bcc: js.UndefOr[js.Array[Recipient]] = js.native
  /** Name of the campaign */
  var campaign_id: js.UndefOr[String] = js.native
  /**
    * Recipients to receive a carbon copy of the transmission
    *
    */
  var cc: js.UndefOr[js.Array[Recipient]] = js.native
  /** Content that will be used to construct a message */
  var content: InlineContent | Templateid | Emailrfc822 = js.native
  /** Description of the transmission */
  var description: js.UndefOr[String] = js.native
  /** Transmission level metadata containing key/value pairs */
  var metadata: js.UndefOr[js.Any] = js.native
  /** JSON object in which transmission options are defined */
  var options: js.UndefOr[TransmissionOptions] = js.native
  /** Inline recipient objects or object containing stored recipient list ID */
  var recipients: js.UndefOr[js.Array[Recipient] | Listid] = js.native
  /** SparkPost Enterprise API only: email to use for envelope FROM */
  var return_path: js.UndefOr[String] = js.native
  /** Key/value pairs that are provided to the substitution engine */
  var substitution_data: js.UndefOr[js.Any] = js.native
}

object CreateTransmission {
  @scala.inline
  def apply(content: InlineContent | Templateid | Emailrfc822): CreateTransmission = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransmission]
  }
  @scala.inline
  implicit class CreateTransmissionOps[Self <: CreateTransmission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: InlineContent | Templateid | Emailrfc822): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBcc(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bcc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBcc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bcc")(js.undefined)
        ret
    }
    @scala.inline
    def withCampaign_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaign_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaign_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaign_id")(js.undefined)
        ret
    }
    @scala.inline
    def withCc(value: js.Array[Recipient]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cc")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: TransmissionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipients(value: js.Array[Recipient] | Listid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(js.undefined)
        ret
    }
    @scala.inline
    def withReturn_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturn_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("return_path")(js.undefined)
        ret
    }
    @scala.inline
    def withSubstitution_data(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubstitution_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("substitution_data")(js.undefined)
        ret
    }
  }
  
}

