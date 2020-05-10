package typingsSlinky.tensorflowTfjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelArtifacts extends js.Object {
  /**
    * What library or tool is responsible for converting the original model
    * to this format, applicable only if the model is output by a converter.
    *
    * Used for debugging purposes.  E.g., 'TensorFlow.js Converter v1.0.0'.
    *
    * A value of `null` means the model artifacts are generated without any
    * conversion process (e.g., saved directly from a TensorFlow.js
    * `tf.LayersModel` instance.)
    */
  var convertedBy: js.UndefOr[String | Null] = js.native
  /**
    * Hard-coded format name for models saved from TensorFlow.js or converted
    * by TensorFlow.js Converter.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * What library is responsible for originally generating this artifact.
    *
    * Used for debugging purposes. E.g., 'TensorFlow.js v1.0.0'.
    */
  var generatedBy: js.UndefOr[String] = js.native
  /**
    * Model topology.
    *
    * For Keras-style `tf.Model`s, this is a JSON object.
    * For TensorFlow-style models (e.g., `SavedModel`), this is the JSON
    * encoding of the `GraphDef` protocol buffer.
    */
  var modelTopology: js.UndefOr[js.Object | js.typedarray.ArrayBuffer] = js.native
  /**
    * Serialized configuration for the model's training.
    */
  var trainingConfig: js.UndefOr[TrainingConfig] = js.native
  /**
    * User-defined metadata about the model.
    */
  var userDefinedMetadata: js.UndefOr[js.Object] = js.native
  /**
    * Binary buffer for all weight values concatenated in the order specified
    * by `weightSpecs`.
    */
  var weightData: js.UndefOr[js.typedarray.ArrayBuffer] = js.native
  /**
    * Weight specifications.
    *
    * This corresponds to the weightsData below.
    */
  var weightSpecs: js.UndefOr[js.Array[WeightsManifestEntry]] = js.native
}

object ModelArtifacts {
  @scala.inline
  def apply(): ModelArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelArtifacts]
  }
  @scala.inline
  implicit class ModelArtifactsOps[Self <: ModelArtifacts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConvertedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConvertedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withConvertedByNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("convertedBy")(null)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneratedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneratedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withModelTopologyArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTopology")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModelTopology(value: js.Object | js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTopology")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelTopology: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTopology")(js.undefined)
        ret
    }
    @scala.inline
    def withTrainingConfig(value: TrainingConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrainingConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trainingConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withUserDefinedMetadata(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefinedMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserDefinedMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userDefinedMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightData")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightSpecs(value: js.Array[WeightsManifestEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightSpecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightSpecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightSpecs")(js.undefined)
        ret
    }
  }
  
}

