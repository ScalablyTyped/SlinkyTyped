package typingsSlinky.streamToString

import typingsSlinky.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-to-string", JSImport.Namespace)
  @js.native
  def apply(stream: ReadableStream): js.Promise[String] = js.native
  @JSImport("stream-to-string", JSImport.Namespace)
  @js.native
  def apply(stream: ReadableStream, cb: Callback): js.Promise[String] = js.native
  @JSImport("stream-to-string", JSImport.Namespace)
  @js.native
  def apply(stream: ReadableStream, enc: String): js.Promise[String] = js.native
  @JSImport("stream-to-string", JSImport.Namespace)
  @js.native
  def apply(stream: ReadableStream, enc: String, cb: Callback): js.Promise[String] = js.native
  
  type Callback = js.Function2[/* error */ js.UndefOr[js.Error], /* str */ String, Unit]
}
