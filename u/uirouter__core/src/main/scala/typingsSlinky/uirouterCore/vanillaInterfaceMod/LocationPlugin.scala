package typingsSlinky.uirouterCore.vanillaInterfaceMod

import typingsSlinky.uirouterCore.coreservicesMod.LocationConfig
import typingsSlinky.uirouterCore.coreservicesMod.LocationServices
import typingsSlinky.uirouterCore.interfaceMod.UIRouterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationPlugin extends UIRouterPlugin {
  
  var configuration: LocationConfig = js.native
  
  var service: LocationServices = js.native
}
