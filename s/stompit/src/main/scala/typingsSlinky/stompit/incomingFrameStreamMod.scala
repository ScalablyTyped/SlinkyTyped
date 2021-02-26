package typingsSlinky.stompit

import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incomingFrameStreamMod {
  
  @JSImport("stompit/lib/IncomingFrameStream", JSImport.Namespace)
  @js.native
  class ^ () extends IncomingFrameStream {
    def this(opts: TransformOptions) = this()
  }
  
  // Internal class, which is not exported
  @js.native
  trait IncomingFrame extends Readable {
    
    def readEmptyBody(): Unit = js.native
    def readEmptyBody(callback: js.Function1[/* isEmpty */ Boolean, Unit]): Unit = js.native
    
    def readString(encoding: String): Unit = js.native
    def readString(
      encoding: String,
      callback: js.Function2[/* err */ js.Error | Null, /* buffer */ js.UndefOr[String], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait IncomingFrameStream extends Transform {
    
    def setVersion(versionId: String): Boolean = js.native
  }
}
