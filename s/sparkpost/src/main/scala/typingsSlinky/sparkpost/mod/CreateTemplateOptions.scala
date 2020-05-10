package typingsSlinky.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTemplateOptions extends js.Object {
  /** Enable or disable click tracking */
  var click_tracking: js.UndefOr[Boolean] = js.native
  /** Enable or disable open tracking */
  var open_tracking: js.UndefOr[Boolean] = js.native
  /** Distinguish between transactional and non-transactional messages for unsubscribe and suppression purposes */
  var transactional: js.UndefOr[Boolean] = js.native
}

object CreateTemplateOptions {
  @scala.inline
  def apply(): CreateTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTemplateOptions]
  }
  @scala.inline
  implicit class CreateTemplateOptionsOps[Self <: CreateTemplateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClick_tracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click_tracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick_tracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click_tracking")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen_tracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_tracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen_tracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open_tracking")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactional")(js.undefined)
        ret
    }
  }
  
}

