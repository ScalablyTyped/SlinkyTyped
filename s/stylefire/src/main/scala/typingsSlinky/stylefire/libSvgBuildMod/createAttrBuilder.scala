package typingsSlinky.stylefire.libSvgBuildMod

import typingsSlinky.stylefire.libStylerTypesMod.State
import typingsSlinky.stylefire.libSvgTypesMod.Dimensions
import typingsSlinky.stylefire.libSvgTypesMod.SVGState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylefire/lib/svg/build", "createAttrBuilder")
@js.native
object createAttrBuilder extends js.Object {
  def apply(dimensions: Dimensions): js.Function1[/* state */ State with SVGState, SVGAttrs] = js.native
  def apply(dimensions: Dimensions, totalPathLength: Double): js.Function1[/* state */ State with SVGState, SVGAttrs] = js.native
  def apply(dimensions: Dimensions, totalPathLength: Double, isDashCase: Boolean): js.Function1[/* state */ State with SVGState, SVGAttrs] = js.native
}

