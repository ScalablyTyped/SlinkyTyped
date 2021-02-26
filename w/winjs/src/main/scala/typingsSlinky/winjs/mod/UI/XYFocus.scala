package typingsSlinky.winjs.mod.UI

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.EventListener
import typingsSlinky.winjs.anon.KeyCode
import typingsSlinky.winjs.winjsStrings.down
import typingsSlinky.winjs.winjsStrings.left
import typingsSlinky.winjs.winjsStrings.right
import typingsSlinky.winjs.winjsStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility functions for generic directional focus movement
**/
object XYFocus {
  
  @JSImport("winjs", "UI.XYFocus")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("winjs", "UI.XYFocus.addEventListener")
  @js.native
  def addEventListener(`type`: String, handler: EventListener): Unit = js.native
  
  @JSImport("winjs", "UI.XYFocus.dispatchEvent")
  @js.native
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  
  @JSImport("winjs", "UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement(direction: String): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement(direction: String, options: typingsSlinky.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_down(direction: down): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_down(direction: down, options: typingsSlinky.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_left(direction: left): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_left(direction: left, options: typingsSlinky.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_right(direction: right): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_right(direction: right, options: typingsSlinky.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_up(direction: up): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.findNextFocusElement")
  @js.native
  def findNextFocusElement_up(direction: up, options: typingsSlinky.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = js.native
  
  @JSImport("winjs", "UI.XYFocus.focusRoot")
  @js.native
  def focusRoot: HTMLElement = js.native
  @scala.inline
  def focusRoot_=(x: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusRoot")(x.asInstanceOf[js.Any])
  
  object keyCodeMap {
    
    @JSImport("winjs", "UI.XYFocus.keyCodeMap")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The array of keycodes that cause XYFocus to accept.
      **/
    @JSImport("winjs", "UI.XYFocus.keyCodeMap.accept")
    @js.native
    def accept: js.Array[Double] = js.native
    @scala.inline
    def accept_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accept")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to cancel.
      **/
    @JSImport("winjs", "UI.XYFocus.keyCodeMap.cancel")
    @js.native
    def cancel: js.Array[Double] = js.native
    @scala.inline
    def cancel_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancel")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to navigate down.
      **/
    @JSImport("winjs", "UI.XYFocus.keyCodeMap.down")
    @js.native
    def down: js.Array[Double] = js.native
    @scala.inline
    def down_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("down")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to navigate left.
      **/
    @JSImport("winjs", "UI.XYFocus.keyCodeMap.left")
    @js.native
    def left: js.Array[Double] = js.native
    @scala.inline
    def left_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to navigate right.
      **/
    @JSImport("winjs", "UI.XYFocus.keyCodeMap.right")
    @js.native
    def right: js.Array[Double] = js.native
    @scala.inline
    def right_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    /**
      * The array of keycodes that cause XYFocus to navigate up.
      **/
    @JSImport("winjs", "UI.XYFocus.keyCodeMap.up")
    @js.native
    def up: js.Array[Double] = js.native
    @scala.inline
    def up_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("up")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("winjs", "UI.XYFocus.moveFocus")
  @js.native
  def moveFocus(direction: String): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.moveFocus")
  @js.native
  def moveFocus(direction: String, options: typingsSlinky.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_down(direction: down): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_down(direction: down, options: typingsSlinky.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_left(direction: left): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_left(direction: left, options: typingsSlinky.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_right(direction: right): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_right(direction: right, options: typingsSlinky.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_up(direction: up): HTMLElement = js.native
  @JSImport("winjs", "UI.XYFocus.moveFocus")
  @js.native
  def moveFocus_up(direction: up, options: typingsSlinky.winjs.WinJS.UI.XYFocus.XYFocusOptions): HTMLElement = js.native
  
  @JSImport("winjs", "UI.XYFocus.onfocuschanged")
  @js.native
  def onfocuschanged(eventInfo: CustomEvent): Unit = js.native
  
  @JSImport("winjs", "UI.XYFocus.onfocuschanging")
  @js.native
  def onfocuschanging(eventInfo: CustomEvent): Unit = js.native
  
  @JSImport("winjs", "UI.XYFocus.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, handler: EventListener): Unit = js.native
  
  @js.native
  trait IRect extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object IRect {
    
    @scala.inline
    def apply(height: Double, left: Double, top: Double, width: Double): IRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRect]
    }
    
    @scala.inline
    implicit class IRectMutableBuilder[Self <: IRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XYFocusEvent
    extends typingsSlinky.std.CustomEvent[js.Any] {
    
    @JSName("detail")
    var detail_XYFocusEvent: KeyCode = js.native
  }
  
  @js.native
  trait XYFocusOptions extends StObject {
    
    /**
      * The focus scope, only children of this element are considered in the calculation.
      **/
    var focusRoot: js.UndefOr[HTMLElement] = js.native
    
    /**
      * A rectangle indicating where focus came from before the current state.
      **/
    var historyRect: js.UndefOr[typingsSlinky.winjs.WinJS.UI.XYFocus.IRect] = js.native
    
    /**
      * The element from which to calculate the next focusable element; if specified, referenceRect is ignored.
      **/
    var referenceElement: js.UndefOr[HTMLElement] = js.native
    
    /**
      * The rectangle from which to calculate next focusable element; ignored if referenceElement is also specified.
      **/
    var referenceRect: js.UndefOr[typingsSlinky.winjs.WinJS.UI.XYFocus.IRect] = js.native
  }
  object XYFocusOptions {
    
    @scala.inline
    def apply(): XYFocusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XYFocusOptions]
    }
    
    @scala.inline
    implicit class XYFocusOptionsMutableBuilder[Self <: XYFocusOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusRoot(value: HTMLElement): Self = StObject.set(x, "focusRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusRootUndefined: Self = StObject.set(x, "focusRoot", js.undefined)
      
      @scala.inline
      def setHistoryRect(value: typingsSlinky.winjs.WinJS.UI.XYFocus.IRect): Self = StObject.set(x, "historyRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryRectUndefined: Self = StObject.set(x, "historyRect", js.undefined)
      
      @scala.inline
      def setReferenceElement(value: HTMLElement): Self = StObject.set(x, "referenceElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceElementUndefined: Self = StObject.set(x, "referenceElement", js.undefined)
      
      @scala.inline
      def setReferenceRect(value: typingsSlinky.winjs.WinJS.UI.XYFocus.IRect): Self = StObject.set(x, "referenceRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceRectUndefined: Self = StObject.set(x, "referenceRect", js.undefined)
    }
  }
}
