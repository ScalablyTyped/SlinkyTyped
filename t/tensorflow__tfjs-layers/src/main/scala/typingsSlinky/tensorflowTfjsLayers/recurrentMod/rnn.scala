package typingsSlinky.tensorflowTfjsLayers.recurrentMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.mod.Tensor_
import typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "rnn")
@js.native
object rnn extends js.Object {
  def apply(stepFunction: RnnStepFunction, inputs: Tensor_[Rank], initialStates: js.Array[Tensor_[Rank]]): js.Tuple3[Tensor_[Rank], Tensor_[Rank], js.Array[Tensor_[Rank]]] = js.native
  def apply(
    stepFunction: RnnStepFunction,
    inputs: Tensor_[Rank],
    initialStates: js.Array[Tensor_[Rank]],
    goBackwards: Boolean
  ): js.Tuple3[Tensor_[Rank], Tensor_[Rank], js.Array[Tensor_[Rank]]] = js.native
  def apply(
    stepFunction: RnnStepFunction,
    inputs: Tensor_[Rank],
    initialStates: js.Array[Tensor_[Rank]],
    goBackwards: Boolean,
    mask: Tensor_[Rank]
  ): js.Tuple3[Tensor_[Rank], Tensor_[Rank], js.Array[Tensor_[Rank]]] = js.native
  def apply(
    stepFunction: RnnStepFunction,
    inputs: Tensor_[Rank],
    initialStates: js.Array[Tensor_[Rank]],
    goBackwards: Boolean,
    mask: Tensor_[Rank],
    constants: js.Array[Tensor_[Rank]]
  ): js.Tuple3[Tensor_[Rank], Tensor_[Rank], js.Array[Tensor_[Rank]]] = js.native
  def apply(
    stepFunction: RnnStepFunction,
    inputs: Tensor_[Rank],
    initialStates: js.Array[Tensor_[Rank]],
    goBackwards: Boolean,
    mask: Tensor_[Rank],
    constants: js.Array[Tensor_[Rank]],
    unroll: Boolean
  ): js.Tuple3[Tensor_[Rank], Tensor_[Rank], js.Array[Tensor_[Rank]]] = js.native
  def apply(
    stepFunction: RnnStepFunction,
    inputs: Tensor_[Rank],
    initialStates: js.Array[Tensor_[Rank]],
    goBackwards: Boolean,
    mask: Tensor_[Rank],
    constants: js.Array[Tensor_[Rank]],
    unroll: Boolean,
    needPerStepOutputs: Boolean
  ): js.Tuple3[Tensor_[Rank], Tensor_[Rank], js.Array[Tensor_[Rank]]] = js.native
}

