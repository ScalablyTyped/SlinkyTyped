package typingsSlinky.tablesorter

import typingsSlinky.tablesorter.mod.global.HTMLElement
import typingsSlinky.tablesorter.mod.global.JQuery
import typingsSlinky.tablesorter.tablesorterConfigurationStoreMod.TablesorterConfigurationStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterFunctionMod {
  
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
