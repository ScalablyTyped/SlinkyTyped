package typingsSlinky.tensorflowTfjsNode

import typingsSlinky.tensorflowTfjsCore.AnonData
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensor
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsCore.typesMod.WeightGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallTensorsGroup extends js.Object {
  def apply(tensors: js.Array[NamedTensor]): js.Promise[AnonData] = js.native
  def apply(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[AnonData] = js.native
  def apply(tensors: NamedTensorMap): js.Promise[AnonData] = js.native
  def apply(tensors: NamedTensorMap, group: WeightGroup): js.Promise[AnonData] = js.native
}

