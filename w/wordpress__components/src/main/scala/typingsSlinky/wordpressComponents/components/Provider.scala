package typingsSlinky.wordpressComponents.components

import typingsSlinky.wordpressComponents.anon.Children
import typingsSlinky.wordpressComponents.providerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  @JSImport("@wordpress/components/drop-zone/provider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Children): SharedBuilder_Children1801684163[default] = new SharedBuilder_Children1801684163[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Provider.type): SharedBuilder_Children1801684163[default] = new SharedBuilder_Children1801684163[default](js.Array(this.component, js.Dictionary.empty))()
}

