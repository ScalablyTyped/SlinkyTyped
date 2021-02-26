package typingsSlinky.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelStats extends StObject {
  
  /** maximum value in the channel */
  var max: Double = js.native
  
  /** x-coordinate of one of the pixel where the maximum lies */
  var maxX: Double = js.native
  
  /** y-coordinate of one of the pixel where the maximum lies */
  var maxY: Double = js.native
  
  /** mean of the values in a channel */
  var mean: Double = js.native
  
  /** minimum value in the channel */
  var min: Double = js.native
  
  /** x-coordinate of one of the pixel where the minimum lies */
  var minX: Double = js.native
  
  /** y-coordinate of one of the pixel where the minimum lies */
  var minY: Double = js.native
  
  /** sum of squared values in a channel */
  var squaresSum: Double = js.native
  
  /** standard deviation for the values in a channel */
  var stdev: Double = js.native
  
  /** sum of all values in a channel */
  var sum: Double = js.native
}
object ChannelStats {
  
  @scala.inline
  def apply(
    max: Double,
    maxX: Double,
    maxY: Double,
    mean: Double,
    min: Double,
    minX: Double,
    minY: Double,
    squaresSum: Double,
    stdev: Double,
    sum: Double
  ): ChannelStats = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], squaresSum = squaresSum.asInstanceOf[js.Any], stdev = stdev.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelStats]
  }
  
  @scala.inline
  implicit class ChannelStatsMutableBuilder[Self <: ChannelStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSquaresSum(value: Double): Self = StObject.set(x, "squaresSum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdev(value: Double): Self = StObject.set(x, "stdev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
  }
}
