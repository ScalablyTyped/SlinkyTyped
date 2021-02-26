package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.BandOffset
import typingsSlinky.vegaLite.anon.FieldGroup
import typingsSlinky.vegaLite.anon.FieldOrDatumDef2
import typingsSlinky.vegaLite.anon.FieldTest
import typingsSlinky.vegaLite.anon.MarkDef
import typingsSlinky.vegaLite.anon.MidPointParamschannelPosi
import typingsSlinky.vegaLite.anon.TestValue
import typingsSlinky.vegaLite.anon.ValueValue
import typingsSlinky.vegaLite.binMod.Bin
import typingsSlinky.vegaLite.channelMod.Channel
import typingsSlinky.vegaLite.channelMod.PolarPositionChannel
import typingsSlinky.vegaLite.channelMod.PositionChannel
import typingsSlinky.vegaLite.channeldefMod.ChannelDef
import typingsSlinky.vegaLite.channeldefMod.DatumDef
import typingsSlinky.vegaLite.channeldefMod.FieldDef
import typingsSlinky.vegaLite.channeldefMod.FieldDefBase
import typingsSlinky.vegaLite.channeldefMod.FieldDefWithoutScale
import typingsSlinky.vegaLite.channeldefMod.FieldName
import typingsSlinky.vegaLite.channeldefMod.FieldRefOption
import typingsSlinky.vegaLite.channeldefMod.OrderFieldDef
import typingsSlinky.vegaLite.channeldefMod.PrimitiveValue
import typingsSlinky.vegaLite.channeldefMod.SecondaryChannelDef
import typingsSlinky.vegaLite.channeldefMod.StringFieldDef
import typingsSlinky.vegaLite.channeldefMod.Value
import typingsSlinky.vegaLite.datetimeMod.DateTime
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.scaleComponentMod.ScaleComponent
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.srcStackMod.StackProperties
import typingsSlinky.vegaLite.srcTypeMod.StandardType
import typingsSlinky.vegaLite.vegaSchemaMod.VgValueRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valuerefMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "datumDefToExpr")
  @js.native
  def datumDefToExpr(datumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]): String = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "fieldInvalidPredicate")
  @js.native
  def fieldInvalidPredicate(field: FieldDef[String, _]): String = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "fieldInvalidPredicate")
  @js.native
  def fieldInvalidPredicate(field: FieldDef[String, _], invalid: Boolean): String = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "fieldInvalidPredicate")
  @js.native
  def fieldInvalidPredicate(field: FieldName): String = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "fieldInvalidPredicate")
  @js.native
  def fieldInvalidPredicate(field: FieldName, invalid: Boolean): String = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "fieldInvalidTestValueRef")
  @js.native
  def fieldInvalidTestValueRef(fieldDef: FieldDef[String, _], channel: PolarPositionChannel): FieldTest | TestValue = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "fieldInvalidTestValueRef")
  @js.native
  def fieldInvalidTestValueRef(fieldDef: FieldDef[String, _], channel: PositionChannel): FieldTest | TestValue = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "interpolatedSignalRef")
  @js.native
  def interpolatedSignalRef(hasScaleNameFieldOrDatumDefFieldOrDatumDef2OffsetStartSuffixBand: FieldOrDatumDef2): VgValueRef = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "midPoint")
  @js.native
  def midPoint(
    hasChannelChannelDefChannel2DefMarkDefConfigScaleNameScaleStackOffsetDefaultRefBand: MidPointParams
  ): VgValueRef = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "midPointRefWithPositionInvalidTest")
  @js.native
  def midPointRefWithPositionInvalidTest(params: MidPointParamschannelPosi): VgValueRef | js.Array[VgValueRef] = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "valueRefForFieldOrDatumDef")
  @js.native
  def valueRefForFieldOrDatumDef(
    fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    scaleName: String,
    opt: FieldRefOption,
    encode: BandOffset
  ): VgValueRef = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "valueRefForFieldOrDatumDef")
  @js.native
  def valueRefForFieldOrDatumDef(fieldDef: FieldDefBase[String, Bin], scaleName: String, opt: FieldRefOption, encode: BandOffset): VgValueRef = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "widthHeightValueOrSignalRef")
  @js.native
  def widthHeightValueOrSignalRef(channel: Channel, value: Value[ExprRef | SignalRef]): SignalRef | ValueValue | FieldGroup = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "widthHeightValueOrSignalRef")
  @js.native
  def widthHeightValueOrSignalRef(channel: Channel, value: SignalRef): SignalRef | ValueValue | FieldGroup = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/valueref", "wrapPositionInvalidTest")
  @js.native
  def wrapPositionInvalidTest(hasFieldDefChannelMarkDefRefConfig: MarkDef): VgValueRef | js.Array[VgValueRef] = js.native
  
  @js.native
  trait MidPointParams extends StObject {
    
    /**
      * Allow overriding band instead of reading to field def since band is applied to size (width/height) instead of the position for x/y-position with band scales.
      */
    var band: js.UndefOr[Double] = js.native
    
    var channel: Channel = js.native
    
    var channel2Def: js.UndefOr[SecondaryChannelDef[String]] = js.native
    
    var channelDef: ChannelDef[String] = js.native
    
    var config: Config[SignalRef] = js.native
    
    var defaultRef: VgValueRef | js.Function0[VgValueRef] = js.native
    
    var markDef: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef] = js.native
    
    var offset: js.UndefOr[Double | SignalRef] = js.native
    
    var scale: ScaleComponent = js.native
    
    var scaleName: String = js.native
    
    var stack: js.UndefOr[StackProperties] = js.native
  }
  object MidPointParams {
    
    @scala.inline
    def apply(
      channel: Channel,
      config: Config[SignalRef],
      defaultRef: VgValueRef | js.Function0[VgValueRef],
      markDef: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef],
      scale: ScaleComponent,
      scaleName: String
    ): MidPointParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], defaultRef = defaultRef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MidPointParams]
    }
    
    @scala.inline
    implicit class MidPointParamsMutableBuilder[Self <: MidPointParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
      
      @scala.inline
      def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel2Def(value: SecondaryChannelDef[String]): Self = StObject.set(x, "channel2Def", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel2DefUndefined: Self = StObject.set(x, "channel2Def", js.undefined)
      
      @scala.inline
      def setChannelDef(value: ChannelDef[String]): Self = StObject.set(x, "channelDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelDefNull: Self = StObject.set(x, "channelDef", null)
      
      @scala.inline
      def setChannelDefUndefined: Self = StObject.set(x, "channelDef", js.undefined)
      
      @scala.inline
      def setChannelDefVarargs(
        value: ((FieldDefWithoutScale[String, StandardType]) | OrderFieldDef[String] | StringFieldDef[String])*
      ): Self = StObject.set(x, "channelDef", js.Array(value :_*))
      
      @scala.inline
      def setConfig(value: Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRef(value: VgValueRef | js.Function0[VgValueRef]): Self = StObject.set(x, "defaultRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRefFunction0(value: () => VgValueRef): Self = StObject.set(x, "defaultRef", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMarkDef(value: typingsSlinky.vegaLite.srcMarkMod.MarkDef[Mark, SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double | SignalRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setScale(value: ScaleComponent): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: StackProperties): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
}
