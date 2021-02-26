package typingsSlinky.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait rules extends StObject {
  
  def isChecked(): Boolean = js.native
  
  def isEmail(): Boolean = js.native
  
  def isNotEmpty(): Boolean = js.native
  
  def isNumber(): Boolean = js.native
}
object rules {
  
  @JSImport("webix", "rules")
  @js.native
  val ^ : typingsSlinky.webix.webix.rules = js.native
  
  @scala.inline
  implicit class rulesMutableBuilder[Self <: rules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEmail(value: () => Boolean): Self = StObject.set(x, "isEmail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNotEmpty(value: () => Boolean): Self = StObject.set(x, "isNotEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNumber(value: () => Boolean): Self = StObject.set(x, "isNumber", js.Any.fromFunction0(value))
  }
}
