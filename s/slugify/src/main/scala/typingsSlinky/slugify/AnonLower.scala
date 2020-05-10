package typingsSlinky.slugify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLower extends js.Object {
  var lower: js.UndefOr[Boolean] = js.native
  var remove: js.UndefOr[js.RegExp] = js.native
  var replacement: js.UndefOr[String] = js.native
}

object AnonLower {
  @scala.inline
  def apply(): AnonLower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLower]
  }
  @scala.inline
  implicit class AnonLowerOps[Self <: AnonLower] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLower(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lower")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement")(js.undefined)
        ret
    }
  }
  
}

