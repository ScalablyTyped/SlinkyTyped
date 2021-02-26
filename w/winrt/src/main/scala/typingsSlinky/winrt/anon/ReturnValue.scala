package typingsSlinky.winrt.anon

import typingsSlinky.winrt.Windows.Foundation.IWwwFormUrlDecoderEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnValue extends StObject {
  
  var items: js.Array[IWwwFormUrlDecoderEntry] = js.native
  
  var returnValue: Double = js.native
}
object ReturnValue {
  
  @scala.inline
  def apply(items: js.Array[IWwwFormUrlDecoderEntry], returnValue: Double): ReturnValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnValue]
  }
  
  @scala.inline
  implicit class ReturnValueMutableBuilder[Self <: ReturnValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[IWwwFormUrlDecoderEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: IWwwFormUrlDecoderEntry*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
