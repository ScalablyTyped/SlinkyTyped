package typingsSlinky.three

import typingsSlinky.three.fontMod.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBevelEnabled extends js.Object {
  var bevelEnabled: Boolean = js.native
  var bevelOffset: Double = js.native
  var bevelSegments: Double = js.native
  var bevelSize: Double = js.native
  var bevelThickness: Double = js.native
  var curveSegments: Double = js.native
  var font: Font = js.native
  var height: Double = js.native
  var size: Double = js.native
}

object AnonBevelEnabled {
  @scala.inline
  def apply(
    bevelEnabled: Boolean,
    bevelOffset: Double,
    bevelSegments: Double,
    bevelSize: Double,
    bevelThickness: Double,
    curveSegments: Double,
    font: Font,
    height: Double,
    size: Double
  ): AnonBevelEnabled = {
    val __obj = js.Dynamic.literal(bevelEnabled = bevelEnabled.asInstanceOf[js.Any], bevelOffset = bevelOffset.asInstanceOf[js.Any], bevelSegments = bevelSegments.asInstanceOf[js.Any], bevelSize = bevelSize.asInstanceOf[js.Any], bevelThickness = bevelThickness.asInstanceOf[js.Any], curveSegments = curveSegments.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBevelEnabled]
  }
  @scala.inline
  implicit class AnonBevelEnabledOps[Self <: AnonBevelEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBevelEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBevelOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBevelSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBevelSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBevelThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurveSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

