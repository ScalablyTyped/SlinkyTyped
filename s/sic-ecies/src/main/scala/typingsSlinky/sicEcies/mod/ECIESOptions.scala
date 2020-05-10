package typingsSlinky.sicEcies.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECIESOptions extends js.Object {
  var noKey: js.UndefOr[Boolean] = js.native
  var shortTag: js.UndefOr[Boolean] = js.native
}

object ECIESOptions {
  @scala.inline
  def apply(): ECIESOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECIESOptions]
  }
  @scala.inline
  implicit class ECIESOptionsOps[Self <: ECIESOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noKey")(js.undefined)
        ret
    }
    @scala.inline
    def withShortTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortTag")(js.undefined)
        ret
    }
  }
  
}

