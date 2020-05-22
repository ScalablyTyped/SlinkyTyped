package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used for attributes of type SVGLengthList which can be animated. */
trait SVGAnimatedLengthList extends js.Object {
  val animVal: org.scalajs.dom.raw.SVGLengthList
  val baseVal: org.scalajs.dom.raw.SVGLengthList
}

object SVGAnimatedLengthList {
  @scala.inline
  def apply(animVal: org.scalajs.dom.raw.SVGLengthList, baseVal: org.scalajs.dom.raw.SVGLengthList): SVGAnimatedLengthList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedLengthList]
  }
}

