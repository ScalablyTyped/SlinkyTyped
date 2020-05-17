package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGZoomEvent extends UIEvent {
  val newScale: Double = js.native
  val newTranslate: org.scalajs.dom.raw.SVGPoint = js.native
  val previousScale: Double = js.native
  val previousTranslate: org.scalajs.dom.raw.SVGPoint = js.native
  val zoomRectScreen: org.scalajs.dom.raw.SVGRect = js.native
}

