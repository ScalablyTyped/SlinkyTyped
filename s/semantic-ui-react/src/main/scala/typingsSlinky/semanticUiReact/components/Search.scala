package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.inputInputMod.InputProps
import typingsSlinky.semanticUiReact.searchCategoryMod.SearchCategoryProps
import typingsSlinky.semanticUiReact.searchMod.default
import typingsSlinky.semanticUiReact.searchResultMod.SearchResultProps
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
      value: (/* component */ ReactComponentClass[InputProps], InputProps, /* children */ js.UndefOr[TagMod[Any] | ReactNodeArray]) => ReactElement | Null
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
    def noResultsDescription(value: TagMod[Any]): this.type = set("noResultsDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def noResultsMessageReactElement(value: ReactElement): this.type = set("noResultsMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def noResultsMessage(value: TagMod[Any]): this.type = set("noResultsMessage", value.asInstanceOf[js.Any])
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
}

