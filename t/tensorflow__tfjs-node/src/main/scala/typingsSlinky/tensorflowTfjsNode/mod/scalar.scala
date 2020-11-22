package typingsSlinky.tensorflowTfjsNode.mod

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Scalar
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-node", "scalar")
@js.native
object scalar extends js.Object {
  
  def apply(value: String): Scalar = js.native
  def apply(value: String, dtype: DataType): Scalar = js.native
  def apply(value: Boolean): Scalar = js.native
  def apply(value: Boolean, dtype: DataType): Scalar = js.native
  def apply(value: Double): Scalar = js.native
  def apply(value: Double, dtype: DataType): Scalar = js.native
  def apply(value: js.typedarray.Uint8Array): Scalar = js.native
  def apply(value: js.typedarray.Uint8Array, dtype: DataType): Scalar = js.native
}
