package typingsSlinky.winrt.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyStorageProviderNamesStatics extends StObject {
  
  var platformKeyStorageProvider: String = js.native
  
  var smartcardKeyStorageProvider: String = js.native
  
  var softwareKeyStorageProvider: String = js.native
}
object IKeyStorageProviderNamesStatics {
  
  @scala.inline
  def apply(
    platformKeyStorageProvider: String,
    smartcardKeyStorageProvider: String,
    softwareKeyStorageProvider: String
  ): IKeyStorageProviderNamesStatics = {
    val __obj = js.Dynamic.literal(platformKeyStorageProvider = platformKeyStorageProvider.asInstanceOf[js.Any], smartcardKeyStorageProvider = smartcardKeyStorageProvider.asInstanceOf[js.Any], softwareKeyStorageProvider = softwareKeyStorageProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyStorageProviderNamesStatics]
  }
  
  @scala.inline
  implicit class IKeyStorageProviderNamesStaticsMutableBuilder[Self <: IKeyStorageProviderNamesStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatformKeyStorageProvider(value: String): Self = StObject.set(x, "platformKeyStorageProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartcardKeyStorageProvider(value: String): Self = StObject.set(x, "smartcardKeyStorageProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareKeyStorageProvider(value: String): Self = StObject.set(x, "softwareKeyStorageProvider", value.asInstanceOf[js.Any])
  }
}
