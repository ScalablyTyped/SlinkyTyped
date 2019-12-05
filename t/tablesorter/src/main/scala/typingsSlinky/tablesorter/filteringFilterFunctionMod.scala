package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import typingsSlinky.tablesorter.tablesorterMod._Global_.HTMLElement
import typingsSlinky.tablesorter.tablesorterMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/FilterFunction", JSImport.Namespace)
@js.native
object filteringFilterFunctionMod extends js.Object {
  type FilterFunction[TElement] = js.Function7[
    /* originalContent */ String, 
    /* normalizedText */ String, 
    /* filterInput */ String, 
    /* index */ Double, 
    /* row */ JQuery[HTMLElement], 
    /* config */ TablesorterConfigurationStore[TElement], 
    /* data */ js.Object, 
    Boolean
  ]
}

