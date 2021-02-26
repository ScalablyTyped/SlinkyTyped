package typingsSlinky.xhrMock

import typingsSlinky.xhrMock.mockHeadersMod.MockHeaders
import typingsSlinky.xhrMock.mockURLMod.MockURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockRequestMod {
  
  @JSImport("xhr-mock/lib/MockRequest", JSImport.Default)
  @js.native
  class default () extends MockRequest
  
  @js.native
  trait MockRequest extends StObject {
    
    var _body: js.Any = js.native
    
    var _headers: js.Any = js.native
    
    var _method: js.Any = js.native
    
    var _url: js.Any = js.native
    
    def body(): js.Any = js.native
    def body(body: js.Any): MockRequest = js.native
    
    def header(name: String): Null | String = js.native
    def header(name: String, value: String): MockRequest = js.native
    
    def headers(): MockHeaders = js.native
    def headers(headers: MockHeaders): MockRequest = js.native
    
    def method(): String = js.native
    def method(method: String): MockRequest = js.native
    
    def url(): MockURL = js.native
    def url(url: String): MockRequest = js.native
  }
}
