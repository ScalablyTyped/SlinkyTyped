package typingsSlinky.uuidApikey

import typingsSlinky.uuidApikey.anon.PartialUUIDOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuid-apikey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("uuid-apikey", JSImport.Default)
  @js.native
  def default: UUIDAPIKey = js.native
  @scala.inline
  def default_=(x: UUIDAPIKey): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait ApiKeyInfo extends StObject {
    
    var apiKey: String = js.native
    
    var uuid: String = js.native
  }
  object ApiKeyInfo {
    
    @scala.inline
    def apply(apiKey: String, uuid: String): ApiKeyInfo = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiKeyInfo]
    }
    
    @scala.inline
    implicit class ApiKeyInfoMutableBuilder[Self <: ApiKeyInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UUIDAPIKey extends StObject {
    
    def check(apiKey: String, uuid: String): Boolean = js.native
    
    def checkDashes(positions: js.Array[Double], str: String): Boolean = js.native
    
    def create(): ApiKeyInfo = js.native
    def create(options: PartialUUIDOptions): ApiKeyInfo = js.native
    
    def isAPIKey(apiKey: String): Boolean = js.native
    
    def isUUID(uuid: String): Boolean = js.native
    
    def toAPIKey(uuid: String): String = js.native
    def toAPIKey(uuid: String, options: PartialUUIDOptions): String = js.native
    
    def toUUID(apiKey: String): String = js.native
  }
  
  @js.native
  trait UUIDOptions extends StObject {
    
    var noDashes: Boolean = js.native
  }
  object UUIDOptions {
    
    @scala.inline
    def apply(noDashes: Boolean): UUIDOptions = {
      val __obj = js.Dynamic.literal(noDashes = noDashes.asInstanceOf[js.Any])
      __obj.asInstanceOf[UUIDOptions]
    }
    
    @scala.inline
    implicit class UUIDOptionsMutableBuilder[Self <: UUIDOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoDashes(value: Boolean): Self = StObject.set(x, "noDashes", value.asInstanceOf[js.Any])
    }
  }
}
