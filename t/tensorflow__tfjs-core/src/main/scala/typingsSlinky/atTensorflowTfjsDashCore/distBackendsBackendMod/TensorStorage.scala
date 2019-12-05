package typingsSlinky.atTensorflowTfjsDashCore.distBackendsBackendMod

import typingsSlinky.atTensorflowTfjsDashCore.Anon_Unreliable
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.DataId
import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.BackendValues
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.DataType
import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.PixelData
import typingsSlinky.std.HTMLCanvasElement
import typingsSlinky.std.HTMLImageElement
import typingsSlinky.std.HTMLVideoElement
import typingsSlinky.std.ImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorStorage extends js.Object {
  def disposeData(dataId: DataId): Unit = js.native
  def fromPixels(pixels: PixelData, numChannels: Double): Tensor3D = js.native
  def fromPixels(pixels: HTMLCanvasElement, numChannels: Double): Tensor3D = js.native
  def fromPixels(pixels: HTMLImageElement, numChannels: Double): Tensor3D = js.native
  def fromPixels(pixels: HTMLVideoElement, numChannels: Double): Tensor3D = js.native
  def fromPixels(pixels: ImageData, numChannels: Double): Tensor3D = js.native
  def memory(): Anon_Unreliable = js.native
  def move(dataId: DataId, values: BackendValues, shape: js.Array[Double], dtype: DataType): Unit = js.native
  /** Returns number of data ids currently in the storage. */
  def numDataIds(): Double = js.native
  def read(dataId: DataId): js.Promise[BackendValues] = js.native
  def readSync(dataId: DataId): BackendValues = js.native
  def write(values: BackendValues, shape: js.Array[Double], dtype: DataType): DataId = js.native
}

