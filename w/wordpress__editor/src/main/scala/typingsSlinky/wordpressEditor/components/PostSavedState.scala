package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressEditor.postSavedStateMod.PostSavedState.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostSavedState {
  
  @JSImport("@wordpress/editor", "PostSavedState")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def forceIsDirty(value: Boolean): this.type = set("forceIsDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def forceIsSaving(value: Boolean): this.type = set("forceIsSaving", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PostSavedState.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
