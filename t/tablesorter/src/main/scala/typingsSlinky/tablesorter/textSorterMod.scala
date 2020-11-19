package typingsSlinky.tablesorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tablesorter/Sorting/TextSorter", JSImport.Namespace)
@js.native
object textSorterMod extends js.Object {
  
  type TextSorter[TElement] = js.Function5[
    /* x */ String, 
    /* y */ String, 
    /* ascending */ Boolean, 
    /* index */ Double, 
    /* table */ TElement, 
    Double
  ]
}
