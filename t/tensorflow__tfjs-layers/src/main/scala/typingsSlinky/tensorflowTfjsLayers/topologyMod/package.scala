package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object topologyMod {
  
  type CallHook = js.Function2[
    /* inputs */ typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]), 
    /* kwargs */ typingsSlinky.tensorflowTfjsLayers.distTypesMod.Kwargs, 
    scala.Unit
  ]
  
  type Op = js.Function1[
    /* x */ typingsSlinky.tensorflowTfjsLayers.variablesMod.LayerVariable, 
    typingsSlinky.tensorflowTfjsLayers.variablesMod.LayerVariable
  ]
}
