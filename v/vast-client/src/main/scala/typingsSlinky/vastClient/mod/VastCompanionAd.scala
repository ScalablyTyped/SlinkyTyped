package typingsSlinky.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastCompanionAd extends js.Object {
  var altText: String | Null = js.native
  var companionClickThroughURLTemplate: String | Null = js.native
  var companionClickTrackingURLTemplate: js.UndefOr[String | Null] = js.native
  var companionClickTrackingURLTemplates: js.Array[String] = js.native
  var height: String = js.native
  var htmlResource: String | Null = js.native
  var id: String | Null = js.native
  var iframeResource: String | Null = js.native
  var staticResource: String | Null = js.native
  var trackingEvents: VastCompanionTrackingEvents = js.native
  var `type`: String | Null = js.native
  var width: String = js.native
}

object VastCompanionAd {
  @scala.inline
  def apply(
    companionClickTrackingURLTemplates: js.Array[String],
    height: String,
    trackingEvents: VastCompanionTrackingEvents,
    width: String
  ): VastCompanionAd = {
    val __obj = js.Dynamic.literal(companionClickTrackingURLTemplates = companionClickTrackingURLTemplates.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], trackingEvents = trackingEvents.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCompanionAd]
  }
  @scala.inline
  implicit class VastCompanionAdOps[Self <: VastCompanionAd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompanionClickTrackingURLTemplates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionClickTrackingURLTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackingEvents(value: VastCompanionTrackingEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altText")(null)
        ret
    }
    @scala.inline
    def withCompanionClickThroughURLTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionClickThroughURLTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompanionClickThroughURLTemplateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionClickThroughURLTemplate")(null)
        ret
    }
    @scala.inline
    def withCompanionClickTrackingURLTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionClickTrackingURLTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompanionClickTrackingURLTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionClickTrackingURLTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withCompanionClickTrackingURLTemplateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companionClickTrackingURLTemplate")(null)
        ret
    }
    @scala.inline
    def withHtmlResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlResourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlResource")(null)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(null)
        ret
    }
    @scala.inline
    def withIframeResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIframeResourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeResource")(null)
        ret
    }
    @scala.inline
    def withStaticResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaticResourceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticResource")(null)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(null)
        ret
    }
  }
  
}

