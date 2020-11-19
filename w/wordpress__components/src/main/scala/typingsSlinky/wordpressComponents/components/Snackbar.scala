package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.noticeMod.Notice.Action
import typingsSlinky.wordpressComponents.snackbarMod.Snackbar.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Snackbar {
  
  @JSImport("@wordpress/components", "Snackbar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def actionsVarargs(value: Action*): this.type = set("actions", js.Array(value :_*))
    
    @scala.inline
    def actions(value: js.Array[Action]): this.type = set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRemove(value: () => Unit): this.type = set("onRemove", js.Any.fromFunction0(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Snackbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
