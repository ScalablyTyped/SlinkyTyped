package typingsSlinky.wordpressComponents

import org.scalajs.dom.raw.SVGCircleElement
import org.scalajs.dom.raw.SVGGElement
import org.scalajs.dom.raw.SVGPathElement
import org.scalajs.dom.raw.SVGPolygonElement
import org.scalajs.dom.raw.SVGRectElement
import org.scalajs.dom.raw.SVGSVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGProps
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.blockquote
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.hr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/components/primitives", JSImport.Namespace)
@js.native
object primitivesMod extends js.Object {
  val BlockQuotation: blockquote = js.native
  val Circle: ReactComponentClass[SVGProps[SVGCircleElement]] = js.native
  val G: ReactComponentClass[SVGProps[SVGGElement]] = js.native
  val HorizontalRule: hr = js.native
  val Path: ReactComponentClass[SVGProps[SVGPathElement]] = js.native
  val Polygon: ReactComponentClass[SVGProps[SVGPolygonElement]] = js.native
  val Rect: ReactComponentClass[SVGProps[SVGRectElement]] = js.native
  val SVG: ReactComponentClass[SVGProps[SVGSVGElement]] = js.native
}

