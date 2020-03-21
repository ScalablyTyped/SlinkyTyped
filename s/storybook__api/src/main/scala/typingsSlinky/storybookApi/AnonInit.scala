package typingsSlinky.storybookApi

import typingsSlinky.storybookApi.mod.API
import typingsSlinky.storybookApi.shortcutsMod.SubAPI
import typingsSlinky.storybookApi.shortcutsMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInit extends js.Object {
  var api: SubAPI
  var state: SubState
  def init(hasApi: API): Unit
}

object AnonInit {
  @scala.inline
  def apply(api: SubAPI, init: API => Unit, state: SubState): AnonInit = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInit]
  }
}

