package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes of basic type <angle> which can be animated. */
@js.native
trait SVGAnimatedAngle extends js.Object {
  val animVal: org.scalajs.dom.raw.SVGAngle = js.native
  val baseVal: org.scalajs.dom.raw.SVGAngle = js.native
}

object SVGAnimatedAngle {
  @scala.inline
  def apply(animVal: org.scalajs.dom.raw.SVGAngle, baseVal: org.scalajs.dom.raw.SVGAngle): SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedAngle]
  }
  @scala.inline
  implicit class SVGAnimatedAngleOps[Self <: org.scalajs.dom.raw.SVGAnimatedAngle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimVal(value: org.scalajs.dom.raw.SVGAngle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseVal(value: org.scalajs.dom.raw.SVGAngle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseVal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

