package typingsSlinky.stylefire.buildMod

import typingsSlinky.stylefire.svgTypesMod.Dimensions
import typingsSlinky.stylefire.svgTypesMod.SVGState
import typingsSlinky.stylefire.typesMod.ResolvedState
import typingsSlinky.stylefire.typesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylefire/lib/svg/build", "buildSVGAttrs")
@js.native
object buildSVGAttrs extends js.Object {
  def apply(hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState): SVGAttrs = js.native
  def apply(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState,
    dimensions: Dimensions
  ): SVGAttrs = js.native
  def apply(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState,
    dimensions: Dimensions,
    totalPathLength: js.UndefOr[scala.Nothing],
    cssBuilder: js.Function1[/* state */ State, ResolvedState]
  ): SVGAttrs = js.native
  def apply(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState,
    dimensions: Dimensions,
    totalPathLength: js.UndefOr[scala.Nothing],
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs
  ): SVGAttrs = js.native
  def apply(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState,
    dimensions: Dimensions,
    totalPathLength: js.UndefOr[scala.Nothing],
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs,
    isDashCase: Boolean
  ): SVGAttrs = js.native
  def apply(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState,
    dimensions: Dimensions,
    totalPathLength: Double
  ): SVGAttrs = js.native
  def apply(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState,
    dimensions: Dimensions,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState]
  ): SVGAttrs = js.native
  def apply(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState,
    dimensions: Dimensions,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs
  ): SVGAttrs = js.native
  def apply(
    hasAttrXAttrYOriginXOriginYPathLengthPathSpacingPathOffsetState: State with SVGState,
    dimensions: Dimensions,
    totalPathLength: Double,
    cssBuilder: js.Function1[/* state */ State, ResolvedState],
    attrs: SVGAttrs,
    isDashCase: Boolean
  ): SVGAttrs = js.native
}

