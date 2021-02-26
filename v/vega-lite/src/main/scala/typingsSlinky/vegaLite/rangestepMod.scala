package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.encodingMod.Encoding
import typingsSlinky.vegaLite.normalizeBaseMod.ExtraNormalizer
import typingsSlinky.vegaLite.specLayerMod.GenericLayerSpec
import typingsSlinky.vegaLite.specLayerMod.NormalizedLayerSpec
import typingsSlinky.vegaLite.specMod.GenericSpec
import typingsSlinky.vegaLite.specUnitMod.GenericUnitSpec
import typingsSlinky.vegaLite.specUnitMod.NormalizedUnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangestepMod {
  
  @JSImport("vega-lite/build/src/normalize/rangestep", "RangeStepNormalizer")
  @js.native
  class RangeStepNormalizer ()
    extends ExtraNormalizer[
          UnitSpecWithRangeStep, 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any]
        ] {
    
    def hasMatchingType(spec: GenericSpec[_, _, _, _]): /* is vega-lite.vega-lite/build/src/normalize/rangestep.UnitSpecWithRangeStep */ Boolean = js.native
    
    def run(spec: UnitSpecWithRangeStep): NormalizedUnitSpec = js.native
  }
  
  type UnitSpecWithRangeStep = GenericUnitSpec[Encoding[String], js.Any]
}
