package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.channeldefMod.Field
import typingsSlinky.vegaLite.repeatMod.RepeatSpec
import typingsSlinky.vegaLite.specConcatMod.GenericConcatSpec
import typingsSlinky.vegaLite.specConcatMod.GenericHConcatSpec
import typingsSlinky.vegaLite.specConcatMod.GenericVConcatSpec
import typingsSlinky.vegaLite.specFacetMod.GenericFacetSpec
import typingsSlinky.vegaLite.specLayerMod.GenericLayerSpec
import typingsSlinky.vegaLite.specMod.GenericSpec
import typingsSlinky.vegaLite.specUnitMod.GenericUnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("vega-lite/build/src/spec/map", "SpecMapper")
  @js.native
  abstract class SpecMapper[P, UI /* <: GenericUnitSpec[_, _] */, LI /* <: GenericLayerSpec[_] */, UO /* <: GenericUnitSpec[_, _] */, RO /* <: RepeatSpec */, FO /* <: Field */] () extends StObject {
    
    def map(spec: GenericSpec[UI, LI, RepeatSpec, Field], params: P): GenericSpec[UO, GenericLayerSpec[UO], RO, FO] = js.native
    
    /* protected */ def mapConcat(spec: GenericConcatSpec[GenericSpec[UI, LI, RepeatSpec, Field]], params: P): GenericConcatSpec[GenericSpec[UO, GenericLayerSpec[UO], RO, FO]] = js.native
    
    /* protected */ def mapFacet(spec: GenericFacetSpec[UI, LI, Field], params: P): GenericFacetSpec[UO, GenericLayerSpec[UO], FO] = js.native
    
    /* protected */ def mapHConcat(spec: GenericHConcatSpec[GenericSpec[UI, LI, RepeatSpec, Field]], params: P): GenericHConcatSpec[GenericSpec[UO, GenericLayerSpec[UO], RO, FO]] = js.native
    
    /* protected */ def mapLayer(spec: LI, params: P): GenericLayerSpec[UO] = js.native
    
    def mapLayerOrUnit(spec: LI | UI, params: P): UO | GenericLayerSpec[UO] = js.native
    
    /* protected */ def mapRepeat(spec: RepeatSpec, params: P): GenericSpec[UO, _, RO, FO] = js.native
    
    def mapUnit(spec: UI, params: P): UO | GenericLayerSpec[UO] = js.native
    
    /* protected */ def mapVConcat(spec: GenericVConcatSpec[GenericSpec[UI, LI, RepeatSpec, Field]], params: P): GenericVConcatSpec[GenericSpec[UO, GenericLayerSpec[UO], RO, FO]] = js.native
  }
}
