package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.anon.InstantiableT
import typingsSlinky.uirouterCore.coreservicesMod.LocationConfig
import typingsSlinky.uirouterCore.coreservicesMod.LocationServices
import typingsSlinky.uirouterCore.globalsMod.UIRouterGlobals
import typingsSlinky.uirouterCore.interfaceMod.Disposable
import typingsSlinky.uirouterCore.interfaceMod.UIRouterPlugin
import typingsSlinky.uirouterCore.stateRegistryMod.StateRegistry
import typingsSlinky.uirouterCore.stateServiceMod.StateService
import typingsSlinky.uirouterCore.traceMod.Trace_
import typingsSlinky.uirouterCore.transitionServiceMod.TransitionService
import typingsSlinky.uirouterCore.urlMatcherFactoryMod.UrlMatcherFactory
import typingsSlinky.uirouterCore.urlRouterMod.UrlRouter
import typingsSlinky.uirouterCore.urlServiceMod.UrlService
import typingsSlinky.uirouterCore.viewViewMod.ViewService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/router", JSImport.Namespace)
@js.native
object routerMod extends js.Object {
  
  @js.native
  /**
    * Creates a new `UIRouter` object
    *
    * @param locationService a [[LocationServices]] implementation
    * @param locationConfig a [[LocationConfig]] implementation
    * @internal
    */
  class UIRouter () extends js.Object {
    def this(locationService: LocationServices) = this()
    def this(locationService: js.UndefOr[scala.Nothing], locationConfig: LocationConfig) = this()
    def this(locationService: LocationServices, locationConfig: LocationConfig) = this()
    
    /** @internal */ @JSName("$id")
    var $id: Double = js.native
    
    /** @internal */ var _disposables: js.Any = js.native
    
    /** @internal */ var _disposed: Boolean = js.native
    
    /** @internal plugin instances are registered here */
    var _plugins: js.Any = js.native
    
    /** Registers an object to be notified when the router is disposed */
    def disposable(disposable: Disposable): Unit = js.native
    
    /**
      * Disposes this router instance
      *
      * When called, clears resources retained by the router by calling `dispose(this)` on all
      * registered [[disposable]] objects.
      *
      * Or, if a `disposable` object is provided, calls `dispose(this)` on that object only.
      *
      * @internal
      * @param disposable (optional) the disposable to dispose
      */
    def dispose(): Unit = js.native
    def dispose(disposable: js.Any): Unit = js.native
    
    /**
      * Returns all registered plugins
      * @return all registered plugins
      */
    def getPlugin(): js.Array[UIRouterPlugin] = js.native
    /**
      * Returns a plugin registered with the given `pluginName`.
      *
      * @param pluginName the name of the plugin to get
      * @return the plugin, or undefined
      */
    def getPlugin(pluginName: String): UIRouterPlugin = js.native
    
    /** An object that contains global router state, such as the current state and params */
    var globals: UIRouterGlobals = js.native
    
    var locationConfig: LocationConfig = js.native
    
    var locationService: LocationServices = js.native
    
    /** Add plugin (as javascript constructor function) */
    /** Add plugin (as javascript factory function) */
    def plugin[T /* <: UIRouterPlugin */](
      plugin: (js.Function2[/* router */ this.type, /* options */ js.UndefOr[js.Any], Unit]) | PluginFactory[T]
    ): T = js.native
    def plugin[T /* <: UIRouterPlugin */](
      plugin: (js.Function2[/* router */ this.type, /* options */ js.UndefOr[js.Any], Unit]) | PluginFactory[T],
      options: js.Any
    ): T = js.native
    /** Add plugin (as ES6 class) */
    def plugin[T /* <: UIRouterPlugin */](plugin: InstantiableT[T]): T = js.native
    def plugin[T /* <: UIRouterPlugin */](plugin: InstantiableT[T], options: js.Any): T = js.native
    
    /** Provides a registry for states, and related registration services */
    var stateRegistry: StateRegistry = js.native
    
    /** Provides services related to states */
    var stateService: StateService = js.native
    
    /** Enable/disable tracing to the javascript console */
    var trace: Trace_ = js.native
    
    /** A service that exposes global Transition Hooks */
    var transitionService: TransitionService = js.native
    
    /**
      * Deprecated for public use. Use [[urlService]] instead.
      * @deprecated Use [[urlService]] instead
      */
    var urlMatcherFactory: UrlMatcherFactory = js.native
    
    /**
      * Deprecated for public use. Use [[urlService]] instead.
      * @deprecated Use [[urlService]] instead
      */
    var urlRouter: UrlRouter = js.native
    
    /** Provides services related to the URL */
    var urlService: UrlService = js.native
    
    /** Provides services related to ui-view synchronization */
    var viewService: ViewService = js.native
  }
  
  type PluginFactory[T] = js.Function2[/* router */ UIRouter, /* options */ js.UndefOr[js.Any], T]
}
