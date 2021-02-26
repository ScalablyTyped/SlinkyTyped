package typingsSlinky.vueRouter.routerMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.vue.pluginMod.PluginFunction
import typingsSlinky.vue.vueMod.Vue
import typingsSlinky.vue.vueMod.VueConstructor
import typingsSlinky.vueRouter.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-router/types/router", "VueRouter")
@js.native
class VueRouter () extends StObject {
  def this(options: RouterOptions) = this()
  
  def addRoutes(routes: js.Array[RouteConfig]): Unit = js.native
  
  def afterEach(hook: js.Function2[/* to */ Route, /* from */ Route, _]): js.Function = js.native
  
  var app: Vue = js.native
  
  def back(): Unit = js.native
  
  def beforeEach(guard: NavigationGuard[Vue]): js.Function = js.native
  
  def beforeResolve(guard: NavigationGuard[Vue]): js.Function = js.native
  
  var currentRoute: Route = js.native
  
  def forward(): Unit = js.native
  
  def getMatchedComponents(): js.Array[Component] = js.native
  def getMatchedComponents(to: RawLocation): js.Array[Component] = js.native
  def getMatchedComponents(to: Route): js.Array[Component] = js.native
  
  def go(n: Double): Unit = js.native
  
  var mode: RouterMode = js.native
  
  def onError(cb: ErrorHandler): Unit = js.native
  
  def onReady(cb: js.Function): Unit = js.native
  def onReady(cb: js.Function, errorCb: ErrorHandler): Unit = js.native
  
  var options: RouterOptions = js.native
  
  def push(location: RawLocation): Unit = js.native
  def push(location: RawLocation, onComplete: js.UndefOr[scala.Nothing], onAbort: ErrorHandler): Unit = js.native
  def push(location: RawLocation, onComplete: js.Function): Unit = js.native
  def push(location: RawLocation, onComplete: js.Function, onAbort: ErrorHandler): Unit = js.native
  @JSName("push")
  def push_Promise(location: RawLocation): js.Promise[Route] = js.native
  
  def replace(location: RawLocation): Unit = js.native
  def replace(location: RawLocation, onComplete: js.UndefOr[scala.Nothing], onAbort: ErrorHandler): Unit = js.native
  def replace(location: RawLocation, onComplete: js.Function): Unit = js.native
  def replace(location: RawLocation, onComplete: js.Function, onAbort: ErrorHandler): Unit = js.native
  @JSName("replace")
  def replace_Promise(location: RawLocation): js.Promise[Route] = js.native
  
  def resolve(to: RawLocation): Href = js.native
  def resolve(to: RawLocation, current: js.UndefOr[scala.Nothing], append: Boolean): Href = js.native
  def resolve(to: RawLocation, current: Route): Href = js.native
  def resolve(to: RawLocation, current: Route, append: Boolean): Href = js.native
}
/* static members */
object VueRouter {
  
  @JSImport("vue-router/types/router", "VueRouter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vue-router/types/router", "VueRouter.NavigationFailureType")
  @js.native
  def NavigationFailureType: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationFailureType * / any ]: vue-router.vue-router/types/router.NavigationFailureType}
    */ typingsSlinky.vueRouter.vueRouterStrings.NavigationFailureType with TopLevel[js.Any] = js.native
  @scala.inline
  def NavigationFailureType_=(
    x: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationFailureType * / any ]: vue-router.vue-router/types/router.NavigationFailureType}
    */ typingsSlinky.vueRouter.vueRouterStrings.NavigationFailureType with TopLevel[js.Any]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NavigationFailureType")(x.asInstanceOf[js.Any])
  
  @JSImport("vue-router/types/router", "VueRouter.install")
  @js.native
  def install: PluginFunction[scala.Nothing] = js.native
  @JSImport("vue-router/types/router", "VueRouter.install")
  @js.native
  def install(Vue: VueConstructor[Vue]): Unit = js.native
  @JSImport("vue-router/types/router", "VueRouter.install")
  @js.native
  def install(Vue: VueConstructor[Vue], options: scala.Nothing): Unit = js.native
  @scala.inline
  def install_=(x: PluginFunction[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("install")(x.asInstanceOf[js.Any])
  
  @JSImport("vue-router/types/router", "VueRouter.isNavigationFailure")
  @js.native
  def isNavigationFailure(error: js.Any): /* is vue-router.vue-router/types/router.NavigationFailure */ Boolean = js.native
  @JSImport("vue-router/types/router", "VueRouter.isNavigationFailure")
  @js.native
  def isNavigationFailure(error: js.Any, `type`: Double): /* is vue-router.vue-router/types/router.NavigationFailure */ Boolean = js.native
  
  @JSImport("vue-router/types/router", "VueRouter.version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
