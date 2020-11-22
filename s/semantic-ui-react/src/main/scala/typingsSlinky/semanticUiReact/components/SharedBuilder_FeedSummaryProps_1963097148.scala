package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.semanticUiReact.feedDateMod.FeedDateProps
import typingsSlinky.semanticUiReact.feedUserMod.FeedUserProps
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_FeedSummaryProps_1963097148 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dateReactElement(value: ReactElement): this.type = set("date", value.asInstanceOf[js.Any])
  
  @scala.inline
  def dateFunction3(
    value: (/* component */ ReactElement, FeedDateProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("date", js.Any.fromFunction3(value))
  
  @scala.inline
  def date(value: SemanticShorthandItem[FeedDateProps]): this.type = set("date", value.asInstanceOf[js.Any])
  
  @scala.inline
  def userReactElement(value: ReactElement): this.type = set("user", value.asInstanceOf[js.Any])
  
  @scala.inline
  def userFunction3(
    value: (/* component */ ReactElement, FeedUserProps, /* children */ js.UndefOr[ReactElement | ReactNodeArray]) => ReactElement | Null
  ): this.type = set("user", js.Any.fromFunction3(value))
  
  @scala.inline
  def user(value: SemanticShorthandItem[FeedUserProps]): this.type = set("user", value.asInstanceOf[js.Any])
}
