package typingsSlinky.thrift.mod

import typingsSlinky.node.tlsMod.TlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerOptions[TProcessor, THandler] extends ServiceOptions[TProcessor, THandler] {
  
  var cors: js.UndefOr[js.Array[String]] = js.native
  
  var files: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[HttpHeaders] = js.native
  
  var services: js.UndefOr[ServiceMap[TProcessor, THandler]] = js.native
  
  var tls: js.UndefOr[TlsOptions] = js.native
}
object ServerOptions {
  
  @scala.inline
  def apply[TProcessor, THandler](): ServerOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions[TProcessor, THandler]]
  }
  
  @scala.inline
  implicit class ServerOptionsMutableBuilder[Self <: ServerOptions[_, _], TProcessor, THandler] (val x: Self with (ServerOptions[TProcessor, THandler])) extends AnyVal {
    
    @scala.inline
    def setCors(value: js.Array[String]): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    @scala.inline
    def setCorsVarargs(value: String*): Self = StObject.set(x, "cors", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setServices(value: ServiceMap[TProcessor, THandler]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setTls(value: TlsOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
