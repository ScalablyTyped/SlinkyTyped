package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.aggregateMod.NonArgAggregateOp
import typingsSlinky.vegaLite.channeldefMod.FieldName
import typingsSlinky.vegaLite.datetimeMod.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortMod {
  
  @JSImport("vega-lite/build/src/sort", "DEFAULT_SORT_OP")
  @js.native
  val DEFAULT_SORT_OP: /* "min" */ String = js.native
  
  @JSImport("vega-lite/build/src/sort", "isSortArray")
  @js.native
  def isSortArray[F](sort: Sort[F]): /* is vega-lite.vega-lite/build/src/sort.SortArray */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/sort", "isSortByChannel")
  @js.native
  def isSortByChannel(c: String): /* is vega-lite.vega-lite/build/src/sort.SortByChannel */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/sort", "isSortByEncoding")
  @js.native
  def isSortByEncoding[F](sort: Sort[F]): /* is vega-lite.vega-lite/build/src/sort.SortByEncoding */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/sort", "isSortField")
  @js.native
  def isSortField[F](sort: Sort[F]): /* is vega-lite.vega-lite/build/src/sort.EncodingSortField<F> */ Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.sortMod.SortOrder
    - typingsSlinky.vegaLite.sortMod.SortByChannel
    - typingsSlinky.vegaLite.sortMod.SortByChannelDesc
  */
  trait AllSortString
    extends _Sort[js.Any]
  
  @js.native
  trait EncodingSortField[F] extends _Sort[F] {
    
    /**
      * The data [field](https://vega.github.io/vega-lite/docs/field.html) to sort by.
      *
      * __Default value:__ If unspecified, defaults to the field specified in the outer data reference.
      */
    var field: js.UndefOr[F] = js.native
    
    /**
      * An [aggregate operation](https://vega.github.io/vega-lite/docs/aggregate.html#ops) to perform on the field prior to sorting (e.g., `"count"`, `"mean"` and `"median"`).
      * An aggregation is required when there are multiple values of the sort field for each encoded data field.
      * The input data objects will be aggregated, grouped by the encoded data field.
      *
      * For a full list of operations, please see the documentation for [aggregate](https://vega.github.io/vega-lite/docs/aggregate.html#ops).
      *
      * __Default value:__ `"sum"` for stacked plots. Otherwise, `"min"`.
      */
    var op: js.UndefOr[NonArgAggregateOp] = js.native
    
    /**
      * The sort order. One of `"ascending"` (default), `"descending"`, or `null` (no not sort).
      */
    var order: js.UndefOr[SortOrder | Null] = js.native
  }
  object EncodingSortField {
    
    @scala.inline
    def apply[F](): EncodingSortField[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingSortField[F]]
    }
    
    @scala.inline
    implicit class EncodingSortFieldMutableBuilder[Self <: EncodingSortField[_], F] (val x: Self with EncodingSortField[F]) extends AnyVal {
      
      @scala.inline
      def setField(value: F): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setOp(value: NonArgAggregateOp): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      @scala.inline
      def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderNull: Self = StObject.set(x, "order", null)
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.sortMod.SortArray
    - typingsSlinky.vegaLite.sortMod.AllSortString
    - typingsSlinky.vegaLite.sortMod.EncodingSortField[F]
    - typingsSlinky.vegaLite.sortMod.SortByEncoding
    - scala.Null
  */
  type Sort[F] = _Sort[F] | SortArray | Null
  
  type SortArray = js.Array[Boolean | DateTime | Double | String]
  
  /* keyof vega-lite.anon.FillOpacity */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.x
    - typingsSlinky.vegaLite.vegaLiteStrings.y
    - typingsSlinky.vegaLite.vegaLiteStrings.color
    - typingsSlinky.vegaLite.vegaLiteStrings.fill
    - typingsSlinky.vegaLite.vegaLiteStrings.stroke
    - typingsSlinky.vegaLite.vegaLiteStrings.strokeWidth
    - typingsSlinky.vegaLite.vegaLiteStrings.size
    - typingsSlinky.vegaLite.vegaLiteStrings.shape
    - typingsSlinky.vegaLite.vegaLiteStrings.fillOpacity
    - typingsSlinky.vegaLite.vegaLiteStrings.strokeOpacity
    - typingsSlinky.vegaLite.vegaLiteStrings.opacity
    - typingsSlinky.vegaLite.vegaLiteStrings.text
  */
  trait SortByChannel extends AllSortString
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.`-x`
    - typingsSlinky.vegaLite.vegaLiteStrings.`-y`
    - typingsSlinky.vegaLite.vegaLiteStrings.`-color`
    - typingsSlinky.vegaLite.vegaLiteStrings.`-fill`
    - typingsSlinky.vegaLite.vegaLiteStrings.`-stroke`
    - typingsSlinky.vegaLite.vegaLiteStrings.`-strokeWidth`
    - typingsSlinky.vegaLite.vegaLiteStrings.`-size`
    - typingsSlinky.vegaLite.vegaLiteStrings.`-shape`
    - typingsSlinky.vegaLite.vegaLiteStrings.`-fillOpacity`
    - typingsSlinky.vegaLite.vegaLiteStrings.`-strokeOpacity`
    - typingsSlinky.vegaLite.vegaLiteStrings.`-opacity`
    - typingsSlinky.vegaLite.vegaLiteStrings.`-text`
  */
  trait SortByChannelDesc extends AllSortString
  object SortByChannelDesc {
    
    @scala.inline
    def `-color`: typingsSlinky.vegaLite.vegaLiteStrings.`-color` = "-color".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`-color`]
    
    @scala.inline
    def `-fill`: typingsSlinky.vegaLite.vegaLiteStrings.`-fill` = "-fill".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`-fill`]
    
    @scala.inline
    def `-fillOpacity`: typingsSlinky.vegaLite.vegaLiteStrings.`-fillOpacity` = "-fillOpacity".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`-fillOpacity`]
    
    @scala.inline
    def `-opacity`: typingsSlinky.vegaLite.vegaLiteStrings.`-opacity` = "-opacity".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`-opacity`]
    
    @scala.inline
    def `-shape`: typingsSlinky.vegaLite.vegaLiteStrings.`-shape` = "-shape".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`-shape`]
    
    @scala.inline
    def `-size`: typingsSlinky.vegaLite.vegaLiteStrings.`-size` = "-size".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`-size`]
    
    @scala.inline
    def `-stroke`: typingsSlinky.vegaLite.vegaLiteStrings.`-stroke` = "-stroke".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`-stroke`]
    
    @scala.inline
    def `-strokeOpacity`: typingsSlinky.vegaLite.vegaLiteStrings.`-strokeOpacity` = "-strokeOpacity".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`-strokeOpacity`]
    
    @scala.inline
    def `-strokeWidth`: typingsSlinky.vegaLite.vegaLiteStrings.`-strokeWidth` = "-strokeWidth".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`-strokeWidth`]
    
    @scala.inline
    def `-text`: typingsSlinky.vegaLite.vegaLiteStrings.`-text` = "-text".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`-text`]
    
    @scala.inline
    def `-x`: typingsSlinky.vegaLite.vegaLiteStrings.`-x` = "-x".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`-x`]
    
    @scala.inline
    def `-y`: typingsSlinky.vegaLite.vegaLiteStrings.`-y` = "-y".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`-y`]
  }
  
  @js.native
  trait SortByEncoding
    extends _Sort[js.Any] {
    
    /**
      * The [encoding channel](https://vega.github.io/vega-lite/docs/encoding.html#channels) to sort by (e.g., `"x"`, `"y"`)
      */
    var encoding: SortByChannel = js.native
    
    /**
      * The sort order. One of `"ascending"` (default), `"descending"`, or `null` (no not sort).
      */
    var order: js.UndefOr[SortOrder | Null] = js.native
  }
  object SortByEncoding {
    
    @scala.inline
    def apply(encoding: SortByChannel): SortByEncoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortByEncoding]
    }
    
    @scala.inline
    implicit class SortByEncodingMutableBuilder[Self <: SortByEncoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: SortByChannel): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderNull: Self = StObject.set(x, "order", null)
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  @js.native
  trait SortField extends StObject {
    
    /**
      * The name of the field to sort.
      */
    var field: FieldName = js.native
    
    /**
      * Whether to sort the field in ascending or descending order. One of `"ascending"` (default), `"descending"`, or `null` (no not sort).
      */
    var order: js.UndefOr[SortOrder | Null] = js.native
  }
  object SortField {
    
    @scala.inline
    def apply(field: FieldName): SortField = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortField]
    }
    
    @scala.inline
    implicit class SortFieldMutableBuilder[Self <: SortField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderNull: Self = StObject.set(x, "order", null)
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
  }
  
  @js.native
  trait SortFields extends StObject {
    
    var field: js.Array[FieldName] = js.native
    
    var order: js.UndefOr[js.Array[SortOrder]] = js.native
  }
  object SortFields {
    
    @scala.inline
    def apply(field: js.Array[FieldName]): SortFields = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortFields]
    }
    
    @scala.inline
    implicit class SortFieldsMutableBuilder[Self <: SortFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: js.Array[FieldName]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldVarargs(value: FieldName*): Self = StObject.set(x, "field", js.Array(value :_*))
      
      @scala.inline
      def setOrder(value: js.Array[SortOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: SortOrder*): Self = StObject.set(x, "order", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.ascending
    - typingsSlinky.vegaLite.vegaLiteStrings.descending
  */
  trait SortOrder extends AllSortString
  object SortOrder {
    
    @scala.inline
    def ascending: typingsSlinky.vegaLite.vegaLiteStrings.ascending = "ascending".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.ascending]
    
    @scala.inline
    def descending: typingsSlinky.vegaLite.vegaLiteStrings.descending = "descending".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.descending]
  }
  
  trait _Sort[F] extends StObject
}
