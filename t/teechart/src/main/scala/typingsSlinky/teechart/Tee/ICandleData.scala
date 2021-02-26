package typingsSlinky.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICandleData extends ISeriesData {
  
  var close: js.Array[Double] = js.native
  
  var high: js.Array[Double] = js.native
  
  var low: js.Array[Double] = js.native
  
  var open: js.Array[Double] = js.native
}
object ICandleData {
  
  @scala.inline
  def apply(
    close: js.Array[Double],
    high: js.Array[Double],
    labels: js.Array[String],
    low: js.Array[Double],
    open: js.Array[Double],
    source: js.Any,
    values: js.Array[Double]
  ): ICandleData = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICandleData]
  }
  
  @scala.inline
  implicit class ICandleDataMutableBuilder[Self <: ICandleData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: js.Array[Double]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseVarargs(value: Double*): Self = StObject.set(x, "close", js.Array(value :_*))
    
    @scala.inline
    def setHigh(value: js.Array[Double]): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighVarargs(value: Double*): Self = StObject.set(x, "high", js.Array(value :_*))
    
    @scala.inline
    def setLow(value: js.Array[Double]): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowVarargs(value: Double*): Self = StObject.set(x, "low", js.Array(value :_*))
    
    @scala.inline
    def setOpen(value: js.Array[Double]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenVarargs(value: Double*): Self = StObject.set(x, "open", js.Array(value :_*))
  }
}
