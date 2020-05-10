package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageEventParameters extends js.Object {
  /** delimited list of bounce classification codes to search. (See Bounce Classification Codes.) */
  var bounce_classes: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.native
  /** delimited list of campaign ID’s to search (i.e. the campaign id used during creation of a transmission). */
  var campaign_ids: js.UndefOr[js.Array[String] | String] = js.native
  /** Specifies the delimiter for query parameter lists */
  var delimiter: js.UndefOr[String] = js.native
  /** delimited list of event types to search. Defaults to all event types. */
  var events: js.UndefOr[js.Array[String] | String] = js.native
  /** delimited list of friendly from emails to search. */
  var friendly_froms: js.UndefOr[js.Array[String] | String] = js.native
  /** Datetime in format of YYYY-MM-DDTHH:MM. */
  var from: js.UndefOr[String] = js.native
  /** delimited list of message ID’s to search. */
  var message_ids: js.UndefOr[js.Array[String] | String] = js.native
  /** The results page number to return. Used with per_page for paging through results. */
  var page: js.UndefOr[Double] = js.native
  /** Number of results to return per page. Must be between 1 and 10,000 (inclusive). */
  var per_page: js.UndefOr[Double] = js.native
  /** Bounce/failure/rejection reason that will be matched using a wildcard (e.g., %reason%). */
  var reason: js.UndefOr[js.Array[String] | String] = js.native
  /** delimited list of recipients to search. */
  var recipients: js.UndefOr[js.Array[String] | String] = js.native
  /** delimited list of subaccount ID’s to search. */
  var subaccounts: js.UndefOr[js.Array[Double] | Double] = js.native
  /** delimited list of template ID’s to search. */
  var template_ids: js.UndefOr[js.Array[String] | String] = js.native
  /** Standard timezone identification string. */
  var timezone: js.UndefOr[String] = js.native
  /** Datetime in format of YYYY-MM-DDTHH:MM. */
  var to: js.UndefOr[String] = js.native
  /** delimited list of transmission ID’s to search (i.e. id generated during creation of a transmission). */
  var transmission_ids: js.UndefOr[js.Array[String] | String] = js.native
}

object MessageEventParameters {
  @scala.inline
  def apply(): MessageEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageEventParameters]
  }
  @scala.inline
  implicit class MessageEventParametersOps[Self <: MessageEventParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounce_classes(value: (js.Array[String | Double]) | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce_classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounce_classes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce_classes")(js.undefined)
        ret
    }
    @scala.inline
    def withCampaign_ids(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaign_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaign_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaign_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withFriendly_froms(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendly_froms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendly_froms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendly_froms")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage_ids(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPer_page(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPer_page: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("per_page")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withRecipients(value: js.Array[String] | String): Self = {
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
    def withSubaccounts(value: js.Array[Double] | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubaccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate_ids(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_ids")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withTransmission_ids(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transmission_ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransmission_ids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transmission_ids")(js.undefined)
        ret
    }
  }
  
}

