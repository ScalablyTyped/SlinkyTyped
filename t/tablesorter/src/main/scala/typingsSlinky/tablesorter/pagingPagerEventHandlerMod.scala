package typingsSlinky.tablesorter

import typingsSlinky.jquery.JQuery.TriggeredEvent
import typingsSlinky.tablesorter.pagingPagerConfigurationStoreMod.PagerConfigurationStore
import typingsSlinky.tablesorter.systemTablesorterConfigurationStoreMod.TablesorterConfigurationStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Paging/PagerEventHandler", JSImport.Namespace)
@js.native
object pagingPagerEventHandlerMod extends js.Object {
  type PagerEventHandler[TElement] = js.Function2[
    /* eventArgs */ TriggeredEvent[TElement, Null, TElement, TElement], 
    /* options */ TablesorterConfigurationStore[TElement] | PagerConfigurationStore[TElement], 
    Unit
  ]
}

