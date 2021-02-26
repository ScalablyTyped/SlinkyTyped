package typingsSlinky.semanticUiReact.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.searchCategoryMod.SearchCategoryProps
import typingsSlinky.semanticUiReact.searchResultMod.SearchResultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_SearchCategoryProps1350341774 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def layoutRenderer(value: (/* categoryContent */ ReactElement, /* resultsContent */ ReactElement) => ReactElement): this.type = set("layoutRenderer", js.Any.fromFunction2(value))
  
  @scala.inline
  def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  @scala.inline
  def renderer(value: /* props */ SearchCategoryProps => ReactElement): this.type = set("renderer", js.Any.fromFunction1(value))
  
  @scala.inline
  def results(value: js.Array[ReactComponentClass[SearchResultProps]]): this.type = set("results", value.asInstanceOf[js.Any])
  
  @scala.inline
  def resultsVarargs(value: ReactComponentClass[SearchResultProps]*): this.type = set("results", js.Array(value :_*))
}
