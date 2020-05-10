package typingsSlinky.wxJsSdkDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSearchBeaconsConfig extends WxBaseRequestConfig {
  @JSName("complete")
  def complete_MOnSearchBeaconsConfig(argv: js.Any): Unit = js.native
}

object OnSearchBeaconsConfig {
  @scala.inline
  def apply(complete: js.Any => Unit): OnSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    __obj.asInstanceOf[OnSearchBeaconsConfig]
  }
  @scala.inline
  implicit class OnSearchBeaconsConfigOps[Self <: OnSearchBeaconsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

