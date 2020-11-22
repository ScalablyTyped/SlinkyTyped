package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Scalar
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/scalar", JSImport.Namespace)
@js.native
object scalarMod extends js.Object {
  
  def scalar(value: String): Scalar = js.native
  def scalar(value: String, dtype: DataType): Scalar = js.native
  def scalar(value: Boolean): Scalar = js.native
  def scalar(value: Boolean, dtype: DataType): Scalar = js.native
  def scalar(value: Double): Scalar = js.native
  def scalar(value: Double, dtype: DataType): Scalar = js.native
  def scalar(value: js.typedarray.Uint8Array): Scalar = js.native
  def scalar(value: js.typedarray.Uint8Array, dtype: DataType): Scalar = js.native
}
