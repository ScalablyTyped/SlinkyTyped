package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <feMorphology> element. */
@js.native
trait SVGFEMorphologyElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_MORPHOLOGY_OPERATOR_DILATE: Double = js.native
  val SVG_MORPHOLOGY_OPERATOR_ERODE: Double = js.native
  val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: Double = js.native
  val in1: org.scalajs.dom.raw.SVGAnimatedString = js.native
  val operator: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  val radiusX: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val radiusY: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
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

