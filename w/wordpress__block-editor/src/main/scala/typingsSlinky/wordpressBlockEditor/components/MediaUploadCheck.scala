package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.checkMod.MediaUploadCheck.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MediaUploadCheck {
  @JSImport("@wordpress/block-editor", "MediaUploadCheck")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props_520543459 = new SharedBuilder_Props_520543459(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MediaUploadCheck.type): SharedBuilder_Props_520543459 = new SharedBuilder_Props_520543459(js.Array(this.component, js.Dictionary.empty))()
}

