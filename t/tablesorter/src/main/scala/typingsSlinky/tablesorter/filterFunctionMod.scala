package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.mod.global.HTMLElement
import typingsSlinky.tablesorter.mod.global.JQuery
import typingsSlinky.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Filtering/FilterFunction", JSImport.Namespace)
@js.native
object filterFunctionMod extends js.Object {
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

