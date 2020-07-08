package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <feComposite> element. */
@js.native
trait SVGFECompositeElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_ATOP: Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_IN: Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_OUT: Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_OVER: Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: Double = js.native
  val SVG_FECOMPOSITE_OPERATOR_XOR: Double = js.native
  val in1: org.scalajs.dom.raw.SVGAnimatedString = js.native
  val in2: org.scalajs.dom.raw.SVGAnimatedString = js.native
  val k1: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val k2: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val k3: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val k4: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val operator: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
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
}

