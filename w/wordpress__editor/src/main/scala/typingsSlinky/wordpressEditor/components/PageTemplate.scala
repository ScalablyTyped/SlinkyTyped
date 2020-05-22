package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.mod.PageTemplate.^
import typingsSlinky.wordpressEditor.templateMod.PageTemplate.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageTemplate {
  @JSImport("@wordpress/editor", "PageTemplate")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_483516479[^] = new SharedBuilder_Props_483516479[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PageTemplate.type): SharedBuilder_Props_483516479[^] = new SharedBuilder_Props_483516479[^](js.Array(this.component, js.Dictionary.empty))()
}

