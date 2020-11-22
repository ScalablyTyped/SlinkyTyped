package typingsSlinky.vueRouter

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.vue.pluginMod.PluginFunction
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import typingsSlinky.vueRouter.routerMod.RouterOptions
import typingsSlinky.vueRouter.routerMod.VueRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-router", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object NavigationFailureType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.vueRouter.routerMod.NavigationFailureType with Double] = js.native
    
    /* 4 */ val aborted: typingsSlinky.vueRouter.routerMod.NavigationFailureType.aborted with Double = js.native
    
    /* 8 */ val cancelled: typingsSlinky.vueRouter.routerMod.NavigationFailureType.cancelled with Double = js.native
    
    /* 16 */ val duplicated: typingsSlinky.vueRouter.routerMod.NavigationFailureType.duplicated with Double = js.native
    
    /* 2 */ val redirected: typingsSlinky.vueRouter.routerMod.NavigationFailureType.redirected with Double = js.native
  }
  
  @js.native
  class default () extends VueRouter {
    def this(options: RouterOptions) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var NavigationFailureType: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationFailureType * / any ]: vue-router.vue-router/types/router.NavigationFailureType}
      */ typingsSlinky.vueRouter.vueRouterStrings.default with TopLevel[js.Any] = js.native
    
    def install(Vue: VueConstructor[Vue]): Unit = js.native
    def install(Vue: VueConstructor[Vue], options: scala.Nothing): Unit = js.native
    @JSName("install")
    var install_Original: PluginFunction[scala.Nothing] = js.native
    
    def isNavigationFailure(error: js.Any): /* is vue-router.vue-router/types/router.NavigationFailure */ Boolean = js.native
    def isNavigationFailure(error: js.Any, `type`: Double): /* is vue-router.vue-router/types/router.NavigationFailure */ Boolean = js.native
    
    var version: String = js.native
  }
}
