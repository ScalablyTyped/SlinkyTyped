package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes of basic type <length> which can be animated. */
trait SVGAnimatedLength extends js.Object {
  val animVal: org.scalajs.dom.raw.SVGLength
  val baseVal: org.scalajs.dom.raw.SVGLength
}

object SVGAnimatedLength {
  @scala.inline
  def apply(animVal: org.scalajs.dom.raw.SVGLength, baseVal: org.scalajs.dom.raw.SVGLength): SVGAnimatedLength = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLength]
  }
}

