package typingsSlinky.webidlConversions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringOptions extends Options {
  var treatNullAsEmptyString: js.UndefOr[Boolean] = js.native
}

object StringOptions {
  @scala.inline
  def apply(): StringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringOptions]
  }
  @scala.inline
  implicit class StringOptionsOps[Self <: StringOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTreatNullAsEmptyString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treatNullAsEmptyString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreatNullAsEmptyString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treatNullAsEmptyString")(js.undefined)
        ret
    }
  }
  
}

