package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Corresponds to the <textPath> element. */
@js.native
trait SVGTextPathElement
  extends SVGTextContentElement
     with SVGURIReference {
  val TEXTPATH_METHODTYPE_ALIGN: Double = js.native
  val TEXTPATH_METHODTYPE_STRETCH: Double = js.native
  val TEXTPATH_METHODTYPE_UNKNOWN: Double = js.native
  val TEXTPATH_SPACINGTYPE_AUTO: Double = js.native
  val TEXTPATH_SPACINGTYPE_EXACT: Double = js.native
  val TEXTPATH_SPACINGTYPE_UNKNOWN: Double = js.native
  val method: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  val spacing: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  val startOffset: org.scalajs.dom.raw.SVGAnimatedLength = js.native
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

