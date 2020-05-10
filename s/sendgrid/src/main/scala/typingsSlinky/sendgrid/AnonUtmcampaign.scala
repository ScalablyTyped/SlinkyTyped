package typingsSlinky.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUtmcampaign extends js.Object {
  var enable: Boolean = js.native
  var utm_campaign: String = js.native
  var utm_content: String = js.native
  var utm_medium: String = js.native
  var utm_source: String = js.native
  var utm_term: String = js.native
}

object AnonUtmcampaign {
  @scala.inline
  def apply(
    enable: Boolean,
    utm_campaign: String,
    utm_content: String,
    utm_medium: String,
    utm_source: String,
    utm_term: String
  ): AnonUtmcampaign = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], utm_campaign = utm_campaign.asInstanceOf[js.Any], utm_content = utm_content.asInstanceOf[js.Any], utm_medium = utm_medium.asInstanceOf[js.Any], utm_source = utm_source.asInstanceOf[js.Any], utm_term = utm_term.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUtmcampaign]
  }
  @scala.inline
  implicit class AnonUtmcampaignOps[Self <: AnonUtmcampaign] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtm_campaign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_campaign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtm_content(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtm_medium(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtm_source(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtm_term(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utm_term")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

