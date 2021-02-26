package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.specBaseMod.LayoutSizeMixins
import typingsSlinky.vegaLite.specLayerMod.NormalizedLayerSpec
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("vega-lite/build/src/compile/layer", "LayerModel")
  @js.native
  class LayerModel protected () extends Model {
    def this(
      spec: NormalizedLayerSpec,
      parent: Model,
      parentGivenName: String,
      parentGivenSize: LayoutSizeMixins,
      config: Config[SignalRef]
    ) = this()
  }
}
