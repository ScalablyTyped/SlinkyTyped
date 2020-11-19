package typingsSlinky.streamBuffers.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-buffers", "ReadableStreamBuffer")
@js.native
class ReadableStreamBuffer () extends Readable {
  def this(options: ReadableStreamBufferOptions) = this()
  
  def maxSize(): Double = js.native
  
  def put(data: String): Unit = js.native
  def put(data: String, encoding: String): Unit = js.native
  def put(data: Buffer): Unit = js.native
  def put(data: Buffer, encoding: String): Unit = js.native
  
  def size(): Double = js.native
  
  def stop(): Unit = js.native
}
