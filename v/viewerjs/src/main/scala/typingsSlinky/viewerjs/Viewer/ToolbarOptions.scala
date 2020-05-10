package typingsSlinky.viewerjs.Viewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarOptions extends js.Object {
  var flipHorizontal: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var flipVertical: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var next: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var oneToOne: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var play: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var prev: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var reset: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var rotateLeft: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var rotateRight: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var zoomIn: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
  var zoomOut: js.UndefOr[Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions] = js.native
}

object ToolbarOptions {
  @scala.inline
  def apply(): ToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolbarOptions]
  }
  @scala.inline
  implicit class ToolbarOptionsOps[Self <: ToolbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlipHorizontal(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipVertical(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withOneToOne(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneToOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneToOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneToOne")(js.undefined)
        ret
    }
    @scala.inline
    def withPlay(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateLeft(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateRight(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateRight")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomIn(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomOut(value: Boolean | Visibility | ToolbarButtonSize | js.Function | ToolbarButtonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(js.undefined)
        ret
    }
  }
  
}

