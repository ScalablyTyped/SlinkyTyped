package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.dataMod.DataComponent
import typingsSlinky.vegaLite.facetMod.FacetNode
import typingsSlinky.vegaLite.srcDataMod.InlineDataset
import typingsSlinky.vegaLite.utilMod.Dict
import typingsSlinky.vegaLite.vegaSchemaMod.VgData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/data/assemble", "assembleFacetData")
  @js.native
  def assembleFacetData(root: FacetNode): js.Array[VgData] = js.native
  
  @JSImport("vega-lite/build/src/compile/data/assemble", "assembleRootData")
  @js.native
  def assembleRootData(dataComponent: DataComponent, datasets: Dict[InlineDataset]): js.Array[VgData] = js.native
}
