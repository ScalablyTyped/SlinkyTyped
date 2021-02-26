package typingsSlinky.turistFetch

import typingsSlinky.nodeFetch.mod.Response
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchRetryErrorMod {
  
  @JSImport("@turist/fetch/dist/fetch-retry-error", JSImport.Default)
  @js.native
  class default protected () extends FetchRetryError {
    def this(res: Response) = this()
  }
  
  @js.native
  trait FetchRetryError extends Error {
    
    var res: Response = js.native
    
    var statusCode: Double = js.native
    
    var url: String = js.native
  }
  object FetchRetryError {
    
    @scala.inline
    def apply(message: String, name: String, res: Response, statusCode: Double, url: String): FetchRetryError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchRetryError]
    }
    
    @scala.inline
    implicit class FetchRetryErrorMutableBuilder[Self <: FetchRetryError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRes(value: Response): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
