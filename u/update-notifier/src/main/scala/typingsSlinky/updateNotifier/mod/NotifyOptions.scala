package typingsSlinky.updateNotifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyOptions extends js.Object {
  /** Options object that will be passed to `boxen` */
  var boxenOptions: js.UndefOr[BoxenOptions] = js.native
  /** Defer showing the notification to after the process has exited */
  var defer: js.UndefOr[Boolean] = js.native
  /** Include the -g argument in the default message's npm i recommendation */
  var isGlobal: js.UndefOr[Boolean] = js.native
  /** Message that will be shown when an update is available */
  var message: js.UndefOr[String] = js.native
}

object NotifyOptions {
  @scala.inline
  def apply(): NotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyOptions]
  }
  @scala.inline
  implicit class NotifyOptionsOps[Self <: NotifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoxenOptions(value: BoxenOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxenOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoxenOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boxenOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDefer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defer")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGlobal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGlobal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGlobal")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
  }
  
}

