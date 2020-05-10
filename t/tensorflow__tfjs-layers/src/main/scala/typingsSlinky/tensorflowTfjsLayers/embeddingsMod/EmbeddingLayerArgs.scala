package typingsSlinky.tensorflowTfjsLayers.embeddingsMod

import typingsSlinky.tensorflowTfjsLayers.constraintsMod.Constraint
import typingsSlinky.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typingsSlinky.tensorflowTfjsLayers.initializersMod.Initializer
import typingsSlinky.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.Regularizer
import typingsSlinky.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typingsSlinky.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbeddingLayerArgs extends LayerArgs {
  /**
    * Regularizer function applied to the activation.
    */
  var activityRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Constraint function applied to the `embeddings` matrix.
    */
  var embeddingsConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
  /**
    * Initializer for the `embeddings` matrix.
    */
  var embeddingsInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  /**
    * Regularizer function applied to the `embeddings` matrix.
    */
  var embeddingsRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  /**
    * Integer > 0. Size of the vocabulary, i.e. maximum integer index + 1.
    */
  var inputDim: Double = js.native
  /**
    * Length of input sequences, when it is constant.
    *
    * This argument is required if you are going to connect `flatten` then
    * `dense` layers upstream (without it, the shape of the dense outputs cannot
    * be computed).
    */
  var inputLength: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Whether the input value 0 is a special "padding" value that should be
    * masked out. This is useful when using recurrent layers which may take
    * variable length input.
    *
    * If this is `True` then all subsequent layers in the model need to support
    * masking or an exception will be raised. If maskZero is set to `True`, as a
    * consequence, index 0 cannot be used in the vocabulary (inputDim should
    * equal size of vocabulary + 1).
    */
  var maskZero: js.UndefOr[Boolean] = js.native
  /**
    * Integer >= 0. Dimension of the dense embedding.
    */
  var outputDim: Double = js.native
}

object EmbeddingLayerArgs {
  @scala.inline
  def apply(inputDim: Double, outputDim: Double): EmbeddingLayerArgs = {
    val __obj = js.Dynamic.literal(inputDim = inputDim.asInstanceOf[js.Any], outputDim = outputDim.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddingLayerArgs]
  }
  @scala.inline
  implicit class EmbeddingLayerArgsOps[Self <: EmbeddingLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputDim(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputDim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputDim(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputDim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivityRegularizer(value: RegularizerIdentifier | Regularizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityRegularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityRegularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityRegularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddingsConstraint(value: ConstraintIdentifier | Constraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddingsConstraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddingsConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddingsConstraint")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddingsInitializer(value: InitializerIdentifier | Initializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddingsInitializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddingsInitializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddingsInitializer")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddingsRegularizer(value: RegularizerIdentifier | Regularizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddingsRegularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddingsRegularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddingsRegularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withInputLength(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskZero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskZero")(js.undefined)
        ret
    }
  }
  
}

