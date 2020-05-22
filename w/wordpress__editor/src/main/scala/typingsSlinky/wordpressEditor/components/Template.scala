package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.templateMod.PageTemplate.Props
import typingsSlinky.wordpressEditor.templateMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Template {
  @JSImport("@wordpress/editor/components/page-attributes/template", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_483516479[^] = new SharedBuilder_Props_483516479[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Template.type): SharedBuilder_Props_483516479[^] = new SharedBuilder_Props_483516479[^](js.Array(this.component, js.Dictionary.empty))()
}

