package typingsSlinky.wepy

import typingsSlinky.wepy.wepyStrings.facial
import typingsSlinky.wepy.wepyStrings.fingerPrint
import typingsSlinky.wepy.wepyStrings.speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCheckAuthMode extends js.Object {
  var checkAuthMode: fingerPrint | facial | speech = js.native
}

object AnonCheckAuthMode {
  @scala.inline
  def apply(checkAuthMode: fingerPrint | facial | speech): AnonCheckAuthMode = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckAuthMode]
  }
  @scala.inline
  implicit class AnonCheckAuthModeOps[Self <: AnonCheckAuthMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckAuthMode(value: fingerPrint | facial | speech): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkAuthMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

