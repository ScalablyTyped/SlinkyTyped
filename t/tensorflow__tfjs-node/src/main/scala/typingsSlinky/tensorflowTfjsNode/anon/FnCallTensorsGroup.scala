package typingsSlinky.tensorflowTfjsNode.anon

import typingsSlinky.tensorflowTfjsCore.anon.Data
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensor
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsCore.typesMod.WeightGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallTensorsGroup extends js.Object {
  
  def apply(tensors: js.Array[NamedTensor]): js.Promise[Data] = js.native
  def apply(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Data] = js.native
  def apply(tensors: NamedTensorMap): js.Promise[Data] = js.native
  def apply(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Data] = js.native
}
