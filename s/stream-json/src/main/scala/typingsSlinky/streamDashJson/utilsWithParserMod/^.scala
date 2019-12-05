package typingsSlinky.streamDashJson.utilsWithParserMod

import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.TransformOptions
import typingsSlinky.streamDashJson.parserMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-json/utils/withParser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    fn: js.Function1[
      js.UndefOr[
        (/* options */ typingsSlinky.streamDashJson.filtersFilterBaseMod.FilterOptions) | typingsSlinky.streamDashJson.streamersStreamBaseMod.StreamOptions | TransformOptions
      ], 
      Transform | typingsSlinky.streamDashJson.streamersStreamBaseMod.^  | typingsSlinky.streamDashJson.filtersFilterBaseMod.^ 
    ]
  ): typingsSlinky.streamDashChain.streamDashChainMod.^ = js.native
  def apply(fn: js.Function1[/* options */ js.UndefOr[TransformOptions], Transform], options: ParserOptions): typingsSlinky.streamDashChain.streamDashChainMod.^ = js.native
  def apply(
    fn: js.Function1[
      /* options */ typingsSlinky.streamDashJson.filtersFilterBaseMod.FilterOptions, 
      typingsSlinky.streamDashJson.filtersFilterBaseMod.^
    ],
    options: FilterOptions
  ): typingsSlinky.streamDashChain.streamDashChainMod.^ = js.native
  def apply(
    fn: js.Function1[
      /* options */ js.UndefOr[typingsSlinky.streamDashJson.streamersStreamBaseMod.StreamOptions], 
      typingsSlinky.streamDashJson.streamersStreamBaseMod.^
    ],
    options: StreamOptions
  ): typingsSlinky.streamDashChain.streamDashChainMod.^ = js.native
}

