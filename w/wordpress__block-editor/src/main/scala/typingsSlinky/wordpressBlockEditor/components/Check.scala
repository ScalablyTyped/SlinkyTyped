package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.checkMod.MediaUploadCheck.Props
import typingsSlinky.wordpressBlockEditor.checkMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Check {
  @JSImport("@wordpress/block-editor/components/media-upload/check", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props514487788[^] = new SharedBuilder_Props514487788[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Check.type): SharedBuilder_Props514487788[^] = new SharedBuilder_Props514487788[^](js.Array(this.component, js.Dictionary.empty))()
}

