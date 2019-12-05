package typingsSlinky.atTensorflowTfjsDashConverter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcDataTypesMod {
  import org.scalablytyped.runtime.NumberDictionary
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.atTensorflowTfjsDashConverter.distSrcExecutorTensorUnderscoreArrayMod.TensorArray
  import typingsSlinky.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
  import typingsSlinky.atTensorflowTfjsDashCore.distTypesMod.Rank

  type NamedTensorMap = StringDictionary[Tensor[Rank]]
  type NamedTensorsMap = StringDictionary[js.Array[Tensor[Rank]]]
  type TensorArrayMap = NumberDictionary[TensorArray]
}
