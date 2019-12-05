package typingsSlinky.atTensorflowTfjsDashLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEngineTopologyMod {
  import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
  import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank
  import typingsSlinky.atTensorflowTfjsDashLayers.distTypesMod.Kwargs
  import typingsSlinky.atTensorflowTfjsDashLayers.distVariablesMod.LayerVariable

  type CallHook = js.Function2[/* inputs */ Tensor[Rank] | js.Array[Tensor[Rank]], /* kwargs */ Kwargs, Unit]
  type Op = js.Function1[/* x */ LayerVariable, LayerVariable]
}
