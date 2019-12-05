package typingsSlinky.atUirouterCore.libVanillaInterfaceMod

import typingsSlinky.atUirouterCore.libCommonCoreservicesMod.LocationConfig
import typingsSlinky.atUirouterCore.libCommonCoreservicesMod.LocationServices
import typingsSlinky.atUirouterCore.libInterfaceMod.UIRouterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationPlugin extends UIRouterPlugin {
  var configuration: LocationConfig = js.native
  var service: LocationServices = js.native
}

