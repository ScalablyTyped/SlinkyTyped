package typingsSlinky.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AcousticModels. */
@js.native
trait AcousticModels extends js.Object {
  /** An array of `AcousticModel` objects that provides information about each available custom acoustic model. The array is empty if the requesting credentials own no custom acoustic models (if no language is specified) or own no custom acoustic models for the specified language. */
  var customizations: js.Array[AcousticModel] = js.native
}

object AcousticModels {
  @scala.inline
  def apply(customizations: js.Array[AcousticModel]): AcousticModels = {
    val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcousticModels]
  }
  @scala.inline
  implicit class AcousticModelsOps[Self <: AcousticModels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomizations(value: js.Array[AcousticModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

