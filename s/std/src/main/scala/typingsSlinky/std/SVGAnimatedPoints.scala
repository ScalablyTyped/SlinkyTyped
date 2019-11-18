package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnimatedPoints extends js.Object {
  val animatedPoints: org.scalajs.dom.raw.SVGPointList
  val points: org.scalajs.dom.raw.SVGPointList
}

object SVGAnimatedPoints {
  @scala.inline
  def apply(animatedPoints: org.scalajs.dom.raw.SVGPointList, points: org.scalajs.dom.raw.SVGPointList): SVGAnimatedPoints = {
    val __obj = js.Dynamic.literal(animatedPoints = animatedPoints.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SVGAnimatedPoints]
  }
}

