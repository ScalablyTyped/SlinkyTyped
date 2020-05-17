package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes whose value must be a constant from a particular enumeration and which can be animated. */
@js.native
trait SVGAnimatedEnumeration extends js.Object {
  val animVal: Double = js.native
  var baseVal: Double = js.native
}

object SVGAnimatedEnumeration {
  @scala.inline
  def apply(animVal: Double, baseVal: Double): SVGAnimatedEnumeration = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedEnumeration]
  }
  @scala.inline
  implicit class SVGAnimatedEnumerationOps[Self <: org.scalajs.dom.raw.SVGAnimatedEnumeration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimVal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseVal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseVal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

