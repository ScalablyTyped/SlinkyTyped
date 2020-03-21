package typingsSlinky.tensorflowTfjsLayers.activationConfigMod

import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.elu_
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu_
import typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softmax_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait ActivationIdentifier extends js.Object

object ActivationIdentifier {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elu: elu_ = this.cast("elu")
  @scala.inline
  def hardSigmoid: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.hardSigmoid = this.cast("hardSigmoid")
  @scala.inline
  def linear: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.linear = this.cast("linear")
  @scala.inline
  def relu: relu_ = this.cast("relu")
  @scala.inline
  def relu6: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.relu6 = this.cast("relu6")
  @scala.inline
  def selu: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.selu = this.cast("selu")
  @scala.inline
  def sigmoid: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.sigmoid = this.cast("sigmoid")
  @scala.inline
  def softmax: softmax_ = this.cast("softmax")
  @scala.inline
  def softplus: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softplus = this.cast("softplus")
  @scala.inline
  def softsign: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.softsign = this.cast("softsign")
  @scala.inline
  def tanh: typingsSlinky.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.tanh = this.cast("tanh")
}

