package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <feDiffuseLighting> element. */
@js.native
trait SVGFEDiffuseLightingElement
  extends SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  val diffuseConstant: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val in1: org.scalajs.dom.raw.SVGAnimatedString = js.native
  val kernelUnitLengthX: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val kernelUnitLengthY: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
  val surfaceScale: org.scalajs.dom.raw.SVGAnimatedNumber = js.native
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

@JSGlobal("SVGFEDiffuseLightingElement")
@js.native
object SVGFEDiffuseLightingElement extends Instantiable0[SVGFEDiffuseLightingElement]

