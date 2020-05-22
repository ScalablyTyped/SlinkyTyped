package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes which take a list of numbers and which can be animated. */
trait SVGAnimatedTransformList extends js.Object {
  val animVal: org.scalajs.dom.raw.SVGTransformList
  val baseVal: org.scalajs.dom.raw.SVGTransformList
}

object SVGAnimatedTransformList {
  @scala.inline
  def apply(animVal: org.scalajs.dom.raw.SVGTransformList, baseVal: org.scalajs.dom.raw.SVGTransformList): SVGAnimatedTransformList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedTransformList]
  }
}

