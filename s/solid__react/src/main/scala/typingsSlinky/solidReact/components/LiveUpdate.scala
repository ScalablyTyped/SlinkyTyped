package typingsSlinky.solidReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.solidReact.anon.Subscribe
import typingsSlinky.solidReact.solidReactStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LiveUpdate {
  
  @JSImport("@solid/react", "LiveUpdate")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.solidReact.mod.LiveUpdate] {
    
    @scala.inline
    def subscribeVarargs(value: String*): this.type = set("subscribe", js.Array(value :_*))
    
    @scala.inline
    def subscribe(value: Asterisk | String | js.Array[String]): this.type = set("subscribe", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Subscribe): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: LiveUpdate.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
