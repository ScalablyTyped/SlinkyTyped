package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <pattern> element. */
@js.native
trait SVGPatternElement
  extends SVGElement
     with SVGFitToViewBox
     with SVGURIReference {
  
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
  
  val height: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  
  val patternContentUnits: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  
  val patternTransform: org.scalajs.dom.raw.SVGAnimatedTransformList = js.native
  
  val patternUnits: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  val width: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  
  val x: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  
  val y: org.scalajs.dom.raw.SVGAnimatedLength = js.native
}
