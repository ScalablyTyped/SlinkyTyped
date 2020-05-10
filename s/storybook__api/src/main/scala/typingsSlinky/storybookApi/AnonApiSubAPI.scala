package typingsSlinky.storybookApi

import typingsSlinky.storybookApi.channelMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApiSubAPI extends js.Object {
  var api: SubAPI = js.native
}

object AnonApiSubAPI {
  @scala.inline
  def apply(api: SubAPI): AnonApiSubAPI = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApiSubAPI]
  }
  @scala.inline
  implicit class AnonApiSubAPIOps[Self <: AnonApiSubAPI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: SubAPI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

