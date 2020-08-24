package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.anon.Configuration
import typingsSlinky.uirouterCore.anon.Hash
import typingsSlinky.uirouterCore.anon.Instantiable
import typingsSlinky.uirouterCore.anon.InstantiableLocationConfig
import typingsSlinky.uirouterCore.coreservicesMod.InjectorLike
import typingsSlinky.uirouterCore.coreservicesMod.LocationServices
import typingsSlinky.uirouterCore.coreservicesMod.QLike
import typingsSlinky.uirouterCore.routerMod.UIRouter
import typingsSlinky.uirouterCore.vanillaInterfaceMod.LocationPlugin
import typingsSlinky.uirouterCore.vanillaInterfaceMod.ServicesPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla", JSImport.Namespace)
@js.native
object vanillaMod extends js.Object {
  @js.native
  abstract class BaseLocationServices protected ()
    extends typingsSlinky.uirouterCore.indexMod.BaseLocationServices {
    def this(router: UIRouter, fireAfterUpdate: Boolean) = this()
  }
  
  @js.native
  class BrowserLocationConfig ()
    extends typingsSlinky.uirouterCore.indexMod.BrowserLocationConfig {
    def this(router: js.Any) = this()
    def this(router: js.UndefOr[scala.Nothing], _isHtml5: Boolean) = this()
    def this(router: js.Any, _isHtml5: Boolean) = this()
  }
  
  @js.native
  class HashLocationService protected ()
    extends typingsSlinky.uirouterCore.indexMod.HashLocationService {
    def this(router: UIRouter) = this()
  }
  
  @js.native
  class MemoryLocationConfig ()
    extends typingsSlinky.uirouterCore.memoryLocationConfigMod.MemoryLocationConfig
  
  @js.native
  class MemoryLocationService protected ()
    extends typingsSlinky.uirouterCore.indexMod.MemoryLocationService {
    def this(router: UIRouter) = this()
  }
  
  @js.native
  class PushStateLocationService protected ()
    extends typingsSlinky.uirouterCore.indexMod.PushStateLocationService {
    def this(router: UIRouter) = this()
  }
  
  @JSName("$injector")
  val injector: InjectorLike = js.native
  @JSName("$q")
  val q: QLike = js.native
  def buildUrl(loc: LocationServices): String = js.native
  def getParams(queryString: String): js.Any = js.native
  def hashLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[_, _]): js.Any = js.native
  def locationPluginFactory(
    name: String,
    isHtml5: Boolean,
    serviceClass: Instantiable,
    configurationClass: InstantiableLocationConfig
  ): js.Function1[/* uiRouter */ UIRouter, Configuration] = js.native
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def parseUrl(url: String): Hash = js.native
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = js.native
  def servicesPlugin(router: UIRouter): ServicesPlugin = js.native
}

