package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of basic type <angle> which can be animated. */
@js.native
trait SVGAnimatedAngle extends StObject {
  
  val animVal: org.scalajs.dom.raw.SVGAngle = js.native
  
  val baseVal: org.scalajs.dom.raw.SVGAngle = js.native
}
object SVGAnimatedAngle {
  
  @scala.inline
  def apply(animVal: org.scalajs.dom.raw.SVGAngle, baseVal: org.scalajs.dom.raw.SVGAngle): org.scalajs.dom.raw.SVGAnimatedAngle = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGAnimatedAngle]
  }
  
  @scala.inline
  implicit class SVGAnimatedAngleMutableBuilder[Self <: org.scalajs.dom.raw.SVGAnimatedAngle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: org.scalajs.dom.raw.SVGAngle): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.raw.SVGAngle): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
