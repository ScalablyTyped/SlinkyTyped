package typingsSlinky.tensorflowTfjsLayers.modelsMod

import typingsSlinky.tensorflowTfjsCore.typesMod.WeightsManifestConfig
import typingsSlinky.tensorflowTfjsLayers.typesMod.PyJsonDict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelAndWeightsConfig extends js.Object {
  /**
    * A JSON object or JSON string containing the model config.
    *
    * This can be either of the following two formats:
    *   - A model archiecture-only config,  i.e., a format consistent with the
    *     return value of`keras.Model.to_json()`.
    *   - A full model config, containing not only model architecture, but also
    *     training options and state, i.e., a format consistent with the return
    *     value of `keras.models.save_model()`.
    */
  var modelTopology: PyJsonDict = js.native
  /**
    * Path to prepend to the paths in `weightManifest` before fetching.
    *
    * The path may optionally end in a slash ('/').
    */
  var pathPrefix: js.UndefOr[String] = js.native
  /**
    * A weights manifest in TensorFlow.js format.
    */
  var weightsManifest: js.UndefOr[WeightsManifestConfig] = js.native
}

object ModelAndWeightsConfig {
  @scala.inline
  def apply(modelTopology: PyJsonDict): ModelAndWeightsConfig = {
    val __obj = js.Dynamic.literal(modelTopology = modelTopology.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelAndWeightsConfig]
  }
  @scala.inline
  implicit class ModelAndWeightsConfigOps[Self <: ModelAndWeightsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModelTopology(value: PyJsonDict): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelTopology")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightsManifest(value: WeightsManifestConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightsManifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightsManifest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightsManifest")(js.undefined)
        ret
    }
  }
  
}

