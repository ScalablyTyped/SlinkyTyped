package typingsSlinky.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdd extends js.Object {
  // Adding a pattern overrides existing pattern only if matches exactly.
  var add: js.UndefOr[Boolean] = js.native
  // Delegate fixedargs override action args.
  var fixedargs: js.UndefOr[Boolean] = js.native
  // Action result must be a plain object.
  var result: js.UndefOr[Boolean] = js.native
}

object AnonAdd {
  @scala.inline
  def apply(): AnonAdd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAdd]
  }
  @scala.inline
  implicit class AnonAddOps[Self <: AnonAdd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedargs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedargs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedargs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedargs")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

