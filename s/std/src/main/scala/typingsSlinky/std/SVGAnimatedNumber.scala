package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of basic type <Number> which can be animated. */
@js.native
trait SVGAnimatedNumber extends StObject {
  
  val animVal: Double = js.native
  
  var baseVal: Double = js.native
}
object SVGAnimatedNumber {
  
  @scala.inline
  def apply(animVal: Double, baseVal: Double): org.scalajs.dom.raw.SVGAnimatedNumber = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGAnimatedNumber]
  }
  
  @scala.inline
  implicit class SVGAnimatedNumberMutableBuilder[Self <: org.scalajs.dom.raw.SVGAnimatedNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: Double): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: Double): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
