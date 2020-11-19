package typingsSlinky.storybookComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookComponents.sourceMod.SourceError
import typingsSlinky.storybookComponents.sourceMod.SourceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Source {
  
  @JSImport("@storybook/components", "Source")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def code(value: String): this.type = set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dark(value: Boolean): this.type = set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def error(value: SourceError): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def format(value: Boolean): this.type = set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def language(value: String): this.type = set("language", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SourceProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Source.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
