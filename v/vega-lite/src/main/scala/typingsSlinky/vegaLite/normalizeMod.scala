package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.autosizeAutosizeTypeAutoS
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.specBaseMod.LayoutSizeMixins
import typingsSlinky.vegaLite.specMod.NormalizedSpec
import typingsSlinky.vegaLite.specMod.TopLevelSpec
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.toplevelMod.AutoSizeParams
import typingsSlinky.vegaLite.toplevelMod.TopLevel
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeMod {
  
  @JSImport("vega-lite/build/src/normalize", "normalize")
  @js.native
  def normalize(spec: TopLevelSpec with LayoutSizeMixins): TopLevel[NormalizedSpec] with LayoutSizeMixins = js.native
  @JSImport("vega-lite/build/src/normalize", "normalize")
  @js.native
  def normalize(spec: TopLevelSpec with LayoutSizeMixins, config: Config[SignalRef]): TopLevel[NormalizedSpec] with LayoutSizeMixins = js.native
  
  @JSImport("vega-lite/build/src/normalize", "normalizeAutoSize")
  @js.native
  def normalizeAutoSize(spec: TopLevel[NormalizedSpec], sizeInfo: autosizeAutosizeTypeAutoS): AutoSizeParams = js.native
  @JSImport("vega-lite/build/src/normalize", "normalizeAutoSize")
  @js.native
  def normalizeAutoSize(
    spec: TopLevel[NormalizedSpec],
    sizeInfo: autosizeAutosizeTypeAutoS,
    config: Config[ExprRef | SignalRef]
  ): AutoSizeParams = js.native
}
