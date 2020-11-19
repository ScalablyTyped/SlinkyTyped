package typingsSlinky.streamToString

import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-to-string", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(stream: ReadableStream): js.Promise[String] = js.native
  def apply(stream: ReadableStream, cb: Callback): js.Promise[String] = js.native
  def apply(stream: ReadableStream, enc: String): js.Promise[String] = js.native
  def apply(stream: ReadableStream, enc: String, cb: Callback): js.Promise[String] = js.native
  
  type Callback = js.Function2[/* error */ js.UndefOr[js.Error], /* str */ String, Unit]
}
