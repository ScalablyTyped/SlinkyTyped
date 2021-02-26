package typingsSlinky.svgPanZoom

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGMatrix
import org.scalajs.dom.raw.SVGSVGElement
import typingsSlinky.svgPanZoom.anon.Height
import typingsSlinky.svgPanZoom.svgPanZoomStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SvgPanZoom {
  
  @js.native
  trait CustomEventHandler extends StObject {
    
    var destroy: js.Function = js.native
    
    var haltEventListeners: js.Array[String] = js.native
    
    def init(options: CustomEventOptions): Unit = js.native
  }
  object CustomEventHandler {
    
    @scala.inline
    def apply(destroy: js.Function, haltEventListeners: js.Array[String], init: CustomEventOptions => Unit): CustomEventHandler = {
      val __obj = js.Dynamic.literal(destroy = destroy.asInstanceOf[js.Any], haltEventListeners = haltEventListeners.asInstanceOf[js.Any], init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[CustomEventHandler]
    }
    
    @scala.inline
    implicit class CustomEventHandlerMutableBuilder[Self <: CustomEventHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: js.Function): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHaltEventListeners(value: js.Array[String]): Self = StObject.set(x, "haltEventListeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHaltEventListenersVarargs(value: String*): Self = StObject.set(x, "haltEventListeners", js.Array(value :_*))
      
      @scala.inline
      def setInit(value: CustomEventOptions => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CustomEventOptions extends StObject {
    
    /**
      * Creates a new SvgPanZoom instance with given element selector.
      *
      * @param  {string|HTMLElement|SVGElement} svg selector of the tag on which it is to be applied.
      * @param  {Object} options        provides customization options at the initialization of the object.
      * @return {Instance}              Current instance
      */
    def instance(svg: String): Instance = js.native
    def instance(svg: String, options: Options): Instance = js.native
    def instance(svg: HTMLElement): Instance = js.native
    def instance(svg: HTMLElement, options: Options): Instance = js.native
    def instance(svg: SVGElement): Instance = js.native
    def instance(svg: SVGElement, options: Options): Instance = js.native
    @JSName("instance")
    var instance_Original: Instance = js.native
    
    var svgElement: SVGSVGElement = js.native
  }
  
  @js.native
  trait Instance extends StObject {
    
    /**
      * Creates a new SvgPanZoom instance with given element selector.
      *
      * @param  {string|HTMLElement|SVGElement} svg selector of the tag on which it is to be applied.
      * @param  {Object} options        provides customization options at the initialization of the object.
      * @return {Instance}              Current instance
      */
    def apply(svg: String): Instance = js.native
    def apply(svg: String, options: Options): Instance = js.native
    def apply(svg: HTMLElement): Instance = js.native
    def apply(svg: HTMLElement, options: Options): Instance = js.native
    def apply(svg: SVGElement): Instance = js.native
    def apply(svg: SVGElement, options: Options): Instance = js.native
    
    /**
      * Adjust viewport pan (only) so it will be centered in SVG
      * Does not zoom/fit image
      *
      * @return {Instance}    Current instance
      */
    def center(): Instance = js.native
    
    /**
      * Adjust viewport size (only) so it will contain in SVG
      * Does not center image
      *
      * @return {Instance}    Current instance
      */
    def contain(): Instance = js.native
    
    def destroy(): Unit = js.native
    
    def disableControlIcons(): Instance = js.native
    
    def disableDblClickZoom(): Instance = js.native
    
    def disableMouseWheelZoom(): Instance = js.native
    
    /**
      * Disables panning on svg element
      * @return {Instance} Current instance
      */
    def disablePan(): Instance = js.native
    
    def disableZoom(): Instance = js.native
    
    def enableControlIcons(): Instance = js.native
    
    def enableDblClickZoom(): Instance = js.native
    
    def enableMouseWheelZoom(): Instance = js.native
    
    /**
      * Enables Panning on svg element
      * @return {Instance} Current instance
      */
    def enablePan(): Instance = js.native
    
    def enableZoom(): Instance = js.native
    
    /**
      * Adjust viewport size (only) so it will fit in SVG
      * Does not center image
      *
      * @return {Instance}    Current instance
      */
    def fit(): Instance = js.native
    
    /**
      * Get pan vector
      *
      * @return {Object} {x: 0, y: 0}
      * @return {Instance}    Current instance
      */
    def getPan(): Point = js.native
    
    /**
      * Get all calculate svg dimensions
      *
      * @return {Object} {width: 0, height: 0, realZoom: 0, viewBox: { width: 0, height: 0 }}
      */
    def getSizes(): Sizes = js.native
    
    /**
      * Get zoom scale/level
      *
      * @return {float} zoom scale
      */
    def getZoom(): Double = js.native
    
    def isControlIconsEnabled(): Boolean = js.native
    
    def isDblClickZoomEnabled(): Boolean = js.native
    
    def isMouseWheelZoomEnabled(): Boolean = js.native
    
    /**
      * Checks if Panning is enabled or not
      * @return {Boolean} true or false based on panning settings
      */
    def isPanEnabled(): Boolean = js.native
    
    def isZoomEnabled(): Boolean = js.native
    
    /**
      * Pan to a rendered position
      *
      * @param  {Object} point {x: 0, y: 0}
      * @return {Instance}    Current instance
      */
    def pan(point: Point): Instance = js.native
    
    /**
      * Relatively pan the graph by a specified rendered position vector
      *
      * @param  {Object} point {x: 0, y: 0}
      * @return {Instance}    Current instance
      */
    def panBy(point: Point): Instance = js.native
    
    def reset(): Instance = js.native
    
    def resetPan(): Instance = js.native
    
    def resetZoom(): Instance = js.native
    
    /**
      * Recalculates cached svg dimensions and controls position
      *
      * @return {Instance}    Current instance
      */
    def resize(): Instance = js.native
    
    def setBeforePan(fn: js.Function2[/* oldPoint */ Point, /* newPoint */ Point, Unit | Boolean | PointModifier]): Instance = js.native
    
    def setBeforeZoom(fn: js.Function2[/* oldScale */ Double, /* newScale */ Double, Unit | Boolean]): Instance = js.native
    
    def setMaxZoom(zoom: Double): Instance = js.native
    
    def setMinZoom(zoom: Double): Instance = js.native
    
    def setOnPan(fn: js.Function1[/* point */ Point, Unit]): Instance = js.native
    
    def setOnUpdatedCTM(fn: js.Function1[/* newCTM */ SVGMatrix, Unit]): Instance = js.native
    
    def setOnZoom(fn: js.Function1[/* scale */ Double, Unit]): Instance = js.native
    
    def setZoomScaleSensitivity(scale: Double): Instance = js.native
    
    /**
      * Update content cached BorderBox
      * Use when viewport contents change
      *
      * @return {Instance}    Current instance
      */
    def updateBBox(): Instance = js.native
    
    def zoom(scale: Double): Unit = js.native
    
    def zoomAtPoint(scale: Double, point: Point): Instance = js.native
    
    def zoomAtPointBy(scale: Double, point: Point): Instance = js.native
    
    def zoomBy(scale: Double): Instance = js.native
    
    def zoomIn(): Instance = js.native
    
    def zoomOut(): Instance = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var beforePan: js.UndefOr[
        js.Function2[/* oldPan */ Point, /* newPan */ Point, Unit | Boolean | PointModifier]
      ] = js.native
    
    // (default 'auto')
    var beforeZoom: js.UndefOr[js.Function2[/* oldScale */ Double, /* newScale */ Double, Unit | Boolean]] = js.native
    
    // (default true)
    var center: js.UndefOr[Boolean] = js.native
    
    // enable or disable viewport fit in SVG (default true)
    var contain: js.UndefOr[Boolean] = js.native
    
    /**
      * insert icons to give user an option in addition to mouse events to control pan/zoom (default disabled)
      * @type {boolean}
      */
    var controlIconsEnabled: js.UndefOr[Boolean] = js.native
    
    var customEventsHandler: js.UndefOr[CustomEventHandler] = js.native
    
    /**
      * enable or disable zooming by double clicking (default enabled)
      * @type {boolean}
      */
    var dblClickZoomEnabled: js.UndefOr[Boolean] = js.native
    
    // (default null)
    var eventsListenerElement: js.UndefOr[SVGElement] = js.native
    
    // Maximum Zoom level  (Default 10)
    var fit: js.UndefOr[Boolean] = js.native
    
    // Minimum Zoom level (Default 0.5)
    var maxZoom: js.UndefOr[Double] = js.native
    
    // Zoom sensitivity (Default 0.2)
    var minZoom: js.UndefOr[Double] = js.native
    
    /**
      * enable or disable zooming by scrolling (default enabled)
      * @type {boolean}
      */
    var mouseWheelZoomEnabled: js.UndefOr[Boolean] = js.native
    
    var onPan: js.UndefOr[js.Function1[/* newPan */ Point, Unit]] = js.native
    
    var onUpdatedCTM: js.UndefOr[js.Function1[/* newCTM */ SVGMatrix, Unit]] = js.native
    
    var onZoom: js.UndefOr[js.Function1[/* newScale */ Double, Unit]] = js.native
    
    /**
      * enable or disable panning (default enabled)
      * @type {boolean}
      */
    var panEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * prevent mouse events to bubble up (default enabled)
      * @type {boolean}
      */
    var preventMouseEventsDefault: js.UndefOr[Boolean] = js.native
    
    // enable or disable viewport centering in SVG (default true)
    var refreshRate: js.UndefOr[Double | auto] = js.native
    
    /**
      * can be querySelector string or SVGElement (default enabled)
      * @type {string|HTMLElement|SVGElement}
      */
    var viewportSelector: js.UndefOr[String | HTMLElement | SVGElement] = js.native
    
    /**
      * enable or disable zooming (default enabled)
      * @type {boolean}
      */
    var zoomEnabled: js.UndefOr[Boolean] = js.native
    
    var zoomScaleSensitivity: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforePan(value: (/* oldPan */ Point, /* newPan */ Point) => Unit | Boolean | PointModifier): Self = StObject.set(x, "beforePan", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforePanUndefined: Self = StObject.set(x, "beforePan", js.undefined)
      
      @scala.inline
      def setBeforeZoom(value: (/* oldScale */ Double, /* newScale */ Double) => Unit | Boolean): Self = StObject.set(x, "beforeZoom", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeZoomUndefined: Self = StObject.set(x, "beforeZoom", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setContain(value: Boolean): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
      
      @scala.inline
      def setControlIconsEnabled(value: Boolean): Self = StObject.set(x, "controlIconsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlIconsEnabledUndefined: Self = StObject.set(x, "controlIconsEnabled", js.undefined)
      
      @scala.inline
      def setCustomEventsHandler(value: CustomEventHandler): Self = StObject.set(x, "customEventsHandler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomEventsHandlerUndefined: Self = StObject.set(x, "customEventsHandler", js.undefined)
      
      @scala.inline
      def setDblClickZoomEnabled(value: Boolean): Self = StObject.set(x, "dblClickZoomEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDblClickZoomEnabledUndefined: Self = StObject.set(x, "dblClickZoomEnabled", js.undefined)
      
      @scala.inline
      def setEventsListenerElement(value: SVGElement): Self = StObject.set(x, "eventsListenerElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsListenerElementUndefined: Self = StObject.set(x, "eventsListenerElement", js.undefined)
      
      @scala.inline
      def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      @scala.inline
      def setMouseWheelZoomEnabled(value: Boolean): Self = StObject.set(x, "mouseWheelZoomEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseWheelZoomEnabledUndefined: Self = StObject.set(x, "mouseWheelZoomEnabled", js.undefined)
      
      @scala.inline
      def setOnPan(value: /* newPan */ Point => Unit): Self = StObject.set(x, "onPan", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPanUndefined: Self = StObject.set(x, "onPan", js.undefined)
      
      @scala.inline
      def setOnUpdatedCTM(value: /* newCTM */ SVGMatrix => Unit): Self = StObject.set(x, "onUpdatedCTM", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdatedCTMUndefined: Self = StObject.set(x, "onUpdatedCTM", js.undefined)
      
      @scala.inline
      def setOnZoom(value: /* newScale */ Double => Unit): Self = StObject.set(x, "onZoom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnZoomUndefined: Self = StObject.set(x, "onZoom", js.undefined)
      
      @scala.inline
      def setPanEnabled(value: Boolean): Self = StObject.set(x, "panEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanEnabledUndefined: Self = StObject.set(x, "panEnabled", js.undefined)
      
      @scala.inline
      def setPreventMouseEventsDefault(value: Boolean): Self = StObject.set(x, "preventMouseEventsDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventMouseEventsDefaultUndefined: Self = StObject.set(x, "preventMouseEventsDefault", js.undefined)
      
      @scala.inline
      def setRefreshRate(value: Double | auto): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshRateUndefined: Self = StObject.set(x, "refreshRate", js.undefined)
      
      @scala.inline
      def setViewportSelector(value: String | HTMLElement | SVGElement): Self = StObject.set(x, "viewportSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportSelectorHTMLElement(value: HTMLElement): Self = StObject.set(x, "viewportSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportSelectorSVGElement(value: SVGElement): Self = StObject.set(x, "viewportSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportSelectorUndefined: Self = StObject.set(x, "viewportSelector", js.undefined)
      
      @scala.inline
      def setZoomEnabled(value: Boolean): Self = StObject.set(x, "zoomEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomEnabledUndefined: Self = StObject.set(x, "zoomEnabled", js.undefined)
      
      @scala.inline
      def setZoomScaleSensitivity(value: Double): Self = StObject.set(x, "zoomScaleSensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomScaleSensitivityUndefined: Self = StObject.set(x, "zoomScaleSensitivity", js.undefined)
    }
  }
  
  @js.native
  trait Point extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Point {
    
    @scala.inline
    def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PointModifier extends StObject {
    
    var x: Double | Boolean = js.native
    
    var y: Double | Boolean = js.native
  }
  object PointModifier {
    
    @scala.inline
    def apply(x: Double | Boolean, y: Double | Boolean): PointModifier = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointModifier]
    }
    
    @scala.inline
    implicit class PointModifierMutableBuilder[Self <: PointModifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double | Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double | Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Sizes extends StObject {
    
    var height: Double = js.native
    
    var realZoom: Double = js.native
    
    var viewBox: Height = js.native
    
    var width: Double = js.native
  }
  object Sizes {
    
    @scala.inline
    def apply(height: Double, realZoom: Double, viewBox: Height, width: Double): Sizes = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], realZoom = realZoom.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sizes]
    }
    
    @scala.inline
    implicit class SizesMutableBuilder[Self <: Sizes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRealZoom(value: Double): Self = StObject.set(x, "realZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBox(value: Height): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
