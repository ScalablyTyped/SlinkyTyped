package typingsSlinky.webix.mod.ui

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datafilter {
  
  @JSImport("webix", "ui.datafilter.columnGroup")
  @js.native
  class columnGroup () extends textFilter
  
  @JSImport("webix", "ui.datafilter.dateFilter")
  @js.native
  class dateFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.dateRangeFilter")
  @js.native
  class dateRangeFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.datepickerFilter")
  @js.native
  class datepickerFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.masterCheckbox")
  @js.native
  class masterCheckbox () extends textFilter
  
  @JSImport("webix", "ui.datafilter.multiComboFilter")
  @js.native
  class multiComboFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.multiSelectFilter")
  @js.native
  class multiSelectFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.numberFilter")
  @js.native
  class numberFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.selectFilter")
  @js.native
  class selectFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.serverFilter")
  @js.native
  class serverFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.serverMultiSelectFilter")
  @js.native
  class serverMultiSelectFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.serverSelectFilter")
  @js.native
  class serverSelectFilter () extends textFilter
  
  @JSImport("webix", "ui.datafilter.summColumn")
  @js.native
  class summColumn () extends textFilter
  
  @JSImport("webix", "ui.datafilter.textFilter")
  @js.native
  class textFilter () extends WebixFilter {
    
    def getInputNode(node: HTMLElement): HTMLElement = js.native
  }
}
