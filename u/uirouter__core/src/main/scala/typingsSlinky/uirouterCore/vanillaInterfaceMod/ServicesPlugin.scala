package typingsSlinky.uirouterCore.vanillaInterfaceMod

import typingsSlinky.uirouterCore.coreservicesMod.InjectorLike
import typingsSlinky.uirouterCore.coreservicesMod.QLike
import typingsSlinky.uirouterCore.interfaceMod.UIRouterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesPlugin extends UIRouterPlugin {
  
  @JSName("$injector")
  var $injector: InjectorLike = js.native
  
  @JSName("$q")
  var $q: QLike = js.native
}
