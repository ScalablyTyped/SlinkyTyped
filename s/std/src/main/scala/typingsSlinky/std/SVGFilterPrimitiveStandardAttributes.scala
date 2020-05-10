package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFilterPrimitiveStandardAttributes extends js.Object {
  val height: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val result: org.scalajs.dom.raw.SVGAnimatedString = js.native
  val width: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val x: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val y: org.scalajs.dom.raw.SVGAnimatedLength = js.native
}

object SVGFilterPrimitiveStandardAttributes {
  @scala.inline
  def apply(
    height: org.scalajs.dom.raw.SVGAnimatedLength,
    result: org.scalajs.dom.raw.SVGAnimatedString,
    width: org.scalajs.dom.raw.SVGAnimatedLength,
    x: org.scalajs.dom.raw.SVGAnimatedLength,
    y: org.scalajs.dom.raw.SVGAnimatedLength
  ): SVGFilterPrimitiveStandardAttributes = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGFilterPrimitiveStandardAttributes]
  }
  @scala.inline
  implicit class SVGFilterPrimitiveStandardAttributesOps[Self <: org.scalajs.dom.raw.SVGFilterPrimitiveStandardAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: org.scalajs.dom.raw.SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: org.scalajs.dom.raw.SVGAnimatedString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: org.scalajs.dom.raw.SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: org.scalajs.dom.raw.SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: org.scalajs.dom.raw.SVGAnimatedLength): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

