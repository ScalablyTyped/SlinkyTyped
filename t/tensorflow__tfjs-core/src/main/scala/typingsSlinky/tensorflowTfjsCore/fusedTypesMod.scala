package typingsSlinky.tensorflowTfjsCore

import typingsSlinky.tensorflowTfjsCore.convUtilMod.Conv2DInfo
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusedTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.linear
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.prelu
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.elu
    - typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu6
  */
  trait Activation extends StObject
  object Activation {
    
    @scala.inline
    def elu: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.elu = "elu".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.elu]
    
    @scala.inline
    def linear: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.linear = "linear".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.linear]
    
    @scala.inline
    def prelu: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.prelu = "prelu".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.prelu]
    
    @scala.inline
    def relu: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu = "relu".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu]
    
    @scala.inline
    def relu6: typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu6 = "relu6".asInstanceOf[typingsSlinky.tensorflowTfjsCore.tensorflowTfjsCoreStrings.relu6]
  }
  
  @js.native
  trait FusedBatchMatMulConfig extends StObject {
    
    var a: Tensor3D = js.native
    
    var activation: js.UndefOr[Activation] = js.native
    
    var b: Tensor3D = js.native
    
    var bias: js.UndefOr[Tensor[Rank]] = js.native
    
    var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.native
    
    var transposeA: Boolean = js.native
    
    var transposeB: Boolean = js.native
  }
  object FusedBatchMatMulConfig {
    
    @scala.inline
    def apply(a: Tensor3D, b: Tensor3D, transposeA: Boolean, transposeB: Boolean): FusedBatchMatMulConfig = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], transposeA = transposeA.asInstanceOf[js.Any], transposeB = transposeB.asInstanceOf[js.Any])
      __obj.asInstanceOf[FusedBatchMatMulConfig]
    }
    
    @scala.inline
    implicit class FusedBatchMatMulConfigMutableBuilder[Self <: FusedBatchMatMulConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Tensor3D): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivation(value: Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      @scala.inline
      def setB(value: Tensor3D): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBias(value: Tensor[Rank]): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      @scala.inline
      def setPreluActivationWeights(value: Tensor[Rank]): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
      
      @scala.inline
      def setTransposeA(value: Boolean): Self = StObject.set(x, "transposeA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransposeB(value: Boolean): Self = StObject.set(x, "transposeB", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FusedConv2DConfig extends StObject {
    
    var activation: js.UndefOr[Activation] = js.native
    
    var bias: js.UndefOr[Tensor[Rank]] = js.native
    
    var convInfo: Conv2DInfo = js.native
    
    var filter: Tensor4D = js.native
    
    var input: Tensor4D = js.native
    
    var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.native
  }
  object FusedConv2DConfig {
    
    @scala.inline
    def apply(convInfo: Conv2DInfo, filter: Tensor4D, input: Tensor4D): FusedConv2DConfig = {
      val __obj = js.Dynamic.literal(convInfo = convInfo.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[FusedConv2DConfig]
    }
    
    @scala.inline
    implicit class FusedConv2DConfigMutableBuilder[Self <: FusedConv2DConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivation(value: Activation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      @scala.inline
      def setBias(value: Tensor[Rank]): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      @scala.inline
      def setConvInfo(value: Conv2DInfo): Self = StObject.set(x, "convInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter(value: Tensor4D): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: Tensor4D): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreluActivationWeights(value: Tensor[Rank]): Self = StObject.set(x, "preluActivationWeights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreluActivationWeightsUndefined: Self = StObject.set(x, "preluActivationWeights", js.undefined)
    }
  }
}
