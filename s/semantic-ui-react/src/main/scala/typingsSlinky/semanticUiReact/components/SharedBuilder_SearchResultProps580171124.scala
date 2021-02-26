package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.searchResultMod.SearchResultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_SearchResultProps580171124[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
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
