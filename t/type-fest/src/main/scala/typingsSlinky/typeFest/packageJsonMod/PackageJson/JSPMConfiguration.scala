package typingsSlinky.typeFest.packageJsonMod.PackageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSPMConfiguration extends js.Object {
  /**
  		JSPM configuration.
  		*/
  var jspm: js.UndefOr[typingsSlinky.typeFest.packageJsonMod.PackageJson] = js.native
}

object JSPMConfiguration {
  @scala.inline
  def apply(): JSPMConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSPMConfiguration]
  }
  @scala.inline
  implicit class JSPMConfigurationOps[Self <: JSPMConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJspm(value: typingsSlinky.typeFest.packageJsonMod.PackageJson): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jspm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJspm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jspm")(js.undefined)
        ret
    }
  }
  
}

