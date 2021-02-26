package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.a.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.paginationItemMod.PaginationItemProps
import typingsSlinky.semanticUiReact.semanticUiReactStrings.ellipsisItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.firstItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.lastItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.nextItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.pageItem
import typingsSlinky.semanticUiReact.semanticUiReactStrings.prevItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_PaginationItemProps_924001220[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(
    value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationItemProps) => Unit
  ): this.type = set("onClick", js.Any.fromFunction2(value))
  
  @scala.inline
  def onKeyDown(
    value: (/* event */ SyntheticMouseEvent[HTMLAnchorElement], /* data */ PaginationItemProps) => Unit
  ): this.type = set("onKeyDown", js.Any.fromFunction2(value))
  
  @scala.inline
  def `type`(value: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem): this.type = set("type", value.asInstanceOf[js.Any])
}
