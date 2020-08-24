package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes of type SVGPreserveAspectRatio which can be animated. */
@js.native
trait SVGAnimatedPreserveAspectRatio extends js.Object {
  val animVal: org.scalajs.dom.raw.SVGPreserveAspectRatio = js.native
  val baseVal: org.scalajs.dom.raw.SVGPreserveAspectRatio = js.native
}

object SVGAnimatedPreserveAspectRatio {
  @scala.inline
  def apply(
    animVal: org.scalajs.dom.raw.SVGPreserveAspectRatio,
    baseVal: org.scalajs.dom.raw.SVGPreserveAspectRatio
  ): SVGAnimatedPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPreserveAspectRatio]
  }
  @scala.inline
  implicit class SVGAnimatedPreserveAspectRatioOps[Self <: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio] (val x: Self) extends AnyVal {
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
    def setAnimVal(value: org.scalajs.dom.raw.SVGPreserveAspectRatio): Self = this.set("animVal", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.raw.SVGPreserveAspectRatio): Self = this.set("baseVal", value.asInstanceOf[js.Any])
  }
  
}

