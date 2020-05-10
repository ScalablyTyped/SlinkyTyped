package typingsSlinky.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastNonLinearAd extends js.Object {
  var adParameters: String | Null = js.native
  var apiFramework: String = js.native
  var expandedHeight: String = js.native
  var expandedWidth: String = js.native
  var height: String = js.native
  var htmlResource: String | Null = js.native
  var id: String | Null = js.native
  var iframeResource: String | Null = js.native
  var maintainAspectRatio: Boolean = js.native
  var minSuggestedDuration: Double = js.native
  var nonLinearClickThroughURLTemplate: String | Null = js.native
  var nonLinearClickTrackingURLTemplates: js.Array[String] = js.native
  var scalable: Boolean = js.native
  var staticResource: String | Null = js.native
  var `type`: String | Null = js.native
  var width: String = js.native
}

object VastNonLinearAd {
  @scala.inline
  def apply(
    apiFramework: String,
    expandedHeight: String,
    expandedWidth: String,
    height: String,
    maintainAspectRatio: Boolean,
    minSuggestedDuration: Double,
    nonLinearClickTrackingURLTemplates: js.Array[String],
    scalable: Boolean,
    width: String
  ): VastNonLinearAd = {
    val __obj = js.Dynamic.literal(apiFramework = apiFramework.asInstanceOf[js.Any], expandedHeight = expandedHeight.asInstanceOf[js.Any], expandedWidth = expandedWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maintainAspectRatio = maintainAspectRatio.asInstanceOf[js.Any], minSuggestedDuration = minSuggestedDuration.asInstanceOf[js.Any], nonLinearClickTrackingURLTemplates = nonLinearClickTrackingURLTemplates.asInstanceOf[js.Any], scalable = scalable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastNonLinearAd]
  }
  @scala.inline
  implicit class VastNonLinearAdOps[Self <: VastNonLinearAd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiFramework(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandedWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaintainAspectRatio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maintainAspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinSuggestedDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSuggestedDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonLinearClickTrackingURLTemplates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonLinearClickTrackingURLTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScalable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdParameters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdParametersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adParameters")(null)
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
    def withNonLinearClickThroughURLTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonLinearClickThroughURLTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonLinearClickThroughURLTemplateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonLinearClickThroughURLTemplate")(null)
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

