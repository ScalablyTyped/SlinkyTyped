package typingsSlinky.wordpressBlockEditor.components

import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.wordpressBlockEditor.richTextMod.RichText.ContentProps
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.meter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ContentMeter {
  @JSImport("@wordpress/block-editor/components/rich-text", "default.Content_meter")
  @js.native
  object component extends js.Object
  
  def withProps(p: ContentProps[meter]): SharedBuilder_ContentProps529013342[LegacyRef[js.Any] with js.Object] = new SharedBuilder_ContentProps529013342[LegacyRef[js.Any] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(value: String): SharedBuilder_ContentProps529013342[LegacyRef[js.Any] with js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new SharedBuilder_ContentProps529013342[LegacyRef[js.Any] with js.Object](js.Array(this.component, __props.asInstanceOf[ContentProps[meter]]))
  }
}

