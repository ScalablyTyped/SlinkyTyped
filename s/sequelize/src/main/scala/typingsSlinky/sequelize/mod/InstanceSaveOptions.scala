package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used for Instance.save method
  */
@js.native
trait InstanceSaveOptions
  extends FieldsOptions
     with LoggingOptions
     with ReturningOptions
     with SearchPathOptions {
  var hooks: js.UndefOr[Boolean] = js.native
  /**
    * If true, the updatedAt timestamp will not be updated.
    *
    * Defaults to false
    */
  var silent: js.UndefOr[Boolean] = js.native
}

object InstanceSaveOptions {
  @scala.inline
  def apply(): InstanceSaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSaveOptions]
  }
  @scala.inline
  implicit class InstanceSaveOptionsOps[Self <: InstanceSaveOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hooks")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
  }
  
}

