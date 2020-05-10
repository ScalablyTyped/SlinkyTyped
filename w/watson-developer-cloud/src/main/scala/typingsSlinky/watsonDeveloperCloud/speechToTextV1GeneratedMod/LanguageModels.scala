package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** LanguageModels. */
@js.native
trait LanguageModels extends js.Object {
  /** An array of `LanguageModel` objects that provides information about each available custom language model. The array is empty if the requesting credentials own no custom language models (if no language is specified) or own no custom language models for the specified language. */
  var customizations: js.Array[LanguageModel] = js.native
}

object LanguageModels {
  @scala.inline
  def apply(customizations: js.Array[LanguageModel]): LanguageModels = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageModels]
  }
  @scala.inline
  implicit class LanguageModelsOps[Self <: LanguageModels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomizations(value: js.Array[LanguageModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

