package typingsSlinky.atTensorflowTfjsDashNode

import typingsSlinky.atTensorflowTfjsDashCore.Anon_Data
import typingsSlinky.atTensorflowTfjsDashCore.distIoTypesMod.WeightGroup
import typingsSlinky.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensor
import typingsSlinky.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Group extends js.Object {
  def apply(tensors: js.Array[NamedTensor]): js.Promise[Anon_Data] = js.native
  def apply(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Anon_Data] = js.native
  def apply(tensors: NamedTensorMap): js.Promise[Anon_Data] = js.native
  def apply(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Anon_Data] = js.native
}

