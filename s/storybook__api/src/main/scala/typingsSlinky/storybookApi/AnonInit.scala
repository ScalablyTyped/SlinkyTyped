package typingsSlinky.storybookApi

import typingsSlinky.storybookApi.mod.API
import typingsSlinky.storybookApi.shortcutsMod.SubAPI
import typingsSlinky.storybookApi.shortcutsMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInit extends js.Object {
  var api: SubAPI = js.native
  var state: SubState = js.native
  def init(hasApi: API): Unit = js.native
}

object AnonInit {
  @scala.inline
  def apply(api: SubAPI, init: API => Unit, state: SubState): AnonInit = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInit]
  }
  @scala.inline
  implicit class AnonInitOps[Self <: AnonInit] (val x: Self) extends AnyVal {
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
    def withInit(value: API => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withState(value: SubState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

