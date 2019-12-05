package typingsSlinky.steamDashLogin.steamDashLoginMod

import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typingsSlinky.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SteamRequest
  extends Request[ParamsDictionary, js.Any, js.Any] {
  var logout: js.UndefOr[
    js.Function0[
      js.Function1[
        /* req */ typingsSlinky.express.expressMod.Request[ParamsDictionary], 
        js.Function0[Unit]
      ]
    ]
  ] = js.native
  var user: js.UndefOr[SteamUser] = js.native
}

