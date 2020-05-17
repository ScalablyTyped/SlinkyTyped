package typingsSlinky.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object operationsTypesMod {
  type InternalOpAsyncExecutor = js.Function3[
    /* node */ typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.Node, 
    /* tensorMap */ typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorsMap, 
    /* context */ typingsSlinky.tensorflowTfjsConverter.executionContextMod.ExecutionContext, 
    js.Promise[
      js.Array[
        typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
      ]
    ]
  ]
  type InternalOpExecutor = js.Function3[
    /* node */ typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.Node, 
    /* tensorMap */ typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorsMap, 
    /* context */ typingsSlinky.tensorflowTfjsConverter.executionContextMod.ExecutionContext, 
    typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ])
  ]
  type OpExecutor = js.Function1[
    /* node */ typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.GraphNode, 
    typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]) | (js.Promise[
      typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
        typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
      ])
    ])
  ]
}
