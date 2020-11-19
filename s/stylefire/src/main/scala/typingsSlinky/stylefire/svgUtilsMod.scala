package typingsSlinky.stylefire

import org.scalajs.dom.raw.SVGElement
import org.scalajs.dom.raw.SVGPathElement
import typingsSlinky.stylefire.svgTypesMod.Dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stylefire/lib/svg/utils", JSImport.Namespace)
@js.native
object svgUtilsMod extends js.Object {
  
  def getDimensions(element: SVGElement): Dimensions = js.native
  def getDimensions(element: SVGPathElement): Dimensions = js.native
  
  def getSVGElementDimensions(element: SVGElement): Dimensions = js.native
  def getSVGElementDimensions(element: SVGPathElement): Dimensions = js.native
}
