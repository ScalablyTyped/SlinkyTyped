package typingsSlinky.wordpressBlockEditor.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.inserterMod.Inserter.Props
import typingsSlinky.wordpressComponents.dropdownMod.Dropdown.RenderProps
import typingsSlinky.wordpressComponents.popoverMod.Popover.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Inserter {
  
  @JSImport("@wordpress/block-editor", "Inserter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def clientId(value: String): this.type = set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isAppender(value: Boolean): this.type = set("isAppender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onToggle(value: /* isOpen */ Boolean => Unit): this.type = set("onToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderToggle(value: /* props */ RenderProps => ReactElement): this.type = set("renderToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def rootClientId(value: String): this.type = set("rootClientId", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Inserter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
