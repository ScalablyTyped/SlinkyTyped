package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.channeldefMod.FieldName
import typingsSlinky.vegaLite.encodingMod.Encoding
import typingsSlinky.vegaLite.normalizeBaseMod.ExtraNormalizer
import typingsSlinky.vegaLite.normalizeBaseMod.Normalize
import typingsSlinky.vegaLite.normalizeBaseMod.NormalizerParams
import typingsSlinky.vegaLite.specLayerMod.GenericLayerSpec
import typingsSlinky.vegaLite.specLayerMod.NormalizedLayerSpec
import typingsSlinky.vegaLite.specMod.GenericSpec
import typingsSlinky.vegaLite.specUnitMod.GenericUnitSpec
import typingsSlinky.vegaLite.specUnitMod.NormalizedUnitSpec
import typingsSlinky.vegaLite.srcMarkMod.GenericMarkDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositemarkBaseMod {
  
  @JSImport("vega-lite/build/src/compositemark/base", "CompositeMarkNormalizer")
  @js.native
  class CompositeMarkNormalizer[M /* <: String */] protected ()
    extends ExtraNormalizer[
          CompositeMarkUnitSpec[M], 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[js.Any, js.Any]) | GenericLayerSpec[js.Any]
        ] {
    def this(
      name: String,
      run: js.Function3[
            /* spec */ CompositeMarkUnitSpec[M], 
            /* params */ NormalizerParams, 
            /* normalize */ Normalize[
              (GenericUnitSpec[Encoding[FieldName], M]) | GenericLayerSpec[_], 
              NormalizedLayerSpec | NormalizedUnitSpec
            ], 
            NormalizedLayerSpec | NormalizedUnitSpec
          ]
    ) = this()
    
    def hasMatchingType(spec: GenericSpec[_, _, _, _]): /* is vega-lite.vega-lite/build/src/compositemark/base.CompositeMarkUnitSpec<M> */ Boolean = js.native
  }
  
  type CompositeMarkUnitSpec[M /* <: String */] = GenericUnitSpec[js.Any, M | GenericMarkDef[M]]
}
