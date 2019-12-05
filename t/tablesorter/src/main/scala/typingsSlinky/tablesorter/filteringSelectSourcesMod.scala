package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.filteringFunctionSelectSourceMod.FunctionSelectSource
import typingsSlinky.tablesorter.filteringValidSelectSourcesMod.ValidSelectSources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/SelectSources", JSImport.Namespace)
@js.native
object filteringSelectSourcesMod extends js.Object {
  type SelectSources[TElement] = FunctionSelectSource[TElement] | ValidSelectSources
}

