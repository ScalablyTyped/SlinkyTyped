package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.channeldefMod.FieldName
import typingsSlinky.vegaLite.datetimeMod.DateTime
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.logicalMod.LogicalComposition
import typingsSlinky.vegaLite.srcTimeunitMod.TimeUnit
import typingsSlinky.vegaLite.srcTimeunitMod.TimeUnitParams
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPredicateMod {
  
  @JSImport("vega-lite/build/src/predicate", "fieldFilterExpression")
  @js.native
  def fieldFilterExpression(predicate: FieldPredicate): String = js.native
  @JSImport("vega-lite/build/src/predicate", "fieldFilterExpression")
  @js.native
  def fieldFilterExpression(predicate: FieldPredicate, useInRange: Boolean): String = js.native
  
  @JSImport("vega-lite/build/src/predicate", "fieldValidPredicate")
  @js.native
  def fieldValidPredicate(fieldExpr: String): String = js.native
  @JSImport("vega-lite/build/src/predicate", "fieldValidPredicate")
  @js.native
  def fieldValidPredicate(fieldExpr: String, valid: Boolean): String = js.native
  
  @JSImport("vega-lite/build/src/predicate", "isFieldEqualPredicate")
  @js.native
  def isFieldEqualPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldEqualPredicate */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/predicate", "isFieldGTEPredicate")
  @js.native
  def isFieldGTEPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldGTEPredicate */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/predicate", "isFieldGTPredicate")
  @js.native
  def isFieldGTPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldGTPredicate */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/predicate", "isFieldLTEPredicate")
  @js.native
  def isFieldLTEPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldLTEPredicate */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/predicate", "isFieldLTPredicate")
  @js.native
  def isFieldLTPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldLTPredicate */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/predicate", "isFieldOneOfPredicate")
  @js.native
  def isFieldOneOfPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldOneOfPredicate */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/predicate", "isFieldPredicate")
  @js.native
  def isFieldPredicate(predicate: Predicate): Boolean = js.native
  
  @JSImport("vega-lite/build/src/predicate", "isFieldRangePredicate")
  @js.native
  def isFieldRangePredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldRangePredicate */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/predicate", "isFieldValidPredicate")
  @js.native
  def isFieldValidPredicate(predicate: js.Any): /* is vega-lite.vega-lite/build/src/predicate.FieldValidPredicate */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/predicate", "isSelectionPredicate")
  @js.native
  def isSelectionPredicate(predicate: LogicalComposition[Predicate]): /* is vega-lite.vega-lite/build/src/predicate.SelectionPredicate */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/predicate", "normalizePredicate")
  @js.native
  def normalizePredicate(f: Predicate): Predicate = js.native
  
  @js.native
  trait FieldEqualPredicate
    extends FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be equal to.
      */
    var equal: String | Double | Boolean | DateTime | ExprRef | SignalRef = js.native
  }
  object FieldEqualPredicate {
    
    @scala.inline
    def apply(equal: String | Double | Boolean | DateTime | ExprRef | SignalRef, field: FieldName): FieldEqualPredicate = {
      val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldEqualPredicate]
    }
    
    @scala.inline
    implicit class FieldEqualPredicateMutableBuilder[Self <: FieldEqualPredicate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEqual(value: String | Double | Boolean | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FieldGTEPredicate
    extends FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be greater than or equals to.
      */
    var gte: String | Double | DateTime | ExprRef | SignalRef = js.native
  }
  object FieldGTEPredicate {
    
    @scala.inline
    def apply(field: FieldName, gte: String | Double | DateTime | ExprRef | SignalRef): FieldGTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldGTEPredicate]
    }
    
    @scala.inline
    implicit class FieldGTEPredicateMutableBuilder[Self <: FieldGTEPredicate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGte(value: String | Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FieldGTPredicate
    extends FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be greater than.
      */
    var gt: String | Double | DateTime | ExprRef | SignalRef = js.native
  }
  object FieldGTPredicate {
    
    @scala.inline
    def apply(field: FieldName, gt: String | Double | DateTime | ExprRef | SignalRef): FieldGTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldGTPredicate]
    }
    
    @scala.inline
    implicit class FieldGTPredicateMutableBuilder[Self <: FieldGTPredicate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGt(value: String | Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FieldLTEPredicate
    extends FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be less than or equals to.
      */
    var lte: String | Double | DateTime | ExprRef | SignalRef = js.native
  }
  object FieldLTEPredicate {
    
    @scala.inline
    def apply(field: FieldName, lte: String | Double | DateTime | ExprRef | SignalRef): FieldLTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldLTEPredicate]
    }
    
    @scala.inline
    implicit class FieldLTEPredicateMutableBuilder[Self <: FieldLTEPredicate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLte(value: String | Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FieldLTPredicate
    extends FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * The value that the field should be less than.
      */
    var lt: String | Double | DateTime | ExprRef | SignalRef = js.native
  }
  object FieldLTPredicate {
    
    @scala.inline
    def apply(field: FieldName, lt: String | Double | DateTime | ExprRef | SignalRef): FieldLTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldLTPredicate]
    }
    
    @scala.inline
    implicit class FieldLTPredicateMutableBuilder[Self <: FieldLTPredicate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLt(value: String | Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FieldOneOfPredicate
    extends FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * A set of values that the `field`'s value should be a member of,
      * for a data item included in the filtered data.
      */
    var oneOf: js.Array[Boolean | DateTime | Double | String] = js.native
  }
  object FieldOneOfPredicate {
    
    @scala.inline
    def apply(field: FieldName, oneOf: js.Array[Boolean | DateTime | Double | String]): FieldOneOfPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldOneOfPredicate]
    }
    
    @scala.inline
    implicit class FieldOneOfPredicateMutableBuilder[Self <: FieldOneOfPredicate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOneOf(value: js.Array[Boolean | DateTime | Double | String]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneOfVarargs(value: (Boolean | DateTime | Double | String)*): Self = StObject.set(x, "oneOf", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.srcPredicateMod.FieldEqualPredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldLTPredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldGTPredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldLTEPredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldGTEPredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldRangePredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldOneOfPredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldValidPredicate_
  */
  trait FieldPredicate extends StObject
  object FieldPredicate {
    
    @scala.inline
    def FieldEqualPredicate(equal: String | Double | Boolean | DateTime | ExprRef | SignalRef, field: FieldName): typingsSlinky.vegaLite.srcPredicateMod.FieldEqualPredicate = {
      val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldEqualPredicate]
    }
    
    @scala.inline
    def FieldGTEPredicate(field: FieldName, gte: String | Double | DateTime | ExprRef | SignalRef): typingsSlinky.vegaLite.srcPredicateMod.FieldGTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldGTEPredicate]
    }
    
    @scala.inline
    def FieldGTPredicate(field: FieldName, gt: String | Double | DateTime | ExprRef | SignalRef): typingsSlinky.vegaLite.srcPredicateMod.FieldGTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldGTPredicate]
    }
    
    @scala.inline
    def FieldLTEPredicate(field: FieldName, lte: String | Double | DateTime | ExprRef | SignalRef): typingsSlinky.vegaLite.srcPredicateMod.FieldLTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldLTEPredicate]
    }
    
    @scala.inline
    def FieldLTPredicate(field: FieldName, lt: String | Double | DateTime | ExprRef | SignalRef): typingsSlinky.vegaLite.srcPredicateMod.FieldLTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldLTPredicate]
    }
    
    @scala.inline
    def FieldOneOfPredicate(field: FieldName, oneOf: js.Array[Boolean | DateTime | Double | String]): typingsSlinky.vegaLite.srcPredicateMod.FieldOneOfPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldOneOfPredicate]
    }
    
    @scala.inline
    def FieldRangePredicate(
      field: FieldName,
      range: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef
    ): typingsSlinky.vegaLite.srcPredicateMod.FieldRangePredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldRangePredicate]
    }
    
    @scala.inline
    def FieldValidPredicate_(field: FieldName, valid: Boolean): typingsSlinky.vegaLite.srcPredicateMod.FieldValidPredicate_ = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldValidPredicate_]
    }
  }
  
  @js.native
  trait FieldPredicateBase extends StObject {
    
    /**
      * Field to be tested.
      */
    var field: FieldName = js.native
    
    /**
      * Time unit for the field to be tested.
      */
    var timeUnit: js.UndefOr[TimeUnit | TimeUnitParams] = js.native
  }
  object FieldPredicateBase {
    
    @scala.inline
    def apply(field: FieldName): FieldPredicateBase = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldPredicateBase]
    }
    
    @scala.inline
    implicit class FieldPredicateBaseMutableBuilder[Self <: FieldPredicateBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUnit(value: TimeUnit | TimeUnitParams): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
    }
  }
  
  @js.native
  trait FieldRangePredicate
    extends FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * An array of inclusive minimum and maximum values
      * for a field value of a data item to be included in the filtered data.
      * @maxItems 2
      * @minItems 2
      */
    var range: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef = js.native
  }
  object FieldRangePredicate {
    
    @scala.inline
    def apply(
      field: FieldName,
      range: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef
    ): FieldRangePredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldRangePredicate]
    }
    
    @scala.inline
    implicit class FieldRangePredicateMutableBuilder[Self <: FieldRangePredicate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRange(value: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeVarargs(value: (Double | DateTime | Null | ExprRef | SignalRef)*): Self = StObject.set(x, "range", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FieldValidPredicate_
    extends FieldPredicateBase
       with FieldPredicate
       with _Predicate {
    
    /**
      * If set to true the field's value has to be valid, meaning both not `null` and not [`NaN`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/NaN).
      */
    var valid: Boolean = js.native
  }
  object FieldValidPredicate_ {
    
    @scala.inline
    def apply(field: FieldName, valid: Boolean): FieldValidPredicate_ = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldValidPredicate_]
    }
    
    @scala.inline
    implicit class FieldValidPredicate_MutableBuilder[Self <: FieldValidPredicate_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.srcPredicateMod.FieldEqualPredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldRangePredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldOneOfPredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldLTPredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldGTPredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldLTEPredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldGTEPredicate
    - typingsSlinky.vegaLite.srcPredicateMod.FieldValidPredicate_
    - typingsSlinky.vegaLite.srcPredicateMod.SelectionPredicate
    - java.lang.String
  */
  type Predicate = _Predicate | String
  
  @js.native
  trait SelectionPredicate extends _Predicate {
    
    /**
      * Filter using a selection name or a logical composition of selection names.
      */
    var selection: LogicalComposition[String] = js.native
  }
  object SelectionPredicate {
    
    @scala.inline
    def apply(selection: LogicalComposition[String]): SelectionPredicate = {
      val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionPredicate]
    }
    
    @scala.inline
    implicit class SelectionPredicateMutableBuilder[Self <: SelectionPredicate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelection(value: LogicalComposition[String]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Predicate extends StObject
  object _Predicate {
    
    @scala.inline
    def FieldEqualPredicate(equal: String | Double | Boolean | DateTime | ExprRef | SignalRef, field: FieldName): typingsSlinky.vegaLite.srcPredicateMod.FieldEqualPredicate = {
      val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldEqualPredicate]
    }
    
    @scala.inline
    def FieldGTEPredicate(field: FieldName, gte: String | Double | DateTime | ExprRef | SignalRef): typingsSlinky.vegaLite.srcPredicateMod.FieldGTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gte = gte.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldGTEPredicate]
    }
    
    @scala.inline
    def FieldGTPredicate(field: FieldName, gt: String | Double | DateTime | ExprRef | SignalRef): typingsSlinky.vegaLite.srcPredicateMod.FieldGTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], gt = gt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldGTPredicate]
    }
    
    @scala.inline
    def FieldLTEPredicate(field: FieldName, lte: String | Double | DateTime | ExprRef | SignalRef): typingsSlinky.vegaLite.srcPredicateMod.FieldLTEPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lte = lte.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldLTEPredicate]
    }
    
    @scala.inline
    def FieldLTPredicate(field: FieldName, lt: String | Double | DateTime | ExprRef | SignalRef): typingsSlinky.vegaLite.srcPredicateMod.FieldLTPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], lt = lt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldLTPredicate]
    }
    
    @scala.inline
    def FieldOneOfPredicate(field: FieldName, oneOf: js.Array[Boolean | DateTime | Double | String]): typingsSlinky.vegaLite.srcPredicateMod.FieldOneOfPredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldOneOfPredicate]
    }
    
    @scala.inline
    def FieldRangePredicate(
      field: FieldName,
      range: (js.Array[Double | DateTime | Null | ExprRef | SignalRef]) | ExprRef | SignalRef
    ): typingsSlinky.vegaLite.srcPredicateMod.FieldRangePredicate = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldRangePredicate]
    }
    
    @scala.inline
    def FieldValidPredicate_(field: FieldName, valid: Boolean): typingsSlinky.vegaLite.srcPredicateMod.FieldValidPredicate_ = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.FieldValidPredicate_]
    }
    
    @scala.inline
    def SelectionPredicate(selection: LogicalComposition[String]): typingsSlinky.vegaLite.srcPredicateMod.SelectionPredicate = {
      val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vegaLite.srcPredicateMod.SelectionPredicate]
    }
  }
}
