package typingsSlinky.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VastIcon extends js.Object {
  var apiFramework: String | Null = js.native
  var duration: Double = js.native
  var height: Double = js.native
  var htmlResource: String | Null = js.native
  var iconClickThroughURLTemplate: String | Null = js.native
  var iconClickTrackingURLTemplates: js.Array[String] = js.native
  var iconViewTrackingURLTemplate: String | Null = js.native
  var iframeResource: String | Null = js.native
  var offset: String | Null = js.native
  var program: String | Null = js.native
  var staticResource: String | Null = js.native
  var `type`: String | Null = js.native
  var width: Double = js.native
  var xPosition: Double = js.native
  var yPosition: Double = js.native
}

object VastIcon {
  @scala.inline
  def apply(
    duration: Double,
    height: Double,
    iconClickTrackingURLTemplates: js.Array[String],
    width: Double,
    xPosition: Double,
    yPosition: Double
  ): VastIcon = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], iconClickTrackingURLTemplates = iconClickTrackingURLTemplates.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xPosition = xPosition.asInstanceOf[js.Any], yPosition = yPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastIcon]
  }
  @scala.inline
  implicit class VastIconOps[Self <: VastIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconClickTrackingURLTemplates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClickTrackingURLTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiFramework(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiFramework")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiFrameworkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiFramework")(null)
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
    def withIconClickThroughURLTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClickThroughURLTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconClickThroughURLTemplateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClickThroughURLTemplate")(null)
        ret
    }
    @scala.inline
    def withIconViewTrackingURLTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconViewTrackingURLTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconViewTrackingURLTemplateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconViewTrackingURLTemplate")(null)
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
    def withOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(null)
        ret
    }
    @scala.inline
    def withProgram(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgramNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(null)
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

