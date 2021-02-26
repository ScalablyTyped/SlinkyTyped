package typingsSlinky.sortablejs

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.sortablejs.mod.SortableEvent
import typingsSlinky.sortablejs.mod.^
import typingsSlinky.sortablejs.sortablejsStrings.continue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMod {
  
  @JSImport("sortablejs/plugins", "AutoScrollPlugin")
  @js.native
  class AutoScrollPlugin () extends StObject
  
  @JSImport("sortablejs/plugins", "MultiDragPlugin")
  @js.native
  class MultiDragPlugin () extends StObject
  
  @JSImport("sortablejs/plugins", "OnSpillPlugin")
  @js.native
  class OnSpillPlugin () extends StObject
  
  @JSImport("sortablejs/plugins", "SortablePlugin")
  @js.native
  class SortablePlugin () extends StObject
  
  @JSImport("sortablejs/plugins", "SwapPlugin")
  @js.native
  class SwapPlugin () extends StObject
  
  @js.native
  trait AutoScrollOptions extends StObject {
    
    /**
      * apply autoscroll to all parent elements, allowing for easier movement.
      */
    var bubbleScroll: js.UndefOr[Boolean] = js.native
    
    /**
      *  Enable the plugin. Can be `HTMLElement`.
      */
    var scroll: js.UndefOr[Boolean | HTMLElement] = js.native
    
    /**
      * if you have custom scrollbar scrollFn may be used for autoscrolling.
      */
    var scrollFn: js.UndefOr[
        js.ThisFunction5[
          /* this */ ^, 
          /* offsetX */ Double, 
          /* offsetY */ Double, 
          /* originalEvent */ Event, 
          /* touchEvt */ TouchEvent, 
          /* hoverTargetEl */ HTMLElement, 
          continue | Unit
        ]
      ] = js.native
    
    /**
      * `px`, how near the mouse must be to an edge to start scrolling.
      */
    var scrollSensitivity: js.UndefOr[Double] = js.native
    
    /**
      * `px`, speed of the scrolling.`
      */
    var scrollSpeed: js.UndefOr[Double] = js.native
  }
  object AutoScrollOptions {
    
    @scala.inline
    def apply(): AutoScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoScrollOptions]
    }
    
    @scala.inline
    implicit class AutoScrollOptionsMutableBuilder[Self <: AutoScrollOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBubbleScroll(value: Boolean): Self = StObject.set(x, "bubbleScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubbleScrollUndefined: Self = StObject.set(x, "bubbleScroll", js.undefined)
      
      @scala.inline
      def setScroll(value: Boolean | HTMLElement): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollFn(
        value: js.ThisFunction5[
              /* this */ ^, 
              /* offsetX */ Double, 
              /* offsetY */ Double, 
              /* originalEvent */ Event, 
              /* touchEvt */ TouchEvent, 
              /* hoverTargetEl */ HTMLElement, 
              continue | Unit
            ]
      ): Self = StObject.set(x, "scrollFn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollFnUndefined: Self = StObject.set(x, "scrollFn", js.undefined)
      
      @scala.inline
      def setScrollHTMLElement(value: HTMLElement): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
      
      @scala.inline
      def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
  
  @js.native
  trait MultiDragOptions extends StObject {
    
    /**
      * Enable the plugin
      */
    var multiDrag: js.UndefOr[Boolean] = js.native
    
    /**
      * Key that must be down for items to be selected
      */
    // todo: create a type
    // todo: check source code for type
    var multiDragKey: js.UndefOr[Null] = js.native
    
    /**
      * Called when an item is deselected
      */
    var onDeselect: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    
    /**
      * Called when an item is selected
      */
    var onSelect: js.UndefOr[js.Function1[/* event */ SortableEvent, Unit]] = js.native
    
    /**
      * Class name for selected item
      */
    var selectedClass: js.UndefOr[String] = js.native
  }
  object MultiDragOptions {
    
    @scala.inline
    def apply(): MultiDragOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiDragOptions]
    }
    
    @scala.inline
    implicit class MultiDragOptionsMutableBuilder[Self <: MultiDragOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultiDrag(value: Boolean): Self = StObject.set(x, "multiDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiDragUndefined: Self = StObject.set(x, "multiDrag", js.undefined)
      
      @scala.inline
      def setOnDeselect(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* event */ SortableEvent => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setSelectedClass(value: String): Self = StObject.set(x, "selectedClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedClassUndefined: Self = StObject.set(x, "selectedClass", js.undefined)
    }
  }
  
  @js.native
  trait OnSpillOptions extends StObject {
    
    /**
      * Called when either `revertOnSpill` or `RemoveOnSpill` plugins are enabled.
      */
    var onSpill: js.UndefOr[js.Function1[/* evt */ SortableEvent, Unit]] = js.native
    
    /**
      * This plugin, when enabled,
      * will cause the dragged item to be removed from the DOM if it is *spilled*
      * (ie. it is dropped outside of a valid Sortable drop target)
      */
    var removeOnSpill: js.UndefOr[Boolean] = js.native
    
    /**
      * This plugin, when enabled,
      * will cause the dragged item to be reverted to it's original position if it is *spilled*
      * (ie. it is dropped outside of a valid Sortable drop target)
      */
    var revertOnSpill: js.UndefOr[Boolean] = js.native
  }
  object OnSpillOptions {
    
    @scala.inline
    def apply(): OnSpillOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnSpillOptions]
    }
    
    @scala.inline
    implicit class OnSpillOptionsMutableBuilder[Self <: OnSpillOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnSpill(value: /* evt */ SortableEvent => Unit): Self = StObject.set(x, "onSpill", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSpillUndefined: Self = StObject.set(x, "onSpill", js.undefined)
      
      @scala.inline
      def setRemoveOnSpill(value: Boolean): Self = StObject.set(x, "removeOnSpill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOnSpillUndefined: Self = StObject.set(x, "removeOnSpill", js.undefined)
      
      @scala.inline
      def setRevertOnSpill(value: Boolean): Self = StObject.set(x, "revertOnSpill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevertOnSpillUndefined: Self = StObject.set(x, "revertOnSpill", js.undefined)
    }
  }
  
  @js.native
  trait SwapOptions extends StObject {
    
    /**
      * Enable swap mode
      */
    var swap: js.UndefOr[Boolean] = js.native
    
    /**
      * Class name for swap item (if swap mode is enabled)
      */
    var swapClass: js.UndefOr[String] = js.native
  }
  object SwapOptions {
    
    @scala.inline
    def apply(): SwapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwapOptions]
    }
    
    @scala.inline
    implicit class SwapOptionsMutableBuilder[Self <: SwapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSwap(value: Boolean): Self = StObject.set(x, "swap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwapClass(value: String): Self = StObject.set(x, "swapClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwapClassUndefined: Self = StObject.set(x, "swapClass", js.undefined)
      
      @scala.inline
      def setSwapUndefined: Self = StObject.set(x, "swap", js.undefined)
    }
  }
}
