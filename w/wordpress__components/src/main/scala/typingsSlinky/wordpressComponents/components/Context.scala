package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.contextMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Context {
  @JSImport("@wordpress/components/slot-fill/context", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): SharedBuilder_Object_159303587[default] = new SharedBuilder_Object_159303587[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Context.type): SharedBuilder_Object_159303587[default] = new SharedBuilder_Object_159303587[default](js.Array(this.component, js.Dictionary.empty))()
}

