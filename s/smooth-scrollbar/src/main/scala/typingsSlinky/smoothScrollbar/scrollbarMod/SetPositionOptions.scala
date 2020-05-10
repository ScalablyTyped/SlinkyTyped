package typingsSlinky.smoothScrollbar.scrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetPositionOptions extends js.Object {
  var withoutCallbacks: Boolean = js.native
}

object SetPositionOptions {
  @scala.inline
  def apply(withoutCallbacks: Boolean): SetPositionOptions = {
    val __obj = js.Dynamic.literal(withoutCallbacks = withoutCallbacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPositionOptions]
  }
  @scala.inline
  implicit class SetPositionOptionsOps[Self <: SetPositionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithoutCallbacks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

