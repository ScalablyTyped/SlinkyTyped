package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.buttonMod.URLInputButton.Props
import typingsSlinky.wordpressBlockEditor.buttonMod.default.^
import typingsSlinky.wordpressBlockEditor.urlInputMod.URLInput.PostType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  @JSImport("@wordpress/block-editor/components/url-input/button", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props287653343[^] = new SharedBuilder_Props287653343[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChange: (/* url */ String, /* post */ PostType | Null) => Unit, url: String): SharedBuilder_Props287653343[^] = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), url = url.asInstanceOf[js.Any])
    new SharedBuilder_Props287653343[^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

