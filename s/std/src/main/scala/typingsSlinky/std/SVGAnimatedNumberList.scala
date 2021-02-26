package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGAnimatedNumber interface is used for attributes which take a list of numbers and which can be animated. */
@js.native
trait SVGAnimatedNumberList extends StObject {
  
  val animVal: org.scalajs.dom.raw.SVGNumberList = js.native
  
  val baseVal: org.scalajs.dom.raw.SVGNumberList = js.native
}
object SVGAnimatedNumberList {
  
  @scala.inline
  def apply(animVal: org.scalajs.dom.raw.SVGNumberList, baseVal: org.scalajs.dom.raw.SVGNumberList): org.scalajs.dom.raw.SVGAnimatedNumberList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGAnimatedNumberList]
  }
  
  @scala.inline
  implicit class SVGAnimatedNumberListMutableBuilder[Self <: org.scalajs.dom.raw.SVGAnimatedNumberList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: org.scalajs.dom.raw.SVGNumberList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.raw.SVGNumberList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
