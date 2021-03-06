package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsCore.distTypesMod.DataType
import typingsSlinky.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputLayerMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/input_layer", "Input")
  @js.native
  def Input(config: InputConfig): SymbolicTensor = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/input_layer", "InputLayer")
  @js.native
  class InputLayer protected () extends Layer {
    def this(args: InputLayerArgs) = this()
    
    var sparse: Boolean = js.native
  }
  /* static members */
  object InputLayer {
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/engine/input_layer", "InputLayer.className")
    @js.native
    val className: /* "InputLayer" */ String = js.native
  }
  
  @js.native
  trait InputConfig extends StObject {
    
    /**
      * A shape tuple (integer), including the batch size. For instance,
      * `batchShape=[10, 32]` indicates that the expected input will be batches of
      * 10 32-dimensional vectors. `batchShape=[null, 32]` indicates batches of an
      * arbitrary number of 32-dimensional vectors.
      */
    var batchShape: js.UndefOr[Shape] = js.native
    
    var dtype: js.UndefOr[DataType] = js.native
    
    /**
      * An optional name string for the layer. Should be unique in a model (do not
      * reuse the same name twice). It will be autogenerated if it isn't provided.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * A shape, not including the batch size. For instance, `shape=[32]`
      * indicates that the expected input will be batches of 32-dimensional
      * vectors.
      */
    var shape: js.UndefOr[Shape] = js.native
    
    /**
      * A boolean specifying whether the placeholder to be created is sparse.
      */
    var sparse: js.UndefOr[Boolean] = js.native
  }
  object InputConfig {
    
    @scala.inline
    def apply(): InputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputConfig]
    }
    
    @scala.inline
    implicit class InputConfigMutableBuilder[Self <: InputConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchShape(value: Shape): Self = StObject.set(x, "batchShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchShapeUndefined: Self = StObject.set(x, "batchShape", js.undefined)
      
      @scala.inline
      def setBatchShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "batchShape", js.Array(value :_*))
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "shape", js.Array(value :_*))
      
      @scala.inline
      def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
    }
  }
  
  @js.native
  trait InputLayerArgs extends StObject {
    
    /** Batch input shape, including the batch axis. */
    var batchInputShape: js.UndefOr[Shape] = js.native
    
    /** Optional input batch size (integer or null). */
    var batchSize: js.UndefOr[Double] = js.native
    
    /** Datatype of the input.  */
    var dtype: js.UndefOr[DataType] = js.native
    
    /** Input shape, not including the batch axis. */
    var inputShape: js.UndefOr[Shape] = js.native
    
    /** Name of the layer. */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Whether the placeholder created is meant to be sparse.
      */
    var sparse: js.UndefOr[Boolean] = js.native
  }
  object InputLayerArgs {
    
    @scala.inline
    def apply(): InputLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputLayerArgs]
    }
    
    @scala.inline
    implicit class InputLayerArgsMutableBuilder[Self <: InputLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchInputShape(value: Shape): Self = StObject.set(x, "batchInputShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchInputShapeUndefined: Self = StObject.set(x, "batchInputShape", js.undefined)
      
      @scala.inline
      def setBatchInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "batchInputShape", js.Array(value :_*))
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      @scala.inline
      def setInputShape(value: Shape): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputShapeUndefined: Self = StObject.set(x, "inputShape", js.undefined)
      
      @scala.inline
      def setInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "inputShape", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSparse(value: Boolean): Self = StObject.set(x, "sparse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSparseUndefined: Self = StObject.set(x, "sparse", js.undefined)
    }
  }
}
