package typingsSlinky.tensorflowTfjsConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type NamedTensorMap = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ]
  
  type NamedTensorsMap = org.scalablytyped.runtime.StringDictionary[
    js.Array[
      typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]
  
  type TensorArrayMap = org.scalablytyped.runtime.NumberDictionary[typingsSlinky.tensorflowTfjsConverter.tensorArrayMod.TensorArray]
}
