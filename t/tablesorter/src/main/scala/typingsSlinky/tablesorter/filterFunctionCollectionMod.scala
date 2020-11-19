package typingsSlinky.tablesorter

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tablesorter.filterFunctionMod.FilterFunction
import typingsSlinky.tablesorter.tablesorterBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/Filtering/FilterFunctionCollection", JSImport.Namespace)
@js.native
object filterFunctionCollectionMod extends js.Object {
  
  type FilterFunctionCollection[TElement] = /**
    * The display-name of the filter-function and the `FilterFunction` itself.
    */
  StringDictionary[FilterFunction[TElement] | `true`]
}
