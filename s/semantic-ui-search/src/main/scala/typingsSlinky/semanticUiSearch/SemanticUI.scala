package typingsSlinky.semanticUiSearch

import typingsSlinky.semanticUiApi.SemanticUI.ApiSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.ClassNameSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.ClassNameSettings.Param
import typingsSlinky.semanticUiSearch.SemanticUI.Search.ErrorSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.FieldsSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.MetadataSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.RegExpSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.SelectorSettings
import typingsSlinky.semanticUiSearch.SemanticUI.Search.TemplatesSettings
import typingsSlinky.semanticUiSearch.anon.PartialPickImplkeyofImpl
import typingsSlinky.semanticUiSearch.anon.PartialPickImplkeyofImplAction
import typingsSlinky.semanticUiSearch.anon.PartialPickImplkeyofImplActive
import typingsSlinky.semanticUiSearch.anon.PartialPickImplkeyofImplBeginsWith
import typingsSlinky.semanticUiSearch.anon.PartialPickImplkeyofImplCache
import typingsSlinky.semanticUiSearch.anon.PartialPickImplkeyofImplCategory
import typingsSlinky.semanticUiSearch.anon.PartialPickImplkeyofImplLogging
import typingsSlinky.semanticUiSearch.anon.PartialPickImplkeyofImplPrompt
import typingsSlinky.semanticUiSearch.anon.PickImplaction
import typingsSlinky.semanticUiSearch.anon.PickImplactionText
import typingsSlinky.semanticUiSearch.anon.PickImplactionURL
import typingsSlinky.semanticUiSearch.anon.PickImplactive
import typingsSlinky.semanticUiSearch.anon.PickImplapiSettings
import typingsSlinky.semanticUiSearch.anon.PickImplbeginsWith
import typingsSlinky.semanticUiSearch.anon.PickImplcache
import typingsSlinky.semanticUiSearch.anon.PickImplcacheCache
import typingsSlinky.semanticUiSearch.anon.PickImplcategories
import typingsSlinky.semanticUiSearch.anon.PickImplcategory
import typingsSlinky.semanticUiSearch.anon.PickImplcategoryCategory
import typingsSlinky.semanticUiSearch.anon.PickImplcategoryName
import typingsSlinky.semanticUiSearch.anon.PickImplcategoryResults
import typingsSlinky.semanticUiSearch.anon.PickImplclassName
import typingsSlinky.semanticUiSearch.anon.PickImpldebug
import typingsSlinky.semanticUiSearch.anon.PickImpldescription
import typingsSlinky.semanticUiSearch.anon.PickImplduration
import typingsSlinky.semanticUiSearch.anon.PickImpleasing
import typingsSlinky.semanticUiSearch.anon.PickImplempty
import typingsSlinky.semanticUiSearch.anon.PickImplerror
import typingsSlinky.semanticUiSearch.anon.PickImplescape
import typingsSlinky.semanticUiSearch.anon.PickImplescapeEscape
import typingsSlinky.semanticUiSearch.anon.PickImplfields
import typingsSlinky.semanticUiSearch.anon.PickImplfocus
import typingsSlinky.semanticUiSearch.anon.PickImplhideDelay
import typingsSlinky.semanticUiSearch.anon.PickImplimage
import typingsSlinky.semanticUiSearch.anon.PickImplloading
import typingsSlinky.semanticUiSearch.anon.PickImpllogging
import typingsSlinky.semanticUiSearch.anon.PickImplmaxResults
import typingsSlinky.semanticUiSearch.anon.PickImplmaxResultsMaxResults
import typingsSlinky.semanticUiSearch.anon.PickImplmessage
import typingsSlinky.semanticUiSearch.anon.PickImplmetadata
import typingsSlinky.semanticUiSearch.anon.PickImplmethod
import typingsSlinky.semanticUiSearch.anon.PickImplminCharacters
import typingsSlinky.semanticUiSearch.anon.PickImplname
import typingsSlinky.semanticUiSearch.anon.PickImplnamespace
import typingsSlinky.semanticUiSearch.anon.PickImplnoResults
import typingsSlinky.semanticUiSearch.anon.PickImplnoTemplate
import typingsSlinky.semanticUiSearch.anon.PickImplonResults
import typingsSlinky.semanticUiSearch.anon.PickImplonResultsAdd
import typingsSlinky.semanticUiSearch.anon.PickImplonResultsClose
import typingsSlinky.semanticUiSearch.anon.PickImplonResultsOpen
import typingsSlinky.semanticUiSearch.anon.PickImplonSearchQuery
import typingsSlinky.semanticUiSearch.anon.PickImplonSelect
import typingsSlinky.semanticUiSearch.anon.PickImplperformance
import typingsSlinky.semanticUiSearch.anon.PickImplpressed
import typingsSlinky.semanticUiSearch.anon.PickImplprice
import typingsSlinky.semanticUiSearch.anon.PickImplprompt
import typingsSlinky.semanticUiSearch.anon.PickImplregExp
import typingsSlinky.semanticUiSearch.anon.PickImplresult
import typingsSlinky.semanticUiSearch.anon.PickImplresults
import typingsSlinky.semanticUiSearch.anon.PickImplsearchButton
import typingsSlinky.semanticUiSearch.anon.PickImplsearchDelay
import typingsSlinky.semanticUiSearch.anon.PickImplsearchFields
import typingsSlinky.semanticUiSearch.anon.PickImplsearchFullText
import typingsSlinky.semanticUiSearch.anon.PickImplselectFirstResult
import typingsSlinky.semanticUiSearch.anon.PickImplselector
import typingsSlinky.semanticUiSearch.anon.PickImplserverError
import typingsSlinky.semanticUiSearch.anon.PickImplshowNoResults
import typingsSlinky.semanticUiSearch.anon.PickImplsilent
import typingsSlinky.semanticUiSearch.anon.PickImplsource
import typingsSlinky.semanticUiSearch.anon.PickImplsourceSource
import typingsSlinky.semanticUiSearch.anon.PickImplstandard
import typingsSlinky.semanticUiSearch.anon.PickImpltemplates
import typingsSlinky.semanticUiSearch.anon.PickImpltitle
import typingsSlinky.semanticUiSearch.anon.PickImpltransition
import typingsSlinky.semanticUiSearch.anon.PickImpltype
import typingsSlinky.semanticUiSearch.anon.PickImplverbose
import typingsSlinky.semanticUiSearch.semanticUiSearchBooleans.`false`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`add results`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`cancel query`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`clear cache`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`display message`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`generate results`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`get result`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`get value`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`has minimum characters`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`hide results`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`is empty`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`is focused`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`is visible`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`read cache`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`search local`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`search object`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`search remote`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`set value`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`show results`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`type`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.`write cache`
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.apiSettings
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.cache
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.className
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.debug
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.destroy
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.duration
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.easing
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.error
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.fields
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.hideDelay
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.maxResults
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.metadata
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.minCharacters
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.name
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.namespace
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.onResults
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.onResultsAdd
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.onResultsClose
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.onResultsOpen
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.onSearchQuery
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.onSelect
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.performance
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.query
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.regExp
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.searchDelay
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.searchFields
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.searchFullText
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.selectFirstResult
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.selector
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.setting
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.showNoResults
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.silent
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.source
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.templates
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.transition
import typingsSlinky.semanticUiSearch.semanticUiSearchStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Search extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Adds HTML to results and displays
      */
    def apply(behavior: `add results`, html: String): JQuery = js.native
    /**
      * Cancels current remote search query
      */
    def apply(behavior: `cancel query`): JQuery = js.native
    /**
      * Clears value from cache, if no parameter passed clears all cache
      */
    def apply(behavior: `clear cache`): JQuery = js.native
    def apply(behavior: `clear cache`, query: String): JQuery = js.native
    /**
      * Displays message in search results with text, using template matching type
      */
    def apply(behavior: `display message`, text: String, `type`: String): JQuery = js.native
    /**
      * Generates results using parser specified by settings.template
      */
    def apply(behavior: `generate results`, response: js.Any): JQuery = js.native
    /**
      * Returns JSON object matching searched title or id (see above)
      */
    def apply(behavior: `get result`, value: js.Any): js.Any = js.native
    /**
      * Returns current search value
      */
    def apply(behavior: `get value`): js.Any = js.native
    /**
      * Whether has minimum characters
      */
    def apply(behavior: `has minimum characters`): Boolean = js.native
    /**
      * Hides results container
      */
    def apply(behavior: `hide results`): JQuery = js.native
    def apply(behavior: `hide results`, callback: js.Function0[Unit]): JQuery = js.native
    /**
      * Whether search results are empty
      */
    def apply(behavior: `is empty`): Boolean = js.native
    /**
      * Whether search is currently focused
      */
    def apply(behavior: `is focused`): Boolean = js.native
    /**
      * Whether search results are visible
      */
    def apply(behavior: `is visible`): Boolean = js.native
    /**
      * Reads cached results for query
      */
    def apply(behavior: `read cache`, query: String): JQuery = js.native
    /**
      * Search local object for specified query and display results
      */
    def apply(behavior: `search local`, query: String): JQuery = js.native
    /**
      * Search object for specified query and return results
      */
    def apply(behavior: `search object`, query: String, `object`: js.Any, searchFields: js.Array[String]): js.Any = js.native
    /**
      * Search remote endpoint for specified query and display results
      */
    def apply(behavior: `search remote`, query: String): JQuery = js.native
    def apply(behavior: `search remote`, query: String, callback: js.Function0[Unit]): JQuery = js.native
    /**
      * Sets search input to value
      */
    def apply(behavior: `set value`, value: js.Any): JQuery = js.native
    /**
      * Shows results container
      */
    def apply(behavior: `show results`): JQuery = js.native
    def apply(behavior: `show results`, callback: js.Function0[Unit]): JQuery = js.native
    /**
      * Writes cached results for query
      */
    def apply(behavior: `write cache`, query: String): JQuery = js.native
    /**
      * Removes all events
      */
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Search for value currently set in search input
      */
    def apply(behavior: query): JQuery = js.native
    def apply(behavior: query, callback: js.Function0[Unit]): JQuery = js.native
    def apply(behavior: setting, name: `type`, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: `type`, value: String): JQuery = js.native
    def apply(behavior: setting, name: apiSettings, value: ApiSettings): JQuery = js.native
    def apply(behavior: setting, name: cache, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: cache, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
    def apply(behavior: setting, name: debug, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: debug, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: duration, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: duration, value: Double): JQuery = js.native
    def apply(behavior: setting, name: easing, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: easing, value: String): JQuery = js.native
    def apply(behavior: setting, name: error, value: js.UndefOr[scala.Nothing]): ErrorSettings = js.native
    def apply(behavior: setting, name: fields, value: FieldsSettings): JQuery = js.native
    def apply(behavior: setting, name: hideDelay, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: hideDelay, value: Double): JQuery = js.native
    def apply(behavior: setting, name: maxResults, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: maxResults, value: Double): JQuery = js.native
    def apply(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
    def apply(behavior: setting, name: minCharacters, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: minCharacters, value: Double): JQuery = js.native
    def apply(behavior: setting, name: namespace, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: namespace, value: String): JQuery = js.native
    def apply(behavior: setting, name: name, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: name, value: String): JQuery = js.native
    def apply(behavior: setting, name: onResultsAdd, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit] = js.native
    def apply(
      behavior: setting,
      name: onResultsAdd,
      value: js.ThisFunction1[/* this */ JQuery, /* html */ String, `false` | Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onResultsClose, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onResultsClose, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onResultsOpen, value: js.UndefOr[scala.Nothing]): js.ThisFunction0[/* this */ JQuery, Unit] = js.native
    def apply(behavior: setting, name: onResultsOpen, value: js.ThisFunction0[/* this */ JQuery, Unit]): JQuery = js.native
    def apply(behavior: setting, name: onResults, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit] = js.native
    def apply(
      behavior: setting,
      name: onResults,
      value: js.ThisFunction1[/* this */ JQuery, /* response */ js.Any, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onSearchQuery, value: js.UndefOr[scala.Nothing]): js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit] = js.native
    def apply(
      behavior: setting,
      name: onSearchQuery,
      value: js.ThisFunction1[/* this */ JQuery, /* query */ String, Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: onSelect, value: js.UndefOr[scala.Nothing]): js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit] = js.native
    def apply(
      behavior: setting,
      name: onSelect,
      value: js.ThisFunction2[/* this */ JQuery, /* result */ js.Any, /* response */ js.Any, `false` | Unit]
    ): JQuery = js.native
    def apply(behavior: setting, name: performance, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: performance, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: regExp, value: RegExpSettings): JQuery = js.native
    def apply(behavior: setting, name: searchDelay, value: js.UndefOr[scala.Nothing]): Double = js.native
    def apply(behavior: setting, name: searchDelay, value: Double): JQuery = js.native
    def apply(behavior: setting, name: searchFields, value: js.UndefOr[scala.Nothing]): js.Array[String] = js.native
    def apply(behavior: setting, name: searchFields, value: js.Array[String]): JQuery = js.native
    def apply(behavior: setting, name: searchFullText, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: searchFullText, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: selectFirstResult, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: selectFirstResult, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
    def apply(behavior: setting, name: showNoResults, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: showNoResults, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: silent, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: silent, value: Boolean): JQuery = js.native
    def apply(behavior: setting, name: source, value: js.UndefOr[scala.Nothing]): `false` | js.Any = js.native
    def apply(behavior: setting, name: source, value: js.Any): JQuery = js.native
    def apply(behavior: setting, name: source, value: `false`): JQuery = js.native
    def apply(behavior: setting, name: templates, value: js.UndefOr[scala.Nothing]): TemplatesSettings = js.native
    def apply(behavior: setting, name: transition, value: js.UndefOr[scala.Nothing]): String = js.native
    def apply(behavior: setting, name: transition, value: String): JQuery = js.native
    def apply(behavior: setting, name: verbose, value: js.UndefOr[scala.Nothing]): Boolean = js.native
    def apply(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
    def apply(behavior: setting, value: SearchSettings): JQuery = js.native
    def apply(settings: SearchSettings): JQuery = js.native
    
    var settings: SearchSettings = js.native
  }
  object Search {
    
    object ClassNameSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String = js.native
        
        /**
          * @default 'empty'
          */
        var empty: String = js.native
        
        /**
          * @default 'focus'
          */
        var focus: String = js.native
        
        /**
          * @default 'loading'
          */
        var loading: String = js.native
        
        /**
          * @default 'down'
          */
        var pressed: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(active: String, empty: String, focus: String, loading: String, pressed: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPressed(value: String): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplactive | PickImplempty | PickImplfocus | PickImplloading | PickImplpressed) with PartialPickImplkeyofImplActive
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'Error in debug logging, exiting.'
          */
        var logging: String = js.native
        
        /**
          * @default 'Results must be an array to use maxResults setting'
          */
        var maxResults: String = js.native
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String = js.native
        
        /**
          * @default 'Your search returned no results'
          */
        var noResults: String = js.native
        
        /**
          * @default 'A valid template name was not specified.'
          */
        var noTemplate: String = js.native
        
        /**
          * @default 'There was an issue with querying the server.'
          */
        var serverError: String = js.native
        
        /**
          * @default 'Cannot search. No source used, and Semantic API module was not included'
          */
        var source: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(
          logging: String,
          maxResults: String,
          method: String,
          noResults: String,
          noTemplate: String,
          serverError: String,
          source: String
        ): Impl = {
          val __obj = js.Dynamic.literal(logging = logging.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], noResults = noResults.asInstanceOf[js.Any], noTemplate = noTemplate.asInstanceOf[js.Any], serverError = serverError.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLogging(value: String): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxResults(value: String): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNoResults(value: String): Self = StObject.set(x, "noResults", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNoTemplate(value: String): Self = StObject.set(x, "noTemplate", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setServerError(value: String): Self = StObject.set(x, "serverError", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplsourceSource | PickImplnoResults | PickImpllogging | PickImplnoTemplate | PickImplserverError | PickImplmaxResultsMaxResults | PickImplmethod) with PartialPickImplkeyofImplLogging
    }
    type ErrorSettings = typingsSlinky.semanticUiSearch.SemanticUI.Search.ErrorSettings.Param
    
    object FieldsSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * "view more" object name
          *
          * @default 'action'
          */
        var action: String = js.native
        
        /**
          * "view more" text
          *
          * @default 'text'
          */
        var actionText: String = js.native
        
        /**
          * "view more" url
          *
          * @default 'url'
          */
        var actionURL: String = js.native
        
        /**
          * array of categories (category view)
          *
          * @default 'results'
          */
        var categories: String = js.native
        
        /**
          * name of category (category view)
          *
          * @default 'name'
          */
        var categoryName: String = js.native
        
        /**
          * array of results (category view)
          *
          * @default 'results'
          */
        var categoryResults: String = js.native
        
        /**
          * result description
          *
          * @default 'description'
          */
        var description: String = js.native
        
        /**
          * result image
          *
          * @default 'image'
          */
        var image: String = js.native
        
        /**
          * result price
          *
          * @default 'price'
          */
        var price: String = js.native
        
        /**
          * array of results (standard)
          *
          * @default 'results'
          */
        var results: String = js.native
        
        /**
          * result title
          *
          * @default 'title'
          */
        var title: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(
          action: String,
          actionText: String,
          actionURL: String,
          categories: String,
          categoryName: String,
          categoryResults: String,
          description: String,
          image: String,
          price: String,
          results: String,
          title: String
        ): Impl = {
          val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actionText = actionText.asInstanceOf[js.Any], actionURL = actionURL.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], categoryName = categoryName.asInstanceOf[js.Any], categoryResults = categoryResults.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setActionURL(value: String): Self = StObject.set(x, "actionURL", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCategories(value: String): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCategoryName(value: String): Self = StObject.set(x, "categoryName", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCategoryResults(value: String): Self = StObject.set(x, "categoryResults", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResults(value: String): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplcategories | PickImplcategoryName | PickImplcategoryResults | PickImpldescription | PickImplimage | PickImplprice | PickImplresults | PickImpltitle | PickImplaction | PickImplactionText | PickImplactionURL) with PartialPickImplkeyofImplAction
    }
    type FieldsSettings = typingsSlinky.semanticUiSearch.SemanticUI.Search.FieldsSettings.Param
    
    object MetadataSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default 'cache'
          */
        var cache: String = js.native
        
        /**
          * @default 'results'
          */
        var results: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(cache: String, results: String): Impl = {
          val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResults(value: String): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplcacheCache | PickImplresults) with PartialPickImplkeyofImplCache
    }
    type MetadataSettings = typingsSlinky.semanticUiSearch.SemanticUI.Search.MetadataSettings.Param
    
    object RegExpSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default '(?:\s|^)'
          */
        var beginsWith: String = js.native
        
        /**
          * @default /[\-\[\]\/\{\}\(\)\*\+\?\.\\\^\$\|]/g
          */
        var escape: js.RegExp = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(beginsWith: String, escape: js.RegExp): Impl = {
          val __obj = js.Dynamic.literal(beginsWith = beginsWith.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBeginsWith(value: String): Self = StObject.set(x, "beginsWith", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEscape(value: js.RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplescapeEscape | PickImplbeginsWith) with PartialPickImplkeyofImplBeginsWith
    }
    type RegExpSettings = typingsSlinky.semanticUiSearch.SemanticUI.Search.RegExpSettings.Param
    
    object SelectorSettings {
      
      @js.native
      trait Impl extends StObject {
        
        /**
          * @default '.category'
          */
        var category: String = js.native
        
        /**
          * @default '.prompt'
          */
        var prompt: String = js.native
        
        /**
          * @default '.result'
          */
        var result: String = js.native
        
        /**
          * @default '.results'
          */
        var results: String = js.native
        
        /**
          * @default '.search.button'
          */
        var searchButton: String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(category: String, prompt: String, result: String, results: String, searchButton: String): Impl = {
          val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], searchButton = searchButton.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResults(value: String): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSearchButton(value: String): Self = StObject.set(x, "searchButton", value.asInstanceOf[js.Any])
        }
      }
      
      type Param = (PickImplprompt | PickImplsearchButton | PickImplresults | PickImplcategoryCategory | PickImplresult) with PartialPickImplkeyofImplPrompt
    }
    type SelectorSettings = typingsSlinky.semanticUiSearch.SemanticUI.Search.SelectorSettings.Param
    
    object TemplatesSettings {
      
      @js.native
      trait Impl extends StObject {
        
        def category(response: js.Any): String = js.native
        
        def escape(string: String): String = js.native
        
        def message(message: String, `type`: String): String = js.native
        
        def standard(response: js.Any): String = js.native
      }
      object Impl {
        
        @scala.inline
        def apply(
          category: js.Any => String,
          escape: String => String,
          message: (String, String) => String,
          standard: js.Any => String
        ): Impl = {
          val __obj = js.Dynamic.literal(category = js.Any.fromFunction1(category), escape = js.Any.fromFunction1(escape), message = js.Any.fromFunction2(message), standard = js.Any.fromFunction1(standard))
          __obj.asInstanceOf[Impl]
        }
        
        @scala.inline
        implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCategory(value: js.Any => String): Self = StObject.set(x, "category", js.Any.fromFunction1(value))
          
          @scala.inline
          def setEscape(value: String => String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
          
          @scala.inline
          def setMessage(value: (String, String) => String): Self = StObject.set(x, "message", js.Any.fromFunction2(value))
          
          @scala.inline
          def setStandard(value: js.Any => String): Self = StObject.set(x, "standard", js.Any.fromFunction1(value))
        }
      }
      
      type Param = (PickImplescape | PickImplmessage | PickImplcategory | PickImplstandard) with PartialPickImplkeyofImplCategory
    }
    type TemplatesSettings = typingsSlinky.semanticUiSearch.SemanticUI.Search.TemplatesSettings.Param
  }
  
  object SearchSettings {
    
    @js.native
    trait Impl extends StObject {
      
      // region Behavior
      /**
        * Settings for API call.
        *
        * @see {@link http://semantic-ui.com/behaviors/api.html#/usage}
        */
      var apiSettings: ApiSettings = js.native
      
      /**
        * Caches results locally to avoid requerying server
        *
        * @default true
        */
      var cache: Boolean = js.native
      
      /**
        * Class names used to determine element state
        */
      var className: ClassNameSettings = js.native
      
      /**
        * Debug output to console
        */
      var debug: Boolean = js.native
      
      /**
        * Duration of animation events
        *
        * @default 300
        */
      var duration: Double = js.native
      
      /**
        * Easing equation when using fallback Javascript animation
        *
        * @default 'easeOutExpo'
        */
      var easing: String = js.native
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings = js.native
      
      /**
        * List mapping display content to JSON property, either with API or source.
        */
      var fields: FieldsSettings = js.native
      
      /**
        * Delay before hiding results after search blur
        *
        * @default 0
        */
      var hideDelay: Double = js.native
      
      /**
        * Maximum results to display when using local and simple search, maximum category count for category search
        *
        * @default 7
        */
      var maxResults: Double = js.native
      
      /**
        * HTML5 metadata attributes used internally
        */
      var metadata: MetadataSettings = js.native
      
      /**
        * Minimum characters to query for results
        *
        * @default 1
        */
      var minCharacters: Double = js.native
      
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
      
      /**
        * Callback on server response
        */
      def onResults(response: js.Any): Unit = js.native
      
      /**
        * Callback after processing element template to add HTML to results. Function should return false to prevent default actions.
        */
      def onResultsAdd(html: String): `false` | Unit = js.native
      
      /**
        * Callback when results are closed
        */
      def onResultsClose(): Unit = js.native
      
      /**
        * Callback when results are opened
        */
      def onResultsOpen(): Unit = js.native
      
      /**
        * Callback on search query
        */
      def onSearchQuery(query: String): Unit = js.native
      
      // endregion
      // region Callbacks
      /**
        * Callback on element selection by user.
        * The first parameter includes the filtered response results for that element.
        * The function should return false to prevent default action (closing search results and selecting value).
        */
      def onSelect(result: js.Any, response: js.Any): `false` | Unit = js.native
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean = js.native
      
      // endregion
      // region DOM Settings
      /**
        * Regular expressions used for matching
        */
      var regExp: RegExpSettings = js.native
      
      /**
        * Delay before querying results on inputchange
        *
        * @default 100
        */
      var searchDelay: Double = js.native
      
      /**
        * Specify object properties inside local source object which will be searched
        */
      var searchFields: js.Array[String] = js.native
      
      /**
        * Return local results that match anywhere inside your content
        *
        * @default true
        */
      var searchFullText: Boolean = js.native
      
      /**
        * Whether the search should automatically select the first search result after searching
        *
        * @default false
        */
      var selectFirstResult: Boolean = js.native
      
      /**
        * Selectors used to find parts of a module
        */
      var selector: SelectorSettings = js.native
      
      /**
        * Whether a "no results" message should be shown if no results are found. (These messages can be modified using the template object specified below)
        *
        * @default false
        */
      var showNoResults: Boolean = js.native
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean = js.native
      
      /**
        * Specify a Javascript object which will be searched locally
        *
        * @default false
        */
      var source: `false` | js.Any = js.native
      
      // endregion
      // region Templates
      var templates: TemplatesSettings = js.native
      
      /**
        * Named transition to use when animating menu in and out. Fade and slide down are available without including ui transitions
        *
        * @default 'fade'
        * @see {@link http://semantic-ui.com/modules/transition.html}
        */
      var transition: String = js.native
      
      var `type`: String = js.native
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean = js.native
    }
    object Impl {
      
      @scala.inline
      def apply(
        apiSettings: ApiSettings,
        cache: Boolean,
        className: ClassNameSettings,
        debug: Boolean,
        duration: Double,
        easing: String,
        error: ErrorSettings,
        fields: FieldsSettings,
        hideDelay: Double,
        maxResults: Double,
        metadata: MetadataSettings,
        minCharacters: Double,
        name: String,
        namespace: String,
        onResults: js.Any => Unit,
        onResultsAdd: String => `false` | Unit,
        onResultsClose: () => Unit,
        onResultsOpen: () => Unit,
        onSearchQuery: String => Unit,
        onSelect: (js.Any, js.Any) => `false` | Unit,
        performance: Boolean,
        regExp: RegExpSettings,
        searchDelay: Double,
        searchFields: js.Array[String],
        searchFullText: Boolean,
        selectFirstResult: Boolean,
        selector: SelectorSettings,
        showNoResults: Boolean,
        silent: Boolean,
        source: `false` | js.Any,
        templates: TemplatesSettings,
        transition: String,
        `type`: String,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hideDelay = hideDelay.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], minCharacters = minCharacters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onResults = js.Any.fromFunction1(onResults), onResultsAdd = js.Any.fromFunction1(onResultsAdd), onResultsClose = js.Any.fromFunction0(onResultsClose), onResultsOpen = js.Any.fromFunction0(onResultsOpen), onSearchQuery = js.Any.fromFunction1(onSearchQuery), onSelect = js.Any.fromFunction2(onSelect), performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], searchDelay = searchDelay.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], searchFullText = searchFullText.asInstanceOf[js.Any], selectFirstResult = selectFirstResult.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], showNoResults = showNoResults.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      @scala.inline
      implicit class ImplMutableBuilder[Self <: Impl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiSettings(value: ApiSettings): Self = StObject.set(x, "apiSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFields(value: FieldsSettings): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinCharacters(value: Double): Self = StObject.set(x, "minCharacters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnResults(value: js.Any => Unit): Self = StObject.set(x, "onResults", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnResultsAdd(value: String => `false` | Unit): Self = StObject.set(x, "onResultsAdd", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnResultsClose(value: () => Unit): Self = StObject.set(x, "onResultsClose", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnResultsOpen(value: () => Unit): Self = StObject.set(x, "onResultsOpen", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnSearchQuery(value: String => Unit): Self = StObject.set(x, "onSearchQuery", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSelect(value: (js.Any, js.Any) => `false` | Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
        
        @scala.inline
        def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearchDelay(value: Double): Self = StObject.set(x, "searchDelay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearchFields(value: js.Array[String]): Self = StObject.set(x, "searchFields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSearchFieldsVarargs(value: String*): Self = StObject.set(x, "searchFields", js.Array(value :_*))
        
        @scala.inline
        def setSearchFullText(value: Boolean): Self = StObject.set(x, "searchFullText", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectFirstResult(value: Boolean): Self = StObject.set(x, "selectFirstResult", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShowNoResults(value: Boolean): Self = StObject.set(x, "showNoResults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(value: `false` | js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    type Param = (PickImplapiSettings | PickImpltype | PickImplminCharacters | PickImpltransition | PickImplduration | PickImplmaxResults | PickImplcache | PickImplsource | PickImplselectFirstResult | PickImplshowNoResults | PickImplsearchFullText | PickImplfields | PickImplsearchFields | PickImplhideDelay | PickImplsearchDelay | PickImpleasing | PickImplonSelect | PickImplonResultsAdd | PickImplonSearchQuery | PickImplonResults | PickImplonResultsOpen | PickImplonResultsClose | PickImpltemplates | PickImplregExp | PickImplselector | PickImplmetadata | PickImplclassName | PickImplerror | PickImplnamespace | PickImplname | PickImplsilent | PickImpldebug | PickImplperformance | PickImplverbose) with PartialPickImplkeyofImpl
  }
  /**
    * @see {@link http://semantic-ui.com/modules/search.html#/settings}
    */
  type SearchSettings = typingsSlinky.semanticUiSearch.SemanticUI.SearchSettings.Param
}
