package typingsSlinky.simplSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleSchemaOptions extends js.Object {
  var check: js.UndefOr[Boolean] = js.native
  var clean: js.UndefOr[CleanOption] = js.native
  var defaultLabel: js.UndefOr[String] = js.native
  var humanizeAutoLabels: js.UndefOr[Boolean] = js.native
  var requiredByDefault: js.UndefOr[Boolean] = js.native
  var tracker: js.UndefOr[js.Any] = js.native
}

object SimpleSchemaOptions {
  @scala.inline
  def apply(): SimpleSchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleSchemaOptions]
  }
  @scala.inline
  implicit class SimpleSchemaOptionsOps[Self <: SimpleSchemaOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("check")(js.undefined)
        ret
    }
    @scala.inline
    def withClean(value: CleanOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHumanizeAutoLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("humanizeAutoLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHumanizeAutoLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("humanizeAutoLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredByDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredByDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredByDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredByDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withTracker(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracker")(js.undefined)
        ret
    }
  }
  
}

