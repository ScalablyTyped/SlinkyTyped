package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.wordpressBlockEditor.mod.URLInput.^
import typingsSlinky.wordpressBlockEditor.urlInputMod.URLInput.PostType
import typingsSlinky.wordpressBlockEditor.urlInputMod.URLInput.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object URLInput {
  @JSImport("@wordpress/block-editor", "URLInput")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props2040850355[^] = new SharedBuilder_Props2040850355[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChange: (String, js.UndefOr[PostType]) => Unit, value: String): SharedBuilder_Props2040850355[^] = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), value = value.asInstanceOf[js.Any])
    new SharedBuilder_Props2040850355[^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

object UrlInput {
  @JSImport("@wordpress/block-editor/components/url-input", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props2040850355[typingsSlinky.wordpressBlockEditor.urlInputMod.default.^] = new SharedBuilder_Props2040850355[typingsSlinky.wordpressBlockEditor.urlInputMod.default.^](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onChange: (String, js.UndefOr[PostType]) => Unit, value: String): SharedBuilder_Props2040850355[typingsSlinky.wordpressBlockEditor.urlInputMod.default.^] = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), value = value.asInstanceOf[js.Any])
    new SharedBuilder_Props2040850355[typingsSlinky.wordpressBlockEditor.urlInputMod.default.^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

