package typingsSlinky.vegaLite.transformMod

import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channeldefMod.FieldName
import typingsSlinky.vegaLite.logicalMod.LogicalComposition
import typingsSlinky.vegaLite.srcPredicateMod.Predicate
import typingsSlinky.vegaLite.srcTimeunitMod.TimeUnit
import typingsSlinky.vegaLite.srcTimeunitMod.TimeUnitParams
import typingsSlinky.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaLite.transformMod.AggregateTransform
  - typingsSlinky.vegaLite.transformMod.BinTransform
  - typingsSlinky.vegaLite.transformMod.CalculateTransform
  - typingsSlinky.vegaLite.transformMod.DensityTransform
  - typingsSlinky.vegaLite.transformMod.FilterTransform
  - typingsSlinky.vegaLite.transformMod.FlattenTransform
  - typingsSlinky.vegaLite.transformMod.FoldTransform
  - typingsSlinky.vegaLite.transformMod.ImputeTransform
  - typingsSlinky.vegaLite.transformMod.JoinAggregateTransform
  - typingsSlinky.vegaLite.transformMod.LoessTransform
  - typingsSlinky.vegaLite.transformMod.LookupTransform
  - typingsSlinky.vegaLite.transformMod.QuantileTransform
  - typingsSlinky.vegaLite.transformMod.RegressionTransform
  - typingsSlinky.vegaLite.transformMod.TimeUnitTransform
  - typingsSlinky.vegaLite.transformMod.SampleTransform
  - typingsSlinky.vegaLite.transformMod.StackTransform
  - typingsSlinky.vegaLite.transformMod.WindowTransform
  - typingsSlinky.vegaLite.transformMod.PivotTransform
*/
trait Transform extends StObject
object Transform {
  
  @scala.inline
  def AggregateTransform(aggregate: js.Array[AggregatedFieldDef]): typingsSlinky.vegaLite.transformMod.AggregateTransform = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.AggregateTransform]
  }
  
  @scala.inline
  def BinTransform(as: FieldName | js.Array[FieldName], bin: `true` | BinParams, field: FieldName): typingsSlinky.vegaLite.transformMod.BinTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.BinTransform]
  }
  
  @scala.inline
  def CalculateTransform(as: FieldName, calculate: String): typingsSlinky.vegaLite.transformMod.CalculateTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], calculate = calculate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.CalculateTransform]
  }
  
  @scala.inline
  def DensityTransform(density: FieldName): typingsSlinky.vegaLite.transformMod.DensityTransform = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.DensityTransform]
  }
  
  @scala.inline
  def FilterTransform(filter: LogicalComposition[Predicate]): typingsSlinky.vegaLite.transformMod.FilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.FilterTransform]
  }
  
  @scala.inline
  def FlattenTransform(flatten: js.Array[FieldName]): typingsSlinky.vegaLite.transformMod.FlattenTransform = {
    val __obj = js.Dynamic.literal(flatten = flatten.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.FlattenTransform]
  }
  
  @scala.inline
  def FoldTransform(fold: js.Array[FieldName]): typingsSlinky.vegaLite.transformMod.FoldTransform = {
    val __obj = js.Dynamic.literal(fold = fold.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.FoldTransform]
  }
  
  @scala.inline
  def ImputeTransform(impute: FieldName, key: FieldName): typingsSlinky.vegaLite.transformMod.ImputeTransform = {
    val __obj = js.Dynamic.literal(impute = impute.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.ImputeTransform]
  }
  
  @scala.inline
  def JoinAggregateTransform(joinaggregate: js.Array[JoinAggregateFieldDef]): typingsSlinky.vegaLite.transformMod.JoinAggregateTransform = {
    val __obj = js.Dynamic.literal(joinaggregate = joinaggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.JoinAggregateTransform]
  }
  
  @scala.inline
  def LoessTransform(loess: FieldName, on: FieldName): typingsSlinky.vegaLite.transformMod.LoessTransform = {
    val __obj = js.Dynamic.literal(loess = loess.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.LoessTransform]
  }
  
  @scala.inline
  def LookupTransform(from: LookupData | LookupSelection, lookup: String): typingsSlinky.vegaLite.transformMod.LookupTransform = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.LookupTransform]
  }
  
  @scala.inline
  def PivotTransform(pivot: FieldName, value: FieldName): typingsSlinky.vegaLite.transformMod.PivotTransform = {
    val __obj = js.Dynamic.literal(pivot = pivot.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.PivotTransform]
  }
  
  @scala.inline
  def QuantileTransform(quantile: FieldName): typingsSlinky.vegaLite.transformMod.QuantileTransform = {
    val __obj = js.Dynamic.literal(quantile = quantile.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.QuantileTransform]
  }
  
  @scala.inline
  def RegressionTransform(on: FieldName, regression: FieldName): typingsSlinky.vegaLite.transformMod.RegressionTransform = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any], regression = regression.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.RegressionTransform]
  }
  
  @scala.inline
  def SampleTransform(sample: Double): typingsSlinky.vegaLite.transformMod.SampleTransform = {
    val __obj = js.Dynamic.literal(sample = sample.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.SampleTransform]
  }
  
  @scala.inline
  def StackTransform(as: FieldName | (js.Tuple2[FieldName, FieldName]), groupby: js.Array[FieldName], stack: FieldName): typingsSlinky.vegaLite.transformMod.StackTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.StackTransform]
  }
  
  @scala.inline
  def TimeUnitTransform(as: FieldName, field: FieldName, timeUnit: TimeUnit | TimeUnitParams): typingsSlinky.vegaLite.transformMod.TimeUnitTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.TimeUnitTransform]
  }
  
  @scala.inline
  def WindowTransform(window: js.Array[WindowFieldDef]): typingsSlinky.vegaLite.transformMod.WindowTransform = {
    val __obj = js.Dynamic.literal(window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.vegaLite.transformMod.WindowTransform]
  }
}
