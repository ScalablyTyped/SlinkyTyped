package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.temporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kerasFormatCommonMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_BIDIRECTIONAL_MERGE_MODES")
  @js.native
  val VALID_BIDIRECTIONAL_MERGE_MODES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_DATA_FORMAT_VALUES")
  @js.native
  val VALID_DATA_FORMAT_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_PADDING_MODE_VALUES")
  @js.native
  val VALID_PADDING_MODE_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_POOL_MODE_VALUES")
  @js.native
  val VALID_POOL_MODE_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/common", "VALID_SAMPLE_WEIGHT_MODES")
  @js.native
  val VALID_SAMPLE_WEIGHT_MODES: js.Array[String] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sum
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mul
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.concat
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ave
  */
  trait BidirectionalMergeMode extends StObject
  object BidirectionalMergeMode {
    
    @scala.inline
    def ave: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ave = "ave".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ave]
    
    @scala.inline
    def concat: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.concat = "concat".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.concat]
    
    @scala.inline
    def mul: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mul = "mul".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.mul]
    
    @scala.inline
    def sum: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sum = "sum".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sum]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsFirst
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsLast
  */
  trait DataFormat extends StObject
  object DataFormat {
    
    @scala.inline
    def channelsFirst: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsFirst = "channelsFirst".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsFirst]
    
    @scala.inline
    def channelsLast: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsLast = "channelsLast".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channelsLast]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_first
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_last
  */
  trait DataFormatSerialization extends StObject
  object DataFormatSerialization {
    
    @scala.inline
    def channels_first: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_first = "channels_first".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_first]
    
    @scala.inline
    def channels_last: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_last = "channels_last".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.channels_last]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string
  */
  trait DataType extends StObject
  object DataType {
    
    @scala.inline
    def bool: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool = "bool".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bool]
    
    @scala.inline
    def complex64: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64 = "complex64".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.complex64]
    
    @scala.inline
    def float32: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32 = "float32".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.float32]
    
    @scala.inline
    def int32: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32 = "int32".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.int32]
    
    @scala.inline
    def string: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string = "string".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.string]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal
  */
  trait PaddingMode extends StObject
  object PaddingMode {
    
    @scala.inline
    def causal: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal = "causal".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.causal]
    
    @scala.inline
    def same: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same = "same".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.same]
    
    @scala.inline
    def valid: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid = "valid".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.valid]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.max
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.avg
  */
  trait PoolMode extends StObject
  object PoolMode {
    
    @scala.inline
    def avg: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.avg = "avg".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.avg]
    
    @scala.inline
    def max: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.max = "max".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.max]
  }
  
  type SampleWeightMode = temporal
  
  type Shape = js.Array[Null | Double]
}
