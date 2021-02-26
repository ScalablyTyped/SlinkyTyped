package typingsSlinky.tablesorter

import typingsSlinky.jquery.JQuery.jqXHR
import typingsSlinky.tablesorter.mod.global.HTMLElement
import typingsSlinky.tablesorter.mod.global.JQuery
import typingsSlinky.tablesorter.pagerDataPartMod.PagerDataPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajaxDataProcessorMod {
  
  type AjaxDataProcessor[TElement] = js.Function3[
    /* data */ js.Any, 
    /* table */ TElement, 
    /* request */ jqXHR[js.Any], 
    PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[
      Double, 
      JQuery[HTMLElement] | js.Array[js.Array[js.Any]], 
      js.UndefOr[js.Array[String]]
    ])
  ]
}
