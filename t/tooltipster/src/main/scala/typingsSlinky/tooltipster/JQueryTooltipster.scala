package typingsSlinky.tooltipster

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import typingsSlinky.jquery.JQueryEventObject
import typingsSlinky.tooltipster.anon.Click
import typingsSlinky.tooltipster.anon.FixedLineage
import typingsSlinky.tooltipster.anon.Height
import typingsSlinky.tooltipster.anon.Left
import typingsSlinky.tooltipster.anon.Mouseenter
import typingsSlinky.tooltipster.anon.Scroll
import typingsSlinky.tooltipster.anon.Size
import typingsSlinky.tooltipster.tooltipsterStrings.appearing
import typingsSlinky.tooltipster.tooltipsterStrings.close
import typingsSlinky.tooltipster.tooltipsterStrings.closed
import typingsSlinky.tooltipster.tooltipsterStrings.constrained
import typingsSlinky.tooltipster.tooltipsterStrings.content
import typingsSlinky.tooltipster.tooltipsterStrings.current
import typingsSlinky.tooltipster.tooltipsterStrings.destroy
import typingsSlinky.tooltipster.tooltipsterStrings.disable
import typingsSlinky.tooltipster.tooltipsterStrings.disappearing
import typingsSlinky.tooltipster.tooltipsterStrings.elementOrigin
import typingsSlinky.tooltipster.tooltipsterStrings.elementTooltip
import typingsSlinky.tooltipster.tooltipsterStrings.enable
import typingsSlinky.tooltipster.tooltipsterStrings.fade
import typingsSlinky.tooltipster.tooltipsterStrings.fall
import typingsSlinky.tooltipster.tooltipsterStrings.grow
import typingsSlinky.tooltipster.tooltipsterStrings.instance
import typingsSlinky.tooltipster.tooltipsterStrings.natural
import typingsSlinky.tooltipster.tooltipsterStrings.none
import typingsSlinky.tooltipster.tooltipsterStrings.off
import typingsSlinky.tooltipster.tooltipsterStrings.on
import typingsSlinky.tooltipster.tooltipsterStrings.one
import typingsSlinky.tooltipster.tooltipsterStrings.open
import typingsSlinky.tooltipster.tooltipsterStrings.option
import typingsSlinky.tooltipster.tooltipsterStrings.previous
import typingsSlinky.tooltipster.tooltipsterStrings.reposition
import typingsSlinky.tooltipster.tooltipsterStrings.rotate
import typingsSlinky.tooltipster.tooltipsterStrings.scale
import typingsSlinky.tooltipster.tooltipsterStrings.slide
import typingsSlinky.tooltipster.tooltipsterStrings.stable
import typingsSlinky.tooltipster.tooltipsterStrings.status
import typingsSlinky.tooltipster.tooltipsterStrings.swing
import typingsSlinky.tooltipster.tooltipsterStrings.triggerHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryTooltipster {
  
  @js.native
  trait ITooltipEvent extends StObject {
    
    var event: JQueryEventObject = js.native
    
    var instance: ITooltipsterInstance = js.native
    
    var origin: HTMLElement = js.native
  }
  object ITooltipEvent {
    
    @scala.inline
    def apply(event: JQueryEventObject, instance: ITooltipsterInstance, origin: HTMLElement): ITooltipEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipEvent]
    }
    
    @scala.inline
    implicit class ITooltipEventMutableBuilder[Self <: ITooltipEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: JQueryEventObject): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstance(value: ITooltipsterInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: HTMLElement): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    }
  }
  
  /** see http://iamceege.github.io/tooltipster/#positioning */
  @js.native
  trait ITooltipPosition extends StObject {
    
    /** determines the position of the tooltip and are relative to the viewport */
    var coord: Left = js.native
    
    /** the offset that will be applied between the origin and the tooltip */
    var distance: Double = js.native
    
    /** is the side Tooltipster has judged best for your tooltip, according to your requirements */
    var side: TooltipPositioningSide = js.native
    
    /**
      * the size that your tooltip will have. It is either the natural size of the tooltip, or a size that has been 
      * set by Tooltipster to fit best on screen according to your requirements
      */
    var size: Height = js.native
    
    /**
      * the location Tooltipster thinks the tooltip should ideally be centered on, and the arrow aiming at. It is 
      * given as the distance from the relevant edge of the viewport (left edge if the side is "top" or "bottom", 
      * top edge if the side is "left" or "right"). The target is usually the middle of the origin, but can be 
      * somewhere else when the origin is actually a portion of text split in several lines. Editing this value 
      * will change the location the arrow is aiming at but will not change the position of the tooltip itself 
      * (use coord for that).
      */
    var target: Double = js.native
  }
  object ITooltipPosition {
    
    @scala.inline
    def apply(coord: Left, distance: Double, side: TooltipPositioningSide, size: Height, target: Double): ITooltipPosition = {
      val __obj = js.Dynamic.literal(coord = coord.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipPosition]
    }
    
    @scala.inline
    implicit class ITooltipPositionMutableBuilder[Self <: ITooltipPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoord(value: Left): Self = StObject.set(x, "coord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSide(value: TooltipPositioningSide): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITooltipStatus extends StObject {
    
    /** if the tooltip has been destroyed */
    var destroyed: Boolean = js.native
    
    /** if the tooltip is scheduled for destruction (which means that the tooltip is currently closing and may not be reopened) */
    var destroying: Boolean = js.native
    
    /** if the tooltip is enabled */
    var enabled: Boolean = js.native
    
    /** if the tooltip is open (either appearing, stable or disappearing) */
    var open: Boolean = js.native
    
    /** the state equals one of these four values: */
    var state: appearing | stable | disappearing | closed = js.native
  }
  object ITooltipStatus {
    
    @scala.inline
    def apply(
      destroyed: Boolean,
      destroying: Boolean,
      enabled: Boolean,
      open: Boolean,
      state: appearing | stable | disappearing | closed
    ): ITooltipStatus = {
      val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], destroying = destroying.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipStatus]
    }
    
    @scala.inline
    implicit class ITooltipStatusMutableBuilder[Self <: ITooltipStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroying(value: Boolean): Self = StObject.set(x, "destroying", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: appearing | stable | disappearing | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITooltipsterGeoHelper extends StObject {
    
    var document: Size = js.native
    
    var origin: FixedLineage = js.native
    
    var window: Scroll = js.native
  }
  object ITooltipsterGeoHelper {
    
    @scala.inline
    def apply(document: Size, origin: FixedLineage, window: Scroll): ITooltipsterGeoHelper = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipsterGeoHelper]
    }
    
    @scala.inline
    implicit class ITooltipsterGeoHelperMutableBuilder[Self <: ITooltipsterGeoHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocument(value: Size): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrigin(value: FixedLineage): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindow(value: Scroll): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITooltipsterHelper extends StObject {
    
    /** provided on functionBefore and functionAfter callbacks */
    var event: js.UndefOr[MouseEvent | TouchEvent | Null] = js.native
    
    /** provided on position callback */
    var geo: js.UndefOr[ITooltipsterGeoHelper] = js.native
    
    /** provided on position callback */
    var mode: js.UndefOr[natural | constrained] = js.native
    
    var origin: HTMLElement = js.native
    
    /** provided on functionReady and open callbacks */
    var tooltip: js.UndefOr[HTMLElement] = js.native
    
    /** provided on position callback */
    var tooltipClone: js.UndefOr[HTMLElement] = js.native
  }
  object ITooltipsterHelper {
    
    @scala.inline
    def apply(origin: HTMLElement): ITooltipsterHelper = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipsterHelper]
    }
    
    @scala.inline
    implicit class ITooltipsterHelperMutableBuilder[Self <: ITooltipsterHelper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: MouseEvent | TouchEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventMouseEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventNull: Self = StObject.set(x, "event", null)
      
      @scala.inline
      def setEventTouchEvent(value: TouchEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setGeo(value: ITooltipsterGeoHelper): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
      
      @scala.inline
      def setMode(value: natural | constrained): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOrigin(value: HTMLElement): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltip(value: HTMLElement): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipClone(value: HTMLElement): Self = StObject.set(x, "tooltipClone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipCloneUndefined: Self = StObject.set(x, "tooltipClone", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  @js.native
  trait ITooltipsterInstance
    extends /**
    * Several plugins may have methods of the same name. To resolve the conflict, use the instance object of the 
    * tooltip and specify the full name of the desired plugin in your calls.
    */
  /* pluginName */ StringDictionary[js.Any] {
    
    /**
      * Closes the tooltip. When the animation is over, its HTML element is destroyed (definitely removed from the 
      * DOM). The `callback` function argument is optional.
      */
    def close(): Unit = js.native
    def close(callback: TooltipsterStandardCallbackFunction): Unit = js.native
    
    /**
      * Returns a tooltip's current content. If the selector matches multiple origins, only the value of the first 
      * will be returned.
      */
    def content(): js.Any = js.native
    /**
      * Updates the tooltip's content.
      * @param value the new content of the tooltip
      */
    def content(value: js.Any): ITooltipsterInstance = js.native
    
    /**
      * Closes and destroys the tooltip functionality.
      */
    def destroy(): Unit = js.native
    
    /**
      * Temporarily disables a tooltip from being able to open.
      */
    def disable(): Unit = js.native
    
    /**
      * Returns the HTML element which has been tooltipped.
      */
    def elementOrigin(): HTMLElement = js.native
    
    /**
      * Returns the HTML root element of the tooltip if it is open, `null` if it is closed.
      */
    def elementTooltip(): HTMLElement | Null = js.native
    
    /**
      * If a tooltip was disabled, restores its previous functionality.
      */
    def enable(): Unit = js.native
    
    /**
      * Returns the instance of Tooltipster associated to the tooltip. If the selector matches multiple origins, 
      * only the instance of the first will be returned.
      */
    def instance(): ITooltipsterInstance = js.native
    
    /**
      * Handle Tooltipster's `off` event coming from any instance.
      */
    def off(eventName: String): ITooltipsterInstance = js.native
    
    /**
      * Handle Tooltipster's `on` event coming from any instance. See http://iamceege.github.io/tooltipster/#events
      * for a complete description of available events.
      */
    def on(eventName: String, callback: js.Function1[/* e */ JQueryEventObject, Unit]): ITooltipsterInstance = js.native
    
    /**
      * Handle Tooltipster's `one` event coming from any instance.
      */
    def one(eventName: String, callback: js.Function1[/* e */ JQueryEventObject, Unit]): ITooltipsterInstance = js.native
    
    /**
      * Opens the tooltip. The `callback` function argument is optional (see its input signature) and, if provided, 
      * is called when the opening animation has ended
      */
    def open(): ITooltipsterInstance = js.native
    def open(callback: TooltipsterStandardCallbackFunction): ITooltipsterInstance = js.native
    
    /**
      * Returns the value of an option.
      */
    def option(optionName: String): js.Any = js.native
    /**
      * Sets the value of an option (for advanced users only; we do not provide support on unexpected results).
      */
    def option(optionName: String, optionValue: js.Any): ITooltipsterInstance = js.native
    
    /**
      * Resizes and repositions the tooltip.
      */
    def reposition(): ITooltipsterInstance = js.native
    
    /**
      * Returns various information about the tooltip, like whether it is open or not. See 
      * http://iamceege.github.io/tooltipster/#status
      */
    def status(): ITooltipStatus = js.native
    
    /**
      * Trigger a Tooltipster's event coming from any instance.
      */
    def triggerHandler(eventName: String): ITooltipsterInstance = js.native
  }
  
  @js.native
  trait ITooltipsterJQuery extends StObject {
    
    /** Activates Tooltipster */
    def apply(): JQuery = js.native
    /**
      * Closes the tooltip. When the animation is over, its HTML element is destroyed (definitely removed from the 
      * DOM). The `callback` function argument is optional.
      */
    def apply(method: close): JQuery = js.native
    def apply(method: close, callback: TooltipsterStandardCallbackFunction): JQuery = js.native
    /**
      * Returns a tooltip's current content. If the selector matches multiple origins, only the value of the first 
      * will be returned.
      */
    def apply(method: content): js.Any = js.native
    /**
      * Updates the tooltip's content.
      * @param value the new content of the tooltip
      */
    def apply(method: content, value: String): JQuery = js.native
    /**
      * Closes and destroys the tooltip functionality.
      */
    def apply(method: destroy): JQuery = js.native
    /**
      * Temporarily disables a tooltip from being able to open.
      */
    def apply(method: disable): JQuery = js.native
    /**
      * Returns the HTML element which has been tooltipped.
      */
    def apply(method: elementOrigin): HTMLElement = js.native
    /**
      * Returns the HTML root element of the tooltip if it is open, `null` if it is closed.
      */
    def apply(method: elementTooltip): HTMLElement | Null = js.native
    /**
      * If a tooltip was disabled, restores its previous functionality.
      */
    def apply(method: enable): JQuery = js.native
    /**
      * Returns the instance of Tooltipster associated to the tooltip. If the selector matches multiple origins, 
      * only the instance of the first will be returned.
      */
    def apply(method: instance): ITooltipsterInstance = js.native
    /**
      * Handle Tooltipster's `off` event coming from any instance.
      */
    def apply(method: off, eventName: String): JQuery = js.native
    /**
      * Handle Tooltipster's `one` event coming from any instance.
      */
    def apply(method: one, eventName: String, callback: js.Function1[/* e */ JQueryEventObject, Unit]): JQuery = js.native
    /**
      * Handle Tooltipster's `on` event coming from any instance. See http://iamceege.github.io/tooltipster/#events
      * for a complete description of available events.
      */
    def apply(method: on, eventName: String, callback: js.Function1[/* e */ JQueryEventObject, Unit]): JQuery = js.native
    /**
      * Opens the tooltip. The `callback` function argument is optional (see its input signature) and, if provided, 
      * is called when the opening animation has ended
      */
    def apply(method: open): JQuery = js.native
    def apply(method: open, callback: TooltipsterStandardCallbackFunction): JQuery = js.native
    /**
      * Returns the value of an option.
      */
    def apply(method: option, optionName: String): js.Any = js.native
    /**
      * Sets the value of an option (for advanced users only; we do not provide support on unexpected results).
      */
    def apply(method: option, optionName: String, optionValue: js.Any): JQuery = js.native
    /**
      * Resizes and repositions the tooltip.
      */
    def apply(method: reposition): JQuery = js.native
    /**
      * Returns various information about the tooltip, like whether it is open or not. See 
      * http://iamceege.github.io/tooltipster/#status
      */
    def apply(method: status): ITooltipStatus = js.native
    /**
      * Trigger a Tooltipster's event coming from any instance.
      */
    def apply(method: triggerHandler, eventName: String): JQuery = js.native
    def apply(options: ITooltipsterOptions): JQuery = js.native
  }
  
  @js.native
  trait ITooltipsterOptions
    extends /**
    * Several plugins may have methods of the same name. To resolve the conflict, use the instance object of the 
    * tooltip and specify the full name of the desired plugin in your calls.
    */
  /* pluginName */ StringDictionary[js.Any] {
    
    /**
      * The minimum version of Internet Explorer to run on. 
      * @default 6
      */
    var IEmin: js.UndefOr[Double] = js.native
    
    /**
      * Determines how the tooltip will animate in and out. In addition to the built-in transitions, 
      * you may also create custom transitions in your CSS files. In IE9 and lower, all animations 
      * default to a JavaScript generated, fade animation. 
      * @default 'fade'
      */
    var animation: js.UndefOr[fade | grow | swing | slide | fall] = js.native
    
    /**
      * Sets the duration of the animation, in milliseconds. If you wish to provide different durations 
      * for the opening and closing animations, provide an array of two different values. 
      * @default 350
      */
    var animationDuration: js.UndefOr[Double | js.Array[Double]] = js.native
    
    /**
      * Add a "speech bubble" arrow to the tooltip. 
      * @default true
      */
    var arrow: js.UndefOr[Boolean] = js.native
    
    /**
      * If set, this will override the content of the tooltip. If you provide something else than a string 
      * or jQuery-wrapped HTML element, you will need to use the 'functionFormat' option to format your 
      * content for display. 
      * @default null
      */
    var content: js.UndefOr[String | JQuery | js.Any] = js.native
    
    /**
      * If the content of the tooltip is provided as a string, it is displayed as plain text by default. 
      * If this content should actually be interpreted as HTML, set this option to true. 
      * @default false
      */
    var contentAsHTML: js.UndefOr[Boolean] = js.native
    
    /**
      * If you provide a jQuery object to the 'content' option, this sets if it is a clone of this object 
      * that should actually be used. 
      * @default false
      */
    var contentCloning: js.UndefOr[Boolean] = js.native
    
    /**
      * Tooltipster logs hints and notices into the console when you're doing something you ideally shouldn't 
      * be doing. Set to false to disable logging. 
      * @default true
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Upon mouse interaction, this is the delay before the tooltip starts its opening and closing animations 
      * when the 'hover' trigger is used (*). If you wish to specify different delays for opening and closing, 
      * you may provide an array of two different values. 
      * @default 300
      */
    var delay: js.UndefOr[Double | js.Array[Double]] = js.native
    
    /**
      * Upon touch interaction, this is the delay before the tooltip starts its opening and closing animations 
      * when the 'hover' trigger is used (*). If you wish to specify different delays for opening and closing, 
      * you may provide an array of two different values. 
      * @default [300, 500]
      */
    var delayTouch: js.UndefOr[Double | js.Array[Double]] = js.native
    
    /**
      * The distance between the origin and the tooltip, in pixels. The value may be an integer or an array of 
      * integers (in the usual CSS syntax) if you wish to specify a different distance for each side. 
      * @default 6
      */
    var distance: js.UndefOr[Double | js.Array[Double]] = js.native
    
    /**
      * A custom function to be fired once the tooltip has been closed and removed from the DOM. 
      * @default null
      */
    var functionAfter: js.UndefOr[TooltipsterStandardCallbackFunction] = js.native
    
    /**
      * A custom function to be fired before the tooltip is opened. This function may prevent the opening if it 
      * returns false. 
      * @default null
      */
    var functionBefore: js.UndefOr[TooltipsterStandardCallbackFunction] = js.native
    
    /**
      * A custom function that does not modify the content but that can format it for display. It gets the two 
      * first usual arguments and also the content as third argument. It must return the value that will be 
      * displayed in the tooltip, either a string or a jQuery-wrapped HTML element (see the formatting section). 
      * @default null
      */
    var functionFormat: js.UndefOr[
        js.Function3[
          /* instance */ ITooltipsterInstance, 
          /* helper */ ITooltipsterHelper, 
          /* content */ js.Any, 
          String | JQuery
        ]
      ] = js.native
    
    /**
      * A custom function to be fired only once at instantiation. 
      * @default null
      */
    var functionInit: js.UndefOr[TooltipsterStandardCallbackFunction] = js.native
    
    /**
      * A custom function fired when the tooltip is repositioned. It gives you the ability to slightly or 
      * completely modify the position that Tooltipster is about to give to the tooltip. It gets the proposed 
      * set of placement values as third argument. The function must return the set of placement values, which 
      * you may have edited (see the positioning section). 
      * @default null
      */
    var functionPosition: js.UndefOr[
        js.Function3[
          /* instance */ ITooltipsterInstance, 
          /* helper */ ITooltipsterHelper, 
          /* position */ ITooltipPosition, 
          ITooltipPosition
        ]
      ] = js.native
    
    /**
      * A custom function to be fired when the tooltip and its contents have been added to the DOM. 
      * @default null
      */
    var functionReady: js.UndefOr[TooltipsterStandardCallbackFunction] = js.native
    
    /**
      * Give users the possibility to interact with the content of the tooltip. If you want them to be able to 
      * make clicks, fill forms or do other interactions inside the tooltip, you have to set this option to 
      * true. When the 'hover' close trigger is used, the user has to move the cursor to the tooltip before it 
      * starts closing (this lapse of time has its duration set by the 'delay' option). 
      * @default false
      */
    var interactive: js.UndefOr[Boolean] = js.native
    
    /**
      * Set a maximum width for the tooltip. 
      * @default null (no max width)
      */
    var maxWidth: js.UndefOr[Double] = js.native
    
    /**
      * Corresponds to the minimum distance to enforce between the center of the arrow and the edges of the 
      * tooltip. Mainly used to create an arrow bigger than those of the default themes. 
      * @default 16
      */
    var minIntersection: js.UndefOr[Double] = js.native
    
    /**
      * Set a minimum width for the tooltip. 
      * @default 0 (auto width)
      */
    var minWidth: js.UndefOr[Double] = js.native
    
    /**
      * Allows you to put several tooltips on a single element (see the multiple section). 
      * @default false
      */
    var multiple: js.UndefOr[Boolean] = js.native
    
    /**
      * The names of plugins to be used by Tooltipster. 
      * @default ['sideTip']
      */
    var plugins: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Repositions the tooltip if it goes out of the viewport when the user scrolls the page, in order to 
      * keep it visible as long as possible. 
      * @default false
      */
    var repositionOnScroll: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies if a TITLE attribute should be restored on the HTML element after a call to the 'destroy' 
      * method. This attribute may be omitted, or be restored with the value that existed before Tooltipster 
      * was initialized, or be restored with the stringified value of the current content. Note: in case of 
      * multiple tooltips on a single element, only the last destroyed tooltip may trigger a restoration. 
      * 
      * @default 'none'
      */
    var restoration: js.UndefOr[none | previous | current] = js.native
    
    /**
      * Sets if the tooltip should self-destruct after a few seconds when its origin is removed from the DOM. 
      * This prevents memory leaks. 
      * @default true
      */
    var selfDestruction: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets the side of the tooltip. The value may one of the following: 'top', 'bottom', 'left', 'right'. 
      * It may also be an array containing one or more of these values. When using an array, the order of 
      * values is taken into account as order of fallbacks and the absence of a side disables it (see the 
      * sides section). Default: ['top', 'bottom', 'right', 'left']
      */
    var side: js.UndefOr[TooltipPositioningSide | js.Array[TooltipPositioningSide]] = js.native
    
    /**
      * Set a theme that will override the default tooltip appearance. You may provide an array of strings 
      * to apply several themes at once (see the themes section). 
      * @default: []
      */
    var theme: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * How long (in ms) the tooltip should live before closing. 
      * @default 0 (disabled)
      */
    var timer: js.UndefOr[Double] = js.native
    
    var trackOrigin: js.UndefOr[Boolean] = js.native
    
    var trackTooltip: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets how often the tracker should run (see trackOrigin and trackTooltip), in milliseconds. The tracker 
      * runs even if trackOrigin and trackTooltip are false to check if the origin has not been removed while 
      * the tooltip was open, so you shouldn't set too high or too low values unless you need to. 
      * @default 500
      */
    var trackerInterval: js.UndefOr[Double] = js.native
    
    /**
      * Set how tooltips should be activated and closed.
      * Possible values: hover, click or custom.
      */
    var trigger: js.UndefOr[String] = js.native
    
    /**
      * When 'trigger' is set to 'custom', all built-in close triggers are disabled by default. This option 
      * allows you to reactivate the triggers of your choice to create a customized behavior. Only applies 
      * if 'trigger' is set to 'custom'. See http://iamceege.github.io/tooltipster/#triggers.
      */
    var triggerClose: js.UndefOr[Click] = js.native
    
    /**
      * When 'trigger' is set to 'custom', all built-in open triggers are disabled by default. This option 
      * allows you to reactivate the triggers of your choice to create a customized behavior. Only applies 
      * if 'trigger' is set to 'custom'. See http://iamceege.github.io/tooltipster/#triggers.
      */
    var triggerOpen: js.UndefOr[Mouseenter] = js.native
    
    /**
      * Plays a subtle animation when the content of the tooltip is updated (if the tooltip is open). You 
      * may create custom animations in your CSS files. Set to null to disable the animation. 
      * @default 'rotate'
      */
    var updateAnimation: js.UndefOr[fade | rotate | scale | Null] = js.native
    
    /**
      * Tries to place the tooltip in such a way that it will be entirely visible on screen when it's opened.
      * If the tooltip is to be opened while its origin is off screen (using a method call), you may want to 
      * set this option to false. 
      * @default true
      */
    var viewportAware: js.UndefOr[Boolean] = js.native
    
    /**
      * Set the z-index of the tooltip. 
      * @default 9999999
      */
    var zIndex: js.UndefOr[Double] = js.native
  }
  object ITooltipsterOptions {
    
    @scala.inline
    def apply(): ITooltipsterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipsterOptions]
    }
    
    @scala.inline
    implicit class ITooltipsterOptionsMutableBuilder[Self <: ITooltipsterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: fade | grow | swing | slide | fall): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDuration(value: Double | js.Array[Double]): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setAnimationDurationVarargs(value: Double*): Self = StObject.set(x, "animationDuration", js.Array(value :_*))
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setArrow(value: Boolean): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      @scala.inline
      def setContent(value: String | JQuery | js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentAsHTML(value: Boolean): Self = StObject.set(x, "contentAsHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentAsHTMLUndefined: Self = StObject.set(x, "contentAsHTML", js.undefined)
      
      @scala.inline
      def setContentCloning(value: Boolean): Self = StObject.set(x, "contentCloning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentCloningUndefined: Self = StObject.set(x, "contentCloning", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDelay(value: Double | js.Array[Double]): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayTouch(value: Double | js.Array[Double]): Self = StObject.set(x, "delayTouch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayTouchUndefined: Self = StObject.set(x, "delayTouch", js.undefined)
      
      @scala.inline
      def setDelayTouchVarargs(value: Double*): Self = StObject.set(x, "delayTouch", js.Array(value :_*))
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDelayVarargs(value: Double*): Self = StObject.set(x, "delay", js.Array(value :_*))
      
      @scala.inline
      def setDistance(value: Double | js.Array[Double]): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setDistanceVarargs(value: Double*): Self = StObject.set(x, "distance", js.Array(value :_*))
      
      @scala.inline
      def setFunctionAfter(value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit): Self = StObject.set(x, "functionAfter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFunctionAfterUndefined: Self = StObject.set(x, "functionAfter", js.undefined)
      
      @scala.inline
      def setFunctionBefore(value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit): Self = StObject.set(x, "functionBefore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFunctionBeforeUndefined: Self = StObject.set(x, "functionBefore", js.undefined)
      
      @scala.inline
      def setFunctionFormat(
        value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper, /* content */ js.Any) => String | JQuery
      ): Self = StObject.set(x, "functionFormat", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFunctionFormatUndefined: Self = StObject.set(x, "functionFormat", js.undefined)
      
      @scala.inline
      def setFunctionInit(value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit): Self = StObject.set(x, "functionInit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFunctionInitUndefined: Self = StObject.set(x, "functionInit", js.undefined)
      
      @scala.inline
      def setFunctionPosition(
        value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper, /* position */ ITooltipPosition) => ITooltipPosition
      ): Self = StObject.set(x, "functionPosition", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFunctionPositionUndefined: Self = StObject.set(x, "functionPosition", js.undefined)
      
      @scala.inline
      def setFunctionReady(value: (/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper) => Unit): Self = StObject.set(x, "functionReady", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFunctionReadyUndefined: Self = StObject.set(x, "functionReady", js.undefined)
      
      @scala.inline
      def setIEmin(value: Double): Self = StObject.set(x, "IEmin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIEminUndefined: Self = StObject.set(x, "IEmin", js.undefined)
      
      @scala.inline
      def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinIntersection(value: Double): Self = StObject.set(x, "minIntersection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinIntersectionUndefined: Self = StObject.set(x, "minIntersection", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setRepositionOnScroll(value: Boolean): Self = StObject.set(x, "repositionOnScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositionOnScrollUndefined: Self = StObject.set(x, "repositionOnScroll", js.undefined)
      
      @scala.inline
      def setRestoration(value: none | previous | current): Self = StObject.set(x, "restoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestorationUndefined: Self = StObject.set(x, "restoration", js.undefined)
      
      @scala.inline
      def setSelfDestruction(value: Boolean): Self = StObject.set(x, "selfDestruction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfDestructionUndefined: Self = StObject.set(x, "selfDestruction", js.undefined)
      
      @scala.inline
      def setSide(value: TooltipPositioningSide | js.Array[TooltipPositioningSide]): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      @scala.inline
      def setSideVarargs(value: TooltipPositioningSide*): Self = StObject.set(x, "side", js.Array(value :_*))
      
      @scala.inline
      def setTheme(value: String | js.Array[String]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setThemeVarargs(value: String*): Self = StObject.set(x, "theme", js.Array(value :_*))
      
      @scala.inline
      def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
      
      @scala.inline
      def setTrackOrigin(value: Boolean): Self = StObject.set(x, "trackOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackOriginUndefined: Self = StObject.set(x, "trackOrigin", js.undefined)
      
      @scala.inline
      def setTrackTooltip(value: Boolean): Self = StObject.set(x, "trackTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackTooltipUndefined: Self = StObject.set(x, "trackTooltip", js.undefined)
      
      @scala.inline
      def setTrackerInterval(value: Double): Self = StObject.set(x, "trackerInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackerIntervalUndefined: Self = StObject.set(x, "trackerInterval", js.undefined)
      
      @scala.inline
      def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerClose(value: Click): Self = StObject.set(x, "triggerClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerCloseUndefined: Self = StObject.set(x, "triggerClose", js.undefined)
      
      @scala.inline
      def setTriggerOpen(value: Mouseenter): Self = StObject.set(x, "triggerOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerOpenUndefined: Self = StObject.set(x, "triggerOpen", js.undefined)
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setUpdateAnimation(value: fade | rotate | scale): Self = StObject.set(x, "updateAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateAnimationNull: Self = StObject.set(x, "updateAnimation", null)
      
      @scala.inline
      def setUpdateAnimationUndefined: Self = StObject.set(x, "updateAnimation", js.undefined)
      
      @scala.inline
      def setViewportAware(value: Boolean): Self = StObject.set(x, "viewportAware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportAwareUndefined: Self = StObject.set(x, "viewportAware", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait ITooltipsterStatic extends StObject {
    
    /**
      * all instances of all tooltips present in the page are returned
      */
    def instances(): js.Array[ITooltipsterInstance] = js.native
    /**
      * Returns the instances of Tooltipster of all tooltips set on the element(s) matched by the argument.
      */
    def instances(element: HTMLElement): js.Array[ITooltipsterInstance] = js.native
    /**
      * Returns the instances of Tooltipster of all tooltips set on the element(s) matched by the argument.
      */
    def instances(selector: String): js.Array[ITooltipsterInstance] = js.native
    def instances(selector: JQuery): js.Array[ITooltipsterInstance] = js.native
    
    /**
      * Returns the instances of Tooltipster which were generated during the last initializing call.
      */
    def instancesLatest(): js.Array[ITooltipsterInstance] = js.native
    
    /**
      * Handle Tooltipster's `off` event coming from any instance.
      */
    def off(eventName: String): ITooltipsterStatic = js.native
    
    /**
      * Handle Tooltipster's `on` event coming from any instance. See http://iamceege.github.io/tooltipster/#events
      * for a complete description of available events.
      */
    def on(eventName: String, callback: js.Function1[/* e */ ITooltipEvent, Unit]): ITooltipsterStatic = js.native
    
    /**
      * Handle Tooltipster's `one` event coming from any instance.
      */
    def one(eventName: String, callback: js.Function1[/* e */ ITooltipEvent, Unit]): ITooltipsterStatic = js.native
    
    /**
      * Returns an array of all HTML elements in the page which have one or several tooltips initialized. If a selector 
      * is passed, the results will be limited to the descendants of the matched elements.
      */
    def origins(): js.Array[HTMLElement] = js.native
    def origins(selector: String): js.Array[HTMLElement] = js.native
    def origins(selector: JQuery): js.Array[HTMLElement] = js.native
    
    /**
      * Changes the default options that will apply to any tooltips created from now on.
      */
    def setDefaults(options: ITooltipsterOptions): Unit = js.native
    
    /**
      * Trigger a Tooltipster's event coming from any instance.
      */
    def triggerHandler(eventName: String): ITooltipsterStatic = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tooltipster.tooltipsterStrings.init
    - typingsSlinky.tooltipster.tooltipsterStrings.before
    - typingsSlinky.tooltipster.tooltipsterStrings.ready
    - typingsSlinky.tooltipster.tooltipsterStrings.after
    - typingsSlinky.tooltipster.tooltipsterStrings.format
    - typingsSlinky.tooltipster.tooltipsterStrings.position
    - typingsSlinky.tooltipster.tooltipsterStrings.close
    - typingsSlinky.tooltipster.tooltipsterStrings.closing
    - typingsSlinky.tooltipster.tooltipsterStrings.created
    - typingsSlinky.tooltipster.tooltipsterStrings.destroy
    - typingsSlinky.tooltipster.tooltipsterStrings.destroyed
    - typingsSlinky.tooltipster.tooltipsterStrings.dismissable
    - typingsSlinky.tooltipster.tooltipsterStrings.geometry
    - typingsSlinky.tooltipster.tooltipsterStrings.positionTest
    - typingsSlinky.tooltipster.tooltipsterStrings.positionTested
    - typingsSlinky.tooltipster.tooltipsterStrings.reposition
    - typingsSlinky.tooltipster.tooltipsterStrings.repositioned
    - typingsSlinky.tooltipster.tooltipsterStrings.scroll
    - typingsSlinky.tooltipster.tooltipsterStrings.start
    - typingsSlinky.tooltipster.tooltipsterStrings.startcancel
    - typingsSlinky.tooltipster.tooltipsterStrings.startend
    - typingsSlinky.tooltipster.tooltipsterStrings.state
    - typingsSlinky.tooltipster.tooltipsterStrings.updated
  */
  trait TooltipEventName extends StObject
  object TooltipEventName {
    
    @scala.inline
    def after: typingsSlinky.tooltipster.tooltipsterStrings.after = "after".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.after]
    
    @scala.inline
    def before: typingsSlinky.tooltipster.tooltipsterStrings.before = "before".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.before]
    
    @scala.inline
    def close: typingsSlinky.tooltipster.tooltipsterStrings.close = "close".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.close]
    
    @scala.inline
    def closing: typingsSlinky.tooltipster.tooltipsterStrings.closing = "closing".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.closing]
    
    @scala.inline
    def created: typingsSlinky.tooltipster.tooltipsterStrings.created = "created".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.created]
    
    @scala.inline
    def destroy: typingsSlinky.tooltipster.tooltipsterStrings.destroy = "destroy".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.destroy]
    
    @scala.inline
    def destroyed: typingsSlinky.tooltipster.tooltipsterStrings.destroyed = "destroyed".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.destroyed]
    
    @scala.inline
    def dismissable: typingsSlinky.tooltipster.tooltipsterStrings.dismissable = "dismissable".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.dismissable]
    
    @scala.inline
    def format: typingsSlinky.tooltipster.tooltipsterStrings.format = "format".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.format]
    
    @scala.inline
    def geometry: typingsSlinky.tooltipster.tooltipsterStrings.geometry = "geometry".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.geometry]
    
    @scala.inline
    def init: typingsSlinky.tooltipster.tooltipsterStrings.init = "init".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.init]
    
    @scala.inline
    def position: typingsSlinky.tooltipster.tooltipsterStrings.position = "position".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.position]
    
    @scala.inline
    def positionTest: typingsSlinky.tooltipster.tooltipsterStrings.positionTest = "positionTest".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.positionTest]
    
    @scala.inline
    def positionTested: typingsSlinky.tooltipster.tooltipsterStrings.positionTested = "positionTested".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.positionTested]
    
    @scala.inline
    def ready: typingsSlinky.tooltipster.tooltipsterStrings.ready = "ready".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.ready]
    
    @scala.inline
    def reposition: typingsSlinky.tooltipster.tooltipsterStrings.reposition = "reposition".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.reposition]
    
    @scala.inline
    def repositioned: typingsSlinky.tooltipster.tooltipsterStrings.repositioned = "repositioned".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.repositioned]
    
    @scala.inline
    def scroll: typingsSlinky.tooltipster.tooltipsterStrings.scroll = "scroll".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.scroll]
    
    @scala.inline
    def start: typingsSlinky.tooltipster.tooltipsterStrings.start = "start".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.start]
    
    @scala.inline
    def startcancel: typingsSlinky.tooltipster.tooltipsterStrings.startcancel = "startcancel".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.startcancel]
    
    @scala.inline
    def startend: typingsSlinky.tooltipster.tooltipsterStrings.startend = "startend".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.startend]
    
    @scala.inline
    def state: typingsSlinky.tooltipster.tooltipsterStrings.state = "state".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.state]
    
    @scala.inline
    def updated: typingsSlinky.tooltipster.tooltipsterStrings.updated = "updated".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.updated]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tooltipster.tooltipsterStrings.top
    - typingsSlinky.tooltipster.tooltipsterStrings.bottom
    - typingsSlinky.tooltipster.tooltipsterStrings.left
    - typingsSlinky.tooltipster.tooltipsterStrings.right
  */
  trait TooltipPositioningSide extends StObject
  object TooltipPositioningSide {
    
    @scala.inline
    def bottom: typingsSlinky.tooltipster.tooltipsterStrings.bottom = "bottom".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.bottom]
    
    @scala.inline
    def left: typingsSlinky.tooltipster.tooltipsterStrings.left = "left".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.left]
    
    @scala.inline
    def right: typingsSlinky.tooltipster.tooltipsterStrings.right = "right".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.right]
    
    @scala.inline
    def top: typingsSlinky.tooltipster.tooltipsterStrings.top = "top".asInstanceOf[typingsSlinky.tooltipster.tooltipsterStrings.top]
  }
  
  type TooltipsterStandardCallbackFunction = js.Function2[/* instance */ ITooltipsterInstance, /* helper */ ITooltipsterHelper, Unit]
}
