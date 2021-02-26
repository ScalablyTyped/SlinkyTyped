package typingsSlinky.uirouterAngularjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uirouterCoreLibRouterAugmentingMod {
  
  @js.native
  trait UIRouter extends StObject {
    
    /** @hidden */
    var stateProvider: typingsSlinky.uirouterAngularjs.stateProviderMod.StateProvider = js.native
    
    /** @hidden */
    var urlRouterProvider: typingsSlinky.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider = js.native
  }
  object UIRouter {
    
    @scala.inline
    def apply(
      stateProvider: typingsSlinky.uirouterAngularjs.stateProviderMod.StateProvider,
      urlRouterProvider: typingsSlinky.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider
    ): typingsSlinky.uirouterAngularjs.mod.uirouterCoreLibRouterAugmentingMod.UIRouter = {
      val __obj = js.Dynamic.literal(stateProvider = stateProvider.asInstanceOf[js.Any], urlRouterProvider = urlRouterProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.uirouterAngularjs.mod.uirouterCoreLibRouterAugmentingMod.UIRouter]
    }
    
    @scala.inline
    implicit class UIRouterMutableBuilder[Self <: typingsSlinky.uirouterAngularjs.mod.uirouterCoreLibRouterAugmentingMod.UIRouter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStateProvider(value: typingsSlinky.uirouterAngularjs.stateProviderMod.StateProvider): Self = StObject.set(x, "stateProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlRouterProvider(value: typingsSlinky.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider): Self = StObject.set(x, "urlRouterProvider", value.asInstanceOf[js.Any])
    }
  }
}
