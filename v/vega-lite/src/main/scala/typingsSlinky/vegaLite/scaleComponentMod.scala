package typingsSlinky.vegaLite

import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import typingsSlinky.vegaLite.channelMod.ScaleChannel
import typingsSlinky.vegaLite.scaleMod.Scale
import typingsSlinky.vegaLite.scaleMod.ScaleType
import typingsSlinky.vegaLite.splitMod.Explicit
import typingsSlinky.vegaLite.splitMod.Split
import typingsSlinky.vegaLite.srcSelectionMod.SelectionExtent
import typingsSlinky.vegaLite.vegaSchemaMod.VgNonUnionDomain
import typingsSlinky.vegaTypings.scaleMod.RangeBand
import typingsSlinky.vegaTypings.scaleMod.RangeRawArray
import typingsSlinky.vegaTypings.scaleMod.RangeScheme
import typingsSlinky.vegaTypings.scaleMod.ScaleBins
import typingsSlinky.vegaTypings.scaleMod.ScaleData
import typingsSlinky.vegaTypings.scaleMod.ScaleInterpolate
import typingsSlinky.vegaTypings.scaleMod.TimeInterval
import typingsSlinky.vegaTypings.scaleMod.TimeIntervalStep
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleComponentMod {
  
  @JSImport("vega-lite/build/src/compile/scale/component", "ScaleComponent")
  @js.native
  class ScaleComponent protected () extends Split[ScaleComponentProps] {
    def this(name: String, typeWithExplicit: Explicit[ScaleType]) = this()
    
    /**
      * Whether the scale definitely includes zero in the domain
      */
    def domainDefinitelyIncludesZero(): Boolean = js.native
    
    var merged: Boolean = js.native
  }
  
  type Range = js.UndefOr[RangeScheme | RangeBand | ScaleData]
  
  type ScaleComponentIndex = Partial[Record[ScaleChannel, ScaleComponent]]
  
  /* Inlined std.Omit<vega-lite.vega-lite/build/src/vega.schema.VgScale, 'domain' | 'domainRaw' | 'reverse'> & {  domains :std.Array<vega-lite.vega-lite/build/src/vega.schema.VgNonUnionDomain>,   selectionExtent :vega-lite.vega-lite/build/src/selection.SelectionExtent | undefined,   reverse :boolean | vega.vega.SignalRef | undefined} */
  @js.native
  trait ScaleComponentProps extends StObject {
    
    var align: js.UndefOr[Double | SignalRef] = js.native
    
    var base: js.UndefOr[Double | SignalRef] = js.native
    
    var bins: js.UndefOr[ScaleBins] = js.native
    
    var clamp: js.UndefOr[Boolean | SignalRef] = js.native
    
    var constant: js.UndefOr[Double | SignalRef] = js.native
    
    var domainImplicit: js.UndefOr[Boolean | SignalRef] = js.native
    
    var domainMax: js.UndefOr[Double | SignalRef] = js.native
    
    var domainMid: js.UndefOr[Double | SignalRef] = js.native
    
    var domainMin: js.UndefOr[Double | SignalRef] = js.native
    
    var domains: js.Array[VgNonUnionDomain] = js.native
    
    var exponent: js.UndefOr[Double | SignalRef] = js.native
    
    var interpolate: js.UndefOr[ScaleInterpolate] = js.native
    
    var name: String = js.native
    
    var nice: js.UndefOr[Boolean | Double | TimeInterval | TimeIntervalStep | SignalRef] = js.native
    
    var padding: js.UndefOr[Double | SignalRef] = js.native
    
    var paddingInner: js.UndefOr[Double | SignalRef] = js.native
    
    var paddingOuter: js.UndefOr[Double | SignalRef] = js.native
    
    var range: js.UndefOr[RangeScheme | RangeBand | ScaleData] = js.native
    
    var reverse: js.UndefOr[Boolean | SignalRef] = js.native
    
    var round: js.UndefOr[Boolean | SignalRef] = js.native
    
    var selectionExtent: js.UndefOr[SelectionExtent] = js.native
    
    var `type`: js.UndefOr[typingsSlinky.vegaTypings.scaleMod.ScaleType] = js.native
    
    var zero: js.UndefOr[Boolean | SignalRef] = js.native
  }
  object ScaleComponentProps {
    
    @scala.inline
    def apply(domains: js.Array[VgNonUnionDomain], name: String): ScaleComponentProps = {
      val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleComponentProps]
    }
    
    @scala.inline
    implicit class ScaleComponentPropsMutableBuilder[Self <: ScaleComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Double | SignalRef): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBase(value: Double | SignalRef): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setBins(value: ScaleBins): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
      
      @scala.inline
      def setBinsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "bins", js.Array(value :_*))
      
      @scala.inline
      def setClamp(value: Boolean | SignalRef): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      @scala.inline
      def setConstant(value: Double | SignalRef): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
      
      @scala.inline
      def setDomainImplicit(value: Boolean | SignalRef): Self = StObject.set(x, "domainImplicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainImplicitUndefined: Self = StObject.set(x, "domainImplicit", js.undefined)
      
      @scala.inline
      def setDomainMax(value: Double | SignalRef): Self = StObject.set(x, "domainMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainMaxUndefined: Self = StObject.set(x, "domainMax", js.undefined)
      
      @scala.inline
      def setDomainMid(value: Double | SignalRef): Self = StObject.set(x, "domainMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainMidUndefined: Self = StObject.set(x, "domainMid", js.undefined)
      
      @scala.inline
      def setDomainMin(value: Double | SignalRef): Self = StObject.set(x, "domainMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainMinUndefined: Self = StObject.set(x, "domainMin", js.undefined)
      
      @scala.inline
      def setDomains(value: js.Array[VgNonUnionDomain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainsVarargs(value: VgNonUnionDomain*): Self = StObject.set(x, "domains", js.Array(value :_*))
      
      @scala.inline
      def setExponent(value: Double | SignalRef): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      @scala.inline
      def setInterpolate(value: ScaleInterpolate): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNice(value: Boolean | Double | TimeInterval | TimeIntervalStep | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInner(value: Double | SignalRef): Self = StObject.set(x, "paddingInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInnerUndefined: Self = StObject.set(x, "paddingInner", js.undefined)
      
      @scala.inline
      def setPaddingOuter(value: Double | SignalRef): Self = StObject.set(x, "paddingOuter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingOuterUndefined: Self = StObject.set(x, "paddingOuter", js.undefined)
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRange(value: RangeScheme | RangeBand | ScaleData): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRangeVarargs(value: (Boolean | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "range", js.Array(value :_*))
      
      @scala.inline
      def setReverse(value: Boolean | SignalRef): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean | SignalRef): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setSelectionExtent(value: SelectionExtent): Self = StObject.set(x, "selectionExtent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionExtentUndefined: Self = StObject.set(x, "selectionExtent", js.undefined)
      
      @scala.inline
      def setType(value: typingsSlinky.vegaTypings.scaleMod.ScaleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setZero(value: Boolean | SignalRef): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  type ScaleIndex = Partial[Record[ScaleChannel, Scale[SignalRef]]]
}
