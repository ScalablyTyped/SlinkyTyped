package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <pattern> element. */
@js.native
trait SVGPatternElement
  extends SVGElement
     with SVGFitToViewBox
     with SVGTests
     with SVGURIReference {
  val height: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val patternContentUnits: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  val patternTransform: org.scalajs.dom.raw.SVGAnimatedTransformList = js.native
  val patternUnits: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  val width: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val x: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val y: org.scalajs.dom.raw.SVGAnimatedLength = js.native
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

@JSGlobal("SVGPatternElement")
@js.native
object SVGPatternElement extends Instantiable0[SVGPatternElement]

