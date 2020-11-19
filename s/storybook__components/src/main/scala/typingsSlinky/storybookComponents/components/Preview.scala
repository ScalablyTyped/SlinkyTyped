package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.previewMod.PreviewProps
import typingsSlinky.storybookComponents.sourceMod.SourceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Preview {
  
  @JSImport("@storybook/components", "Preview")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def columns(value: Double): this.type = set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isColumn(value: Boolean): this.type = set("isColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isExpanded(value: Boolean): this.type = set("isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def withSource(value: SourceProps): this.type = set("withSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def withToolbar(value: Boolean): this.type = set("withToolbar", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PreviewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Preview.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
