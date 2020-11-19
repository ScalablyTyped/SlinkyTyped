package typingsSlinky.xhrMock

import typingsSlinky.xhrMock.mockXMLHttpRequestEventTargetMod.MockXMLHttpRequestEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xhr-mock/lib/MockXMLHttpRequestUpload", JSImport.Namespace)
@js.native
object mockXMLHttpRequestUploadMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.std.EventTarget because Already inherited
  - typingsSlinky.std.XMLHttpRequestEventTarget because Already inherited
  - typingsSlinky.std.XMLHttpRequestUpload because var conflicts: onabort, onerror, onload, onloadend, onloadstart, onprogress, ontimeout. Inlined  */ @js.native
  trait MockXMLHttpRequestUpload extends MockXMLHttpRequestEventTarget
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.std.EventTarget because Already inherited
  - typingsSlinky.std.XMLHttpRequestEventTarget because Already inherited
  - typingsSlinky.std.XMLHttpRequestUpload because var conflicts: onabort, onerror, onload, onloadend, onloadstart, onprogress, ontimeout. Inlined  */ @js.native
  class default () extends MockXMLHttpRequestEventTarget
}
