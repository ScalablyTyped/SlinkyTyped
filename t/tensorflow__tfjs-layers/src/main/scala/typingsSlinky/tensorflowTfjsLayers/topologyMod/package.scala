package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object topologyMod {
  type CallHook = js.Function2[
    /* inputs */ typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]), 
    /* kwargs */ typingsSlinky.tensorflowTfjsLayers.distTypesMod.Kwargs, 
    scala.Unit
  ]
  type Op = js.Function1[
    /* x */ typingsSlinky.tensorflowTfjsLayers.variablesMod.LayerVariable, 
    typingsSlinky.tensorflowTfjsLayers.variablesMod.LayerVariable
  ]
}
