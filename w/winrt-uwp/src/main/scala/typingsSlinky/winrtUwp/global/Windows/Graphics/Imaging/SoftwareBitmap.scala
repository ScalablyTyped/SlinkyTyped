package typingsSlinky.winrtUwp.global.Windows.Graphics.Imaging

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an uncompressed bitmap. */
@JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap")
@js.native
class SoftwareBitmap protected ()
  extends typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap {
  /**
    * Initializes a new instance of the SoftwareBitmap class.
    * @param format The pixel format of the new software bitmap.
    * @param width The width of the new software bitmap, in pixels.
    * @param height The height of the new software bitmap, in pixels.
    */
  def this(
    format: typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat,
    width: Double,
    height: Double
  ) = this()
  /**
    * Initializes a new instance of the SoftwareBitmap class.
    * @param format The pixel format of the new software bitmap.
    * @param width The width of the new software bitmap, in pixels.
    * @param height The height of the new software bitmap, in pixels.
    * @param alpha The alpha mode of the new software bitmap.
    */
  def this(
    format: typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat,
    width: Double,
    height: Double,
    alpha: typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
  ) = this()
}
/* static members */
@JSGlobal("Windows.Graphics.Imaging.SoftwareBitmap")
@js.native
object SoftwareBitmap extends js.Object {
  
  /**
    * Converts an existing SoftwareBitmap to a SoftwareBitmap with a different pixel format.
    * @param source The software bitmap to convert.
    * @param format The pixel format of the new software bitmap.
    * @return The converted software bitmap.
    */
  def convert(
    source: typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap,
    format: typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
  ): typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
  /**
    * Converts an existing SoftwareBitmap to a SoftwareBitmap with a different pixel format or alpha mode.
    * @param source The software bitmap to convert.
    * @param format The pixel format of the new software bitmap.
    * @param alpha The alpha mode of the new software bitmap.
    * @return The converted software bitmap.
    */
  def convert(
    source: typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap,
    format: typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat,
    alpha: typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
  ): typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
  
  /**
    * Creates a copy of the provided SoftwareBitmap object.
    * @param source The software bitmap to copy.
    * @return The newly created copy of the software bitmap.
    */
  def copy(source: typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap): typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
  
  /**
    * Creates a new SoftwareBitmap by performing a deep copy of the provided buffer. Modifications to the data in the new SoftwareBitmap will not effect the buffer from which it was created.
    * @param source The source buffer from which the copy will be created.
    * @param format The pixel format of the software bitmap.
    * @param width The width of the software bitmap, in pixels.
    * @param height The height of the software bitmap, in pixels.
    * @return The new software bitmap.
    */
  def createCopyFromBuffer(
    source: IBuffer,
    format: typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat,
    width: Double,
    height: Double
  ): typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
  /**
    * Creates a new SoftwareBitmap by performing a deep copy of the provided buffer. Modifications to the data in the new SoftwareBitmap will not effect the buffer from which it was created.
    * @param source The source buffer from which the copy will be created.
    * @param format The pixel format of the software bitmap.
    * @param width The width of the software bitmap, in pixels.
    * @param height The height of the software bitmap, in pixels.
    * @param alpha The alpha mode of the software bitmap.
    * @return The new software bitmap.
    */
  def createCopyFromBuffer(
    source: IBuffer,
    format: typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat,
    width: Double,
    height: Double,
    alpha: typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
  ): typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap = js.native
  
  /**
    * Asynchronously creates a new SoftwareBitmap by performing a deep copy of the provided IDirect3DSurface . Modifications to the data in the new SoftwareBitmap will not effect the surface from which it was created.
    * @param surface The source surface from which the copy will be created.
    * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
    */
  def createCopyFromSurfaceAsync(surface: IDirect3DSurface): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap] = js.native
  /**
    * Asynchronously creates a new SoftwareBitmap by performing a deep copy of the provided IDirect3DSurface . Modifications to the data in the new SoftwareBitmap will not effect the surface from which it was created.
    * @param surface The source surface from which the copy will be created.
    * @param alpha The alpha mode of the software bitmap.
    * @return An asynchronous operation that returns a SoftwareBitmap on successful completion.
    */
  def createCopyFromSurfaceAsync(surface: IDirect3DSurface, alpha: typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap] = js.native
}
