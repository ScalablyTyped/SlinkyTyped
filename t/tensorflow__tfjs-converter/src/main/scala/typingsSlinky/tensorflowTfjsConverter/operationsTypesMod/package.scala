package typingsSlinky.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object operationsTypesMod {
  
  type InternalOpAsyncExecutor = js.Function4[
    /* node */ typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.Node, 
    /* tensorMap */ typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorsMap, 
    /* context */ typingsSlinky.tensorflowTfjsConverter.executionContextMod.ExecutionContext, 
    /* resourceManager */ js.UndefOr[typingsSlinky.tensorflowTfjsConverter.resourceManagerMod.ResourceManager], 
    js.Promise[
      js.Array[
        typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]
  ]
  
  type InternalOpExecutor = js.Function3[
    /* node */ typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.Node, 
    /* tensorMap */ typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorsMap, 
    /* context */ typingsSlinky.tensorflowTfjsConverter.executionContextMod.ExecutionContext, 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ])
  ]
  
  type OpExecutor = js.Function1[
    /* node */ typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.GraphNode, 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]) | (js.Promise[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
        typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
      ])
    ])
  ]
  
  type ValueType = java.lang.String | (js.Array[
    js.Array[scala.Double] | scala.Boolean | scala.Double | java.lang.String | typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ]) | scala.Double | scala.Boolean | typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
}
