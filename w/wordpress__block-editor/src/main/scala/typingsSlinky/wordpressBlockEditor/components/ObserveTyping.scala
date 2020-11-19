package typingsSlinky.wordpressBlockEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.wordpressBlockEditor.observeTypingMod.ObserveTyping.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ObserveTyping {
  
  @JSImport("@wordpress/block-editor", "ObserveTyping")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ObserveTyping.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}
