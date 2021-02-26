package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.encodingMod.Encoding
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.normalizeBaseMod.ExtraNormalizer
import typingsSlinky.vegaLite.specLayerMod.GenericLayerSpec
import typingsSlinky.vegaLite.specLayerMod.NormalizedLayerSpec
import typingsSlinky.vegaLite.specUnitMod.GenericUnitSpec
import typingsSlinky.vegaLite.specUnitMod.NormalizedUnitSpec
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.srcMarkMod.MarkDef
import typingsSlinky.vegaLite.vegaLiteStrings.area
import typingsSlinky.vegaLite.vegaLiteStrings.line
import typingsSlinky.vegaLite.vegaLiteStrings.rule
import typingsSlinky.vegaLite.vegaLiteStrings.trail
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathoverlayMod {
  
  @JSImport("vega-lite/build/src/normalize/pathoverlay", "PathOverlayNormalizer")
  @js.native
  class PathOverlayNormalizer ()
    extends ExtraNormalizer[
          UnitSpecWithPathOverlay, 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any]
        ] {
    
    def hasMatchingType(
      spec: GenericUnitSpec[_, Mark | (MarkDef[Mark, ExprRef | SignalRef])],
      config: Config[ExprRef | SignalRef]
    ): /* is vega-lite.vega-lite/build/src/normalize/pathoverlay.UnitSpecWithPathOverlay */ Boolean = js.native
  }
  
  type UnitSpecWithPathOverlay = GenericUnitSpec[
    Encoding[String], 
    Mark | (MarkDef[line | area | rule | trail, ExprRef | SignalRef])
  ]
}
