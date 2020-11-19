package typingsSlinky.xhrMock

import typingsSlinky.xhrMock.anon.Instantiable
import typingsSlinky.xhrMock.typesMod.ErrorCallbackEvent
import typingsSlinky.xhrMock.typesMod.Mock
import typingsSlinky.xhrMock.typesMod.MockFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xhr-mock/lib/XHRMock", JSImport.Namespace)
@js.native
object xhrmockMod extends js.Object {
  
  val default: XHRMock = js.native
  
  @js.native
  class XHRMock () extends js.Object {
    
    var RealXMLHttpRequest: Instantiable = js.native
    
    def delete(url: String, mock: Mock): XHRMock = js.native
    def delete(url: js.RegExp, mock: Mock): XHRMock = js.native
    
    def error(callback: js.Function1[/* event */ ErrorCallbackEvent, Unit]): XHRMock = js.native
    
    def get(url: String, mock: Mock): XHRMock = js.native
    def get(url: js.RegExp, mock: Mock): XHRMock = js.native
    
    def mock(fn: MockFunction): XHRMock = js.native
    def mock(method: String, url: String, mock: Mock): XHRMock = js.native
    def mock(method: String, url: js.RegExp, mock: Mock): XHRMock = js.native
    
    def patch(url: String, mock: Mock): XHRMock = js.native
    def patch(url: js.RegExp, mock: Mock): XHRMock = js.native
    
    def post(url: String, mock: Mock): XHRMock = js.native
    def post(url: js.RegExp, mock: Mock): XHRMock = js.native
    
    def put(url: String, mock: Mock): XHRMock = js.native
    def put(url: js.RegExp, mock: Mock): XHRMock = js.native
    
    def reset(): XHRMock = js.native
    
    def setup(): XHRMock = js.native
    
    def teardown(): XHRMock = js.native
    
    def use(fn: MockFunction): XHRMock = js.native
    def use(method: String, url: String, mock: Mock): XHRMock = js.native
    def use(method: String, url: js.RegExp, mock: Mock): XHRMock = js.native
  }
}
