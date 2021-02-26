package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsLayers.topologyMod.Layer
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Add")
  @js.native
  class Add_ () extends Merge {
    def this(args: LayerArgs) = this()
  }
  /* static members */
  object Add_ {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Add")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Add.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Average")
  @js.native
  class Average_ () extends Merge {
    def this(args: LayerArgs) = this()
  }
  /* static members */
  object Average_ {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Average")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Average.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Concatenate")
  @js.native
  class Concatenate_ () extends Merge {
    def this(args: ConcatenateLayerArgs) = this()
    
    val DEFAULT_AXIS: /* -1 */ Double = js.native
    
    val axis: js.Any = js.native
  }
  /* static members */
  object Concatenate_ {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Concatenate")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Concatenate.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Dot")
  @js.native
  class Dot protected () extends Merge {
    def this(args: DotLayerArgs) = this()
    
    var axes: js.Any = js.native
    
    var interpretAxes: js.Any = js.native
    
    var normalize: js.Any = js.native
  }
  /* static members */
  object Dot {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Dot")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Dot.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Maximum")
  @js.native
  class Maximum_ () extends Merge {
    def this(args: LayerArgs) = this()
  }
  /* static members */
  object Maximum_ {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Maximum")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Maximum.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Merge")
  @js.native
  abstract class Merge () extends Layer {
    def this(args: LayerArgs) = this()
    
    /**
      * Computes the shape of the result of an elementwise operation.
      *
      * @param shape1: Shape of the first tensor.
      * @param shape2: Shape of the second tensor.
      * @returns Expected output shape when an elementwise operation is carried
      *   out on 2 tensors with shapes `shape1` and `shape2`.
      * @throws ValueError: If `shape1` and `shape2` are not compatible for
      *   element-wise operations.
      */
    var computeElementwiseOpOutputShape: js.Any = js.native
    
    /**
      * Logic for merging multiple tensors, to be overridden by subclasses.
      * @param inputs
      */
    /* protected */ def mergeFunction(inputs: js.Array[Tensor[Rank]]): Tensor[Rank] = js.native
    
    var reshapeRequired: Boolean = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Minimum")
  @js.native
  class Minimum_ () extends Merge {
    def this(args: LayerArgs) = this()
  }
  /* static members */
  object Minimum_ {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Minimum")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Minimum.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Multiply")
  @js.native
  class Multiply_ () extends Merge {
    def this(args: LayerArgs) = this()
  }
  /* static members */
  object Multiply_ {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Multiply")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Multiply.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "add")
  @js.native
  def add(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "add")
  @js.native
  def add(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "add")
  @js.native
  def add(config: LayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "average")
  @js.native
  def average(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "average")
  @js.native
  def average(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "average")
  @js.native
  def average(config: LayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "concatenate")
  @js.native
  def concatenate(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "concatenate")
  @js.native
  def concatenate(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "concatenate")
  @js.native
  def concatenate(config: ConcatenateLayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "maximum")
  @js.native
  def maximum(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "maximum")
  @js.native
  def maximum(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "maximum")
  @js.native
  def maximum(config: LayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "minimum")
  @js.native
  def minimum(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "minimum")
  @js.native
  def minimum(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "minimum")
  @js.native
  def minimum(config: LayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "multiply")
  @js.native
  def multiply(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "multiply")
  @js.native
  def multiply(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "multiply")
  @js.native
  def multiply(config: LayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
  
  @js.native
  trait ConcatenateLayerArgs extends LayerArgs {
    
    /**
      * Axis along which to concatenate.
      */
    var axis: js.UndefOr[Double] = js.native
  }
  object ConcatenateLayerArgs {
    
    @scala.inline
    def apply(): ConcatenateLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConcatenateLayerArgs]
    }
    
    @scala.inline
    implicit class ConcatenateLayerArgsMutableBuilder[Self <: ConcatenateLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  @js.native
  trait DotLayerArgs extends LayerArgs {
    
    /**
      * Axis or axes along which the dot product will be taken.
      *
      * Integer or an Array of integers.
      */
    var axes: Double | (js.Tuple2[Double, Double]) = js.native
    
    /**
      * Whether to L2-normalize samples along the dot product axis
      * before taking the dot product.
      *
      * If set to `true`, the output of the dot product isthe cosine
      * proximity between the two samples.
      */
    var normalize: js.UndefOr[Boolean] = js.native
  }
  object DotLayerArgs {
    
    @scala.inline
    def apply(axes: Double | (js.Tuple2[Double, Double])): DotLayerArgs = {
      val __obj = js.Dynamic.literal(axes = axes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotLayerArgs]
    }
    
    @scala.inline
    implicit class DotLayerArgsMutableBuilder[Self <: DotLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
}
