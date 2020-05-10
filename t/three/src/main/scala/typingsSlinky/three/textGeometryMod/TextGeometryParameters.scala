package typingsSlinky.three.textGeometryMod

import typingsSlinky.three.fontMod.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextGeometryParameters extends js.Object {
  var bevelEnabled: js.UndefOr[Boolean] = js.native
  var bevelOffset: js.UndefOr[Double] = js.native
  var bevelSegments: js.UndefOr[Double] = js.native
  var bevelSize: js.UndefOr[Double] = js.native
  var bevelThickness: js.UndefOr[Double] = js.native
  var curveSegments: js.UndefOr[Double] = js.native
  var font: js.UndefOr[Font] = js.native
  var height: js.UndefOr[Double] = js.native
  var size: js.UndefOr[Double] = js.native
}

object TextGeometryParameters {
  @scala.inline
  def apply(): TextGeometryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextGeometryParameters]
  }
  @scala.inline
  implicit class TextGeometryParametersOps[Self <: TextGeometryParameters] (val x: Self) extends AnyVal {
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
    def withoutBevelEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withBevelOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBevelOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withBevelSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBevelSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withBevelSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBevelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBevelThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBevelThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bevelThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withCurveSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurveSegments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curveSegments")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: Font): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

