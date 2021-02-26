package typingsSlinky.tablesorter

import typingsSlinky.jquery.JQuery.Selector
import typingsSlinky.tablesorter.mod.global.HTMLElement
import typingsSlinky.tablesorter.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stickyHeaderOptionsMod {
  
  @js.native
  trait StickyHeaderOptions extends StObject {
    
    /**
      * A set of classes to add to the sticky header.
      */
    var stickyHeaders: js.UndefOr[String] = js.native
    
    /**
      * A value indicating whether the table should be resized automatically when data is added to or removed from the table.
      */
    var stickyHeaders_addResizeEvent: js.UndefOr[Boolean] = js.native
    
    /**
      * A jQuery-selector to get an element to append the sticky header to.
      */
    var stickyHeaders_appendTo: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
    
    /**
      * A jQuery-selector to get an element to attach the sticky header to.
      */
    var stickyHeaders_attachTo: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
    
    /**
      * A string to append to the table-id for the cloned sticky table.
      */
    var stickyHeaders_cloneId: js.UndefOr[String] = js.native
    
    /**
      * A value indicating whether the filter should be scrolled into view when inputing a filter.
      */
    var stickyHeaders_filteredToTop: js.UndefOr[Boolean] = js.native
    
    /**
      * A value indicating whether the caption should be included in the sticky header.
      */
    var stickyHeaders_includeCaption: js.UndefOr[Boolean] = js.native
    
    /**
      * Either a number of the offset to the top of the browser-window or a jQuery-selector or -object for the elemtn which represents the offset.
      */
    var stickyHeaders_offset: js.UndefOr[Double | Selector | JQuery[HTMLElement]] = js.native
    
    /**
      * The jQuery-selector or -object to monitor for horizontal scrolling.
      */
    var stickyHeaders_xScroll: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
    
    /**
      * The jQuery-selector or -object to monitor for vertical scrolling.
      */
    var stickyHeaders_yScroll: js.UndefOr[Selector | JQuery[HTMLElement]] = js.native
    
    /**
      * The z-index of the sticky header.
      */
    var stickyHeaders_zindex: js.UndefOr[Double] = js.native
  }
  object StickyHeaderOptions {
    
    @scala.inline
    def apply(): StickyHeaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StickyHeaderOptions]
    }
    
    @scala.inline
    implicit class StickyHeaderOptionsMutableBuilder[Self <: StickyHeaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStickyHeaders(value: String): Self = StObject.set(x, "stickyHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeadersUndefined: Self = StObject.set(x, "stickyHeaders", js.undefined)
      
      @scala.inline
      def setStickyHeaders_addResizeEvent(value: Boolean): Self = StObject.set(x, "stickyHeaders_addResizeEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeaders_addResizeEventUndefined: Self = StObject.set(x, "stickyHeaders_addResizeEvent", js.undefined)
      
      @scala.inline
      def setStickyHeaders_appendTo(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "stickyHeaders_appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeaders_appendToUndefined: Self = StObject.set(x, "stickyHeaders_appendTo", js.undefined)
      
      @scala.inline
      def setStickyHeaders_attachTo(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "stickyHeaders_attachTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeaders_attachToUndefined: Self = StObject.set(x, "stickyHeaders_attachTo", js.undefined)
      
      @scala.inline
      def setStickyHeaders_cloneId(value: String): Self = StObject.set(x, "stickyHeaders_cloneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeaders_cloneIdUndefined: Self = StObject.set(x, "stickyHeaders_cloneId", js.undefined)
      
      @scala.inline
      def setStickyHeaders_filteredToTop(value: Boolean): Self = StObject.set(x, "stickyHeaders_filteredToTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeaders_filteredToTopUndefined: Self = StObject.set(x, "stickyHeaders_filteredToTop", js.undefined)
      
      @scala.inline
      def setStickyHeaders_includeCaption(value: Boolean): Self = StObject.set(x, "stickyHeaders_includeCaption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeaders_includeCaptionUndefined: Self = StObject.set(x, "stickyHeaders_includeCaption", js.undefined)
      
      @scala.inline
      def setStickyHeaders_offset(value: Double | Selector | JQuery[HTMLElement]): Self = StObject.set(x, "stickyHeaders_offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeaders_offsetUndefined: Self = StObject.set(x, "stickyHeaders_offset", js.undefined)
      
      @scala.inline
      def setStickyHeaders_xScroll(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "stickyHeaders_xScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeaders_xScrollUndefined: Self = StObject.set(x, "stickyHeaders_xScroll", js.undefined)
      
      @scala.inline
      def setStickyHeaders_yScroll(value: Selector | JQuery[HTMLElement]): Self = StObject.set(x, "stickyHeaders_yScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeaders_yScrollUndefined: Self = StObject.set(x, "stickyHeaders_yScroll", js.undefined)
      
      @scala.inline
      def setStickyHeaders_zindex(value: Double): Self = StObject.set(x, "stickyHeaders_zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyHeaders_zindexUndefined: Self = StObject.set(x, "stickyHeaders_zindex", js.undefined)
    }
  }
}
