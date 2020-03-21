package typingsSlinky.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object operationsTypesMod {
  type InternalOpExecutor = js.Function3[
    /* node */ typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.Node, 
    /* tensorMap */ typingsSlinky.tensorflowTfjsConverter.typesMod.NamedTensorsMap, 
    /* context */ typingsSlinky.tensorflowTfjsConverter.executionContextMod.ExecutionContext, 
    typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]) | (js.Promise[
      typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
        typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
      ])
    ])
  ]
  type OpExecutor = js.Function1[
    /* node */ typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.GraphNode, 
    typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]) | (js.Promise[
      typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
        typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
      ])
    ])
  ]
  type ValueType = java.lang.String | (js.Array[
    js.Array[scala.Double] | scala.Boolean | scala.Double | java.lang.String | typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ]) | scala.Double | scala.Boolean | typingsSlinky.tensorflowTfjsCore.mod.Tensor_[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
}
