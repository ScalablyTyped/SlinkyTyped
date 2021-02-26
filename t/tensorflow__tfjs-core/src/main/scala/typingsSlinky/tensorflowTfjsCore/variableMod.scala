package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Variable
import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object variableMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/variable", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R]): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/variable", "variable")
  @js.native
  def variable[R /* <: Rank */](
    initialValue: Tensor[R],
    trainable: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    dtype: DataType
  ): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/variable", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: js.UndefOr[scala.Nothing], name: String): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/variable", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: js.UndefOr[scala.Nothing], name: String, dtype: DataType): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/variable", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/variable", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: js.UndefOr[scala.Nothing], dtype: DataType): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/variable", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: String): Variable[R] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/ops/variable", "variable")
  @js.native
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: String, dtype: DataType): Variable[R] = js.native
}
