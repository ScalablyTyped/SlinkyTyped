package typingsSlinky.sendmail.mod

import typingsSlinky.sendmail.AnonDebug
import typingsSlinky.sendmail.AnonKeySelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** Default: localhost */
  var devHost: js.UndefOr[String] = js.native
  /** Default: False */
  var devPort: js.UndefOr[Double | Boolean] = js.native
  /** Default: False */
  var dkim: js.UndefOr[Boolean | AnonKeySelector] = js.native
  var logger: js.UndefOr[AnonDebug] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  /** Default: -1 - extra smtp host after resolveMX */
  var smtpHost: js.UndefOr[String | Double] = js.native
  /** Default: 25 */
  var smtpPort: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devHost")(js.undefined)
        ret
    }
    @scala.inline
    def withDevPort(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devPort")(js.undefined)
        ret
    }
    @scala.inline
    def withDkim(value: Boolean | AnonKeySelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDkim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dkim")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: AnonDebug): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withSilent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSilent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silent")(js.undefined)
        ret
    }
    @scala.inline
    def withSmtpHost(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smtpHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmtpHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smtpHost")(js.undefined)
        ret
    }
    @scala.inline
    def withSmtpPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smtpPort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmtpPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smtpPort")(js.undefined)
        ret
    }
  }
  
}

