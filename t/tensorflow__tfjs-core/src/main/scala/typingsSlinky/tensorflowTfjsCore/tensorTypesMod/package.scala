package typingsSlinky.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tensorTypesMod {
  
  type GradSaveFunc = js.Function1[
    /* save */ js.Array[
      typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ], 
    scala.Unit
  ]
  
  type NamedTensorMap = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  
  type NamedVariableMap = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.tensorflowTfjsCore.tensorMod.Variable[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainerObject
    - typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainerArray
    - typingsSlinky.std.Float32Array
    - typingsSlinky.std.Int32Array
    - typingsSlinky.std.Uint8Array
  */
  type TensorContainer = typingsSlinky.tensorflowTfjsCore.tensorTypesMod._TensorContainer | typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | scala.Unit | java.lang.String | scala.Double | scala.Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array
}
