package typingsSlinky.semanticUiTab

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.TabSettings._Impl, 'apiSettings'> */
@js.native
trait PickImplapiSettings extends js.Object {
  var apiSettings: ApiSettings = js.native
}

object PickImplapiSettings {
  @scala.inline
  def apply(apiSettings: ApiSettings): PickImplapiSettings = {
    val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplapiSettings]
  }
  @scala.inline
  implicit class PickImplapiSettingsOps[Self <: PickImplapiSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiSettings(value: ApiSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiSettings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

