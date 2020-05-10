package typingsSlinky.storybookReactNative.onDeviceUIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDeviceUIState extends js.Object {
  var previewHeight: Double = js.native
  var previewWidth: Double = js.native
  var slideBetweenAnimation: Boolean = js.native
  var tabOpen: Double = js.native
}

object OnDeviceUIState {
  @scala.inline
  def apply(previewHeight: Double, previewWidth: Double, slideBetweenAnimation: Boolean, tabOpen: Double): OnDeviceUIState = {
    val __obj = js.Dynamic.literal(previewHeight = previewHeight.asInstanceOf[js.Any], previewWidth = previewWidth.asInstanceOf[js.Any], slideBetweenAnimation = slideBetweenAnimation.asInstanceOf[js.Any], tabOpen = tabOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDeviceUIState]
  }
  @scala.inline
  implicit class OnDeviceUIStateOps[Self <: OnDeviceUIState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviewHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviewWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideBetweenAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideBetweenAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabOpen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabOpen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

