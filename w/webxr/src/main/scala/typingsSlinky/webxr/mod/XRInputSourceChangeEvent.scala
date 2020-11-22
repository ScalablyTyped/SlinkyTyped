package typingsSlinky.webxr.mod

import typingsSlinky.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRInputSourceChangeEvent extends Event {
  
  var added: js.Array[XRInputSource] = js.native
  
  var removed: js.Array[XRInputSource] = js.native
  
  var session: XRSession = js.native
}
