package typingsSlinky.atTensorflowTfjsDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTensorUnderscoreTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Tensor
  import typingsSlinky.atTensorflowTfjsDashCore.distTensorMod.Variable
  import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank

  type GradSaveFunc = js.Function1[/* save */ js.Array[Tensor[Rank]], Unit]
  type NamedTensorMap = StringDictionary[Tensor[Rank]]
  type NamedVariableMap = StringDictionary[Variable[Rank]]
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainerObject
    - typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainerArray
    - typings.std.Float32Array
    - typings.std.Int32Array
    - typings.std.Uint8Array
  */
  type TensorContainer = _TensorContainer | Tensor[Rank] | Unit | String | Double | Boolean | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint8Array
}
