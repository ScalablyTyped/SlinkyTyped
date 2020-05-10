package typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod

import typingsSlinky.vscodeLanguageserverProtocol.AnonConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationClientCapabilities extends js.Object {
  /**
    * The workspace client capabilities
    */
  var workspace: js.UndefOr[AnonConfiguration] = js.native
}

object ConfigurationClientCapabilities {
  @scala.inline
  def apply(): ConfigurationClientCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationClientCapabilities]
  }
  @scala.inline
  implicit class ConfigurationClientCapabilitiesOps[Self <: ConfigurationClientCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkspace(value: AnonConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(js.undefined)
        ret
    }
  }
  
}

