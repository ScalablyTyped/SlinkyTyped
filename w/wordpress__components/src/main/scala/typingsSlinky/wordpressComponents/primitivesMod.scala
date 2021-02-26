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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesMod {
  
  @JSImport("@wordpress/components/primitives", "BlockQuotation")
  @js.native
  val BlockQuotation: blockquote = js.native
  
  @JSImport("@wordpress/components/primitives", "Circle")
  @js.native
  val Circle: ReactComponentClass[SVGProps[SVGCircleElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "G")
  @js.native
  val G: ReactComponentClass[SVGProps[SVGGElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "HorizontalRule")
  @js.native
  val HorizontalRule: hr = js.native
  
  @JSImport("@wordpress/components/primitives", "Path")
  @js.native
  val Path: ReactComponentClass[SVGProps[SVGPathElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "Polygon")
  @js.native
  val Polygon: ReactComponentClass[SVGProps[SVGPolygonElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "Rect")
  @js.native
  val Rect: ReactComponentClass[SVGProps[SVGRectElement]] = js.native
  
  @JSImport("@wordpress/components/primitives", "SVG")
  @js.native
  val SVG: ReactComponentClass[SVGProps[SVGSVGElement]] = js.native
}
