package typingsSlinky.synaptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonActivationsentences extends js.Object {
  var activation_sentences: js.Any = js.native
  var inputs: js.Any = js.native
  var layers: js.Any = js.native
  var memory: js.Any = js.native
  var neurons: js.Any = js.native
  var outputs: js.Any = js.native
  var propagation_sentences: js.Any = js.native
  var targets: js.Any = js.native
  var trace_sentences: js.Any = js.native
  var variables: js.Any = js.native
}

object AnonActivationsentences {
  @scala.inline
  def apply(
    activation_sentences: js.Any,
    inputs: js.Any,
    layers: js.Any,
    memory: js.Any,
    neurons: js.Any,
    outputs: js.Any,
    propagation_sentences: js.Any,
    targets: js.Any,
    trace_sentences: js.Any,
    variables: js.Any
  ): AnonActivationsentences = {
    val __obj = js.Dynamic.literal(activation_sentences = activation_sentences.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], neurons = neurons.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], propagation_sentences = propagation_sentences.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], trace_sentences = trace_sentences.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActivationsentences]
  }
  @scala.inline
  implicit class AnonActivationsentencesOps[Self <: AnonActivationsentences] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivation_sentences(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activation_sentences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemory(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNeurons(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neurons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropagation_sentences(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagation_sentences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrace_sentences(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace_sentences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

