package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactFragment
import typingsSlinky.wordpressBlockEditor.anon.OnClick
import typingsSlinky.wordpressBlockEditor.warningMod.Warning.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Warning {
  
  @JSImport("@wordpress/block-editor", "Warning")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def actions(value: ReactFragment): this.type = set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondaryActions(value: js.Array[OnClick]): this.type = set("secondaryActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondaryActionsVarargs(value: OnClick*): this.type = set("secondaryActions", js.Array(value :_*))
  }
  
  implicit def make(companion: Warning.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
