package typingsSlinky.semanticUiTab

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab.ClassNameSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab.ClassNameSettings.Param
import typingsSlinky.semanticUiTab.SemanticUI.Tab.ErrorSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab.MetadataSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab.SelectorSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab.TemplatesSettings
import typingsSlinky.semanticUiTab.anon.PartialPickImplkeyofImpl
import typingsSlinky.semanticUiTab.anon.PartialPickImplkeyofImplActive
import typingsSlinky.semanticUiTab.anon.PartialPickImplkeyofImplApi
import typingsSlinky.semanticUiTab.anon.PartialPickImplkeyofImplLoaded
import typingsSlinky.semanticUiTab.anon.PartialPickImplkeyofImplParent
import typingsSlinky.semanticUiTab.anon.PickImplactive
import typingsSlinky.semanticUiTab.anon.PickImplalwaysRefresh
import typingsSlinky.semanticUiTab.anon.PickImplapi
import typingsSlinky.semanticUiTab.anon.PickImplapiSettings
import typingsSlinky.semanticUiTab.anon.PickImplauto
import typingsSlinky.semanticUiTab.anon.PickImplcache
import typingsSlinky.semanticUiTab.anon.PickImplcacheType
import typingsSlinky.semanticUiTab.anon.PickImplchildrenOnly
import typingsSlinky.semanticUiTab.anon.PickImplclassName
import typingsSlinky.semanticUiTab.anon.PickImplcontext
import typingsSlinky.semanticUiTab.anon.PickImpldeactivate
import typingsSlinky.semanticUiTab.anon.PickImpldebug
import typingsSlinky.semanticUiTab.anon.PickImplerror
import typingsSlinky.semanticUiTab.anon.PickImplevaluateScripts
import typingsSlinky.semanticUiTab.anon.PickImplhistory
import typingsSlinky.semanticUiTab.anon.PickImplhistoryType
import typingsSlinky.semanticUiTab.anon.PickImplignoreFirstLoad
import typingsSlinky.semanticUiTab.anon.PickImplloadOnce
import typingsSlinky.semanticUiTab.anon.PickImplloaded
import typingsSlinky.semanticUiTab.anon.PickImplloading
import typingsSlinky.semanticUiTab.anon.PickImplmaxDepth
import typingsSlinky.semanticUiTab.anon.PickImplmetadata
import typingsSlinky.semanticUiTab.anon.PickImplmethod
import typingsSlinky.semanticUiTab.anon.PickImplmissingTab
import typingsSlinky.semanticUiTab.anon.PickImplname
import typingsSlinky.semanticUiTab.anon.PickImplnamespace
import typingsSlinky.semanticUiTab.anon.PickImplnoContent
import typingsSlinky.semanticUiTab.anon.PickImplonFirstLoad
import typingsSlinky.semanticUiTab.anon.PickImplonLoad
import typingsSlinky.semanticUiTab.anon.PickImplonRequest
import typingsSlinky.semanticUiTab.anon.PickImplonVisible
import typingsSlinky.semanticUiTab.anon.PickImplparent
import typingsSlinky.semanticUiTab.anon.PickImplpath
import typingsSlinky.semanticUiTab.anon.PickImplpathPath
import typingsSlinky.semanticUiTab.anon.PickImplperformance
import typingsSlinky.semanticUiTab.anon.PickImplpromise
import typingsSlinky.semanticUiTab.anon.PickImplrecursion
import typingsSlinky.semanticUiTab.anon.PickImplselector
import typingsSlinky.semanticUiTab.anon.PickImplsilent
import typingsSlinky.semanticUiTab.anon.PickImplstate
import typingsSlinky.semanticUiTab.anon.PickImpltab
import typingsSlinky.semanticUiTab.anon.PickImpltabs
import typingsSlinky.semanticUiTab.anon.PickImpltemplates
import typingsSlinky.semanticUiTab.anon.PickImplverbose
import typingsSlinky.semanticUiTab.semanticUiTabBooleans.`false`
import typingsSlinky.semanticUiTab.semanticUiTabStrings.DOM
import typingsSlinky.semanticUiTab.semanticUiTabStrings.`cache add`
import typingsSlinky.semanticUiTab.semanticUiTabStrings.`cache read`
import typingsSlinky.semanticUiTab.semanticUiTabStrings.`cache remove`
import typingsSlinky.semanticUiTab.semanticUiTabStrings.`change tab`
import typingsSlinky.semanticUiTab.semanticUiTabStrings.`get path`
import typingsSlinky.semanticUiTab.semanticUiTabStrings.`is tab`
import typingsSlinky.semanticUiTab.semanticUiTabStrings.`set state`
import typingsSlinky.semanticUiTab.semanticUiTabStrings.all
import typingsSlinky.semanticUiTab.semanticUiTabStrings.alwaysRefresh
import typingsSlinky.semanticUiTab.semanticUiTabStrings.apiSettings
import typingsSlinky.semanticUiTab.semanticUiTabStrings.auto
import typingsSlinky.semanticUiTab.semanticUiTabStrings.cache
import typingsSlinky.semanticUiTab.semanticUiTabStrings.cacheType
import typingsSlinky.semanticUiTab.semanticUiTabStrings.childrenOnly
import typingsSlinky.semanticUiTab.semanticUiTabStrings.className
import typingsSlinky.semanticUiTab.semanticUiTabStrings.context
import typingsSlinky.semanticUiTab.semanticUiTabStrings.deactivate
import typingsSlinky.semanticUiTab.semanticUiTabStrings.debug
import typingsSlinky.semanticUiTab.semanticUiTabStrings.destroy
import typingsSlinky.semanticUiTab.semanticUiTabStrings.error
import typingsSlinky.semanticUiTab.semanticUiTabStrings.evaluateScripts
import typingsSlinky.semanticUiTab.semanticUiTabStrings.hash
import typingsSlinky.semanticUiTab.semanticUiTabStrings.history
import typingsSlinky.semanticUiTab.semanticUiTabStrings.historyType
import typingsSlinky.semanticUiTab.semanticUiTabStrings.html
import typingsSlinky.semanticUiTab.semanticUiTabStrings.ignoreFirstLoad
import typingsSlinky.semanticUiTab.semanticUiTabStrings.loadOnce
import typingsSlinky.semanticUiTab.semanticUiTabStrings.maxDepth
import typingsSlinky.semanticUiTab.semanticUiTabStrings.metadata
import typingsSlinky.semanticUiTab.semanticUiTabStrings.name
import typingsSlinky.semanticUiTab.semanticUiTabStrings.namespace
import typingsSlinky.semanticUiTab.semanticUiTabStrings.onFirstLoad
import typingsSlinky.semanticUiTab.semanticUiTabStrings.onLoad
import typingsSlinky.semanticUiTab.semanticUiTabStrings.onRequest
import typingsSlinky.semanticUiTab.semanticUiTabStrings.onVisible
import typingsSlinky.semanticUiTab.semanticUiTabStrings.once
import typingsSlinky.semanticUiTab.semanticUiTabStrings.path
import typingsSlinky.semanticUiTab.semanticUiTabStrings.performance
import typingsSlinky.semanticUiTab.semanticUiTabStrings.response
import typingsSlinky.semanticUiTab.semanticUiTabStrings.selector
import typingsSlinky.semanticUiTab.semanticUiTabStrings.setting
import typingsSlinky.semanticUiTab.semanticUiTabStrings.siblings
import typingsSlinky.semanticUiTab.semanticUiTabStrings.silent
import typingsSlinky.semanticUiTab.semanticUiTabStrings.state
import typingsSlinky.semanticUiTab.semanticUiTabStrings.templates
import typingsSlinky.semanticUiTab.semanticUiTabStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Tab extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Sets cached HTML for path
      */
    def apply(behavior: `cache add`, path: String, html: String): JQuery = js.native
    /**
      * Returns cached HTML for path
      */
    def apply(behavior: `cache read`, path: String): String | `false` = js.native
    /**
      * Removes cached HTML for path
      */
    def apply(behavior: `cache remove`, path: String): JQuery = js.native
    // Documentation says this exists but it does not.
    // /**
    //  * Attaches tab action to given selector. Default event if none specified is toggle
    //  */
    // (behavior: 'attach events', selector: Selector, event?: string): JQuery;
    /**
      * Changes tab to path
      */
    def apply(behavior: `change tab`, path: String): JQuery = js.native
    /**
      * Returns current path
      */
    def apply(behavior: `get path`): String = js.native
    /**
      * Returns whether tab exists
      */
    def apply(behavior: `is tab`): Boolean = js.native
    /**
      * Sets current path to state
      */
    def apply(behavior: `set state`, path: String): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    def apply(behavior: setting, name: alwaysRefresh, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: alwaysRefresh, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: apiSettings, value: ApiSettings): JQuery = js.native
    def apply(behavior: setting, name: auto, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: auto, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: cacheType, value: js.UndefOr[scala.Nothing]): response | DOM | html = js.native
    def apply(behavior: setting, name: cacheType, value: DOM): JQuery = js.native
    def apply(behavior: setting, name: cacheType, value: html): JQuery = js.native
    def apply(behavior: setting, name: cacheType, value: response): JQuery = js.native
    def apply(behavior: setting, name: cache, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: cache, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: childrenOnly, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: childrenOnly, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
    def apply(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): `false` | String | JQuery = js.native
    def apply(behavior: setting, name: context, value: String): JQuery = js.native
    def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
    def apply(behavior: setting, name: context, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: deactivate, value: js.UndefOr[scala.Nothing]): siblings | all = js.native
    def apply(behavior: setting, name: deactivate, value: all): JQuery = js.native
    def apply(behavior: setting, name: deactivate, value: siblings): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
    def apply(behavior: setting, name: evaluateScripts, value: js.UndefOr[scala.Nothing]): once | Boolean = js.native
    def apply(behavior: setting, name: evaluateScripts, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: evaluateScripts, value: once): JQuery = js.native
    def apply(behavior: setting, name: historyType, value: js.UndefOr[scala.Nothing]): hash | state = js.native
    def apply(behavior: setting, name: historyType, value: hash): JQuery = js.native
    def apply(behavior: setting, name: historyType, value: state): JQuery = js.native
    def apply(behavior: setting, name: history, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: history, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: ignoreFirstLoad, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: ignoreFirstLoad, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: loadOnce, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: loadOnce, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: maxDepth, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: maxDepth, value: Double): JQuery = js.native
    def apply(behavior: setting, name: metadata, value: js.UndefOr[scala.Nothing]): MetadataSettings = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: onFirstLoad, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[
        /* this */ JQuery, 
        /* tabPath */ String, 
        /* parameterArray */ js.Array[_], 
        /* historyEvent */ js.Any, 
        Unit
      ] = js.native
    def apply(
      behavior: setting,
      name: onFirstLoad,
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[_], 
          /* historyEvent */ js.Any, 
          Unit
        ]
    ): JQuery = js.native
    def apply(behavior: setting, name: onLoad, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[
        /* this */ JQuery, 
        /* tabPath */ String, 
        /* parameterArray */ js.Array[_], 
        /* historyEvent */ js.Any, 
        Unit
      ] = js.native
    def apply(
      behavior: setting,
      name: onLoad,
      value: js.ThisFunction3[
          /* this */ JQuery, 
          /* tabPath */ String, 
          /* parameterArray */ js.Array[_], 
          /* historyEvent */ js.Any, 
          Unit
        ]
    ): JQuery = js.native
    def apply(behavior: setting, name: onRequest, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = js.native
    def apply(
      behavior: setting,
      name: onRequest,
      value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = js.native
    def apply(
      behavior: setting,
      name: onVisible,
      value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: path, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
    def apply(behavior: setting, name: path, value: String): JQuery = js.native
    def apply(behavior: setting, name: path, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: templates, value: js.UndefOr[scala.Nothing]): TemplatesSettings = js.native
    def apply(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: TabSettings): JQuery = js.native
    def apply(settings: TabSettings): JQuery = js.native
    
    var settings: TabSettings = js.native
  }
  object Tab {
    
    object ClassNameSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String = js.native
        
        /**
          * @default 'loading'
          */
        var loading: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(active: String, loading: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplloading | PickImplactive) with PartialPickImplkeyofImplActive
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'You attempted to load content without API module'
          */
        var api: String = js.native
        
        /**
          * @default 'The method you called is not defined'
          */
        var method: String = js.native
        
        /**
          * @default 'Activated tab cannot be found for this context.'
          */
        var missingTab: String = js.native
        
        /**
          * @default 'The tab you specified is missing a content url.'
          */
        var noContent: String = js.native
        
        /**
          * @default 'History enabled, but no path was specified'
          */
        var path: String = js.native
        
        /**
          * @default 'Max recursive depth reached'
          */
        var recursion: String = js.native
        
        /**
          * @default 'The state library has not been initialized'
          */
        var state: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(
          api: String,
          method: String,
          missingTab: String,
          noContent: String,
          path: String,
          recursion: String,
          state: String
        ): Impl = {
          val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], missingTab = missingTab.asInstanceOf[js.Any], noContent = noContent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], recursion = recursion.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMissingTab(value: String): Self = StObject.set(x, "missingTab", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNoContent(value: String): Self = StObject.set(x, "noContent", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRecursion(value: String): Self = StObject.set(x, "recursion", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplapi | PickImplmethod | PickImplmissingTab | PickImplnoContent | PickImplpathPath | PickImplrecursion | PickImplstate) with PartialPickImplkeyofImplApi
    }
    type ErrorSettings = typingsSlinky.semanticUiTab.SemanticUI.Tab.ErrorSettings.Param
    
    object MetadataSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'loaded'
          */
        var loaded: String = js.native
        
        /**
          * @default 'promise'
          */
        var promise: String = js.native
        
        /**
          * @default 'tab'
          */
        var tab: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(loaded: String, promise: String, tab: String): Impl = {
          val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLoaded(value: String): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPromise(value: String): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImpltab | PickImplloaded | PickImplpromise) with PartialPickImplkeyofImplLoaded
    }
    type MetadataSettings = typingsSlinky.semanticUiTab.SemanticUI.Tab.MetadataSettings.Param
    
    object SelectorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default '.ui:not(.menu)'
          */
        var parent: String = js.native
        
        /**
          * @default '.ui.tab'
          */
        var tabs: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(parent: String, tabs: String): Impl = {
          val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTabs(value: String): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImpltabs | PickImplparent) with PartialPickImplkeyofImplParent
    }
    type SelectorSettings = typingsSlinky.semanticUiTab.SemanticUI.Tab.SelectorSettings.Param
    
    /* Inlined semantic-ui-tab.SemanticUI.Tab.TemplatesSettings.Param */
    @js.native
    trait TemplatesSettings extends StObject {
      
      def determineTitle(tabArray: js.Array[_]): String = js.native
      @JSName("determineTitle")
      var determineTitle_Original: (js.Function1[/* tabArray */ js.Array[_], String]) with (js.UndefOr[js.Function1[/* tabArray */ js.Array[_], String]]) = js.native
    }
    object TemplatesSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * returns page title
          */
        def determineTitle(tabArray: js.Array[_]): String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(determineTitle: js.Array[_] => String): Impl = {
          val __obj = js.Dynamic.literal(determineTitle = js.Any.fromFunction1(determineTitle))
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDetermineTitle(value: js.Array[_] => String): Self = StObject.set(x, "determineTitle", js.Any.fromFunction1(value))
        }
      }
      
      /* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.TemplatesSettings._Impl, 'determineTitle'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.TemplatesSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.TemplatesSettings._Impl>> */
      @js.native
      trait Param extends StObject {
        
        def determineTitle(tabArray: js.Array[_]): String = js.native
        @JSName("determineTitle")
        var determineTitle_Original: (js.Function1[/* tabArray */ js.Array[_], String]) with (js.UndefOr[js.Function1[/* tabArray */ js.Array[_], String]]) = js.native
      }
    }
  }
  
  object TabSettings {
    
    @js.native
    trait Impl extends StObject {
      
      /**
        * Tab should reload content every time it is opened
        */
      var alwaysRefresh: Boolean = js.native
      
      /**
        * Settings object for $.api call
        *
        * @default false
        * @see {@link http://semantic-ui.com/behaviors/api.html}
        */
      var apiSettings: ApiSettings = js.native
      
      // region Tab Settings
      /**
        * Whether tab should load remote content as same url as history
        *
        * @default false
        */
      var auto: Boolean = js.native
      
      /**
        * Tab should cache content after loading locally to avoid server trip on second load
        *
        * @default true
        */
      var cache: Boolean = js.native
      
      /**
        * Can be set to either response, DOM or html.
        * Using DOM will cache the a clone of the DOM tree, preserving all events as they existed on render.
        * response will cache the original response on load, this way callbacks always receive the same content.
        * Using html will cache the resulting html after all callbacks, making sure any changes to content are preserved.
        *
        * @default 'response'
        */
      var cacheType: response | DOM | html = js.native
      
      /**
        * If enabled limits tabs to children of passed context
        *
        * @default false
        */
      var childrenOnly: Boolean = js.native
      
      /**
        * Class names used to attach style to state
        */
      var className: ClassNameSettings = js.native
      
      /**
        * Tabs are limited to those found inside this context
        *
        * @default false
        */
      var context: `false` | String | JQuery = js.native
      
      /**
        * When set to siblings will only deactivate elements that are DOM siblings with the activated element.
        * When set to all the component will deactivate all other elements initialized at the same time.
        *
        * @default 'siblings'
        * @since 2.2
        */
      var deactivate: siblings | all = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      /**
        * Whether inline scripts in tab HTML should be parsed on tab load.
        * Defaults to once, parsing only on first load.
        * Can also be set to true or false to always parse or never parse inline scripts.
        *
        * @default 'once'
        */
      var evaluateScripts: once | Boolean = js.native
      
      /**
        * Whether to record history events for tab changes
        *
        * @default false
        */
      var history: Boolean = js.native
      
      /**
        * Can be set to hash or state.
        * Hash will use an in-page link to create history events.
        * State will use DOM History and load pages from server on refresh.
        *
        * @default 'hash'
        * @see {@link https://developer.mozilla.org/en-US/docs/Web/Guide/API/DOM/Manipulating_the_browser_history}
        */
      var historyType: hash | state = js.native
      
      /**
        * Do not load content remotely on first tab load. Useful when open tab is rendered on server.
        *
        * @default false
        */
      var ignoreFirstLoad: Boolean = js.native
      
      /**
        * When enabled only calls remote endpoint for tab data on first load and leaves the DOM undisturbed afterwards.
        *
        * @default false
        * @since 2.2.8
        */
      var loadOnce: Boolean = js.native
      
      /**
        * Maximum amount of nested tabs allowed (avoids recursion)
        *
        * @default 25
        */
      var maxDepth: Double = js.native
      
      /**
        * DOM metadata used by module
        */
      var metadata: MetadataSettings = js.native
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String = js.native
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String = js.native
      
      // endregion
      // region Callbacks
      /**
        * Callback only the first time a tab is loaded
        */
      def onFirstLoad(tabPath: String, parameterArray: js.Array[_], historyEvent: js.Any): Unit = js.native
      
      /**
        * Callback every time a tab is loaded
        */
      def onLoad(tabPath: String, parameterArray: js.Array[_], historyEvent: js.Any): Unit = js.native
      
      /**
        * Called when a tab begins loading remote content
        */
      def onRequest(tabPath: String): Unit = js.native
      
      /**
        * Called after a tab becomes visible
        */
      def onVisible(tabPath: String): Unit = js.native
      
      /**
        * When using historyType state you must specify the base URL for all internal links.
        *
        * @default false
        */
      var path: `false` | String = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      /**
        * Selectors used by module
        */
      var selector: SelectorSettings = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      // endregion
      // region DOM Settings
      /**
        * Functions used to return content
        */
      var templates: TemplatesSettings = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        alwaysRefresh: Boolean,
        apiSettings: ApiSettings,
        auto: Boolean,
        cache: Boolean,
        cacheType: response | DOM | html,
        childrenOnly: Boolean,
        className: ClassNameSettings,
        context: `false` | String | JQuery,
        deactivate: siblings | all,
        debug: Boolean,
        error: ErrorSettings,
        evaluateScripts: once | Boolean,
        history: Boolean,
        historyType: hash | state,
        ignoreFirstLoad: Boolean,
        loadOnce: Boolean,
        maxDepth: Double,
        metadata: MetadataSettings,
        name: String,
        namespace: String,
        onFirstLoad: (String, js.Array[_], js.Any) => Unit,
        onLoad: (String, js.Array[_], js.Any) => Unit,
        onRequest: String => Unit,
        onVisible: String => Unit,
        path: `false` | String,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        templates: TemplatesSettings,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(alwaysRefresh = alwaysRefresh.asInstanceOf[js.Any], apiSettings = apiSettings.asInstanceOf[js.Any], auto = auto.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], cacheType = cacheType.asInstanceOf[js.Any], childrenOnly = childrenOnly.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], deactivate = deactivate.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], evaluateScripts = evaluateScripts.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], historyType = historyType.asInstanceOf[js.Any], ignoreFirstLoad = ignoreFirstLoad.asInstanceOf[js.Any], loadOnce = loadOnce.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onFirstLoad = js.Any.fromFunction3(onFirstLoad), onLoad = js.Any.fromFunction3(onLoad), onRequest = js.Any.fromFunction1(onRequest), onVisible = js.Any.fromFunction1(onVisible), path = path.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlwaysRefresh(value: Boolean): Self = StObject.set(x, "alwaysRefresh", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApiSettings(value: ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCacheType(value: response | DOM | html): Self = StObject.set(x, "cacheType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenOnly(value: Boolean): Self = StObject.set(x, "childrenOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContext(value: `false` | String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeactivate(value: siblings | all): Self = StObject.set(x, "deactivate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEvaluateScripts(value: once | Boolean): Self = StObject.set(x, "evaluateScripts", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHistory(value: Boolean): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHistoryType(value: hash | state): Self = StObject.set(x, "historyType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreFirstLoad(value: Boolean): Self = StObject.set(x, "ignoreFirstLoad", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoadOnce(value: Boolean): Self = StObject.set(x, "loadOnce", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnFirstLoad(value: (String, js.Array[_], js.Any) => Unit): Self = StObject.set(x, "onFirstLoad", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnLoad(value: (String, js.Array[_], js.Any) => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction3(value))
        
        @scala.inline
        def setOnRequest(value: String => Unit): Self = StObject.set(x, "onRequest", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnVisible(value: String => Unit): Self = StObject.set(x, "onVisible", js.Any.fromFunction1(value))
        
        @scala.inline
        def setPath(value: `false` | String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplauto | PickImpldeactivate | PickImplhistory | PickImplignoreFirstLoad | PickImplevaluateScripts | PickImplalwaysRefresh | PickImplcacheType | PickImplcache | PickImplapiSettings | PickImplhistoryType | PickImplpath | PickImplcontext | PickImplchildrenOnly | PickImplmaxDepth | PickImplloadOnce | PickImplonFirstLoad | PickImplonLoad | PickImplonRequest | PickImplonVisible | PickImpltemplates | PickImplselector | PickImplmetadata | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/tab.html#/settings}
    */
  type TabSettings = typingsSlinky.semanticUiTab.SemanticUI.TabSettings.Param
}
