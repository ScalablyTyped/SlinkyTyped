package typingsSlinky.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0` extends js.Object {
  var updated: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1` = js.native
}

object `0` {
  @scala.inline
  def apply(
    updated: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1`
  ): `0` = {
    val __obj = js.Dynamic.literal(updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdated(
      value: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

