package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Choice field in list form or in list view in grid mode */
@js.native
trait FieldSchemaInFormMultiLineText extends FieldSchemaInForm {
  /** A boolean value that specifies whether hyperlinks can be used in this fields. */
  var AllowHyperlink: Boolean = js.native
  /** Changes are appended to the existing text. */
  var AppendOnly: Boolean = js.native
  /** Number of lines configured to display */
  var NumberOfLines: Double = js.native
  /** Specifies whether rich text formatting can be used in the field */
  var RichText: Boolean = js.native
  /** Rich text mode for the field */
  var RichTextMode: typingsSlinky.sharepoint.SPClientTemplates.RichTextMode = js.native
  /** WebPartAdderId for the ScriptEditorWebPart */
  var ScriptEditorAdderId: String = js.native
}

object FieldSchemaInFormMultiLineText {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    AllowHyperlink: Boolean,
    AppendOnly: Boolean,
    Description: String,
    Direction: String,
    FieldType: String,
    Hidden: Boolean,
    IMEMode: js.Any,
    Id: String,
    Name: String,
    NumberOfLines: Double,
    ReadOnlyField: Boolean,
    Required: Boolean,
    RestrictedMode: Boolean,
    RichText: Boolean,
    RichTextMode: RichTextMode,
    ScriptEditorAdderId: String,
    Title: String,
    Type: String,
    UseMinWidth: Boolean
  ): FieldSchemaInFormMultiLineText = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], AllowHyperlink = AllowHyperlink.asInstanceOf[js.Any], AppendOnly = AppendOnly.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberOfLines = NumberOfLines.asInstanceOf[js.Any], ReadOnlyField = ReadOnlyField.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], RestrictedMode = RestrictedMode.asInstanceOf[js.Any], RichText = RichText.asInstanceOf[js.Any], RichTextMode = RichTextMode.asInstanceOf[js.Any], ScriptEditorAdderId = ScriptEditorAdderId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseMinWidth = UseMinWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInFormMultiLineText]
  }
  @scala.inline
  implicit class FieldSchemaInFormMultiLineTextOps[Self <: FieldSchemaInFormMultiLineText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHyperlink(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowHyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppendOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRichText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RichText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRichTextMode(value: RichTextMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RichTextMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScriptEditorAdderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptEditorAdderId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

