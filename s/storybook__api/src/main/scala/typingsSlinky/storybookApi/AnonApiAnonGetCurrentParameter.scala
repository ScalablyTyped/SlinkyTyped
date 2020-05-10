package typingsSlinky.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApiAnonGetCurrentParameter extends js.Object {
  var api: AnonGetCurrentParameter = js.native
  var state: AnonStoriesConfigured = js.native
}

object AnonApiAnonGetCurrentParameter {
  @scala.inline
  def apply(api: AnonGetCurrentParameter, state: AnonStoriesConfigured): AnonApiAnonGetCurrentParameter = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApiAnonGetCurrentParameter]
  }
  @scala.inline
  implicit class AnonApiAnonGetCurrentParameterOps[Self <: AnonApiAnonGetCurrentParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi(value: AnonGetCurrentParameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: AnonStoriesConfigured): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

