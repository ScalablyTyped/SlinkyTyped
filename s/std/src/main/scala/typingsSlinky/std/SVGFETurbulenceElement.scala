package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <feTurbulence> element. */
@js.native
trait SVGFETurbulenceElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val SVG_STITCHTYPE_NOSTITCH: Double = js.native
  val SVG_STITCHTYPE_STITCH: Double = js.native
  val SVG_STITCHTYPE_UNKNOWN: Double = js.native
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: Double = js.native
  val SVG_TURBULENCE_TYPE_TURBULENCE: Double = js.native
  val SVG_TURBULENCE_TYPE_UNKNOWN: Double = js.native
  val baseFrequencyX: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val baseFrequencyY: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val numOctaves: org.scalajs.dom.raw.SVGAnimatedInteger = js.native
  val seed: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val stitchTiles: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  val `type`: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
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
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("SVGFETurbulenceElement")
@js.native
object SVGFETurbulenceElement extends Instantiable0[SVGFETurbulenceElement] {
  val SVG_STITCHTYPE_NOSTITCH: Double = js.native
  val SVG_STITCHTYPE_STITCH: Double = js.native
  val SVG_STITCHTYPE_UNKNOWN: Double = js.native
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: Double = js.native
  val SVG_TURBULENCE_TYPE_TURBULENCE: Double = js.native
  val SVG_TURBULENCE_TYPE_UNKNOWN: Double = js.native
}

