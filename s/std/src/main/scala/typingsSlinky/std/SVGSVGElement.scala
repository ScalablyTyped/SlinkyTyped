package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.std.stdStrings.SVGUnload
import typingsSlinky.std.stdStrings.SVGZoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the properties of <svg> elements, as well as methods to manipulate them. This interface contains also various miscellaneous commonly-used utility methods, such as matrix operations and the ability to control the time of redraw on visual rendering devices. */
@js.native
trait SVGSVGElement
  extends SVGGraphicsElement
     with DocumentEvent
     with SVGFitToViewBox
     with SVGZoomAndPan {
  /** @deprecated */
  var contentScriptType: java.lang.String = js.native
  /** @deprecated */
  var contentStyleType: java.lang.String = js.native
  var currentScale: Double = js.native
  val currentTranslate: org.scalajs.dom.raw.SVGPoint = js.native
  val height: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  var onunload: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]) | Null = js.native
  var onzoom: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.SVGZoomEvent, _]) | Null = js.native
  /** @deprecated */
  val pixelUnitToMillimeterX: Double = js.native
  /** @deprecated */
  val pixelUnitToMillimeterY: Double = js.native
  /** @deprecated */
  val screenPixelToMillimeterX: Double = js.native
  /** @deprecated */
  val screenPixelToMillimeterY: Double = js.native
  /** @deprecated */
  val viewport: org.scalajs.dom.raw.SVGRect = js.native
  val width: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val x: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val y: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * 
    * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * 
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * 
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
    * 
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
    * 
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.SVGZoomEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.SVGZoomEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.SVGZoomEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def animationsPaused(): scala.Boolean = js.native
  def checkEnclosure(element: org.scalajs.dom.raw.SVGElement, rect: org.scalajs.dom.raw.SVGRect): scala.Boolean = js.native
  def checkIntersection(element: org.scalajs.dom.raw.SVGElement, rect: org.scalajs.dom.raw.SVGRect): scala.Boolean = js.native
  def createSVGAngle(): org.scalajs.dom.raw.SVGAngle = js.native
  def createSVGLength(): org.scalajs.dom.raw.SVGLength = js.native
  def createSVGMatrix(): org.scalajs.dom.raw.SVGMatrix = js.native
  def createSVGNumber(): org.scalajs.dom.raw.SVGNumber = js.native
  def createSVGPoint(): org.scalajs.dom.raw.SVGPoint = js.native
  def createSVGRect(): org.scalajs.dom.raw.SVGRect = js.native
  def createSVGTransform(): org.scalajs.dom.raw.SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: org.scalajs.dom.raw.SVGMatrix): org.scalajs.dom.raw.SVGTransform = js.native
  def deselectAll(): Unit = js.native
  /** @deprecated */
  def forceRedraw(): Unit = js.native
  def getComputedStyle(elt: org.scalajs.dom.raw.Element): org.scalajs.dom.raw.CSSStyleDeclaration = js.native
  def getComputedStyle(elt: org.scalajs.dom.raw.Element, pseudoElt: java.lang.String): org.scalajs.dom.raw.CSSStyleDeclaration = js.native
  def getCurrentTime(): Double = js.native
  def getElementById(elementId: java.lang.String): org.scalajs.dom.raw.Element = js.native
  def getEnclosureList(rect: org.scalajs.dom.raw.SVGRect, referenceElement: org.scalajs.dom.raw.SVGElement): org.scalajs.dom.raw.NodeListOf[
    (org.scalajs.dom.raw.SVGCircleElement | org.scalajs.dom.raw.SVGEllipseElement | org.scalajs.dom.raw.SVGImageElement | org.scalajs.dom.raw.SVGLineElement | org.scalajs.dom.raw.SVGPathElement | org.scalajs.dom.raw.SVGPolygonElement | org.scalajs.dom.raw.SVGPolylineElement | org.scalajs.dom.raw.SVGRectElement | org.scalajs.dom.raw.SVGTextElement | org.scalajs.dom.raw.SVGUseElement) with org.scalajs.dom.raw.Node
  ] = js.native
  def getIntersectionList(rect: org.scalajs.dom.raw.SVGRect, referenceElement: org.scalajs.dom.raw.SVGElement): org.scalajs.dom.raw.NodeListOf[
    (org.scalajs.dom.raw.SVGCircleElement | org.scalajs.dom.raw.SVGEllipseElement | org.scalajs.dom.raw.SVGImageElement | org.scalajs.dom.raw.SVGLineElement | org.scalajs.dom.raw.SVGPathElement | org.scalajs.dom.raw.SVGPolygonElement | org.scalajs.dom.raw.SVGPolylineElement | org.scalajs.dom.raw.SVGRectElement | org.scalajs.dom.raw.SVGTextElement | org.scalajs.dom.raw.SVGUseElement) with org.scalajs.dom.raw.Node
  ] = js.native
  def pauseAnimations(): Unit = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGUnload(
    `type`: SVGUnload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.SVGZoomEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.SVGZoomEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_SVGZoom(
    `type`: SVGZoom,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.SVGZoomEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  def setCurrentTime(seconds: Double): Unit = js.native
  /** @deprecated */
  def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  def unpauseAnimations(): Unit = js.native
  /** @deprecated */
  def unsuspendRedraw(suspendHandleID: Double): Unit = js.native
  /** @deprecated */
  def unsuspendRedrawAll(): Unit = js.native
}

@JSGlobal("SVGSVGElement")
@js.native
object SVGSVGElement extends Instantiable0[SVGSVGElement] {
  val SVG_ZOOMANDPAN_DISABLE: Double = js.native
  val SVG_ZOOMANDPAN_MAGNIFY: Double = js.native
  val SVG_ZOOMANDPAN_UNKNOWN: Double = js.native
}

