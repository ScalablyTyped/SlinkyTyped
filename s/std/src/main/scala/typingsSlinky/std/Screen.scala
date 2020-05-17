package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A screen, usually the one on which the current window is being rendered, and is obtained using window.screen. */
@js.native
trait Screen extends js.Object {
  val availHeight: Double = js.native
  val availWidth: Double = js.native
  val colorDepth: Double = js.native
  val height: Double = js.native
  val orientation: ScreenOrientation = js.native
  val pixelDepth: Double = js.native
  val width: Double = js.native
}

object Screen {
  @scala.inline
  def apply(
    availHeight: Double,
    availWidth: Double,
    colorDepth: Double,
    height: Double,
    orientation: ScreenOrientation,
    pixelDepth: Double,
    width: Double
  ): Screen = {
    val __obj = js.Dynamic.literal(availHeight = availHeight.asInstanceOf[js.Any], availWidth = availWidth.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pixelDepth = pixelDepth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
  @scala.inline
  implicit class ScreenOps[Self <: org.scalajs.dom.raw.Screen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: ScreenOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

