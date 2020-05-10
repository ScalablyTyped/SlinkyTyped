package typingsSlinky.uifabricStyling.isemantictextcolorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISemanticTextColors extends js.Object {
  /**
    * Color of text for accent button (kicker)
    */
  var accentButtonText: String = js.native
  /**
    * Neutral colored links and links for action buttons.
    */
  var actionLink: String = js.native
  /**
    * Hover state for neutral colored links and links for action buttons.
    */
  var actionLinkHovered: String = js.native
  /**
    * De-emphasized text; e.g. metadata, captions, placeholder text.
    */
  var bodySubtext: String = js.native
  /**
    * The default color for text.
    */
  var bodyText: String = js.native
  /**
    * Checked text color, e.g. selected menu item text.
    */
  var bodyTextChecked: String = js.native
  /**
    * Color of text in a standard button
    */
  var buttonText: String = js.native
  /**
    * Color of text in a checked standard button
    */
  var buttonTextChecked: String = js.native
  /**
    * Color of text in a checked and hovered standard button
    */
  var buttonTextCheckedHovered: String = js.native
  /**
    * Color of text in a disabled standard button
    */
  var buttonTextDisabled: String = js.native
  /**
    * Color of text in a hovered standard button
    */
  var buttonTextHovered: String = js.native
  /**
    * Color of text in a pressed standard button; i.e. currently being clicked by mouse
    */
  var buttonTextPressed: String = js.native
  /**
    * Disabled de-emphasized text, for use on the default background (bodyBackground).
    */
  var disabledBodySubtext: String = js.native
  /**
    * The default color for disabled text on the default background (bodyBackground).
    */
  var disabledBodyText: String = js.native
  /**
    * Disabled de-emphasized text, for use on disabledBackground.
    */
  var disabledSubtext: String = js.native
  /**
    * The default color for disabled text on top of disabledBackground; e.g. text in a disabled text field or
    * disabled button text.
    */
  var disabledText: String = js.native
  /**
    * The default color of error text on bodyBackground.
    */
  var errorText: String = js.native
  /**
    * The color of placeholder text.
    */
  var inputPlaceholderText: String = js.native
  /**
    * The color of input text.
    */
  var inputText: String = js.native
  /**
    * The color of input text on hover.
    */
  var inputTextHovered: String = js.native
  /**
    * The color of a link.
    */
  var link: String = js.native
  /**
    * The color of a hovered link. Also used when the link is active.
    */
  var linkHovered: String = js.native
  /**
    * The default text color for list item titles and text in column fields.
    */
  var listText: String = js.native
  /** @deprecated
    * This slot was incorrectly named. Use listText instead. */
  var listTextColor: String = js.native
  /**
    * Color of text in a primary button
    */
  var primaryButtonText: String = js.native
  /**
    * Color of text in a disabled primary button
    */
  var primaryButtonTextDisabled: String = js.native
  /**
    * Color of text in a hovered primary button
    */
  var primaryButtonTextHovered: String = js.native
  /**
    * Color of text in a pressed primary button; i.e. currently being clicked by mouse
    */
  var primaryButtonTextPressed: String = js.native
  /**
    * The default color of success text on successBackground.
    */
  var successText: String = js.native
  /**
    * The default color of text on errorBackground, warningBackground, blockingBackground, or successBackground.
    */
  var warningText: String = js.native
}

object ISemanticTextColors {
  @scala.inline
  def apply(
    accentButtonText: String,
    actionLink: String,
    actionLinkHovered: String,
    bodySubtext: String,
    bodyText: String,
    bodyTextChecked: String,
    buttonText: String,
    buttonTextChecked: String,
    buttonTextCheckedHovered: String,
    buttonTextDisabled: String,
    buttonTextHovered: String,
    buttonTextPressed: String,
    disabledBodySubtext: String,
    disabledBodyText: String,
    disabledSubtext: String,
    disabledText: String,
    errorText: String,
    inputPlaceholderText: String,
    inputText: String,
    inputTextHovered: String,
    link: String,
    linkHovered: String,
    listText: String,
    listTextColor: String,
    primaryButtonText: String,
    primaryButtonTextDisabled: String,
    primaryButtonTextHovered: String,
    primaryButtonTextPressed: String,
    successText: String,
    warningText: String
  ): ISemanticTextColors = {
    val __obj = js.Dynamic.literal(accentButtonText = accentButtonText.asInstanceOf[js.Any], actionLink = actionLink.asInstanceOf[js.Any], actionLinkHovered = actionLinkHovered.asInstanceOf[js.Any], bodySubtext = bodySubtext.asInstanceOf[js.Any], bodyText = bodyText.asInstanceOf[js.Any], bodyTextChecked = bodyTextChecked.asInstanceOf[js.Any], buttonText = buttonText.asInstanceOf[js.Any], buttonTextChecked = buttonTextChecked.asInstanceOf[js.Any], buttonTextCheckedHovered = buttonTextCheckedHovered.asInstanceOf[js.Any], buttonTextDisabled = buttonTextDisabled.asInstanceOf[js.Any], buttonTextHovered = buttonTextHovered.asInstanceOf[js.Any], buttonTextPressed = buttonTextPressed.asInstanceOf[js.Any], disabledBodySubtext = disabledBodySubtext.asInstanceOf[js.Any], disabledBodyText = disabledBodyText.asInstanceOf[js.Any], disabledSubtext = disabledSubtext.asInstanceOf[js.Any], disabledText = disabledText.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], inputPlaceholderText = inputPlaceholderText.asInstanceOf[js.Any], inputText = inputText.asInstanceOf[js.Any], inputTextHovered = inputTextHovered.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkHovered = linkHovered.asInstanceOf[js.Any], listText = listText.asInstanceOf[js.Any], listTextColor = listTextColor.asInstanceOf[js.Any], primaryButtonText = primaryButtonText.asInstanceOf[js.Any], primaryButtonTextDisabled = primaryButtonTextDisabled.asInstanceOf[js.Any], primaryButtonTextHovered = primaryButtonTextHovered.asInstanceOf[js.Any], primaryButtonTextPressed = primaryButtonTextPressed.asInstanceOf[js.Any], successText = successText.asInstanceOf[js.Any], warningText = warningText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISemanticTextColors]
  }
  @scala.inline
  implicit class ISemanticTextColorsOps[Self <: ISemanticTextColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccentButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionLinkHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionLinkHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodySubtext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodySubtext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyTextChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyTextChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTextChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTextCheckedHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextCheckedHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTextDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTextHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTextPressed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonTextPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledBodySubtext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledBodySubtext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledBodyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledBodyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledSubtext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledSubtext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputPlaceholderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPlaceholderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputTextHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTextHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryButtonTextDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonTextDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryButtonTextHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonTextHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryButtonTextPressed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonTextPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

