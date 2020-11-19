package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.functionSelectSourceMod.FunctionSelectSource
import typingsSlinky.tablesorter.validSelectSourcesMod.ValidSelectSources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/Filtering/SelectSources", JSImport.Namespace)
@js.native
object selectSourcesMod extends js.Object {
  
  type SelectSources[TElement] = FunctionSelectSource[TElement] | ValidSelectSources
}
