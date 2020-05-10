package typingsSlinky.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Components
@js.native
trait UIkitCountdownOptions extends js.Object {
  var date: js.UndefOr[String | Boolean] = js.native
}

object UIkitCountdownOptions {
  @scala.inline
  def apply(): UIkitCountdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitCountdownOptions]
  }
  @scala.inline
  implicit class UIkitCountdownOptionsOps[Self <: UIkitCountdownOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
  }
  
}

