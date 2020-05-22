package typingsSlinky.storybookApi.anon

import typingsSlinky.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Api extends js.Object {
  var api: API
  var state: typingsSlinky.storybookApi.mod.State
}

object Api {
  @scala.inline
  def apply(api: API, state: typingsSlinky.storybookApi.mod.State): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
}

