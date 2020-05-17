package typingsSlinky.sparkpost.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Campaignid extends js.Object {
  var campaign_id: js.UndefOr[String] = js.native
  var template_id: js.UndefOr[String] = js.native
}

object Campaignid {
  @scala.inline
  def apply(): Campaignid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Campaignid]
  }
  @scala.inline
  implicit class CampaignidOps[Self <: Campaignid] (val x: Self) extends AnyVal {
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
    def withoutCampaign_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaign_id")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template_id")(js.undefined)
        ret
    }
  }
  
}

