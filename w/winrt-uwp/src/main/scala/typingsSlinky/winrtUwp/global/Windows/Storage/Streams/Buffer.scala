package typingsSlinky.winrtUwp.global.Windows.Storage.Streams

import typingsSlinky.winrtUwp.Windows.Foundation.IMemoryBuffer
import typingsSlinky.winrtUwp.Windows.Foundation.MemoryBuffer
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a default implementation of the IBuffer interface and its related interfaces. */
@JSGlobal("Windows.Storage.Streams.Buffer")
@js.native
class Buffer protected ()
  extends typingsSlinky.winrtUwp.Windows.Storage.Streams.Buffer {
  /**
    * Initializes a new instance of the Buffer class with the specified capacity.
    * @param capacity The maximum number of bytes that the buffer can hold.
    */
  def this(capacity: Double) = this()
}
/* static members */
@JSGlobal("Windows.Storage.Streams.Buffer")
@js.native
object Buffer extends js.Object {
  
  /**
    * Creates a new buffer containing a copy of a specified buffer.
    * @param input The buffer to be copied.
    * @return The newly created copy.
    */
  def createCopyFromMemoryBuffer(input: IMemoryBuffer): typingsSlinky.winrtUwp.Windows.Storage.Streams.Buffer = js.native
  
  /**
    * Creates a MemoryBuffer from an existing IBuffer .
    * @param input The input IBuffer .
    * @return The newly created MemoryBuffer .
    */
  def createMemoryBufferOverIBuffer(input: IBuffer): MemoryBuffer = js.native
}
