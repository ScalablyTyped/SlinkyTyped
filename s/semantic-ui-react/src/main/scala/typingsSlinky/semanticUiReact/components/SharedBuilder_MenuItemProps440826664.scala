package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.a.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.iconIconMod.IconProps
import typingsSlinky.semanticUiReact.menuItemMod.MenuItemProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.horizontally
import typingsSlinky.semanticUiReact.semanticUiReactStrings.left
import typingsSlinky.semanticUiReact.semanticUiReactStrings.right
import typingsSlinky.semanticUiReact.semanticUiReactStrings.vertically
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_MenuItemProps440826664[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
  
  @scala.inline
  def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def fitted(value: Boolean | horizontally | vertically): this.type = set("fitted", value.asInstanceOf[js.Any])
  
  @scala.inline
  def header(value: Boolean): this.type = set("header", value.asInstanceOf[js.Any])
  
  @scala.inline
  def icon(value: Boolean | SemanticShorthandItem[IconProps]): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def iconFunction3(
    value: (/* component */ ReactElement, IconProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("icon", js.Any.fromFunction3(value))
  
  @scala.inline
  def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
  
  @scala.inline
  def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
  
  @scala.inline
  def link(value: Boolean): this.type = set("link", value.asInstanceOf[js.Any])
  
  @scala.inline
  def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ MenuItemProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
  
  @scala.inline
  def position(value: left | right): this.type = set("position", value.asInstanceOf[js.Any])
}
