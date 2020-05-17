package typingsSlinky.sendgrid.mod.SendGrid.Helpers.Mail

import typingsSlinky.sendgrid.anon.Utmcampaign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ganalytics extends js.Object {
  def getContent(): String = js.native
  def getEnable(): Boolean = js.native
  def getUrmMedium(): String = js.native
  def getUrmTerm(): String = js.native
  def getUtmCampaign(): String = js.native
  def getUtmSource(): String = js.native
  def setContent(content: String): Unit = js.native
  def setEnable(enabled: Boolean): Unit = js.native
  def setUrmMedium(medium: String): Unit = js.native
  def setUrmTerm(term: String): Unit = js.native
  def setUtmCampaign(campaign: String): Unit = js.native
  def setUtmSource(source: String): Unit = js.native
  def toJSON(): Utmcampaign = js.native
}

object Ganalytics {
  @scala.inline
  def apply(
    getContent: () => String,
    getEnable: () => Boolean,
    getUrmMedium: () => String,
    getUrmTerm: () => String,
    getUtmCampaign: () => String,
    getUtmSource: () => String,
    setContent: String => Unit,
    setEnable: Boolean => Unit,
    setUrmMedium: String => Unit,
    setUrmTerm: String => Unit,
    setUtmCampaign: String => Unit,
    setUtmSource: String => Unit,
    toJSON: () => Utmcampaign
  ): Ganalytics = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), getEnable = js.Any.fromFunction0(getEnable), getUrmMedium = js.Any.fromFunction0(getUrmMedium), getUrmTerm = js.Any.fromFunction0(getUrmTerm), getUtmCampaign = js.Any.fromFunction0(getUtmCampaign), getUtmSource = js.Any.fromFunction0(getUtmSource), setContent = js.Any.fromFunction1(setContent), setEnable = js.Any.fromFunction1(setEnable), setUrmMedium = js.Any.fromFunction1(setUrmMedium), setUrmTerm = js.Any.fromFunction1(setUrmTerm), setUtmCampaign = js.Any.fromFunction1(setUtmCampaign), setUtmSource = js.Any.fromFunction1(setUtmSource), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Ganalytics]
  }
  @scala.inline
  implicit class GanalyticsOps[Self <: Ganalytics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContent(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUrmMedium(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrmMedium")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUrmTerm(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrmTerm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUtmCampaign(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUtmCampaign")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUtmSource(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUtmSource")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContent(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetEnable(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUrmMedium(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUrmMedium")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUrmTerm(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUrmTerm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUtmCampaign(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUtmCampaign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetUtmSource(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUtmSource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => Utmcampaign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

