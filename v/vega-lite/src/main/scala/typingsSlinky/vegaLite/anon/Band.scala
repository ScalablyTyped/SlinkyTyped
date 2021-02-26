package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.aggregateMod.ArgmaxDef
import typingsSlinky.vegaLite.aggregateMod.ArgminDef
import typingsSlinky.vegaLite.vegaLiteStrings.average
import typingsSlinky.vegaLite.vegaLiteStrings.boxplot
import typingsSlinky.vegaLite.vegaLiteStrings.ci0
import typingsSlinky.vegaLite.vegaLiteStrings.ci1
import typingsSlinky.vegaLite.vegaLiteStrings.count
import typingsSlinky.vegaLite.vegaLiteStrings.distinct
import typingsSlinky.vegaLite.vegaLiteStrings.errorband
import typingsSlinky.vegaLite.vegaLiteStrings.errorbar
import typingsSlinky.vegaLite.vegaLiteStrings.max
import typingsSlinky.vegaLite.vegaLiteStrings.mean
import typingsSlinky.vegaLite.vegaLiteStrings.median
import typingsSlinky.vegaLite.vegaLiteStrings.min
import typingsSlinky.vegaLite.vegaLiteStrings.missing
import typingsSlinky.vegaLite.vegaLiteStrings.product
import typingsSlinky.vegaLite.vegaLiteStrings.q1
import typingsSlinky.vegaLite.vegaLiteStrings.q3
import typingsSlinky.vegaLite.vegaLiteStrings.stderr
import typingsSlinky.vegaLite.vegaLiteStrings.stdev
import typingsSlinky.vegaLite.vegaLiteStrings.stdevp
import typingsSlinky.vegaLite.vegaLiteStrings.sum
import typingsSlinky.vegaLite.vegaLiteStrings.valid
import typingsSlinky.vegaLite.vegaLiteStrings.values
import typingsSlinky.vegaLite.vegaLiteStrings.variance
import typingsSlinky.vegaLite.vegaLiteStrings.variancep
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Band extends StObject {
  
  /**
    * Aggregation function for the field
    * (e.g., `"mean"`, `"sum"`, `"median"`, `"min"`, `"max"`, `"count"`).
    *
    * __Default value:__ `undefined` (None)
    *
    * __See also:__ [`aggregate`](https://vega.github.io/vega-lite/docs/aggregate.html) documentation.
    */
  var aggregate: js.UndefOr[
    max | values | count | min | average | distinct | mean | median | missing | product | q1 | q3 | ci0 | ci1 | stderr | stdev | stdevp | sum | valid | variance | variancep | ArgminDef | ArgmaxDef | boxplot | errorbar | errorband
  ] = js.native
  
  /**
    * For rect-based marks (`rect`, `bar`, and `image`), mark size relative to bandwidth of [band scales](https://vega.github.io/vega-lite/docs/scale.html#band), bins or time units. If set to `1`, the mark size is set to the bandwidth, the bin interval, or the time unit interval. If set to `0.5`, the mark size is half of the bandwidth or the time unit interval.
    *
    * For other marks, relative position on a band of a stacked, binned, time unit or band scale. If set to `0`, the marks will be positioned at the beginning of the band. If set to `0.5`, the marks will be positioned in the middle of the band.
    *
    * @minimum 0
    * @maximum 1
    */
  var band: js.UndefOr[Double] = js.native
  
  /**
    * A flag for binning a `quantitative` field, [an object defining binning parameters](https://vega.github.io/vega-lite/docs/bin.html#params), or indicating that the data for `x` or `y` channel are binned before they are imported into Vega-Lite (`"binned"`).
    *
    * - If `true`, default [binning parameters](https://vega.github.io/vega-lite/docs/bin.html) will be applied.
    *
    * - If `"binned"`, this indicates that the data for the `x` (or `y`) channel are already binned. You can map the bin-start field to `x` (or `y`) and the bin-end field to `x2` (or `y2`). The scale and axis will be formatted similar to binning in Vega-Lite.  To adjust the axis ticks based on the bin step, you can also set the axis's [`tickMinStep`](https://vega.github.io/vega-lite/docs/axis.html#ticks) property.
    *
    * __Default value:__ `false`
    *
    * __See also:__ [`bin`](https://vega.github.io/vega-lite/docs/bin.html) documentation.
    */
  var bin: js.UndefOr[Null] = js.native
  
  /**
    * __Required.__ A string defining the name of the field from which to pull a data value
    * or an object defining iterated values from the [`repeat`](https://vega.github.io/vega-lite/docs/repeat.html) operator.
    *
    * __See also:__ [`field`](https://vega.github.io/vega-lite/docs/field.html) documentation.
    *
    * __Notes:__
    * 1)  Dots (`.`) and brackets (`[` and `]`) can be used to access nested objects (e.g., `"field": "foo.bar"` and `"field": "foo['bar']"`).
    * If field names contain dots or brackets but are not nested, you can use `\\` to escape dots and brackets (e.g., `"a\\.b"` and `"a\\[0\\]"`).
    * See more details about escaping in the [field documentation](https://vega.github.io/vega-lite/docs/field.html).
    * 2) `field` is not required if `aggregate` is `count`.
    */
  var field: js.UndefOr[String] = js.native
  
  /**
    * Time unit (e.g., `year`, `yearmonth`, `month`, `hours`) for a temporal field.
    * or [a temporal field that gets casted as ordinal](https://vega.github.io/vega-lite/docs/type.html#cast).
    *
    * __Default value:__ `undefined` (None)
    *
    * __See also:__ [`timeUnit`](https://vega.github.io/vega-lite/docs/timeunit.html) documentation.
    */
  var timeUnit: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any
  ] = js.native
  
  var title: js.UndefOr[String | js.Array[String] | SignalRef] = js.native
}
object Band {
  
  @scala.inline
  def apply(): Band = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Band]
  }
  
  @scala.inline
  implicit class BandMutableBuilder[Self <: Band] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(
      value: max | values | count | min | average | distinct | mean | median | missing | product | q1 | q3 | ci0 | ci1 | stderr | stdev | stdevp | sum | valid | variance | variancep | ArgminDef | ArgmaxDef | boxplot | errorbar | errorband
    ): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setBand(value: Double): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setTimeUnit(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 82 */ js.Any): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
    
    @scala.inline
    def setTitle(value: String | js.Array[String] | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
  }
}
