package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the properties of <filter> elements, as well as methods to manipulate them. */
@js.native
trait SVGFilterElement
  extends SVGElement
     with SVGURIReference {
  val filterUnits: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  val height: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  val primitiveUnits: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
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

@JSGlobal("SVGFilterElement")
@js.native
object SVGFilterElement extends Instantiable0[SVGFilterElement]

