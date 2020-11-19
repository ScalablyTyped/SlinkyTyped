package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feDisplacementMap> element. */
@js.native
trait SVGFEDisplacementMapElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  val SVG_CHANNEL_A: Double = js.native
  
  val SVG_CHANNEL_B: Double = js.native
  
  val SVG_CHANNEL_G: Double = js.native
  
  val SVG_CHANNEL_R: Double = js.native
  
  val SVG_CHANNEL_UNKNOWN: Double = js.native
  
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
  
  val in1: org.scalajs.dom.raw.SVGAnimatedString = js.native
  
  val in2: org.scalajs.dom.raw.SVGAnimatedString = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.raw.EventListenerOptions
  ): Unit = js.native
  
  val scale: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  
  val xChannelSelector: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  
  val yChannelSelector: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
}
