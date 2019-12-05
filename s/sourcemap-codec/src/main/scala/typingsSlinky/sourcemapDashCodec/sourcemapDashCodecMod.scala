package typingsSlinky.sourcemapDashCodec

import typingsSlinky.sourcemapDashCodec.sourcemapDashCodecMod.SourceMapLine
import typingsSlinky.sourcemapDashCodec.sourcemapDashCodecMod.SourceMapMappings
import typingsSlinky.sourcemapDashCodec.sourcemapDashCodecMod.SourceMapSegment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sourcemap-codec", JSImport.Namespace)
@js.native
object sourcemapDashCodecMod extends js.Object {
  def decode(mappings: String): SourceMapMappings = js.native
  def encode(decoded: SourceMapMappings): String = js.native
  type SourceMapLine = js.Array[SourceMapSegment]
  type SourceMapMappings = js.Array[SourceMapLine]
  type SourceMapSegment = js.Array[Double] | (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple5[Double, Double, Double, Double, Double])
}

