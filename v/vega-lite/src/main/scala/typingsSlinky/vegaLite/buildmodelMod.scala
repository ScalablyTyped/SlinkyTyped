package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.specBaseMod.LayoutSizeMixins
import typingsSlinky.vegaLite.specMod.NormalizedSpec
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildmodelMod {
  
  @JSImport("vega-lite/build/src/compile/buildmodel", "buildModel")
  @js.native
  def buildModel(
    spec: NormalizedSpec,
    parent: Model,
    parentGivenName: String,
    unitSize: LayoutSizeMixins,
    config: Config[SignalRef]
  ): Model = js.native
}
