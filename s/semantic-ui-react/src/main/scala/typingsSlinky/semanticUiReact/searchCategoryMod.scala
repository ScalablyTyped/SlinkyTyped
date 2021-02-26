package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.searchResultMod.SearchResultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchCategoryMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/SearchCategory", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SearchCategoryProps] = js.native
  
  @js.native
  trait SearchCategoryProps
    extends StrictSearchCategoryProps
       with /* key */ StringDictionary[js.Any]
  object SearchCategoryProps {
    
    @scala.inline
    def apply(): SearchCategoryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchCategoryProps]
    }
  }
  
  @js.native
  trait StrictSearchCategoryProps extends StObject {
    
    /** The item currently selected by keyboard shortcut. */
    var active: js.UndefOr[Boolean] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactElement] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /**
      * Renders the SearchCategory layout.
      *
      * @param {object} categoryContent - The Renderable SearchCategory contents.
      * @param {object} resultsContent - The Renderable SearchResult contents.
      * @returns {*} - Renderable SearchCategory layout.
      */
    var layoutRenderer: js.UndefOr[
        js.Function2[/* categoryContent */ ReactElement, /* resultsContent */ ReactElement, ReactElement]
      ] = js.native
    
    /** Display name. */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Renders the category contents.
      *
      * @param {object} props - The SearchCategory props object.
      * @returns {*} - Renderable category contents.
      */
    var renderer: js.UndefOr[js.Function1[/* props */ SearchCategoryProps, ReactElement]] = js.native
    
    /** Array of Search.Result props. */
    var results: js.UndefOr[js.Array[ReactComponentClass[SearchResultProps]]] = js.native
  }
  object StrictSearchCategoryProps {
    
    @scala.inline
    def apply(): StrictSearchCategoryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictSearchCategoryProps]
    }
    
    @scala.inline
    implicit class StrictSearchCategoryPropsMutableBuilder[Self <: StrictSearchCategoryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setLayoutRenderer(value: (/* categoryContent */ ReactElement, /* resultsContent */ ReactElement) => ReactElement): Self = StObject.set(x, "layoutRenderer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLayoutRendererUndefined: Self = StObject.set(x, "layoutRenderer", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRenderer(value: /* props */ SearchCategoryProps => ReactElement): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setResults(value: js.Array[ReactComponentClass[SearchResultProps]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setResultsVarargs(value: ReactComponentClass[SearchResultProps]*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
  
  type _To = ReactComponentClass[SearchCategoryProps]
  
  /* This means you don't have to write `default`, but can instead just say `searchCategoryMod.foo` */
  override def _to: ReactComponentClass[SearchCategoryProps] = default
}
