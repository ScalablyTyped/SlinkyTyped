package typingsSlinky.tablesorter

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tablesorter.filteringFilterFunctionMod.FilterFunction
import typingsSlinky.tablesorter.tablesorterBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/FilterFunctionCollection", JSImport.Namespace)
@js.native
object filteringFilterFunctionCollectionMod extends js.Object {
  type FilterFunctionCollection[TElement] = /**
    * The display-name of the filter-function and the `FilterFunction` itself.
    */
  StringDictionary[FilterFunction[TElement] | `true`]
}

