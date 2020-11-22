package typingsSlinky.tensorflowTfjsLayers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object distTypesMod {
  
  type Kwargs = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type LossOrMetricFn = js.Function2[
    /* yTrue */ typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    /* yPred */ typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  
  type RegularizerFn = js.Function0[typingsSlinky.tensorflowTfjsCore.distTensorMod.Scalar]
  
  type RnnStepFunction = js.Function2[
    /* inputs */ typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    /* states */ js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ], 
    js.Tuple2[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
      js.Array[
        typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]
  ]
  
  type TensorOrArrayOrMap = typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ]) | typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
}
