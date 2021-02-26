package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes which take a list of numbers and which can be animated. */
@js.native
trait SVGAnimatedTransformList extends StObject {
  
  val animVal: org.scalajs.dom.raw.SVGTransformList = js.native
  
  val baseVal: org.scalajs.dom.raw.SVGTransformList = js.native
}
object SVGAnimatedTransformList {
  
  @scala.inline
  def apply(animVal: org.scalajs.dom.raw.SVGTransformList, baseVal: org.scalajs.dom.raw.SVGTransformList): org.scalajs.dom.raw.SVGAnimatedTransformList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGAnimatedTransformList]
  }
  
  @scala.inline
  implicit class SVGAnimatedTransformListMutableBuilder[Self <: org.scalajs.dom.raw.SVGAnimatedTransformList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: org.scalajs.dom.raw.SVGTransformList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.raw.SVGTransformList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
