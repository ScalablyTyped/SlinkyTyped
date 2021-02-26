package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.channeldefMod.FieldName
import typingsSlinky.vegaLite.mapMod.SpecMapper
import typingsSlinky.vegaLite.normalizeBaseMod.NormalizerParams
import typingsSlinky.vegaLite.specLayerMod.LayerSpec
import typingsSlinky.vegaLite.specUnitMod.FacetedUnitSpec
import typingsSlinky.vegaLite.specUnitMod.NormalizedUnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("vega-lite/build/src/normalize/core", "CoreNormalizer")
  @js.native
  class CoreNormalizer ()
    extends SpecMapper[NormalizerParams, FacetedUnitSpec, LayerSpec, NormalizedUnitSpec, scala.Nothing, FieldName] {
    
    var getFacetMappingAndLayout: js.Any = js.native
    
    var mapFacetedUnit: js.Any = js.native
    
    var mapLayerRepeat: js.Any = js.native
    
    var mapNonLayerRepeat: js.Any = js.native
    
    var mapUnitWithParentEncodingOrProjection: js.Any = js.native
    
    var nonFacetUnitNormalizers: js.Any = js.native
  }
}
