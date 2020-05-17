package typingsSlinky.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a reference counted memory buffer. */
@js.native
trait MemoryBuffer extends js.Object {
  /** Disconnects this MemoryBuffer object from the actual memory buffer. */
  def close(): Unit = js.native
  /**
    * Returns a new managed object that implements the IMemoryBufferReference interface.
    * @return A new managed object that implements the IMemoryBufferReference interface.
    */
  def createReference(): IMemoryBufferReference = js.native
}

object MemoryBuffer {
  @scala.inline
  def apply(close: () => Unit, createReference: () => IMemoryBufferReference): MemoryBuffer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), createReference = js.Any.fromFunction0(createReference))
    __obj.asInstanceOf[MemoryBuffer]
  }
  @scala.inline
  implicit class MemoryBufferOps[Self <: MemoryBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCreateReference(value: () => IMemoryBufferReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createReference")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

