package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An aggregation produced by the Discovery service to analyze the input provided. */
@js.native
trait QueryAggregation extends StObject {
  
  /** Aggregations returned by the Discovery service. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.native
  
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
  
  /** Array of aggregation results. */
  var results: js.UndefOr[js.Array[AggregationResult]] = js.native
  
  /** The type of aggregation command used. For example: term, filter, max, min, etc. */
  var `type`: js.UndefOr[String] = js.native
}
object QueryAggregation {
  
  @scala.inline
  def apply(): QueryAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryAggregation]
  }
  
  @scala.inline
  implicit class QueryAggregationMutableBuilder[Self <: QueryAggregation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregations(value: js.Array[QueryAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    @scala.inline
    def setAggregationsVarargs(value: QueryAggregation*): Self = StObject.set(x, "aggregations", js.Array(value :_*))
    
    @scala.inline
    def setMatching_results(value: Double): Self = StObject.set(x, "matching_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatching_resultsUndefined: Self = StObject.set(x, "matching_results", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[AggregationResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: AggregationResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
