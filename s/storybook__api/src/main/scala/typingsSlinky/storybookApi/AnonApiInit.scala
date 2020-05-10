package typingsSlinky.storybookApi

import typingsSlinky.storybookApi.mod.API
import typingsSlinky.storybookApi.versionsMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApiInit extends js.Object {
  var api: SubAPI = js.native
  var state: AnonDismissedVersionNotification = js.native
  def init(hasApi: API): js.Promise[Unit] = js.native
}

object AnonApiInit {
  @scala.inline
  def apply(api: SubAPI, init: API => js.Promise[Unit], state: AnonDismissedVersionNotification): AnonApiInit = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApiInit]
  }
  @scala.inline
  implicit class AnonApiInitOps[Self <: AnonApiInit] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withInit(value: API => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withState(value: AnonDismissedVersionNotification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

