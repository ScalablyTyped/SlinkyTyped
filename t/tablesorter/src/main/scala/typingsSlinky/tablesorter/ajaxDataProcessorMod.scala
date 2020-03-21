package typingsSlinky.tablesorter

import typingsSlinky.jquery.JQuery_.jqXHR
import typingsSlinky.tablesorter.mod._Global_.HTMLElement
import typingsSlinky.tablesorter.mod._Global_.JQuery
import typingsSlinky.tablesorter.pagerDataPartMod.PagerDataPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Paging/AjaxDataProcessor", JSImport.Namespace)
@js.native
object ajaxDataProcessorMod extends js.Object {
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

