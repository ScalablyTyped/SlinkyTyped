package typingsSlinky.streamBuffers.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.streamBuffers.streamBuffersBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-buffers", "WritableStreamBuffer")
@js.native
class WritableStreamBuffer () extends Writable {
  def this(options: WritableStreamBufferOptions) = this()
  
  def getContents(): Buffer | `false` = js.native
  def getContents(length: Double): Buffer | `false` = js.native
  
  def getContentsAsString(): String | `false` = js.native
  def getContentsAsString(encoding: js.UndefOr[scala.Nothing], length: Double): String | `false` = js.native
  def getContentsAsString(encoding: String): String | `false` = js.native
  def getContentsAsString(encoding: String, length: Double): String | `false` = js.native
  
  def maxSize(): Double = js.native
  
  def size(): Double = js.native
}
