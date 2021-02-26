package typingsSlinky.tablesorter

import typingsSlinky.jquery.JQuery.Selector
import typingsSlinky.tablesorter.mod.global.HTMLElement
import typingsSlinky.tablesorter.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pagerSelectorsMod {
  
  @js.native
  trait PagerSelectors extends StObject {
    
    /**
      * The selector for querying the pager-container.
      */
    var container: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
    
    /**
      * The selector for querying the control to jump to the first page.
      */
    var first: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
    
    /**
      * The selector for querying the dropdown-control to jump to a specific page.
      */
    var gotoPage: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
    
    /**
      * The selector for querying the control to jump to the last page.
      */
    var last: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
    
    /**
      * The selector for querying the control to jump to the next page.
      */
    var next: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
    
    /**
      * The selector for querying the container to print the output to.
      */
    var pageDisplay: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
    
    /**
      * The selector for querying the control to set the page-size.
      */
    var pageSize: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
    
    /**
      * The selector for querying the control to jump to the previous page.
      */
    var prev: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
  }
  object PagerSelectors {
    
    @scala.inline
    def apply(): PagerSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerSelectors]
    }
    
    @scala.inline
    implicit class PagerSelectorsMutableBuilder[Self <: PagerSelectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setFirst(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      @scala.inline
      def setGotoPage(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "gotoPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGotoPageUndefined: Self = StObject.set(x, "gotoPage", js.undefined)
      
      @scala.inline
      def setLast(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      @scala.inline
      def setNext(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPageDisplay(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "pageDisplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageDisplayUndefined: Self = StObject.set(x, "pageDisplay", js.undefined)
      
      @scala.inline
      def setPageSize(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPrev(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    }
  }
}
