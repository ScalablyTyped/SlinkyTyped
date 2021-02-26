package typingsSlinky.vegaLite

import typingsSlinky.vegaTypings.transformMod.AggregateOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aggregateMod {
  
  @JSImport("vega-lite/build/src/aggregate", "AGGREGATE_OPS")
  @js.native
  val AGGREGATE_OPS: js.Array[AggregateOp] = js.native
  
  @JSImport("vega-lite/build/src/aggregate", "COUNTING_OPS")
  @js.native
  val COUNTING_OPS: js.Array[NonArgAggregateOp] = js.native
  
  object MULTIDOMAIN_SORT_OP_INDEX {
    
    @JSImport("vega-lite/build/src/aggregate", "MULTIDOMAIN_SORT_OP_INDEX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/aggregate", "MULTIDOMAIN_SORT_OP_INDEX.count")
    @js.native
    def count: Double = js.native
    @scala.inline
    def count_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/aggregate", "MULTIDOMAIN_SORT_OP_INDEX.max")
    @js.native
    def max: Double = js.native
    @scala.inline
    def max_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("max")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/aggregate", "MULTIDOMAIN_SORT_OP_INDEX.min")
    @js.native
    def min: Double = js.native
    @scala.inline
    def min_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("min")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vega-lite/build/src/aggregate", "SHARED_DOMAIN_OPS")
  @js.native
  val SHARED_DOMAIN_OPS: js.Array[AggregateOp] = js.native
  
  @JSImport("vega-lite/build/src/aggregate", "SUM_OPS")
  @js.native
  val SUM_OPS: js.Array[NonArgAggregateOp] = js.native
  
  @JSImport("vega-lite/build/src/aggregate", "isAggregateOp")
  @js.native
  def isAggregateOp(a: String): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = js.native
  @JSImport("vega-lite/build/src/aggregate", "isAggregateOp")
  @js.native
  def isAggregateOp(a: ArgmaxDef): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = js.native
  @JSImport("vega-lite/build/src/aggregate", "isAggregateOp")
  @js.native
  def isAggregateOp(a: ArgminDef): /* is vega-typings.vega-typings/types/spec/transform.AggregateOp */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/aggregate", "isArgmaxDef")
  @js.native
  def isArgmaxDef(a: String): /* is vega-lite.vega-lite/build/src/aggregate.ArgmaxDef */ Boolean = js.native
  @JSImport("vega-lite/build/src/aggregate", "isArgmaxDef")
  @js.native
  def isArgmaxDef(a: Aggregate): /* is vega-lite.vega-lite/build/src/aggregate.ArgmaxDef */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/aggregate", "isArgminDef")
  @js.native
  def isArgminDef(a: String): /* is vega-lite.vega-lite/build/src/aggregate.ArgminDef */ Boolean = js.native
  @JSImport("vega-lite/build/src/aggregate", "isArgminDef")
  @js.native
  def isArgminDef(a: Aggregate): /* is vega-lite.vega-lite/build/src/aggregate.ArgminDef */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/aggregate", "isCountingAggregateOp")
  @js.native
  def isCountingAggregateOp(): Boolean = js.native
  @JSImport("vega-lite/build/src/aggregate", "isCountingAggregateOp")
  @js.native
  def isCountingAggregateOp(aggregate: String): Boolean = js.native
  @JSImport("vega-lite/build/src/aggregate", "isCountingAggregateOp")
  @js.native
  def isCountingAggregateOp(aggregate: Aggregate): Boolean = js.native
  
  @JSImport("vega-lite/build/src/aggregate", "isMinMaxOp")
  @js.native
  def isMinMaxOp(): Boolean = js.native
  @JSImport("vega-lite/build/src/aggregate", "isMinMaxOp")
  @js.native
  def isMinMaxOp(aggregate: String): Boolean = js.native
  @JSImport("vega-lite/build/src/aggregate", "isMinMaxOp")
  @js.native
  def isMinMaxOp(aggregate: Aggregate): Boolean = js.native
  
  /* Inlined vega-lite.vega-lite/build/src/aggregate.NonArgAggregateOp | vega-lite.vega-lite/build/src/aggregate.ArgmaxDef | vega-lite.vega-lite/build/src/aggregate.ArgminDef */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.max
    - typingsSlinky.vegaLite.vegaLiteStrings.q1
    - typingsSlinky.vegaLite.vegaLiteStrings.median
    - typingsSlinky.vegaLite.vegaLiteStrings.q3
    - typingsSlinky.vegaLite.vegaLiteStrings.argmax
    - typingsSlinky.vegaLite.vegaLiteStrings.mean
    - typingsSlinky.vegaLite.vegaLiteStrings.sum
    - typingsSlinky.vegaLite.vegaLiteStrings.variance
    - typingsSlinky.vegaLite.vegaLiteStrings.stdev
    - typingsSlinky.vegaLite.vegaLiteStrings.argmin
    - typingsSlinky.vegaLite.vegaLiteStrings.min
    - typingsSlinky.vegaLite.vegaLiteStrings.valid
    - typingsSlinky.vegaLite.vegaLiteStrings.missing
    - typingsSlinky.vegaLite.vegaLiteStrings.stdevp
    - typingsSlinky.vegaLite.vegaLiteStrings.distinct
    - typingsSlinky.vegaLite.vegaLiteStrings.ci0
    - typingsSlinky.vegaLite.vegaLiteStrings.product
    - typingsSlinky.vegaLite.vegaLiteStrings.stderr
    - typingsSlinky.vegaLite.vegaLiteStrings.count
    - typingsSlinky.vegaLite.vegaLiteStrings.ci1
    - typingsSlinky.vegaLite.vegaLiteStrings.average
    - typingsSlinky.vegaLite.vegaLiteStrings.values
    - typingsSlinky.vegaLite.vegaLiteStrings.variancep
  */
  trait Aggregate extends StObject
  object Aggregate {
    
    @scala.inline
    def argmax: typingsSlinky.vegaLite.vegaLiteStrings.argmax = "argmax".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.argmax]
    
    @scala.inline
    def argmin: typingsSlinky.vegaLite.vegaLiteStrings.argmin = "argmin".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.argmin]
    
    @scala.inline
    def average: typingsSlinky.vegaLite.vegaLiteStrings.average = "average".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.average]
    
    @scala.inline
    def ci0: typingsSlinky.vegaLite.vegaLiteStrings.ci0 = "ci0".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.ci0]
    
    @scala.inline
    def ci1: typingsSlinky.vegaLite.vegaLiteStrings.ci1 = "ci1".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.ci1]
    
    @scala.inline
    def count: typingsSlinky.vegaLite.vegaLiteStrings.count = "count".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.count]
    
    @scala.inline
    def distinct: typingsSlinky.vegaLite.vegaLiteStrings.distinct = "distinct".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.distinct]
    
    @scala.inline
    def max: typingsSlinky.vegaLite.vegaLiteStrings.max = "max".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.max]
    
    @scala.inline
    def mean: typingsSlinky.vegaLite.vegaLiteStrings.mean = "mean".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.mean]
    
    @scala.inline
    def median: typingsSlinky.vegaLite.vegaLiteStrings.median = "median".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.median]
    
    @scala.inline
    def min: typingsSlinky.vegaLite.vegaLiteStrings.min = "min".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.min]
    
    @scala.inline
    def missing: typingsSlinky.vegaLite.vegaLiteStrings.missing = "missing".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.missing]
    
    @scala.inline
    def product: typingsSlinky.vegaLite.vegaLiteStrings.product = "product".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.product]
    
    @scala.inline
    def q1: typingsSlinky.vegaLite.vegaLiteStrings.q1 = "q1".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.q1]
    
    @scala.inline
    def q3: typingsSlinky.vegaLite.vegaLiteStrings.q3 = "q3".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.q3]
    
    @scala.inline
    def stderr: typingsSlinky.vegaLite.vegaLiteStrings.stderr = "stderr".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.stderr]
    
    @scala.inline
    def stdev: typingsSlinky.vegaLite.vegaLiteStrings.stdev = "stdev".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.stdev]
    
    @scala.inline
    def stdevp: typingsSlinky.vegaLite.vegaLiteStrings.stdevp = "stdevp".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.stdevp]
    
    @scala.inline
    def sum: typingsSlinky.vegaLite.vegaLiteStrings.sum = "sum".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.sum]
    
    @scala.inline
    def valid: typingsSlinky.vegaLite.vegaLiteStrings.valid = "valid".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.valid]
    
    @scala.inline
    def values: typingsSlinky.vegaLite.vegaLiteStrings.values = "values".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.values]
    
    @scala.inline
    def variance: typingsSlinky.vegaLite.vegaLiteStrings.variance = "variance".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.variance]
    
    @scala.inline
    def variancep: typingsSlinky.vegaLite.vegaLiteStrings.variancep = "variancep".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.variancep]
  }
  
  @js.native
  trait ArgmaxDef extends StObject {
    
    var argmax: String = js.native
  }
  object ArgmaxDef {
    
    @scala.inline
    def apply(argmax: String): ArgmaxDef = {
      val __obj = js.Dynamic.literal(argmax = argmax.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgmaxDef]
    }
    
    @scala.inline
    implicit class ArgmaxDefMutableBuilder[Self <: ArgmaxDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgmax(value: String): Self = StObject.set(x, "argmax", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ArgminDef extends StObject {
    
    var argmin: String = js.native
  }
  object ArgminDef {
    
    @scala.inline
    def apply(argmin: String): ArgminDef = {
      val __obj = js.Dynamic.literal(argmin = argmin.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgminDef]
    }
    
    @scala.inline
    implicit class ArgminDefMutableBuilder[Self <: ArgminDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgmin(value: String): Self = StObject.set(x, "argmin", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Exclude<vega.vega.AggregateOp, 'argmin' | 'argmax'> */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.max
    - typingsSlinky.vegaLite.vegaLiteStrings.q1
    - typingsSlinky.vegaLite.vegaLiteStrings.median
    - typingsSlinky.vegaLite.vegaLiteStrings.q3
    - typingsSlinky.vegaLite.vegaLiteStrings.mean
    - typingsSlinky.vegaLite.vegaLiteStrings.sum
    - typingsSlinky.vegaLite.vegaLiteStrings.variance
    - typingsSlinky.vegaLite.vegaLiteStrings.stdev
    - typingsSlinky.vegaLite.vegaLiteStrings.min
    - typingsSlinky.vegaLite.vegaLiteStrings.valid
    - typingsSlinky.vegaLite.vegaLiteStrings.missing
    - typingsSlinky.vegaLite.vegaLiteStrings.stdevp
    - typingsSlinky.vegaLite.vegaLiteStrings.distinct
    - typingsSlinky.vegaLite.vegaLiteStrings.ci0
    - typingsSlinky.vegaLite.vegaLiteStrings.product
    - typingsSlinky.vegaLite.vegaLiteStrings.stderr
    - typingsSlinky.vegaLite.vegaLiteStrings.count
    - typingsSlinky.vegaLite.vegaLiteStrings.ci1
    - typingsSlinky.vegaLite.vegaLiteStrings.average
    - typingsSlinky.vegaLite.vegaLiteStrings.values
    - typingsSlinky.vegaLite.vegaLiteStrings.variancep
  */
  trait NonArgAggregateOp extends StObject
  object NonArgAggregateOp {
    
    @scala.inline
    def average: typingsSlinky.vegaLite.vegaLiteStrings.average = "average".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.average]
    
    @scala.inline
    def ci0: typingsSlinky.vegaLite.vegaLiteStrings.ci0 = "ci0".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.ci0]
    
    @scala.inline
    def ci1: typingsSlinky.vegaLite.vegaLiteStrings.ci1 = "ci1".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.ci1]
    
    @scala.inline
    def count: typingsSlinky.vegaLite.vegaLiteStrings.count = "count".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.count]
    
    @scala.inline
    def distinct: typingsSlinky.vegaLite.vegaLiteStrings.distinct = "distinct".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.distinct]
    
    @scala.inline
    def max: typingsSlinky.vegaLite.vegaLiteStrings.max = "max".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.max]
    
    @scala.inline
    def mean: typingsSlinky.vegaLite.vegaLiteStrings.mean = "mean".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.mean]
    
    @scala.inline
    def median: typingsSlinky.vegaLite.vegaLiteStrings.median = "median".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.median]
    
    @scala.inline
    def min: typingsSlinky.vegaLite.vegaLiteStrings.min = "min".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.min]
    
    @scala.inline
    def missing: typingsSlinky.vegaLite.vegaLiteStrings.missing = "missing".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.missing]
    
    @scala.inline
    def product: typingsSlinky.vegaLite.vegaLiteStrings.product = "product".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.product]
    
    @scala.inline
    def q1: typingsSlinky.vegaLite.vegaLiteStrings.q1 = "q1".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.q1]
    
    @scala.inline
    def q3: typingsSlinky.vegaLite.vegaLiteStrings.q3 = "q3".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.q3]
    
    @scala.inline
    def stderr: typingsSlinky.vegaLite.vegaLiteStrings.stderr = "stderr".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.stderr]
    
    @scala.inline
    def stdev: typingsSlinky.vegaLite.vegaLiteStrings.stdev = "stdev".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.stdev]
    
    @scala.inline
    def stdevp: typingsSlinky.vegaLite.vegaLiteStrings.stdevp = "stdevp".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.stdevp]
    
    @scala.inline
    def sum: typingsSlinky.vegaLite.vegaLiteStrings.sum = "sum".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.sum]
    
    @scala.inline
    def valid: typingsSlinky.vegaLite.vegaLiteStrings.valid = "valid".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.valid]
    
    @scala.inline
    def values: typingsSlinky.vegaLite.vegaLiteStrings.values = "values".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.values]
    
    @scala.inline
    def variance: typingsSlinky.vegaLite.vegaLiteStrings.variance = "variance".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.variance]
    
    @scala.inline
    def variancep: typingsSlinky.vegaLite.vegaLiteStrings.variancep = "variancep".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.variancep]
  }
}
