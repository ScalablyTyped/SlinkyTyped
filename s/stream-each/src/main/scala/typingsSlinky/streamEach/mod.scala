package typingsSlinky.streamEach

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-each", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(
    stream: ReadableStream,
    iterator: js.Function2[
      /* data */ Buffer | String, 
      /* next */ js.Function1[/* error */ js.UndefOr[js.Error], Unit], 
      Unit
    ],
    cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]
  ): Unit = js.native
}
