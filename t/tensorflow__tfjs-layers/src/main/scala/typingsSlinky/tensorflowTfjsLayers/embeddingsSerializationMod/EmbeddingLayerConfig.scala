package typingsSlinky.tensorflowTfjsLayers.embeddingsSerializationMod

import typingsSlinky.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typingsSlinky.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typingsSlinky.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typingsSlinky.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmbeddingLayerConfig extends LayerConfig {
  var activity_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var embeddings_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var embeddings_initializer: js.UndefOr[InitializerSerialization] = js.native
  var embeddings_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var input_dim: Double = js.native
  var input_length: js.UndefOr[Double | js.Array[Double]] = js.native
  var mask_zero: js.UndefOr[Boolean] = js.native
  var output_dim: Double = js.native
}

object EmbeddingLayerConfig {
  @scala.inline
  def apply(input_dim: Double, output_dim: Double): EmbeddingLayerConfig = {
    val __obj = js.Dynamic.literal(input_dim = input_dim.asInstanceOf[js.Any], output_dim = output_dim.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddingLayerConfig]
  }
  @scala.inline
  implicit class EmbeddingLayerConfigOps[Self <: EmbeddingLayerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInput_dim(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_dim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutput_dim(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output_dim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivity_regularizer(value: RegularizerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity_regularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivity_regularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity_regularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddings_constraint(value: ConstraintSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddings_constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddings_constraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddings_constraint")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddings_initializer(value: InitializerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddings_initializer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddings_initializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddings_initializer")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddings_regularizer(value: RegularizerSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddings_regularizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddings_regularizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddings_regularizer")(js.undefined)
        ret
    }
    @scala.inline
    def withInput_length(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput_length: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input_length")(js.undefined)
        ret
    }
    @scala.inline
    def withMask_zero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask_zero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask_zero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask_zero")(js.undefined)
        ret
    }
  }
  
}

