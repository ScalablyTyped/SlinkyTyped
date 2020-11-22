package typingsSlinky.uirouterAngularjs.mod

import typingsSlinky.uirouterCore.commonCommonMod.IInjectable
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "UrlRouterProvider")
@js.native
class UrlRouterProvider protected ()
  extends typingsSlinky.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider {
  /** @hidden */
  def this(/** @hidden */ router: typingsSlinky.uirouterCore.mod.UIRouter) = this()
}
/* static members */
@JSImport("@uirouter/angularjs", "UrlRouterProvider")
@js.native
object UrlRouterProvider extends js.Object {
  
  def injectableHandler(router: typingsSlinky.uirouterCore.mod.UIRouter, handler: IInjectable): UrlRuleHandlerFn = js.native
}
