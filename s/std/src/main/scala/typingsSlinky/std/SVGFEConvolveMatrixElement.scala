package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <feConvolveMatrix> element. */
@js.native
trait SVGFEConvolveMatrixElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_EDGEMODE_DUPLICATE: Double = js.native
  val SVG_EDGEMODE_NONE: Double = js.native
  val SVG_EDGEMODE_UNKNOWN: Double = js.native
  val SVG_EDGEMODE_WRAP: Double = js.native
  val bias: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val divisor: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val edgeMode: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  val in1: org.scalajs.dom.raw.SVGAnimatedString = js.native
  val kernelMatrix: org.scalajs.dom.raw.SVGAnimatedNumberList = js.native
  val kernelUnitLengthX: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val kernelUnitLengthY: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val orderX: org.scalajs.dom.raw.SVGAnimatedInteger = js.native
  val orderY: org.scalajs.dom.raw.SVGAnimatedInteger = js.native
  val preserveAlpha: org.scalajs.dom.raw.SVGAnimatedBoolean = js.native
  val targetX: org.scalajs.dom.raw.SVGAnimatedInteger = js.native
  val targetY: org.scalajs.dom.raw.SVGAnimatedInteger = js.native
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

