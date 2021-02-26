package typingsSlinky.semanticUiTab

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab
import typingsSlinky.semanticUiTab.SemanticUI.Tab.ClassNameSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab.ErrorSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab.MetadataSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab.SelectorSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab.TemplatesSettings
import typingsSlinky.semanticUiTab.SemanticUI.TabSettings
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

@js.native
trait JQuery extends StObject {
  
  def tab(): JQuery = js.native
  def tab(behavior: setting, name: alwaysRefresh, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def tab(behavior: setting, name: alwaysRefresh, value: Boolean): JQuery = js.native
  def tab(behavior: setting, name: apiSettings, value: ApiSettings): JQuery = js.native
  def tab(behavior: setting, name: auto, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def tab(behavior: setting, name: auto, value: Boolean): JQuery = js.native
  def tab(behavior: setting, name: cacheType, value: js.UndefOr[scala.Nothing]): response | DOM | html = js.native
  def tab(behavior: setting, name: cacheType, value: DOM): JQuery = js.native
  def tab(behavior: setting, name: cacheType, value: html): JQuery = js.native
  def tab(behavior: setting, name: cacheType, value: response): JQuery = js.native
  def tab(behavior: setting, name: cache, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def tab(behavior: setting, name: cache, value: Boolean): JQuery = js.native
  def tab(behavior: setting, name: childrenOnly, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def tab(behavior: setting, name: childrenOnly, value: Boolean): JQuery = js.native
  def tab(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def tab(behavior: setting, name: context, value: js.UndefOr[scala.Nothing]): `false` | String | JQuery = js.native
  def tab(behavior: setting, name: context, value: String): JQuery = js.native
  def tab(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def tab(behavior: setting, name: context, value: `false`): JQuery = js.native
  def tab(behavior: setting, name: deactivate, value: js.UndefOr[scala.Nothing]): siblings | all = js.native
  def tab(behavior: setting, name: deactivate, value: all): JQuery = js.native
  def tab(behavior: setting, name: deactivate, value: siblings): JQuery = js.native
  def tab(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def tab(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def tab(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
  def tab(behavior: setting, name: evaluateScripts, value: js.UndefOr[scala.Nothing]): once | Boolean = js.native
  def tab(behavior: setting, name: evaluateScripts, value: Boolean): JQuery = js.native
  def tab(behavior: setting, name: evaluateScripts, value: once): JQuery = js.native
  def tab(behavior: setting, name: historyType, value: js.UndefOr[scala.Nothing]): hash | state = js.native
  def tab(behavior: setting, name: historyType, value: hash): JQuery = js.native
  def tab(behavior: setting, name: historyType, value: state): JQuery = js.native
  def tab(behavior: setting, name: history, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def tab(behavior: setting, name: history, value: Boolean): JQuery = js.native
  def tab(behavior: setting, name: ignoreFirstLoad, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def tab(behavior: setting, name: ignoreFirstLoad, value: Boolean): JQuery = js.native
  def tab(behavior: setting, name: loadOnce, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def tab(behavior: setting, name: loadOnce, value: Boolean): JQuery = js.native
  def tab(behavior: setting, name: maxDepth, value: js.UndefOr[scala.Nothing]): Double = js.native
  def tab(behavior: setting, name: maxDepth, value: Double): JQuery = js.native
  def tab(behavior: setting, name: metadata, value: js.UndefOr[scala.Nothing]): MetadataSettings = js.native
  def tab(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
  def tab(behavior: setting, name: namespace, value: String): JQuery = js.native
  def tab(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
  def tab(behavior: setting, name: name, value: String): JQuery = js.native
  def tab(behavior: setting, name: onFirstLoad, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[
    /* this */ JQuery, 
    /* tabPath */ String, 
    /* parameterArray */ js.Array[_], 
    /* historyEvent */ js.Any, 
    Unit
  ] = js.native
  def tab(
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
  def tab(behavior: setting, name: onLoad, value: js.UndefOr[scala.Nothing]): js.ThisFunction3[
    /* this */ JQuery, 
    /* tabPath */ String, 
    /* parameterArray */ js.Array[_], 
    /* historyEvent */ js.Any, 
    Unit
  ] = js.native
  def tab(
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
  def tab(behavior: setting, name: onRequest, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = js.native
  def tab(
    behavior: setting,
    name: onRequest,
    value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
  ): JQuery = js.native
  def tab(behavior: setting, name: onVisible, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = js.native
  def tab(
    behavior: setting,
    name: onVisible,
    value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
  ): JQuery = js.native
  def tab(behavior: setting, name: path, value: js.UndefOr[scala.Nothing]): `false` | String = js.native
  def tab(behavior: setting, name: path, value: String): JQuery = js.native
  def tab(behavior: setting, name: path, value: `false`): JQuery = js.native
  def tab(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def tab(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def tab(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def tab(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def tab(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def tab(behavior: setting, name: templates, value: js.UndefOr[scala.Nothing]): TemplatesSettings = js.native
  def tab(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
  def tab(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
  def tab(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def tab(settings: TabSettings): JQuery = js.native
  @JSName("tab")
  def tab_ApiSettings(behavior: setting, name: apiSettings, value: js.UndefOr[scala.Nothing]): ApiSettings = js.native
  @JSName("tab")
  def tab_ClassNameSettings(behavior: setting, name: className, value: js.UndefOr[scala.Nothing]): ClassNameSettings = js.native
  @JSName("tab")
  def tab_JQuery(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  @JSName("tab")
  def tab_JQuery(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  @JSName("tab")
  var tab_Original: Tab = js.native
  @JSName("tab")
  def tab_SelectorSettings(behavior: setting, name: selector, value: js.UndefOr[scala.Nothing]): SelectorSettings = js.native
  /**
    * Sets cached HTML for path
    */
  @JSName("tab")
  def tab_cacheadd(behavior: `cache add`, path: String, html: String): JQuery = js.native
  /**
    * Returns cached HTML for path
    */
  @JSName("tab")
  def tab_cacheread(behavior: `cache read`, path: String): String | `false` = js.native
  /**
    * Removes cached HTML for path
    */
  @JSName("tab")
  def tab_cacheremove(behavior: `cache remove`, path: String): JQuery = js.native
  // Documentation says this exists but it does not.
  // /**
  //  * Attaches tab action to given selector. Default event if none specified is toggle
  //  */
  // (behavior: 'attach events', selector: Selector, event?: string): JQuery;
  /**
    * Changes tab to path
    */
  @JSName("tab")
  def tab_changetab(behavior: `change tab`, path: String): JQuery = js.native
  @JSName("tab")
  def tab_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns current path
    */
  @JSName("tab")
  def tab_getpath(behavior: `get path`): String = js.native
  /**
    * Returns whether tab exists
    */
  @JSName("tab")
  def tab_istab(behavior: `is tab`): Boolean = js.native
  /**
    * Sets current path to state
    */
  @JSName("tab")
  def tab_setstate(behavior: `set state`, path: String): JQuery = js.native
  @JSName("tab")
  def tab_setting(behavior: setting, value: TabSettings): JQuery = js.native
}
