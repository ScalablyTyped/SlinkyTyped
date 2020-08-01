package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.react.mod.ReactType
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.inputInputMod.InputProps
import typingsSlinky.semanticUiReact.searchCategoryMod.SearchCategoryProps
import typingsSlinky.semanticUiReact.searchMod.default
import typingsSlinky.semanticUiReact.searchResultMod.SearchResultProps
import typingsSlinky.semanticUiReact.searchResultsMod.SearchResultsProps
import typingsSlinky.semanticUiReact.searchSearchMod.SearchProps
import typingsSlinky.semanticUiReact.searchSearchMod.SearchResultData
import typingsSlinky.semanticUiReact.semanticUiReactStrings.big
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Search {
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def aligned(value: String): this.type = set("aligned", value.asInstanceOf[js.Any])
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def category(value: Boolean): this.type = set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def categoryLayoutRenderer(value: /* props */ SearchCategoryProps => ReactElement): this.type = set("categoryLayoutRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def categoryRenderer(value: /* props */ SearchCategoryProps => ReactElement): this.type = set("categoryRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultOpen(value: Boolean): this.type = set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: js.Any): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def inputReactElement(value: ReactElement): this.type = set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def inputFunction3(
      value: (/* component */ ReactType[InputProps], InputProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
    ): this.type = set("input", js.Any.fromFunction3(value))
    @scala.inline
    def input(value: SemanticShorthandItem[InputProps]): this.type = set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def minCharacters(value: Double): this.type = set("minCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def noResultsDescriptionReactElement(value: ReactElement): this.type = set("noResultsDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def noResultsDescription(value: ReactElement): this.type = set("noResultsDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def noResultsMessageReactElement(value: ReactElement): this.type = set("noResultsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def noResultsMessage(value: ReactElement): this.type = set("noResultsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchProps) => Unit): this.type = set("onBlur", js.Any.fromFunction2(value))
    @scala.inline
    def onFocus(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchProps) => Unit): this.type = set("onFocus", js.Any.fromFunction2(value))
    @scala.inline
    def onMouseDown(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchProps) => Unit): this.type = set("onMouseDown", js.Any.fromFunction2(value))
    @scala.inline
    def onResultSelect(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ SearchResultData) => Unit): this.type = set("onResultSelect", js.Any.fromFunction2(value))
    @scala.inline
    def onSearchChange(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchProps) => Unit): this.type = set("onSearchChange", js.Any.fromFunction2(value))
    @scala.inline
    def onSelectionChange(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ SearchResultData) => Unit): this.type = set("onSelectionChange", js.Any.fromFunction2(value))
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def resultRenderer(value: /* props */ SearchResultProps => ReactElement): this.type = set("resultRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def resultsVarargs(value: js.Any*): this.type = set("results", js.Array(value :_*))
    @scala.inline
    def results(value: js.Array[_] | js.Object): this.type = set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def selectFirstResult(value: Boolean): this.type = set("selectFirstResult", value.asInstanceOf[js.Any])
    @scala.inline
    def showNoResults(value: Boolean): this.type = set("showNoResults", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: mini | tiny | small | large | big | huge | massive): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SearchProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Search.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Category {
    @JSImport("semantic-ui-react/dist/commonjs/modules/Search", "Category")
    @js.native
    object component extends js.Object
    
    def withProps(p: SearchCategoryProps): SharedBuilder_SearchCategoryProps1350341774 = new SharedBuilder_SearchCategoryProps1350341774(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Category.type): SharedBuilder_SearchCategoryProps1350341774 = new SharedBuilder_SearchCategoryProps1350341774(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object Result {
    @JSImport("semantic-ui-react/dist/commonjs/modules/Search", "Result")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
      @scala.inline
      def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
      @scala.inline
      def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
      @scala.inline
      def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
      @scala.inline
      def id(value: Double | String): this.type = set("id", value.asInstanceOf[js.Any])
      @scala.inline
      def image(value: String): this.type = set("image", value.asInstanceOf[js.Any])
      @scala.inline
      def onClick(value: (/* event */ SyntheticMouseEvent[HTMLDivElement], /* data */ SearchResultProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
      @scala.inline
      def price(value: String): this.type = set("price", value.asInstanceOf[js.Any])
      @scala.inline
      def renderer(value: /* props */ SearchResultProps => js.Array[ReactElement]): this.type = set("renderer", js.Any.fromFunction1(value))
    }
    
    def withProps(p: SearchResultProps): typingsSlinky.semanticUiReact.components.Search.Result.Builder = new typingsSlinky.semanticUiReact.components.Search.Result.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(title: String): typingsSlinky.semanticUiReact.components.Search.Result.Builder = {
        val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
        new typingsSlinky.semanticUiReact.components.Search.Result.Builder(js.Array(this.component, __props.asInstanceOf[SearchResultProps]))
    }
  }
  
  object Results {
    @JSImport("semantic-ui-react/dist/commonjs/modules/Search", "Results")
    @js.native
    object component extends js.Object
    
    def withProps(p: SearchResultsProps): SharedBuilder_SearchResultsProps_397260772 = new SharedBuilder_SearchResultsProps_397260772(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Results.type): SharedBuilder_SearchResultsProps_397260772 = new SharedBuilder_SearchResultsProps_397260772(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

