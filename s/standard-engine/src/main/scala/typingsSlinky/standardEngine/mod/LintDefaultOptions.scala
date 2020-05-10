package typingsSlinky.standardEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintDefaultOptions extends js.Object {
  /**
    * use options from nearest package.json?
    * @default true
    */
  var usePackageJson: js.UndefOr[Boolean] = js.native
}

object LintDefaultOptions {
  @scala.inline
  def apply(): LintDefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintDefaultOptions]
  }
  @scala.inline
  implicit class LintDefaultOptionsOps[Self <: LintDefaultOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUsePackageJson(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePackageJson")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePackageJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePackageJson")(js.undefined)
        ret
    }
  }
  
}

