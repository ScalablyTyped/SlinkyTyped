package typingsSlinky.typedRestClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArrayFormat extends js.Object {
  var arrayFormat: js.UndefOr[String] = js.native
  var separator: js.UndefOr[String] = js.native
  var shouldAllowDots: js.UndefOr[Boolean] = js.native
  var shouldOnlyEncodeValues: js.UndefOr[Boolean] = js.native
}

object AnonArrayFormat {
  @scala.inline
  def apply(): AnonArrayFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonArrayFormat]
  }
  @scala.inline
  implicit class AnonArrayFormatOps[Self <: AnonArrayFormat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldAllowDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldAllowDots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldAllowDots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldAllowDots")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldOnlyEncodeValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldOnlyEncodeValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldOnlyEncodeValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldOnlyEncodeValues")(js.undefined)
        ret
    }
  }
  
}

