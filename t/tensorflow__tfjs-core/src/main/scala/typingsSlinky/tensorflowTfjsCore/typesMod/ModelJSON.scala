package typingsSlinky.tensorflowTfjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelJSON extends js.Object {
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
  /** Model training configuration. */
  var trainingConfig: js.UndefOr[TrainingConfig] = js.native
  /**
    * User-defined metadata about the model.
    */
  var userDefinedMetadata: js.UndefOr[js.Object] = js.native
  /**
    * Weights manifest.
    *
    * The weights manifest consists of an ordered list of weight-manifest
    * groups. Each weight-manifest group consists of a number of weight values
    * stored in a number of paths. See the documentation of
    * `WeightsManifestConfig` for more details.
    */
  var weightsManifest: WeightsManifestConfig = js.native
}

object ModelJSON {
  @scala.inline
  def apply(weightsManifest: WeightsManifestConfig): ModelJSON = {
    val __obj = js.Dynamic.literal(weightsManifest = weightsManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelJSON]
  }
  @scala.inline
  implicit class ModelJSONOps[Self <: ModelJSON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWeightsManifest(value: WeightsManifestConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightsManifest")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

