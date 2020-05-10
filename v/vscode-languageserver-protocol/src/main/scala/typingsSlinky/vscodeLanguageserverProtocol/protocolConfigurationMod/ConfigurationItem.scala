package typingsSlinky.vscodeLanguageserverProtocol.protocolConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationItem extends js.Object {
  /**
    * The scope to get the configuration section for.
    */
  var scopeUri: js.UndefOr[String] = js.native
  /**
    * The configuration section asked for.
    */
  var section: js.UndefOr[String] = js.native
}

object ConfigurationItem {
  @scala.inline
  def apply(): ConfigurationItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationItem]
  }
  @scala.inline
  implicit class ConfigurationItemOps[Self <: ConfigurationItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopeUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeUri")(js.undefined)
        ret
    }
    @scala.inline
    def withSection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(js.undefined)
        ret
    }
  }
  
}

