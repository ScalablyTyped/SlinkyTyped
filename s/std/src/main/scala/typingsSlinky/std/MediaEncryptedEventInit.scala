package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaEncryptedEventInit extends EventInit {
  
  var initData: js.UndefOr[js.typedarray.ArrayBuffer | Null] = js.native
  
  var initDataType: js.UndefOr[java.lang.String] = js.native
}
object MediaEncryptedEventInit {
  
  @scala.inline
  def apply(): MediaEncryptedEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaEncryptedEventInit]
  }
  
  @scala.inline
  implicit class MediaEncryptedEventInitMutableBuilder[Self <: MediaEncryptedEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "initData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitDataNull: Self = StObject.set(x, "initData", null)
    
    @scala.inline
    def setInitDataType(value: java.lang.String): Self = StObject.set(x, "initDataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitDataTypeUndefined: Self = StObject.set(x, "initDataType", js.undefined)
    
    @scala.inline
    def setInitDataUndefined: Self = StObject.set(x, "initData", js.undefined)
  }
}
