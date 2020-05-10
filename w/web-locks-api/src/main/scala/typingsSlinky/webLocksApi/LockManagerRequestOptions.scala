package typingsSlinky.webLocksApi

import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.webLocksApi.webLocksApiStrings.exclusive
import typingsSlinky.webLocksApi.webLocksApiStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LockManagerRequestOptions extends js.Object {
  var ifAvailable: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[exclusive | shared] = js.native
  var signal: js.UndefOr[AbortSignal] = js.native
  var steal: js.UndefOr[Boolean] = js.native
}

object LockManagerRequestOptions {
  @scala.inline
  def apply(): LockManagerRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockManagerRequestOptions]
  }
  @scala.inline
  implicit class LockManagerRequestOptionsOps[Self <: LockManagerRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIfAvailable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIfAvailable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ifAvailable")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: exclusive | shared): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withSignal(value: AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
    @scala.inline
    def withSteal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steal")(js.undefined)
        ret
    }
  }
  
}

