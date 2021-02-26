package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channeldefMod.ChannelDef
import typingsSlinky.vegaLite.channeldefMod.Field
import typingsSlinky.vegaLite.channeldefMod.FieldDefBase
import typingsSlinky.vegaLite.channeldefMod.FieldName
import typingsSlinky.vegaLite.channeldefMod.TypeMixins
import typingsSlinky.vegaLite.datetimeMod.DateTime
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.headerMod.Header
import typingsSlinky.vegaLite.sortMod.EncodingSortField
import typingsSlinky.vegaLite.sortMod.SortArray
import typingsSlinky.vegaLite.sortMod.SortOrder
import typingsSlinky.vegaLite.specBaseMod.BaseSpec
import typingsSlinky.vegaLite.specBaseMod.ColumnMixins
import typingsSlinky.vegaLite.specBaseMod.GenericCompositionLayout
import typingsSlinky.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns
import typingsSlinky.vegaLite.specBaseMod.ResolveMixins
import typingsSlinky.vegaLite.specLayerMod.GenericLayerSpec
import typingsSlinky.vegaLite.specLayerMod.NormalizedLayerSpec
import typingsSlinky.vegaLite.specUnitMod.GenericUnitSpec
import typingsSlinky.vegaLite.specUnitMod.NormalizedUnitSpec
import typingsSlinky.vegaLite.srcGuideMod.TitleMixins
import typingsSlinky.vegaLite.srcTypeMod.StandardType
import typingsSlinky.vegaTypings.layoutMod.LayoutAlign
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object specFacetMod {
  
  @JSImport("vega-lite/build/src/spec/facet", "isFacetFieldDef")
  @js.native
  def isFacetFieldDef[F /* <: Field */](channelDef: ChannelDef[F]): /* is vega-lite.vega-lite/build/src/spec/facet.FacetFieldDef<F, any> */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/spec/facet", "isFacetMapping")
  @js.native
  def isFacetMapping[F /* <: Field */, ES /* <: ExprRef | SignalRef */](f: FacetFieldDef[F, ES]): /* is vega-lite.vega-lite/build/src/spec/facet.FacetMapping<F, vega-lite.vega-lite/build/src/spec/facet.FacetFieldDef<F, vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>> */ Boolean = js.native
  @JSImport("vega-lite/build/src/spec/facet", "isFacetMapping")
  @js.native
  def isFacetMapping[F /* <: Field */, ES /* <: ExprRef | SignalRef */](f: FacetMapping[F, FacetFieldDef[F, ExprRef | SignalRef]]): /* is vega-lite.vega-lite/build/src/spec/facet.FacetMapping<F, vega-lite.vega-lite/build/src/spec/facet.FacetFieldDef<F, vega-lite.vega-lite/build/src/expr.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef>> */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/spec/facet", "isFacetSpec")
  @js.native
  def isFacetSpec(spec: BaseSpec): /* is vega-lite.vega-lite/build/src/spec/facet.GenericFacetSpec<any, any, any> */ Boolean = js.native
  
  @js.native
  trait EncodingFacetMapping[F /* <: Field */, ES /* <: ExprRef | SignalRef */] extends FacetMapping[F, RowColumnEncodingFieldDef[F, ES]] {
    
    /**
      * A field definition for the (flexible) facet of trellis plots.
      *
      * If either `row` or `column` is specified, this channel will be ignored.
      */
    var facet: js.UndefOr[FacetEncodingFieldDef[F, ES]] = js.native
  }
  object EncodingFacetMapping {
    
    @scala.inline
    def apply[F /* <: Field */, ES /* <: ExprRef | SignalRef */](): EncodingFacetMapping[F, ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingFacetMapping[F, ES]]
    }
    
    @scala.inline
    implicit class EncodingFacetMappingMutableBuilder[Self <: EncodingFacetMapping[_, _], F /* <: Field */, ES /* <: ExprRef | SignalRef */] (val x: Self with (EncodingFacetMapping[F, ES])) extends AnyVal {
      
      @scala.inline
      def setFacet(value: FacetEncodingFieldDef[F, ES]): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacetUndefined: Self = StObject.set(x, "facet", js.undefined)
    }
  }
  
  type FacetEncodingFieldDef[F /* <: Field */, ES /* <: ExprRef | SignalRef */] = (FacetFieldDef[F, ES]) with GenericCompositionLayoutWithColumns
  
  @js.native
  trait FacetFieldDef[F /* <: Field */, ES /* <: ExprRef | SignalRef */]
    extends FieldDefBase[F, Boolean | BinParams | Null]
       with TitleMixins
       with TypeMixins[StandardType] {
    
    /**
      * An object defining properties of a facet's header.
      */
    var header: js.UndefOr[Header[ES]] = js.native
    
    /**
      * Sort order for the encoded field.
      *
      * For continuous fields (quantitative or temporal), `sort` can be either `"ascending"` or `"descending"`.
      *
      * For discrete fields, `sort` can be one of the following:
      * - `"ascending"` or `"descending"` -- for sorting by the values' natural order in JavaScript.
      * - [A sort field definition](https://vega.github.io/vega-lite/docs/sort.html#sort-field) for sorting by another field.
      * - [An array specifying the field values in preferred order](https://vega.github.io/vega-lite/docs/sort.html#sort-array). In this case, the sort order will obey the values in the array, followed by any unspecified values in their original order. For discrete time field, values in the sort array can be [date-time definition objects](types#datetime). In addition, for time units `"month"` and `"day"`, the values can be the month or day names (case insensitive) or their 3-letter initials (e.g., `"Mon"`, `"Tue"`).
      * - `null` indicating no sort.
      *
      * __Default value:__ `"ascending"`
      *
      * __Note:__ `null` is not supported for `row` and `column`.
      */
    var sort: js.UndefOr[SortArray | SortOrder | EncodingSortField[F] | Null] = js.native
  }
  object FacetFieldDef {
    
    @scala.inline
    def apply[F /* <: Field */, ES /* <: ExprRef | SignalRef */](): FacetFieldDef[F, ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacetFieldDef[F, ES]]
    }
    
    @scala.inline
    implicit class FacetFieldDefMutableBuilder[Self <: FacetFieldDef[_, _], F /* <: Field */, ES /* <: ExprRef | SignalRef */] (val x: Self with (FacetFieldDef[F, ES])) extends AnyVal {
      
      @scala.inline
      def setHeader(value: Header[ES]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setSort(value: SortArray | SortOrder | EncodingSortField[F]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortNull: Self = StObject.set(x, "sort", null)
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setSortVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "sort", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FacetMapping[F /* <: Field */, FD /* <: FacetFieldDef[F, ExprRef | SignalRef] */] extends StObject {
    
    /**
      * A field definition for the horizontal facet of trellis plots.
      */
    var column: js.UndefOr[FD] = js.native
    
    /**
      * A field definition for the vertical facet of trellis plots.
      */
    var row: js.UndefOr[FD] = js.native
  }
  object FacetMapping {
    
    @scala.inline
    def apply[F /* <: Field */, FD /* <: FacetFieldDef[F, ExprRef | SignalRef] */](): FacetMapping[F, FD] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacetMapping[F, FD]]
    }
    
    @scala.inline
    implicit class FacetMappingMutableBuilder[Self <: FacetMapping[_, _], F /* <: Field */, FD /* <: FacetFieldDef[F, ExprRef | SignalRef] */] (val x: Self with (FacetMapping[F, FD])) extends AnyVal {
      
      @scala.inline
      def setColumn(value: FD): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setRow(value: FD): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  @js.native
  trait GenericFacetSpec[U /* <: GenericUnitSpec[_, _] */, L /* <: GenericLayerSpec[_] */, F /* <: Field */]
    extends GenericCompositionLayout
       with BaseSpec
       with ColumnMixins
       with ResolveMixins {
    
    /**
      * Definition for how to facet the data. One of:
      * 1) [a field definition for faceting the plot by one field](https://vega.github.io/vega-lite/docs/facet.html#field-def)
      * 2) [An object that maps `row` and `column` channels to their field definitions](https://vega.github.io/vega-lite/docs/facet.html#mapping)
      */
    var facet: (FacetFieldDef[F, ExprRef | SignalRef]) | (FacetMapping[F, FacetFieldDef[F, ExprRef | SignalRef]]) = js.native
    
    /**
      * A specification of the view that gets faceted.
      */
    var spec: L | U = js.native
  }
  object GenericFacetSpec {
    
    @scala.inline
    def apply[U /* <: GenericUnitSpec[_, _] */, L /* <: GenericLayerSpec[_] */, F /* <: Field */](
      facet: (FacetFieldDef[F, ExprRef | SignalRef]) | (FacetMapping[F, FacetFieldDef[F, ExprRef | SignalRef]]),
      spec: L | U
    ): GenericFacetSpec[U, L, F] = {
      val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericFacetSpec[U, L, F]]
    }
    
    @scala.inline
    implicit class GenericFacetSpecMutableBuilder[Self <: GenericFacetSpec[_, _, _], U /* <: GenericUnitSpec[_, _] */, L /* <: GenericLayerSpec[_] */, F /* <: Field */] (val x: Self with (GenericFacetSpec[U, L, F])) extends AnyVal {
      
      @scala.inline
      def setFacet(
        value: (FacetFieldDef[F, ExprRef | SignalRef]) | (FacetMapping[F, FacetFieldDef[F, ExprRef | SignalRef]])
      ): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpec(value: L | U): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  type NormalizedFacetSpec = GenericFacetSpec[NormalizedUnitSpec, NormalizedLayerSpec, FieldName]
  
  @js.native
  trait RowColumnEncodingFieldDef[F /* <: Field */, ES /* <: ExprRef | SignalRef */] extends FacetFieldDef[F, ES] {
    
    /**
      * The alignment to apply to row/column facet's subplot.
      * The supported string values are `"all"`, `"each"`, and `"none"`.
      *
      * - For `"none"`, a flow layout will be used, in which adjacent subviews are simply placed one after the other.
      * - For `"each"`, subviews will be aligned into a clean grid structure, but each row or column may be of variable size.
      * - For `"all"`, subviews will be aligned and each row or column will be sized identically based on the maximum observed size. String values for this property will be applied to both grid rows and columns.
      *
      * __Default value:__ `"all"`.
      */
    var align: js.UndefOr[LayoutAlign] = js.native
    
    /**
      * Boolean flag indicating if facet's subviews should be centered relative to their respective rows or columns.
      *
      * __Default value:__ `false`
      */
    var center: js.UndefOr[Boolean] = js.native
    
    /**
      * The spacing in pixels between facet's sub-views.
      *
      * __Default value__: Depends on `"spacing"` property of [the view composition configuration](https://vega.github.io/vega-lite/docs/config.html#view-config) (`20` by default)
      */
    var spacing: js.UndefOr[Double] = js.native
  }
  object RowColumnEncodingFieldDef {
    
    @scala.inline
    def apply[F /* <: Field */, ES /* <: ExprRef | SignalRef */](): RowColumnEncodingFieldDef[F, ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowColumnEncodingFieldDef[F, ES]]
    }
    
    @scala.inline
    implicit class RowColumnEncodingFieldDefMutableBuilder[Self <: RowColumnEncodingFieldDef[_, _], F /* <: Field */, ES /* <: ExprRef | SignalRef */] (val x: Self with (RowColumnEncodingFieldDef[F, ES])) extends AnyVal {
      
      @scala.inline
      def setAlign(value: LayoutAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
}
