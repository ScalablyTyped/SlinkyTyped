package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of type SVGPreserveAspectRatio which can be animated. */
@js.native
trait SVGAnimatedPreserveAspectRatio extends StObject {
  
  val animVal: org.scalajs.dom.raw.SVGPreserveAspectRatio = js.native
  
  val baseVal: org.scalajs.dom.raw.SVGPreserveAspectRatio = js.native
}
object SVGAnimatedPreserveAspectRatio {
  
  @scala.inline
  def apply(
    animVal: org.scalajs.dom.raw.SVGPreserveAspectRatio,
    baseVal: org.scalajs.dom.raw.SVGPreserveAspectRatio
  ): org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio]
  }
  
  @scala.inline
  implicit class SVGAnimatedPreserveAspectRatioMutableBuilder[Self <: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: org.scalajs.dom.raw.SVGPreserveAspectRatio): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.raw.SVGPreserveAspectRatio): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
