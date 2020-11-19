package typingsSlinky.xhrMock

import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.std.XMLHttpRequestEventTarget
import typingsSlinky.xhrMock.mockEventTargetMod.MockEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xhr-mock/lib/MockXMLHttpRequestEventTarget", JSImport.Namespace)
@js.native
object mockXMLHttpRequestEventTargetMod extends js.Object {
  
  @js.native
  trait MockXMLHttpRequestEventTarget
    extends MockEventTarget
       with XMLHttpRequestEventTarget {
    
    @JSName("onabort")
    def onabort_MMockXMLHttpRequestEventTarget(ev: ProgressEvent): js.Any = js.native
    
    @JSName("onerror")
    def onerror_MMockXMLHttpRequestEventTarget(ev: ProgressEvent): js.Any = js.native
    
    @JSName("onload")
    def onload_MMockXMLHttpRequestEventTarget(ev: ProgressEvent): js.Any = js.native
    
    @JSName("onloadend")
    def onloadend_MMockXMLHttpRequestEventTarget(ev: ProgressEvent): js.Any = js.native
    
    @JSName("onloadstart")
    def onloadstart_MMockXMLHttpRequestEventTarget(ev: ProgressEvent): js.Any = js.native
    
    @JSName("onprogress")
    def onprogress_MMockXMLHttpRequestEventTarget(ev: ProgressEvent): js.Any = js.native
    
    @JSName("ontimeout")
    def ontimeout_MMockXMLHttpRequestEventTarget(ev: ProgressEvent): js.Any = js.native
  }
  
  @js.native
  class default () extends MockXMLHttpRequestEventTarget
}
