package typingsSlinky.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlProperties extends js.Object {
  var Command: String = js.native
  var Id: String = js.native
  var Image16by16: String = js.native
  var Image16by16Class: String = js.native
  var Image16by16Left: Double = js.native
  var Image16by16Top: Double = js.native
  var Image32by32: String = js.native
  var Image32by32Class: String = js.native
  var Image32by32Left: Double = js.native
  var Image32by32Top: Double = js.native
  var LabelCss: String = js.native
  var LabelText: String = js.native
  var PopulateDynamically: String = js.native
  var PopulateOnlyOnce: String = js.native
  var PopulateQueryCommand: String = js.native
  var TemplateAlias: String = js.native
  var ToolTipDescription: String = js.native
  var ToolTipHelpKeyWord: String = js.native
  var ToolTipImage32by32: String = js.native
  var ToolTipImage32by32Class: String = js.native
  var ToolTipImage32by32Left: Double = js.native
  var ToolTipImage32by32Top: Double = js.native
  var ToolTipSelectedItemTitle: String = js.native
  var ToolTipShortcutKey: String = js.native
  var ToolTipTitle: String = js.native
  var Width: String = js.native
}

object ControlProperties {
  @scala.inline
  def apply(
    Command: String,
    Id: String,
    Image16by16: String,
    Image16by16Class: String,
    Image16by16Left: Double,
    Image16by16Top: Double,
    Image32by32: String,
    Image32by32Class: String,
    Image32by32Left: Double,
    Image32by32Top: Double,
    LabelCss: String,
    LabelText: String,
    PopulateDynamically: String,
    PopulateOnlyOnce: String,
    PopulateQueryCommand: String,
    TemplateAlias: String,
    ToolTipDescription: String,
    ToolTipHelpKeyWord: String,
    ToolTipImage32by32: String,
    ToolTipImage32by32Class: String,
    ToolTipImage32by32Left: Double,
    ToolTipImage32by32Top: Double,
    ToolTipSelectedItemTitle: String,
    ToolTipShortcutKey: String,
    ToolTipTitle: String,
    Width: String
  ): ControlProperties = {
    val __obj = js.Dynamic.literal(Command = Command.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Image16by16 = Image16by16.asInstanceOf[js.Any], Image16by16Class = Image16by16Class.asInstanceOf[js.Any], Image16by16Left = Image16by16Left.asInstanceOf[js.Any], Image16by16Top = Image16by16Top.asInstanceOf[js.Any], Image32by32 = Image32by32.asInstanceOf[js.Any], Image32by32Class = Image32by32Class.asInstanceOf[js.Any], Image32by32Left = Image32by32Left.asInstanceOf[js.Any], Image32by32Top = Image32by32Top.asInstanceOf[js.Any], LabelCss = LabelCss.asInstanceOf[js.Any], LabelText = LabelText.asInstanceOf[js.Any], PopulateDynamically = PopulateDynamically.asInstanceOf[js.Any], PopulateOnlyOnce = PopulateOnlyOnce.asInstanceOf[js.Any], PopulateQueryCommand = PopulateQueryCommand.asInstanceOf[js.Any], TemplateAlias = TemplateAlias.asInstanceOf[js.Any], ToolTipDescription = ToolTipDescription.asInstanceOf[js.Any], ToolTipHelpKeyWord = ToolTipHelpKeyWord.asInstanceOf[js.Any], ToolTipImage32by32 = ToolTipImage32by32.asInstanceOf[js.Any], ToolTipImage32by32Class = ToolTipImage32by32Class.asInstanceOf[js.Any], ToolTipImage32by32Left = ToolTipImage32by32Left.asInstanceOf[js.Any], ToolTipImage32by32Top = ToolTipImage32by32Top.asInstanceOf[js.Any], ToolTipSelectedItemTitle = ToolTipSelectedItemTitle.asInstanceOf[js.Any], ToolTipShortcutKey = ToolTipShortcutKey.asInstanceOf[js.Any], ToolTipTitle = ToolTipTitle.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlProperties]
  }
  @scala.inline
  implicit class ControlPropertiesOps[Self <: ControlProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage16by16(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image16by16")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage16by16Class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image16by16Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage16by16Left(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image16by16Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage16by16Top(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image16by16Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage32by32(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image32by32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage32by32Class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image32by32Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage32by32Left(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image32by32Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage32by32Top(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image32by32Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopulateDynamically(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PopulateDynamically")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopulateOnlyOnce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PopulateOnlyOnce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopulateQueryCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PopulateQueryCommand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolTipDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipHelpKeyWord(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolTipHelpKeyWord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipImage32by32(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolTipImage32by32")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipImage32by32Class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolTipImage32by32Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipImage32by32Left(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolTipImage32by32Left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipImage32by32Top(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolTipImage32by32Top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipSelectedItemTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolTipSelectedItemTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipShortcutKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolTipShortcutKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolTipTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolTipTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

