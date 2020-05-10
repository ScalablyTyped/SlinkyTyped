package typingsSlinky.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Custom models that are available for entities and relations. */
@js.native
trait ListModelsResults extends js.Object {
  /** An array of available models. */
  var models: js.UndefOr[js.Array[Model]] = js.native
}

object ListModelsResults {
  @scala.inline
  def apply(): ListModelsResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelsResults]
  }
  @scala.inline
  implicit class ListModelsResultsOps[Self <: ListModelsResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModels(value: js.Array[Model]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(js.undefined)
        ret
    }
  }
  
}

