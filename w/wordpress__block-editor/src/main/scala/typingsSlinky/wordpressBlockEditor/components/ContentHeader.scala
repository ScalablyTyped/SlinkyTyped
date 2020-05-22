package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.wordpressBlockEditor.richTextMod.RichText.ContentProps
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ContentHeader {
  @JSImport("@wordpress/block-editor/components/rich-text", "default.Content_header")
  @js.native
  object component extends js.Object
  
  def withProps(p: ContentProps[header]): SharedBuilder_ContentProps760636734[LegacyRef[js.Any] with js.Object] = new SharedBuilder_ContentProps760636734[LegacyRef[js.Any] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: String): SharedBuilder_ContentProps760636734[LegacyRef[js.Any] with js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new SharedBuilder_ContentProps760636734[LegacyRef[js.Any] with js.Object](js.Array(this.component, __props.asInstanceOf[ContentProps[header]]))
  }
}

