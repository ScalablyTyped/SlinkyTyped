package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGAnimatedString interface represents string attributes which can be animated from each SVG declaration. You need to create SVG attribute before doing anything else, everything should be declared inside this. */
@js.native
trait SVGAnimatedString extends StObject {
  
  val animVal: java.lang.String = js.native
  
  var baseVal: java.lang.String = js.native
}
object SVGAnimatedString {
  
  @scala.inline
  def apply(animVal: java.lang.String, baseVal: java.lang.String): org.scalajs.dom.raw.SVGAnimatedString = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.raw.SVGAnimatedString]
  }
  
  @scala.inline
  implicit class SVGAnimatedStringMutableBuilder[Self <: org.scalajs.dom.raw.SVGAnimatedString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimVal(value: java.lang.String): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseVal(value: java.lang.String): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
