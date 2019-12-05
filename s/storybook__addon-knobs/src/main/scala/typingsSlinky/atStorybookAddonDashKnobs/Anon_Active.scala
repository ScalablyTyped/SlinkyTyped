package typingsSlinky.atStorybookAddonDashKnobs

import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.emit
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.getQueryParam
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.off
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.on
import typingsSlinky.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.setQueryParams
import typingsSlinky.atStorybookApi.atStorybookApiMod.API
import typingsSlinky.propDashTypes.propDashTypesMod.Validator
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: Validator[Boolean]
  var api: Validator[Pick[API, on | off | emit | getQueryParam | setQueryParams]]
  var onReset: Validator[js.UndefOr[js.Object]]
}

object Anon_Active {
  @scala.inline
  def apply(
    active: Validator[Boolean],
    api: Validator[Pick[API, on | off | emit | getQueryParam | setQueryParams]],
    onReset: Validator[js.UndefOr[js.Object]]
  ): Anon_Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Active]
  }
}

