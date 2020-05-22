package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.wordpressBlockEditor.richTextMod.RichText.ContentProps
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.h2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RichTextContentH2 {
  @JSImport("@wordpress/block-editor", "RichText.Content_h2")
  @js.native
  object component extends js.Object
  
  def withProps(p: ContentProps[h2]): SharedBuilder_ContentProps_1545598072[LegacyRef[js.Any] with js.Object] = new SharedBuilder_ContentProps_1545598072[LegacyRef[js.Any] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: String): SharedBuilder_ContentProps_1545598072[LegacyRef[js.Any] with js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new SharedBuilder_ContentProps_1545598072[LegacyRef[js.Any] with js.Object](js.Array(this.component, __props.asInstanceOf[ContentProps[h2]]))
  }
}

