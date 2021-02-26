package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.anon.PartialProps
import typingsSlinky.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import typingsSlinky.wordpressComponents.toolbarButtonMod.ToolbarButton.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToolbarButton {
  
  @scala.inline
  def apply(
    icon: typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon,
    onClick: () => Unit,
    title: String
  ): Builder = {
    val __props = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components", "ToolbarButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def extraProps(value: PartialProps): this.type = set("extraProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isActive(value: Boolean): this.type = set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shortcut(value: ShortcutType): this.type = set("shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subscript(value: String): this.type = set("subscript", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
