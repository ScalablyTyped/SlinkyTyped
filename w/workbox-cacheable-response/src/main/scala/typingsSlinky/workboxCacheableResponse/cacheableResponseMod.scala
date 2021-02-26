package typingsSlinky.workboxCacheableResponse

import org.scalajs.dom.experimental.Response
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheableResponseMod {
  
  @JSImport("workbox-cacheable-response/CacheableResponse", "CacheableResponse")
  @js.native
  class CacheableResponse () extends StObject {
    def this(config: CacheableResponseConfig) = this()
    
    def isResponseCacheable(response: Response): Boolean = js.native
  }
  
  @js.native
  trait CacheableResponseConfig extends StObject {
    
    var headers: js.UndefOr[Record[String, String]] = js.native
    
    var statuses: js.UndefOr[js.Array[Double]] = js.native
  }
  object CacheableResponseConfig {
    
    @scala.inline
    def apply(): CacheableResponseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheableResponseConfig]
    }
    
    @scala.inline
    implicit class CacheableResponseConfigMutableBuilder[Self <: CacheableResponseConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setStatuses(value: js.Array[Double]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
      
      @scala.inline
      def setStatusesVarargs(value: Double*): Self = StObject.set(x, "statuses", js.Array(value :_*))
    }
  }
}
