package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Timeslice. */
@js.native
trait Timeslice extends StObject {
  
  /** Used to indicate that anomaly detection should be performed. Anomaly detection is used to locate unusual datapoints within a time series. */
  var anomaly: js.UndefOr[Boolean] = js.native
  
  /** The field where the aggregation is located in the document. */
  var field: js.UndefOr[String] = js.native
  
  /** Interval of the aggregation. Valid date interval values are second/seconds minute/minutes, hour/hours, day/days, week/weeks, month/months, and year/years. */
  var interval: js.UndefOr[String] = js.native
}
object Timeslice {
  
  @scala.inline
  def apply(): Timeslice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timeslice]
  }
  
  @scala.inline
  implicit class TimesliceMutableBuilder[Self <: Timeslice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnomaly(value: Boolean): Self = StObject.set(x, "anomaly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnomalyUndefined: Self = StObject.set(x, "anomaly", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
