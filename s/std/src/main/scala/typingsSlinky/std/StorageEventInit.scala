package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageEventInit extends EventInit {
  
  var key: js.UndefOr[java.lang.String | Null] = js.native
  
  var newValue: js.UndefOr[java.lang.String | Null] = js.native
  
  var oldValue: js.UndefOr[java.lang.String | Null] = js.native
  
  var storageArea: js.UndefOr[org.scalajs.dom.raw.Storage | Null] = js.native
  
  var url: js.UndefOr[java.lang.String] = js.native
}
object StorageEventInit {
  
  @scala.inline
  def apply(): StorageEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageEventInit]
  }
  
  @scala.inline
  implicit class StorageEventInitMutableBuilder[Self <: StorageEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: java.lang.String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = StObject.set(x, "key", null)
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setNewValue(value: java.lang.String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueNull: Self = StObject.set(x, "newValue", null)
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: java.lang.String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueNull: Self = StObject.set(x, "oldValue", null)
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    @scala.inline
    def setStorageArea(value: org.scalajs.dom.raw.Storage): Self = StObject.set(x, "storageArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageAreaNull: Self = StObject.set(x, "storageArea", null)
    
    @scala.inline
    def setStorageAreaUndefined: Self = StObject.set(x, "storageArea", js.undefined)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
