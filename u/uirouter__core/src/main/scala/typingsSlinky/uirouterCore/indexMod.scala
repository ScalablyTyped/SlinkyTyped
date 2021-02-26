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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMod {
  
  @JSImport("@uirouter/core/lib/vanilla/index", "BaseLocationServices")
  @js.native
  abstract class BaseLocationServices protected ()
    extends typingsSlinky.uirouterCore.baseLocationServiceMod.BaseLocationServices {
    def this(router: UIRouter, fireAfterUpdate: Boolean) = this()
  }
  
  @JSImport("@uirouter/core/lib/vanilla/index", "BrowserLocationConfig")
  @js.native
  class BrowserLocationConfig ()
    extends typingsSlinky.uirouterCore.browserLocationConfigMod.BrowserLocationConfig {
    def this(router: js.Any) = this()
    def this(router: js.UndefOr[scala.Nothing], _isHtml5: Boolean) = this()
    def this(router: js.Any, _isHtml5: Boolean) = this()
  }
  
  @JSImport("@uirouter/core/lib/vanilla/index", "HashLocationService")
  @js.native
  class HashLocationService protected ()
    extends typingsSlinky.uirouterCore.hashLocationServiceMod.HashLocationService {
    def this(router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/vanilla/index", "MemoryLocationConfig")
  @js.native
  class MemoryLocationConfig ()
    extends typingsSlinky.uirouterCore.memoryLocationConfigMod.MemoryLocationConfig
  
  @JSImport("@uirouter/core/lib/vanilla/index", "MemoryLocationService")
  @js.native
  class MemoryLocationService protected ()
    extends typingsSlinky.uirouterCore.memoryLocationServiceMod.MemoryLocationService {
    def this(router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/vanilla/index", "PushStateLocationService")
  @js.native
  class PushStateLocationService protected ()
    extends typingsSlinky.uirouterCore.pushStateLocationServiceMod.PushStateLocationService {
    def this(router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/vanilla/index", "buildUrl")
  @js.native
  def buildUrl(loc: LocationServices): String = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/index", "getParams")
  @js.native
  def getParams(queryString: String): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/index", "hashLocationPlugin")
  @js.native
  def hashLocationPlugin(router: UIRouter): LocationPlugin = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/index", "$injector")
  @js.native
  val injector: InjectorLike = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/index", "keyValsToObjectR")
  @js.native
  def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[_, _]): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/index", "locationPluginFactory")
  @js.native
  def locationPluginFactory(
    name: String,
    isHtml5: Boolean,
    serviceClass: Instantiable,
    configurationClass: InstantiableLocationConfig
  ): js.Function1[/* uiRouter */ UIRouter, Configuration] = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/index", "memoryLocationPlugin")
  @js.native
  def memoryLocationPlugin(router: UIRouter): LocationPlugin = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/index", "parseUrl")
  @js.native
  def parseUrl(url: String): Hash = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/index", "pushStateLocationPlugin")
  @js.native
  def pushStateLocationPlugin(router: UIRouter): LocationPlugin = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/index", "$q")
  @js.native
  val q: QLike = js.native
  
  @JSImport("@uirouter/core/lib/vanilla/index", "servicesPlugin")
  @js.native
  def servicesPlugin(router: UIRouter): ServicesPlugin = js.native
}
