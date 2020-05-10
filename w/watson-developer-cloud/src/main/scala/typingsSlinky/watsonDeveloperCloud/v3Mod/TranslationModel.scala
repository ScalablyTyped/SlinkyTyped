package typingsSlinky.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Response payload for models. */
@js.native
trait TranslationModel extends js.Object {
  /** Model ID of the base model that was used to customize the model. If the model is not a custom model, this will be an empty string. */
  var base_model_id: js.UndefOr[String] = js.native
  /** Whether this model can be used as a base for customization. Customized models are not further customizable, and some base models are not customizable. */
  var customizable: js.UndefOr[Boolean] = js.native
  /** Whether or not the model is a default model. A default model is the model for a given language pair that will be used when that language pair is specified in the source and target parameters. */
  var default_model: js.UndefOr[Boolean] = js.native
  /** The domain of the translation model. */
  var domain: js.UndefOr[String] = js.native
  /** A globally unique string that identifies the underlying model that is used for translation. */
  var model_id: String = js.native
  /** Optional name that can be specified when the model is created. */
  var name: js.UndefOr[String] = js.native
  /** Either an empty string, indicating the model is not a custom model, or the ID of the service instance that created the model. */
  var owner: js.UndefOr[String] = js.native
  /** Translation source language code. */
  var source: js.UndefOr[String] = js.native
  /** Availability of a model. */
  var status: js.UndefOr[String] = js.native
  /** Translation target language code. */
  var target: js.UndefOr[String] = js.native
}

object TranslationModel {
  @scala.inline
  def apply(model_id: String): TranslationModel = {
    val __obj = js.Dynamic.literal(model_id = model_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationModel]
  }
  @scala.inline
  implicit class TranslationModelOps[Self <: TranslationModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase_model_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_model_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase_model_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_model_id")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizable")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault_model(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault_model: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_model")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

