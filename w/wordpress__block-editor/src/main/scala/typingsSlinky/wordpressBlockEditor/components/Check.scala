package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.checkMod.MediaUploadCheck.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Check {
  
  @JSImport("@wordpress/block-editor/components/media-upload/check", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Check.type): SharedBuilder_Props_520543459 = new SharedBuilder_Props_520543459(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_520543459 = new SharedBuilder_Props_520543459(js.Array(this.component, p.asInstanceOf[js.Any]))
}
