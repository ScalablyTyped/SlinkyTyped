package typingsSlinky.steamLogin.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SteamRequest
  extends Request[ParamsDictionary, js.Any, js.Any, Query] {
  var logout: js.UndefOr[
    js.Function0[
      js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], js.Function0[Unit]]
    ]
  ] = js.native
  var user: js.UndefOr[SteamUser] = js.native
}

