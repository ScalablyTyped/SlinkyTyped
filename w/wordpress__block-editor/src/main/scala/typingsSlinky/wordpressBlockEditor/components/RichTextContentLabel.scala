package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.wordpressBlockEditor.richTextMod.RichText.ContentProps
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RichTextContentLabel {
  @JSImport("@wordpress/block-editor", "RichText.Content_label")
  @js.native
  object component extends js.Object
  
  def withProps(p: ContentProps[label]): SharedBuilder_ContentProps1834534581[LegacyRef[js.Any] with js.Object] = new SharedBuilder_ContentProps1834534581[LegacyRef[js.Any] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: String): SharedBuilder_ContentProps1834534581[LegacyRef[js.Any] with js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new SharedBuilder_ContentProps1834534581[LegacyRef[js.Any] with js.Object](js.Array(this.component, __props.asInstanceOf[ContentProps[label]]))
  }
}

