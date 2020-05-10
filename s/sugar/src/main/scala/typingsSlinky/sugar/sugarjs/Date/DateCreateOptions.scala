package typingsSlinky.sugar.sugarjs.Date

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateCreateOptions extends js.Object {
  @JSName("clone")
  var clone_FDateCreateOptions: js.UndefOr[Boolean] = js.native
  var fromUTC: js.UndefOr[Boolean] = js.native
  var future: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[String] = js.native
  var params: js.UndefOr[js.Object] = js.native
  var past: js.UndefOr[Boolean] = js.native
  var setUTC: js.UndefOr[Boolean] = js.native
}

object DateCreateOptions {
  @scala.inline
  def apply(): DateCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateCreateOptions]
  }
  @scala.inline
  implicit class DateCreateOptionsOps[Self <: DateCreateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clone")(js.undefined)
        ret
    }
    @scala.inline
    def withFromUTC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromUTC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUTC")(js.undefined)
        ret
    }
    @scala.inline
    def withFuture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("future")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFuture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("future")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPast(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("past")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("past")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUTC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetUTC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUTC")(js.undefined)
        ret
    }
  }
  
}

