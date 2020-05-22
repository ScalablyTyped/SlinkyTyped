package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes of basic type <angle> which can be animated. */
trait SVGAnimatedAngle extends js.Object {
  val animVal: org.scalajs.dom.raw.SVGAngle
  val baseVal: org.scalajs.dom.raw.SVGAngle
}

object SVGAnimatedAngle {
  @scala.inline
  def apply(animVal: org.scalajs.dom.raw.SVGAngle, baseVal: org.scalajs.dom.raw.SVGAngle): SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedAngle]
  }
}

