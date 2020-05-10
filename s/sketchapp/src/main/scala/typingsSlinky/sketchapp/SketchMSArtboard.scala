package typingsSlinky.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSArtboard extends js.Object {
  var backgroundColor: SketchMSColor = js.native
  var frame: SketchMSRect = js.native
  var hasBackgroundColor: Boolean = js.native
  var horizontalRulerData: js.UndefOr[SketchMSRulerData] = js.native
  var includeBackgroundColorInExport: js.UndefOr[Boolean] = js.native
  var includeInCloudUpload: js.UndefOr[Boolean] = js.native
  var isFlowHome: js.UndefOr[Boolean] = js.native
  var verticalRulerData: js.UndefOr[SketchMSRulerData] = js.native
}

object SketchMSArtboard {
  @scala.inline
  def apply(backgroundColor: SketchMSColor, frame: SketchMSRect, hasBackgroundColor: Boolean): SketchMSArtboard = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], hasBackgroundColor = hasBackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSArtboard]
  }
  @scala.inline
  implicit class SketchMSArtboardOps[Self <: SketchMSArtboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: SketchMSColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrame(value: SketchMSRect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasBackgroundColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalRulerData(value: SketchMSRulerData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalRulerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalRulerData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalRulerData")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeBackgroundColorInExport(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBackgroundColorInExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeBackgroundColorInExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBackgroundColorInExport")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeInCloudUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInCloudUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeInCloudUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeInCloudUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFlowHome(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFlowHome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFlowHome: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFlowHome")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalRulerData(value: SketchMSRulerData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalRulerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalRulerData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalRulerData")(js.undefined)
        ret
    }
  }
  
}

