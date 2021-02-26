package typingsSlinky.xhrMock

import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.std.XMLHttpRequestEventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockXMLHttpRequestEventTargetMod {
  
  @JSImport("xhr-mock/lib/MockXMLHttpRequestEventTarget", JSImport.Default)
  @js.native
  class default () extends MockXMLHttpRequestEventTarget
  
  @js.native
  trait MockXMLHttpRequestEventTarget
    extends typingsSlinky.xhrMock.mockEventTargetMod.default
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
}
