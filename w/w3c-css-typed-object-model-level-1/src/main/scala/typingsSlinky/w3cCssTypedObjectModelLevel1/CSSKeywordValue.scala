package typingsSlinky.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSKeywordValue extends CSSStyleValue {
  
  var value: String = js.native
}
object CSSKeywordValue {
  
  @scala.inline
  def apply(value: String): CSSKeywordValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSKeywordValue]
  }
  
  @scala.inline
  implicit class CSSKeywordValueMutableBuilder[Self <: CSSKeywordValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
