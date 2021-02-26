package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
import typingsSlinky.tensorflowTfjsLayers.typesMod.BaseSerialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializerConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/initializer_config", "VALID_DISTRIBUTION_VALUES")
  @js.native
  val VALID_DISTRIBUTION_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/initializer_config", "VALID_FAN_MODE_VALUES")
  @js.native
  val VALID_FAN_MODE_VALUES: js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/initializer_config", "initializerClassNames")
  @js.native
  val initializerClassNames: js.Array[InitializerClassName] = js.native
  
  @js.native
  trait ConstantConfig extends StObject {
    
    var value: Double = js.native
  }
  object ConstantConfig {
    
    @scala.inline
    def apply(value: Double): ConstantConfig = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstantConfig]
    }
    
    @scala.inline
    implicit class ConstantConfigMutableBuilder[Self <: ConstantConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type ConstantSerialization = BaseSerialization[Constant, ConstantConfig]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
  */
  trait Distribution extends StObject
  object Distribution {
    
    @scala.inline
    def normal: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = "normal".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal]
    
    @scala.inline
    def truncatedNormal: truncatedNormal_ = "truncatedNormal".asInstanceOf[truncatedNormal_]
    
    @scala.inline
    def uniform: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = "uniform".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal
  */
  trait DistributionSerialization extends StObject
  object DistributionSerialization {
    
    @scala.inline
    def normal: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal = "normal".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.normal]
    
    @scala.inline
    def truncated_normal: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal = "truncated_normal".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncated_normal]
    
    @scala.inline
    def uniform: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform = "uniform".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.uniform]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg
  */
  trait FanMode extends StObject
  object FanMode {
    
    @scala.inline
    def fanAvg: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg = "fanAvg".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanAvg]
    
    @scala.inline
    def fanIn: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn = "fanIn".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanIn]
    
    @scala.inline
    def fanOut: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut = "fanOut".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fanOut]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg
  */
  trait FanModeSerialization extends StObject
  object FanModeSerialization {
    
    @scala.inline
    def fan_avg: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg = "fan_avg".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_avg]
    
    @scala.inline
    def fan_in: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in = "fan_in".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_in]
    
    @scala.inline
    def fan_out: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out = "fan_out".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.fan_out]
  }
  
  @js.native
  trait IdentityConfig extends StObject {
    
    var gain: js.UndefOr[Double] = js.native
  }
  object IdentityConfig {
    
    @scala.inline
    def apply(): IdentityConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityConfig]
    }
    
    @scala.inline
    implicit class IdentityConfigMutableBuilder[Self <: IdentityConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
    }
  }
  
  type IdentitySerialization = BaseSerialization[Identity, IdentityConfig]
  
  /* Inlined @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/keras_format/initializer_config.InitializerSerialization['class_name'] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling
  */
  trait InitializerClassName extends StObject
  object InitializerClassName {
    
    @scala.inline
    def Constant: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant = "Constant".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Constant]
    
    @scala.inline
    def Identity: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity = "Identity".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Identity]
    
    @scala.inline
    def Ones: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones = "Ones".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Ones]
    
    @scala.inline
    def Orthogonal: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal = "Orthogonal".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Orthogonal]
    
    @scala.inline
    def RandomNormal: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal = "RandomNormal".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomNormal]
    
    @scala.inline
    def RandomUniform: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform = "RandomUniform".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.RandomUniform]
    
    @scala.inline
    def TruncatedNormal: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal = "TruncatedNormal".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.TruncatedNormal]
    
    @scala.inline
    def VarianceScaling: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling = "VarianceScaling".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.VarianceScaling]
    
    @scala.inline
    def Zeros: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros = "Zeros".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.Zeros]
  }
  
  type InitializerSerialization = ZerosSerialization | OnesSerialization | ConstantSerialization | RandomUniformSerialization | RandomNormalSerialization | TruncatedNormalSerialization | IdentitySerialization | VarianceScalingSerialization | OrthogonalSerialization
  
  type OnesSerialization = BaseSerialization[Ones, js.Object]
  
  @js.native
  trait OrthogonalConfig extends StObject {
    
    var gain: js.UndefOr[Double] = js.native
    
    var seed: js.UndefOr[Double] = js.native
  }
  object OrthogonalConfig {
    
    @scala.inline
    def apply(): OrthogonalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrthogonalConfig]
    }
    
    @scala.inline
    implicit class OrthogonalConfigMutableBuilder[Self <: OrthogonalConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type OrthogonalSerialization = BaseSerialization[Orthogonal, OrthogonalConfig]
  
  @js.native
  trait RandomNormalConfig extends StObject {
    
    var mean: js.UndefOr[Double] = js.native
    
    var seed: js.UndefOr[Double] = js.native
    
    var stddev: js.UndefOr[Double] = js.native
  }
  object RandomNormalConfig {
    
    @scala.inline
    def apply(): RandomNormalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomNormalConfig]
    }
    
    @scala.inline
    implicit class RandomNormalConfigMutableBuilder[Self <: RandomNormalConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStddevUndefined: Self = StObject.set(x, "stddev", js.undefined)
    }
  }
  
  type RandomNormalSerialization = BaseSerialization[RandomNormal, RandomNormalConfig]
  
  @js.native
  trait RandomUniformConfig extends StObject {
    
    var maxval: js.UndefOr[Double] = js.native
    
    var minval: js.UndefOr[Double] = js.native
    
    var seed: js.UndefOr[Double] = js.native
  }
  object RandomUniformConfig {
    
    @scala.inline
    def apply(): RandomUniformConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RandomUniformConfig]
    }
    
    @scala.inline
    implicit class RandomUniformConfigMutableBuilder[Self <: RandomUniformConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxval(value: Double): Self = StObject.set(x, "maxval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxvalUndefined: Self = StObject.set(x, "maxval", js.undefined)
      
      @scala.inline
      def setMinval(value: Double): Self = StObject.set(x, "minval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinvalUndefined: Self = StObject.set(x, "minval", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type RandomUniformSerialization = BaseSerialization[RandomUniform, RandomUniformConfig]
  
  @js.native
  trait TruncatedNormalConfig extends StObject {
    
    var mean: js.UndefOr[Double] = js.native
    
    var seed: js.UndefOr[Double] = js.native
    
    var stddev: js.UndefOr[Double] = js.native
  }
  object TruncatedNormalConfig {
    
    @scala.inline
    def apply(): TruncatedNormalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TruncatedNormalConfig]
    }
    
    @scala.inline
    implicit class TruncatedNormalConfigMutableBuilder[Self <: TruncatedNormalConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStddevUndefined: Self = StObject.set(x, "stddev", js.undefined)
    }
  }
  
  type TruncatedNormalSerialization = BaseSerialization[TruncatedNormal, TruncatedNormalConfig]
  
  @js.native
  trait VarianceScalingConfig extends StObject {
    
    var distribution: js.UndefOr[DistributionSerialization] = js.native
    
    var mode: js.UndefOr[FanModeSerialization] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var seed: js.UndefOr[Double] = js.native
  }
  object VarianceScalingConfig {
    
    @scala.inline
    def apply(): VarianceScalingConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VarianceScalingConfig]
    }
    
    @scala.inline
    implicit class VarianceScalingConfigMutableBuilder[Self <: VarianceScalingConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDistribution(value: DistributionSerialization): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
      
      @scala.inline
      def setMode(value: FanModeSerialization): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
  
  type VarianceScalingSerialization = BaseSerialization[VarianceScaling, VarianceScalingConfig]
  
  type ZerosSerialization = BaseSerialization[Zeros, js.Object]
}
