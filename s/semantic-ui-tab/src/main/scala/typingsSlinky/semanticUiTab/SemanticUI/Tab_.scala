package typingsSlinky.semanticUiTab.SemanticUI

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiTab.JQuery
import typingsSlinky.semanticUiTab.SemanticUI.Tab.ClassNameSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab.ErrorSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab.MetadataSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab.SelectorSettings
import typingsSlinky.semanticUiTab.SemanticUI.Tab.TemplatesSettings
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tab_ extends js.Object {
  var settings: TabSettings = js.native
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
  def apply(behavior: setting, name: alwaysRefresh): Boolean = js.native
  def apply(behavior: setting, name: alwaysRefresh, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: apiSettings): ApiSettings = js.native
  def apply(behavior: setting, name: apiSettings, value: ApiSettings): JQuery = js.native
  def apply(behavior: setting, name: auto): Boolean = js.native
  def apply(behavior: setting, name: auto, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: cache): Boolean = js.native
  def apply(behavior: setting, name: cacheType): response | DOM | html = js.native
  def apply(behavior: setting, name: cacheType, value: DOM): JQuery = js.native
  def apply(behavior: setting, name: cacheType, value: html): JQuery = js.native
  def apply(behavior: setting, name: cacheType, value: response): JQuery = js.native
  def apply(behavior: setting, name: cache, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: childrenOnly): Boolean = js.native
  def apply(behavior: setting, name: childrenOnly, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: className): ClassNameSettings = js.native
  def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def apply(behavior: setting, name: context): `false` | String | JQuery = js.native
  def apply(behavior: setting, name: context, value: String): JQuery = js.native
  def apply(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def apply(behavior: setting, name: context, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: deactivate): siblings | all = js.native
  def apply(behavior: setting, name: deactivate, value: all): JQuery = js.native
  def apply(behavior: setting, name: deactivate, value: siblings): JQuery = js.native
  def apply(behavior: setting, name: debug): Boolean = js.native
  def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: error): ErrorSettings = js.native
  def apply(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def apply(behavior: setting, name: evaluateScripts): once | Boolean = js.native
  def apply(behavior: setting, name: evaluateScripts, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: evaluateScripts, value: once): JQuery = js.native
  def apply(behavior: setting, name: history): Boolean = js.native
  def apply(behavior: setting, name: historyType): hash | state = js.native
  def apply(behavior: setting, name: historyType, value: hash): JQuery = js.native
  def apply(behavior: setting, name: historyType, value: state): JQuery = js.native
  def apply(behavior: setting, name: history, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: ignoreFirstLoad): Boolean = js.native
  def apply(behavior: setting, name: ignoreFirstLoad, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: loadOnce): Boolean = js.native
  def apply(behavior: setting, name: loadOnce, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: maxDepth): Double = js.native
  def apply(behavior: setting, name: maxDepth, value: Double): JQuery = js.native
  def apply(behavior: setting, name: metadata): MetadataSettings = js.native
  def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def apply(behavior: setting, name: name): String = js.native
  def apply(behavior: setting, name: namespace): String = js.native
  def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
  def apply(behavior: setting, name: name, value: String): JQuery = js.native
  def apply(behavior: setting, name: onFirstLoad): js.ThisFunction3[
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
  def apply(behavior: setting, name: onLoad): js.ThisFunction3[
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
  def apply(behavior: setting, name: onRequest): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = js.native
  def apply(
    behavior: setting,
    name: onRequest,
    value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: onVisible): js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit] = js.native
  def apply(
    behavior: setting,
    name: onVisible,
    value: js.ThisFunction1[/* this */ JQuery, /* tabPath */ String, Unit]
  ): JQuery = js.native
  def apply(behavior: setting, name: path): `false` | String = js.native
  def apply(behavior: setting, name: path, value: String): JQuery = js.native
  def apply(behavior: setting, name: path, value: `false`): JQuery = js.native
  def apply(behavior: setting, name: performance): Boolean = js.native
  def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: selector): SelectorSettings = js.native
  def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def apply(behavior: setting, name: silent): Boolean = js.native
  def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def apply(behavior: setting, name: templates): TemplatesSettings = js.native
  def apply(behavior: setting, name: templates, value: TemplatesSettings): JQuery = js.native
  def apply(behavior: setting, name: verbose): Boolean = js.native
  def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def apply(behavior: setting, value: TabSettings): JQuery = js.native
  def apply(settings: TabSettings): JQuery = js.native
}

