package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <image> element. */
@js.native
trait SVGImageElement
  extends SVGGraphicsElement
     with SVGURIReference
     with HTMLOrSVGImageElement {
  val height: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val preserveAspectRatio: org.scalajs.dom.raw.SVGAnimatedPreserveAspectRatio = js.native
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

@JSGlobal("SVGImageElement")
@js.native
object SVGImageElement extends Instantiable0[SVGImageElement]

