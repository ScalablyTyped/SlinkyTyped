package typingsSlinky.streamToPromise

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Return a promise which resolves when the input stream ends
    * @param stream The input stream
    * @returns A promise containing the stream output as a buffer
    */
  @JSImport("stream-to-promise", JSImport.Namespace)
  @js.native
  def apply(stream: ReadableStream): js.Promise[Buffer] = js.native
  /**
    * Return s promise which resolves when the input stream ends
    * @param stream The input stream
    */
  @JSImport("stream-to-promise", JSImport.Namespace)
  @js.native
  def apply(stream: WritableStream): js.Promise[Unit] = js.native
  @JSImport("stream-to-promise", JSImport.Namespace)
  @js.native
  def apply(stream: Readable): js.Promise[Buffer] = js.native
  @JSImport("stream-to-promise", JSImport.Namespace)
  @js.native
  def apply(stream: Writable): js.Promise[Unit] = js.native
}
