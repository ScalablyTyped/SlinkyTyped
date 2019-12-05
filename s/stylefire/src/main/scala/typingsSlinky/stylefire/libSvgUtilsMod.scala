package typingsSlinky.stylefire

import typingsSlinky.std.SVGElement
import typingsSlinky.std.SVGPathElement
import typingsSlinky.stylefire.libSvgTypesMod.Dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylefire/lib/svg/utils", JSImport.Namespace)
@js.native
object libSvgUtilsMod extends js.Object {
  def getDimensions(element: SVGElement): Dimensions = js.native
  def getDimensions(element: SVGPathElement): Dimensions = js.native
  def getSVGElementDimensions(element: SVGElement): Dimensions = js.native
  def getSVGElementDimensions(element: SVGPathElement): Dimensions = js.native
}

