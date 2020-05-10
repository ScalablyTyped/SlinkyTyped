package typingsSlinky.vue2Editor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueEditorProps extends js.Object {
  var disabled: Boolean = js.native
  var editorOptions: js.Any = js.native
  var editorToolbar: js.Array[_] = js.native
  var id: String = js.native
  var placeholder: String = js.native
  var useCustomImageHandler: js.Any = js.native
  var useMarkdownShortcuts: Boolean = js.native
  var value: String = js.native
}

object VueEditorProps {
  @scala.inline
  def apply(
    disabled: Boolean,
    editorOptions: js.Any,
    editorToolbar: js.Array[_],
    id: String,
    placeholder: String,
    useCustomImageHandler: js.Any,
    useMarkdownShortcuts: Boolean,
    value: String
  ): VueEditorProps = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], editorOptions = editorOptions.asInstanceOf[js.Any], editorToolbar = editorToolbar.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], useCustomImageHandler = useCustomImageHandler.asInstanceOf[js.Any], useMarkdownShortcuts = useMarkdownShortcuts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueEditorProps]
  }
  @scala.inline
  implicit class VueEditorPropsOps[Self <: VueEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorToolbar(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseCustomImageHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCustomImageHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseMarkdownShortcuts(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMarkdownShortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

