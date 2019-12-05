package typingsSlinky.atUirouterCore

import typingsSlinky.atUirouterCore.libRouterMod.UIRouter
import typingsSlinky.atUirouterCore.libVanillaInterfaceMod.LocationPlugin
import typingsSlinky.atUirouterCore.libVanillaInterfaceMod.ServicesPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/plugins", JSImport.Namespace)
@js.native
object libVanillaPluginsMod extends js.Object {
  def hashLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def servicesPlugin(router: UIRouter): ServicesPlugin = js.native
}

