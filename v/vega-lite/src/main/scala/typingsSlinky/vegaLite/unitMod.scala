package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.axisMod.AxisInternal
import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channelMod.NonPositionScaleChannel
import typingsSlinky.vegaLite.channelMod.PositionChannel
import typingsSlinky.vegaLite.channelMod.ScaleChannel
import typingsSlinky.vegaLite.channelMod.SingleDefChannel
import typingsSlinky.vegaLite.channeldefMod.TypedFieldDef
import typingsSlinky.vegaLite.componentMod.AxisInternalIndex
import typingsSlinky.vegaLite.encodingMod.Encoding
import typingsSlinky.vegaLite.legendComponentMod.LegendInternalIndex
import typingsSlinky.vegaLite.legendMod.LegendInternal
import typingsSlinky.vegaLite.modelMod.Model
import typingsSlinky.vegaLite.modelMod.ModelWithField
import typingsSlinky.vegaLite.projectionMod.Projection
import typingsSlinky.vegaLite.scaleComponentMod.ScaleIndex
import typingsSlinky.vegaLite.scaleMod.Domain
import typingsSlinky.vegaLite.specBaseMod.LayoutSizeMixins
import typingsSlinky.vegaLite.specUnitMod.NormalizedUnitSpec
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.srcMarkMod.MarkDef
import typingsSlinky.vegaLite.srcSelectionMod.SelectionDef
import typingsSlinky.vegaLite.srcStackMod.StackProperties
import typingsSlinky.vegaLite.utilMod.Dict
import typingsSlinky.vegaLite.vegaLiteStrings.binned
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitMod {
  
  @JSImport("vega-lite/build/src/compile/unit", "UnitModel")
  @js.native
  class UnitModel protected () extends ModelWithField {
    def this(
      spec: NormalizedUnitSpec,
      parent: Model,
      parentGivenName: String,
      parentGivenSize: LayoutSizeMixins,
      config: Config[SignalRef]
    ) = this()
    
    def axis(channel: PositionChannel): AxisInternal = js.native
    
    val encoding: Encoding[String] = js.native
    
    def hasProjection: Boolean = js.native
    
    var initAxes: js.Any = js.native
    
    var initAxis: js.Any = js.native
    
    var initLegends: js.Any = js.native
    
    var initScale: js.Any = js.native
    
    var initScales: js.Any = js.native
    
    def legend(channel: NonPositionScaleChannel): LegendInternal = js.native
    
    def mark: Mark = js.native
    
    val markDef: MarkDef[Mark, SignalRef] = js.native
    
    /**
      * Return specified Vega-Lite scale domain for a particular channel
      * @param channel
      */
    def scaleDomain(channel: ScaleChannel): Domain = js.native
    
    val selection: Dict[SelectionDef] = js.native
    
    var specifiedAxes: AxisInternalIndex = js.native
    
    var specifiedLegends: LegendInternalIndex = js.native
    
    var specifiedProjection: Projection = js.native
    
    val specifiedScales: ScaleIndex = js.native
    
    val stack: StackProperties = js.native
    
    def typedFieldDef(channel: SingleDefChannel): TypedFieldDef[String, _, Boolean | BinParams | binned] = js.native
  }
}
