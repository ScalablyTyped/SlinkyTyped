package typingsSlinky.winrtUwp.Windows.Media

import typingsSlinky.winrtUwp.Windows.Foundation.IMemoryBufferReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a buffer containing audio data. */
@js.native
trait AudioBuffer extends js.Object {
  /** Gets the maximum number of bytes that the buffer can hold. */
  var capacity: Double = js.native
  /** Gets or sets the number of bytes currently in use in the buffer. */
  var length: Double = js.native
  /** Disposes of the object and associated resources. */
  def close(): Unit = js.native
  /**
    * Returns an IMemoryBufferReference representation of the audio buffer.
    * @return The IMemoryBufferReference representation of the audio buffer.
    */
  def createReference(): IMemoryBufferReference = js.native
}

object AudioBuffer {
  @scala.inline
  def apply(capacity: Double, close: () => Unit, createReference: () => IMemoryBufferReference, length: Double): AudioBuffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), createReference = js.Any.fromFunction0(createReference), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBuffer]
  }
  @scala.inline
  implicit class AudioBufferOps[Self <: AudioBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capacity")(value.asInstanceOf[js.Any])
        ret
    }
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
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

