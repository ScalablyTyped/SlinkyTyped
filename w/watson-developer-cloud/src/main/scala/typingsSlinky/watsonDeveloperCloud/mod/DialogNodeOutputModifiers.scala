package typingsSlinky.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options that modify how specified output is handled. */
@js.native
trait DialogNodeOutputModifiers extends js.Object {
  /** Whether values in the output will overwrite output values in an array specified by previously executed dialog nodes. If this option is set to **false**, new values will be appended to previously specified values. */
  var overwrite: js.UndefOr[Boolean] = js.native
}

object DialogNodeOutputModifiers {
  @scala.inline
  def apply(): DialogNodeOutputModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodeOutputModifiers]
  }
  @scala.inline
  implicit class DialogNodeOutputModifiersOps[Self <: DialogNodeOutputModifiers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

