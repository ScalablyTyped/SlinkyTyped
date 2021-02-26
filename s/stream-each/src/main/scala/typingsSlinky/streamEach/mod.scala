package typingsSlinky.streamEach

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-each", JSImport.Namespace)
  @js.native
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
