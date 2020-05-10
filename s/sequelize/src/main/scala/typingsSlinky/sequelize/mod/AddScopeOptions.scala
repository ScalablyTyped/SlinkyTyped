package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AddScope Options for Model.addScope
  */
@js.native
trait AddScopeOptions extends js.Object {
  /**
    * If a scope of the same name already exists, should it be overwritten?
    */
  var `override`: Boolean = js.native
}

object AddScopeOptions {
  @scala.inline
  def apply(`override`: Boolean): AddScopeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddScopeOptions]
  }
  @scala.inline
  implicit class AddScopeOptionsOps[Self <: AddScopeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverride(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

