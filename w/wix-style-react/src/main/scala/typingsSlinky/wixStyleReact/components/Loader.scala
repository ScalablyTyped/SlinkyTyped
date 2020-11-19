package typingsSlinky.wixStyleReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wixStyleReact.loaderMod.LoaderColor
import typingsSlinky.wixStyleReact.loaderMod.LoaderProps
import typingsSlinky.wixStyleReact.loaderMod.LoaderSize
import typingsSlinky.wixStyleReact.loaderMod.LoaderStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Loader {
  
  @JSImport("wix-style-react", "Loader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.wixStyleReact.mod.Loader] {
    
    @scala.inline
    def color(value: LoaderColor): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldLoadAsync(value: Boolean): this.type = set("shouldLoadAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: LoaderSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def status(value: LoaderStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def statusMessage(value: String): this.type = set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: String): this.type = set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def textReactElement(value: ReactElement): this.type = set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def text(value: ReactElement): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Loader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
