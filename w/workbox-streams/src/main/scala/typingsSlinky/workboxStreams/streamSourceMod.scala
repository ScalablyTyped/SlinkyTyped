package typingsSlinky.workboxStreams

import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.Response
import typingsSlinky.std.BodyInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-streams/types/StreamSource", JSImport.Namespace)
@js.native
object streamSourceMod extends js.Object {
  
  type StreamSource = Response | BodyInit | ReadableStream[js.Any]
}
