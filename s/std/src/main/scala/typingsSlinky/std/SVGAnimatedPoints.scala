package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGAnimatedPoints extends StObject {
  
  val animatedPoints: org.scalajs.dom.raw.SVGPointList = js.native
  
  val points: org.scalajs.dom.raw.SVGPointList = js.native
}
object SVGAnimatedPoints {
  
  @scala.inline
  def apply(animatedPoints: org.scalajs.dom.raw.SVGPointList, points: org.scalajs.dom.raw.SVGPointList): org.scalajs.dom.raw.SVGAnimatedPoints = {
    val __obj = js.Dynamic.literal(animatedPoints = animatedPoints.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGAnimatedPoints]
  }
  
  @scala.inline
  implicit class SVGAnimatedPointsMutableBuilder[Self <: org.scalajs.dom.raw.SVGAnimatedPoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimatedPoints(value: org.scalajs.dom.raw.SVGPointList): Self = StObject.set(x, "animatedPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: org.scalajs.dom.raw.SVGPointList): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
  }
}
