package typingsSlinky.tablesorter

import typingsSlinky.jquery.JQuery.Ajax.SuccessCallback
import typingsSlinky.jquery.JQuery.Ajax.SuccessTextStatus
import typingsSlinky.jquery.JQuery.jqXHR
import typingsSlinky.tablesorter.mod.global.HTMLElement
import typingsSlinky.tablesorter.mod.global.JQuery
import typingsSlinky.tablesorter.pagerConfigurationMod.PagerConfiguration
import typingsSlinky.tablesorter.pagerDataPartMod.PagerDataPart
import typingsSlinky.tablesorter.pagerMemoryMod.PagerMemory
import typingsSlinky.tablesorter.sortDefinitionMod.SortDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerConfigurationStoreMod {
  
  @js.native
  trait PagerConfigurationStore[TElement] extends PagerConfiguration[TElement] {
    
    /**
      * The jQuery-object which contains the container-control.
      */
    @JSName("$container")
    var $container: JQuery[HTMLElement] = js.native
    
    /**
      * The jQuery-object which contains the control for jumping to pages.
      */
    @JSName("$goto")
    var $goto: JQuery[HTMLElement] = js.native
    
    /**
      * The jQuery-object which contains the size-control.
      */
    @JSName("$size")
    var $size: JQuery[HTMLElement] = js.native
    
    /**
      * A value indicating whether ajax is enabled.
      */
    var ajax: Boolean = js.native
    
    /**
      * The number of performed ajax-request.
      */
    var ajaxCounter: Double = js.native
    
    /**
      * The result of the ajax-request.
      */
    var ajaxData: PagerDataPart[TElement] | js.Array[Double] | (js.Tuple3[Double, JQuery[HTMLElement] | js.Array[js.Array[_]], js.UndefOr[js.Array[String]]]) = js.native
    
    /**
      * The url to query data from.
      */
    @JSName("ajaxUrl")
    var ajaxUrl_PagerConfigurationStore: String = js.native
    
    /**
      * The index of the cached rows which are being displayed.
      */
    var cachedIndex: js.Array[Double] = js.native
    
    /**
      * The applied filters.
      */
    var currentFilters: js.Array[String] = js.native
    
    /**
      * The number of the last row being displayed.
      */
    var endRow: Double = js.native
    
    /**
      * The amount of filtered pages.
      */
    var filteredPages: Double = js.native
    
    /**
      * The amount of filtered rows.
      */
    var filteredRows: Double = js.native
    
    /**
      * A value indicating whether the pager is initialized.
      */
    var initialized: Boolean = js.native
    
    /**
      * A value indicating whether the pager is initializing.
      */
    var initializing: Boolean = js.native
    
    /**
      * A value indicating whether the pager is disabled.
      */
    var isDisabled: Boolean = js.native
    
    /**
      * The last memorized settings of the `pager`.
      */
    var last: PagerMemory = js.native
    
    /**
      * The old success-callback of the ajax-settings.
      */
    def oldAjaxSuccess(data: js.Any, textStatus: SuccessTextStatus, jqXHR: jqXHR[_]): Unit = js.native
    /**
      * The old success-callback of the ajax-settings.
      */
    @JSName("oldAjaxSuccess")
    var oldAjaxSuccess_Original: SuccessCallback[_] = js.native
    
    /**
      * The optional url to query data from.
      */
    var optAjaxUrl: String = js.native
    
    @JSName("page")
    var page_PagerConfigurationStore: Double = js.native
    
    /**
      * The regex for identifying filtered rows.
      */
    var regexFiltered: js.RegExp = js.native
    
    /**
      * The regex for identifying rows.
      */
    var regexRows: js.RegExp = js.native
    
    /**
      * The initial settings of the pager.
      */
    var settings: PagerConfiguration[TElement] = js.native
    
    @JSName("size")
    var size_PagerConfigurationStore: Double = js.native
    
    /**
      * The sorting to apply.
      */
    var sortList: js.Array[SortDefinition] = js.native
    
    /**
      * The number of the first row being displayed.
      */
    var startRow: Double = js.native
    
    /**
      * The total amount of pages.
      */
    var totalPages: Double = js.native
    
    /**
      * The total amount of rows.
      */
    var totalRows: Double = js.native
  }
}
