package typingsSlinky.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduceUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/reduce_util", "PARALLELIZE_THRESHOLD")
  @js.native
  val PARALLELIZE_THRESHOLD: /* 30 */ Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/reduce_util", "computeOptimalWindowSize")
  @js.native
  def computeOptimalWindowSize(inSize: Double): Double = js.native
  
  @js.native
  trait ReduceInfo extends StObject {
    
    var batchSize: Double = js.native
    
    var inSize: Double = js.native
    
    var outSize: Double = js.native
    
    var windowSize: Double = js.native
  }
  object ReduceInfo {
    
    @scala.inline
    def apply(batchSize: Double, inSize: Double, outSize: Double, windowSize: Double): ReduceInfo = {
      val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], inSize = inSize.asInstanceOf[js.Any], outSize = outSize.asInstanceOf[js.Any], windowSize = windowSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReduceInfo]
    }
    
    @scala.inline
    implicit class ReduceInfoMutableBuilder[Self <: ReduceInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInSize(value: Double): Self = StObject.set(x, "inSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutSize(value: Double): Self = StObject.set(x, "outSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    }
  }
}
