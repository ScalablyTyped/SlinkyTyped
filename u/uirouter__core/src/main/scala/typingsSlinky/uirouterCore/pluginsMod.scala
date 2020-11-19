package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.routerMod.UIRouter
import typingsSlinky.uirouterCore.vanillaInterfaceMod.LocationPlugin
import typingsSlinky.uirouterCore.vanillaInterfaceMod.ServicesPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/vanilla/plugins", JSImport.Namespace)
@js.native
object pluginsMod extends js.Object {
  
  def hashLocationPlugin(router: UIRouter): LocationPlugin = js.native
  
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = js.native
  
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = js.native
  
  def servicesPlugin(router: UIRouter): ServicesPlugin = js.native
}
