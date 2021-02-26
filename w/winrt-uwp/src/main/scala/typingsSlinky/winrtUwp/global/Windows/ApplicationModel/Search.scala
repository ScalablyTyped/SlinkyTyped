package typingsSlinky.winrtUwp.global.Windows.ApplicationModel

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for the search pane in apps that participate in the Search contract. The search pane opens when users activate the Search charm and provides a consistent, touch-friendly search box and optional search suggestions. */
object Search {
  
  /** Provides access to search suggestions for the in-app SearchBox control and the search pane. */
  object Core {
    
    /** Provides data for the RequestingFocusOnKeyboardInput event. */
    @JSGlobal("Windows.ApplicationModel.Search.Core.RequestingFocusOnKeyboardInputEventArgs")
    @js.native
    abstract class RequestingFocusOnKeyboardInputEventArgs ()
      extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.Core.RequestingFocusOnKeyboardInputEventArgs
    
    /** Enables access to the search suggestions that the SearchSuggestionManager provides. */
    @JSGlobal("Windows.ApplicationModel.Search.Core.SearchSuggestion")
    @js.native
    abstract class SearchSuggestion ()
      extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestion
    
    /** Specifies the type of a SearchSuggestion . */
    @JSGlobal("Windows.ApplicationModel.Search.Core.SearchSuggestionKind")
    @js.native
    object SearchSuggestionKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind with Double
          ] = js.native
      
      /* 0 */ val query: typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind.query with Double = js.native
      
      /* 1 */ val result: typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind.result with Double = js.native
      
      /* 2 */ val separator: typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind.separator with Double = js.native
    }
    
    /** Manages access to search suggestions for the in-app SearchBox control. */
    @JSGlobal("Windows.ApplicationModel.Search.Core.SearchSuggestionManager")
    @js.native
    /** Initializes a new instance of the SearchSuggestionManager class. */
    class SearchSuggestionManager ()
      extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionManager
    
    /** Provides data for the SuggestionsRequested event. */
    @JSGlobal("Windows.ApplicationModel.Search.Core.SearchSuggestionsRequestedEventArgs")
    @js.native
    abstract class SearchSuggestionsRequestedEventArgs ()
      extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionsRequestedEventArgs
  }
  
  /** Stores settings that determine whether the app provides suggestions based on local files, and that define the criteria used to locate and filter these suggestions. */
  @JSGlobal("Windows.ApplicationModel.Search.LocalContentSuggestionSettings")
  @js.native
  /** Creates a new instance of the localContentSuggestionSettings class. */
  class LocalContentSuggestionSettings ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.LocalContentSuggestionSettings
  
  /** Represents and manages the search pane that opens when a user activates the Search charm. The search pane provides a consistent, touch-friendly search box and optional search suggestions. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPane")
  @js.native
  abstract class SearchPane ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchPane
  object SearchPane {
    
    /**
      * Retrieves an instance of the search pane from which users can search within the app.
      * @return An instance of the search pane, which provides a consistent, touch-friendly search box and optional search suggestions for searching within the current application.
      */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Search.SearchPane.getForCurrentView")
    @js.native
    def getForCurrentView(): typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchPane = js.native
    
    /** Hides the current app's UI. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Search.SearchPane.hideThisApplication")
    @js.native
    def hideThisApplication(): Unit = js.native
  }
  
  /** Provides data for a querychanged event that is associated with a searchPane object. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneQueryChangedEventArgs")
  @js.native
  abstract class SearchPaneQueryChangedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryChangedEventArgs
  
  /** Provides information about query text that the user enters through an Input Method Editor (IME). */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails")
  @js.native
  abstract class SearchPaneQueryLinguisticDetails ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails
  
  /** Provides data for a querysubmitted event that is associated with a searchPane instance. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs")
  @js.native
  abstract class SearchPaneQuerySubmittedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs
  
  /** Provides data for a resultsuggestionchosen event that is associated with a searchPane object. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneResultSuggestionChosenEventArgs")
  @js.native
  abstract class SearchPaneResultSuggestionChosenEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchPaneResultSuggestionChosenEventArgs
  
  /** Stores suggestions and information about the request for suggestions. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest")
  @js.native
  abstract class SearchPaneSuggestionsRequest ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest
  
  /** Enables the app to signal when it has finished populating a searchSuggestionCollection object while handling the suggestionsrequested event. Apps should use a deferral if and only if they need to respond to a request for suggestions asynchronously. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral")
  @js.native
  abstract class SearchPaneSuggestionsRequestDeferral ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral
  
  /** Provides data for a suggestionsrequested event that is associated with a searchPane object. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs")
  @js.native
  abstract class SearchPaneSuggestionsRequestedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs
  
  /** Provides data for a visibilitychanged event that is associated with a searchPane object. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneVisibilityChangedEventArgs")
  @js.native
  abstract class SearchPaneVisibilityChangedEventArgs ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchPaneVisibilityChangedEventArgs
  
  /** Provides information about query text that the user enters through an Input Method Editor (IME). */
  @JSGlobal("Windows.ApplicationModel.Search.SearchQueryLinguisticDetails")
  @js.native
  class SearchQueryLinguisticDetails protected ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchQueryLinguisticDetails {
    /**
      * Initializes a new instance of the SearchQueryLinguisticDetails class.
      * @param queryTextAlternatives A list of the text alternatives for the current query text.
      * @param queryTextCompositionStart The starting location of the text that the user is composing with an IME.
      * @param queryTextCompositionLength The length of the portion of the query text that the user is composing with an IME.
      */
    def this(
      queryTextAlternatives: IIterable[String],
      queryTextCompositionStart: Double,
      queryTextCompositionLength: Double
    ) = this()
  }
  
  /** Represents a collection of search suggestions to be displayed in the search pane in response to a suggestionsrequested event. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionCollection")
  @js.native
  abstract class SearchSuggestionCollection ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionCollection
  
  /** Stores suggestions and information about the request for suggestions. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionsRequest")
  @js.native
  abstract class SearchSuggestionsRequest ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionsRequest
  
  /** Enables the app to signal when it has finished populating a SearchSuggestionCollection object while handling the SuggestionsRequested event. Use a deferral if and only if your app needs to respond to a request for suggestions asynchronously. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionsRequestDeferral")
  @js.native
  abstract class SearchSuggestionsRequestDeferral ()
    extends typingsSlinky.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionsRequestDeferral
}
