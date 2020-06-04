package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A screen, usually the one on which the current window is being rendered, and is obtained using window.screen. */
trait Screen extends js.Object {
  val availHeight: Double
  val availWidth: Double
  val colorDepth: Double
  val height: Double
  val orientation: ScreenOrientation
  val pixelDepth: Double
  val width: Double
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
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailHeight(value: Double): Self = this.set("availHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailWidth(value: Double): Self = this.set("availWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorDepth(value: Double): Self = this.set("colorDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: ScreenOrientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelDepth(value: Double): Self = this.set("pixelDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

