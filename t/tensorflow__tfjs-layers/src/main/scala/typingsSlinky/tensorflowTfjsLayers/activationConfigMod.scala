package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.elu_
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hard_sigmoid
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu_
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softmax_
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object activationConfigMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/keras_format/activation_config", "activationOptions")
  @js.native
  val activationOptions: js.Array[
    linear | relu_ | elu_ | relu6 | selu | sigmoid | softmax_ | softplus | tanh | hard_sigmoid | softsign
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.elu_
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu_
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softmax_
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign
    - typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh
  */
  trait ActivationIdentifier extends StObject
  object ActivationIdentifier {
    
    @scala.inline
    def elu: elu_ = "elu".asInstanceOf[elu_]
    
    @scala.inline
    def hardSigmoid: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid = "hardSigmoid".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid]
    
    @scala.inline
    def linear: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear = "linear".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear]
    
    @scala.inline
    def relu: relu_ = "relu".asInstanceOf[relu_]
    
    @scala.inline
    def relu6: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6 = "relu6".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6]
    
    @scala.inline
    def selu: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu = "selu".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu]
    
    @scala.inline
    def sigmoid: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid = "sigmoid".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid]
    
    @scala.inline
    def softmax: softmax_ = "softmax".asInstanceOf[softmax_]
    
    @scala.inline
    def softplus: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus = "softplus".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus]
    
    @scala.inline
    def softsign: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign = "softsign".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign]
    
    @scala.inline
    def tanh: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh = "tanh".asInstanceOf[typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh]
  }
  
  type ActivationSerialization = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<'linear' | 'relu' | 'elu' | 'relu6' | 'selu' | 'sigmoid' | 'softmax' | 'softplus' | 'tanh' | 'hard_sigmoid' | 'softsign'>[number] */ js.Any
}
