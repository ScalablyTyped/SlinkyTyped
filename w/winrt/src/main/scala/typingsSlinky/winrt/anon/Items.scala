package typingsSlinky.winrt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Items[T] extends StObject {
  
  var items: js.Array[T] = js.native
  
  var returnValue: Double = js.native
}
object Items {
  
  @scala.inline
  def apply[T](items: js.Array[T], returnValue: Double): Items[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items[T]]
  }
  
  @scala.inline
  implicit class ItemsMutableBuilder[Self <: Items[_], T] (val x: Self with Items[T]) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
