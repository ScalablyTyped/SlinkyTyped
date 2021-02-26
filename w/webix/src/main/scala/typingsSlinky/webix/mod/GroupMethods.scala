package typingsSlinky.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupMethods extends StObject {
  
  def any(property: String, data: js.Any): Unit = js.native
  
  def count(property: String, data: js.Any): Unit = js.native
  
  def max(property: String, data: js.Any): Unit = js.native
  
  def min(property: String, data: js.Any): Unit = js.native
  
  def string(property: String, data: js.Any): Unit = js.native
  
  def sum(property: String, data: js.Any): Unit = js.native
}
object GroupMethods {
  
  @JSImport("webix", "GroupMethods")
  @js.native
  val ^ : GroupMethods = js.native
  
  @scala.inline
  implicit class GroupMethodsMutableBuilder[Self <: GroupMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAny(value: (String, js.Any) => Unit): Self = StObject.set(x, "any", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCount(value: (String, js.Any) => Unit): Self = StObject.set(x, "count", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMax(value: (String, js.Any) => Unit): Self = StObject.set(x, "max", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMin(value: (String, js.Any) => Unit): Self = StObject.set(x, "min", js.Any.fromFunction2(value))
    
    @scala.inline
    def setString(value: (String, js.Any) => Unit): Self = StObject.set(x, "string", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSum(value: (String, js.Any) => Unit): Self = StObject.set(x, "sum", js.Any.fromFunction2(value))
  }
}
