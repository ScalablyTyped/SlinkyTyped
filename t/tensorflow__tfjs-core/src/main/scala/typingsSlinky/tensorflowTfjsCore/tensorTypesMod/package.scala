package typingsSlinky.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}
