package typingsSlinky.winrtUwp.Windows.Graphics.Imaging

import typingsSlinky.winrtUwp.Windows.Foundation.IMemoryBufferReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the pixel data buffer of a bitmap. */
@js.native
trait BitmapBuffer extends js.Object {
  /** Disposes of the object and associated resources. */
  def close(): Unit = js.native
  /**
    * Creates a reference to the underlying memory buffer.
    * @return A reference to the underlying memory buffer.
    */
  def createReference(): IMemoryBufferReference = js.native
  /**
    * Gets the number of bit planes in the bitmap buffer.
    * @return The number of bit planes in the bitmap buffer.
    */
  def getPlaneCount(): Double = js.native
  /**
    * Gets a BitmapPlaneDescription object that describes the size, offset, and stride of the bitmap data in the bit plane with the specified index.
    * @param index The index of the bit plane for which the description is retrieved.
    * @return The bit plane description.
    */
  def getPlaneDescription(index: Double): BitmapPlaneDescription = js.native
}

object BitmapBuffer {
  @scala.inline
  def apply(
    close: () => Unit,
    createReference: () => IMemoryBufferReference,
    getPlaneCount: () => Double,
    getPlaneDescription: Double => BitmapPlaneDescription
  ): BitmapBuffer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), createReference = js.Any.fromFunction0(createReference), getPlaneCount = js.Any.fromFunction0(getPlaneCount), getPlaneDescription = js.Any.fromFunction1(getPlaneDescription))
    __obj.asInstanceOf[BitmapBuffer]
  }
  @scala.inline
  implicit class BitmapBufferOps[Self <: BitmapBuffer] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withGetPlaneCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlaneCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPlaneDescription(value: Double => BitmapPlaneDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlaneDescription")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

