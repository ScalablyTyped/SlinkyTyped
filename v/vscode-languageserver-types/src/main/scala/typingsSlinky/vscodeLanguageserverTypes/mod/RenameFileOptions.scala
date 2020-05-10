package typingsSlinky.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameFileOptions extends js.Object {
  /**
    * Ignores if target exists.
    */
  var ignoreIfExists: js.UndefOr[Boolean] = js.native
  /**
    * Overwrite target if existing. Overwrite wins over `ignoreIfExists`
    */
  var overwrite: js.UndefOr[Boolean] = js.native
}

object RenameFileOptions {
  @scala.inline
  def apply(): RenameFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameFileOptions]
  }
  @scala.inline
  implicit class RenameFileOptionsOps[Self <: RenameFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreIfExists(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIfExists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreIfExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreIfExists")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
  }
  
}

