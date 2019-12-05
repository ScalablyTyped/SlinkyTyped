package typingsSlinky.atUirouterCore.libVanillaInterfaceMod

import typingsSlinky.atUirouterCore.libCommonCoreservicesMod.$InjectorLike
import typingsSlinky.atUirouterCore.libCommonCoreservicesMod.$QLike
import typingsSlinky.atUirouterCore.libInterfaceMod.UIRouterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicesPlugin extends UIRouterPlugin {
  @JSName("$injector")
  var $injector: $InjectorLike = js.native
  @JSName("$q")
  var $q: $QLike = js.native
}

