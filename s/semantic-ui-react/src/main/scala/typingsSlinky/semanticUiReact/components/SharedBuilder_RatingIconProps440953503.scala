package typingsSlinky.semanticUiReact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.ratingIconMod.RatingIconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_RatingIconProps440953503[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
  
  @scala.inline
  def onKeyUp(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps) => Unit): this.type = set("onKeyUp", js.Any.fromFunction2(value))
  
  @scala.inline
  def onMouseEnter(value: (/* event */ SyntheticMouseEvent[HTMLElement], /* data */ RatingIconProps) => Unit): this.type = set("onMouseEnter", js.Any.fromFunction2(value))
  
  @scala.inline
  def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
}
