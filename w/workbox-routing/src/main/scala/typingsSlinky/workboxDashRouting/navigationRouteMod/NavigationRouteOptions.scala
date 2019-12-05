package typingsSlinky.workboxDashRouting.navigationRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationRouteOptions extends js.Object {
  var blacklist: js.UndefOr[js.Array[js.RegExp]] = js.undefined
  var whitelist: js.UndefOr[js.Array[js.RegExp]] = js.undefined
}

object NavigationRouteOptions {
  @scala.inline
  def apply(blacklist: js.Array[js.RegExp] = null, whitelist: js.Array[js.RegExp] = null): NavigationRouteOptions = {
    val __obj = js.Dynamic.literal()
    if (blacklist != null) __obj.updateDynamic("blacklist")(blacklist.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationRouteOptions]
  }
}

