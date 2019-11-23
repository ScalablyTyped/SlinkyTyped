package typingsSlinky.atStorybookApi

import typingsSlinky.atStorybookApi.atStorybookApiMod.State
import typingsSlinky.atStorybookApi.atStorybookApiStrings.development
import typingsSlinky.atStorybookApi.atStorybookApiStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Development extends js.Object {
  var mode: js.UndefOr[production | development] = js.undefined
  var state: State
}

object Anon_Development {
  @scala.inline
  def apply(state: State, mode: production | development = null): Anon_Development = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Development]
  }
}

