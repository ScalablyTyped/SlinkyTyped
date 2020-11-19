package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGAnimatedPoints extends js.Object {
  
  val animatedPoints: org.scalajs.dom.raw.SVGPointList = js.native
  
  val points: org.scalajs.dom.raw.SVGPointList = js.native
}
object SVGAnimatedPoints {
  
  @scala.inline
  def apply(animatedPoints: org.scalajs.dom.raw.SVGPointList, points: org.scalajs.dom.raw.SVGPointList): SVGAnimatedPoints = {
    val __obj = js.Dynamic.literal(animatedPoints = animatedPoints.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPoints]
  }
  
  @scala.inline
  implicit class SVGAnimatedPointsOps[Self <: org.scalajs.dom.raw.SVGAnimatedPoints] (val x: Self) extends AnyVal {
    
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
    def setAnimatedPoints(value: org.scalajs.dom.raw.SVGPointList): Self = this.set("animatedPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: org.scalajs.dom.raw.SVGPointList): Self = this.set("points", value.asInstanceOf[js.Any])
  }
}
