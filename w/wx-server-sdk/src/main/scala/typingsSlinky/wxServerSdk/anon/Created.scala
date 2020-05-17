package typingsSlinky.wxServerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Created extends js.Object {
  var created: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1` = js.native
  var updated: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1` = js.native
}

object Created {
  @scala.inline
  def apply(
    created: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1`,
    updated: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1`
  ): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
  @scala.inline
  implicit class CreatedOps[Self <: Created] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(
      value: typingsSlinky.wxServerSdk.wxServerSdkNumbers.`0` | typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
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

