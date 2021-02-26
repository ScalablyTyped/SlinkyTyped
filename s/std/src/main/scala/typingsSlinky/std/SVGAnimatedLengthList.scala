package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used for attributes of type SVGLengthList which can be animated. */
@js.native
trait SVGAnimatedLengthList extends StObject {
  
  val animVal: org.scalajs.dom.raw.SVGLengthList = js.native
  
  val baseVal: org.scalajs.dom.raw.SVGLengthList = js.native
}
object SVGAnimatedLengthList {
  
  @scala.inline
  def apply(animVal: org.scalajs.dom.raw.SVGLengthList, baseVal: org.scalajs.dom.raw.SVGLengthList): org.scalajs.dom.raw.SVGAnimatedLengthList = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGAnimatedLengthList]
  }
  
  @scala.inline
  implicit class SVGAnimatedLengthListMutableBuilder[Self <: org.scalajs.dom.raw.SVGAnimatedLengthList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: org.scalajs.dom.raw.SVGLengthList): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: org.scalajs.dom.raw.SVGLengthList): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
