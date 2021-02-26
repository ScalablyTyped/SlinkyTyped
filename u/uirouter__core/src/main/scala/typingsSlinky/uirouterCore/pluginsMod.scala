package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.routerMod.UIRouter
import typingsSlinky.uirouterCore.vanillaInterfaceMod.LocationPlugin
import typingsSlinky.uirouterCore.vanillaInterfaceMod.ServicesPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMod {
  
  @JSImport("@uirouter/core/lib/vanilla/plugins", "hashLocationPlugin")
  @js.native
  def hashLocationPlugin(router: UIRouter): LocationPlugin = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/plugins", "memoryLocationPlugin")
  @js.native
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/plugins", "pushStateLocationPlugin")
  @js.native
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/plugins", "servicesPlugin")
  @js.native
  def servicesPlugin(router: UIRouter): ServicesPlugin = js.native
}
