package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.transformMod.AggregatedFieldDef
import typingsSlinky.vegaLite.transformMod.BinTransform
import typingsSlinky.vegaLite.transformMod.TimeUnitTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bins extends StObject {
  
  var aggregate: js.Array[AggregatedFieldDef] = js.native
  
  var bins: js.Array[BinTransform] = js.native
  
  var encoding: typingsSlinky.vegaLite.encodingMod.Encoding[String] = js.native
  
  var groupby: js.Array[String] = js.native
  
  var timeUnits: js.Array[TimeUnitTransform] = js.native
}
object Bins {
  
  @scala.inline
  def apply(
    aggregate: js.Array[AggregatedFieldDef],
    bins: js.Array[BinTransform],
    encoding: typingsSlinky.vegaLite.encodingMod.Encoding[String],
    groupby: js.Array[String],
    timeUnits: js.Array[TimeUnitTransform]
  ): Bins = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any], bins = bins.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], timeUnits = timeUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bins]
  }
  
  @scala.inline
  implicit class BinsMutableBuilder[Self <: Bins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: js.Array[AggregatedFieldDef]): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateVarargs(value: AggregatedFieldDef*): Self = StObject.set(x, "aggregate", js.Array(value :_*))
    
    @scala.inline
    def setBins(value: js.Array[BinTransform]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinsVarargs(value: BinTransform*): Self = StObject.set(x, "bins", js.Array(value :_*))
    
    @scala.inline
    def setEncoding(value: typingsSlinky.vegaLite.encodingMod.Encoding[String]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupby(value: js.Array[String]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyVarargs(value: String*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setTimeUnits(value: js.Array[TimeUnitTransform]): Self = StObject.set(x, "timeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUnitsVarargs(value: TimeUnitTransform*): Self = StObject.set(x, "timeUnits", js.Array(value :_*))
  }
}
