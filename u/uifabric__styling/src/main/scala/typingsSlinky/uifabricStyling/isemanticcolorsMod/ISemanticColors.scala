package typingsSlinky.uifabricStyling.isemanticcolorsMod

import typingsSlinky.uifabricStyling.isemantictextcolorsMod.ISemanticTextColors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISemanticColors extends ISemanticTextColors {
  /**
    * Background of an accent button (kicker)
    */
  var accentButtonBackground: String = js.native
  /**
    * Background for blocking issues, which is more severe than a warning, but not as bad as an error.
    */
  var blockingBackground: String = js.native
  /**
    * The default color for backgrounds.
    */
  var bodyBackground: String = js.native
  /**
    * The default background color of selected interactable elements that don't have their own backgrounds.
    * e.g. indicates in the nav which page you're currently on
    */
  var bodyBackgroundChecked: String = js.native
  /**
    * The default hover color for the backgrounds of interactable elements that don't have their own backgrounds.
    * e.g. if links had hover backgrounds, they'd use this
    */
  var bodyBackgroundHovered: String = js.native
  /**
    * Divider lines; e.g. lines that separate sections in a menu, an <HR> element.
    */
  var bodyDivider: String = js.native
  /**
    * The color for chrome adjacent to an area with bodyBackground.
    * This can be used to provide visual separation of zones when using stronger colors, when using a divider line
    * is not desired.
    * In most themes, this should match the color of bodyBackground.
    * See also: bodyFrameDivider
    */
  var bodyFrameBackground: String = js.native
  /**
    * Used as the border between a zone with bodyFrameBackground and a zone with bodyBackground.
    * If bodyBackground and bodyFrameBackground are different, this should be the same color as bodyFrameBackground
    * in order to visually disappear.
    * See also: bodyFrameBackground
    */
  var bodyFrameDivider: String = js.native
  /**
    * The standout color for highlighted content backgrounds.
    * For highlighted content when there is no emphasis, use the neutral variant instead.
    * This should be a shade darker than bodyBackground in light themes,
    * and a shade lighter in inverted themes.
    */
  var bodyStandoutBackground: String = js.native
  /**
    * Background of a standard button
    */
  var buttonBackground: String = js.native
  /**
    * Background of a checked standard button; e.g. bold/italicize/underline text button in toolbar
    */
  var buttonBackgroundChecked: String = js.native
  /**
    * Background of a checked and hovered standard button; e.g. bold/italicize/underline text button in toolbar
    */
  var buttonBackgroundCheckedHovered: String = js.native
  /**
    * Background of a disabled standard button
    */
  var buttonBackgroundDisabled: String = js.native
  /**
    * Background of a hovered standard button
    */
  var buttonBackgroundHovered: String = js.native
  /**
    * Background of a pressed standard button; i.e. currently being clicked by mouse
    */
  var buttonBackgroundPressed: String = js.native
  /**
    * Border of a standard button
    */
  var buttonBorder: String = js.native
  /**
    * Border of a disabled standard button
    */
  var buttonBorderDisabled: String = js.native
  /**
    * Background color for default/empty state graphical elements; eg default icons, empty section that
    * needs user to fill in content, placeholder graphics, empty seats, etc.
    */
  var defaultStateBackground: String = js.native
  /**
    * The default color for backgrounds of disabled controls; e.g. disabled text field.
    */
  var disabledBackground: String = js.native
  /**
    * The default color for border of disabled controls; e.g. disabled slider, disabled toggle border.
    */
  var disabledBorder: String = js.native
  /**
    * The background for errors, if necessary, or highlighting the section of the page where the error is present.
    */
  var errorBackground: String = js.native
  /**
    * The color of the outline around focused controls that don't already have a border; e.g. menu items
    */
  var focusBorder: String = js.native
  /**
    * The background color of an input, e.g. textbox background.
    */
  var inputBackground: String = js.native
  /**
    * The background of a checked control; e.g. checked radio button's dot, checked toggle's background.
    */
  var inputBackgroundChecked: String = js.native
  /**
    * The background of a checked and hovered control; e.g. checked checkbox's background color on hover.
    */
  var inputBackgroundCheckedHovered: String = js.native
  /**
    * The border of a large input control in its resting, state; e.g. the box of dropdown.
    */
  var inputBorder: String = js.native
  /**
    * The border color of a large hovered input control, such as textbox.
    */
  var inputBorderHovered: String = js.native
  /**
    * The alternate focus border color for elements that already have a border; e.g. text field borders on focus.
    */
  var inputFocusBorderAlt: String = js.native
  /**
    * The foreground of a checked control; e.g. checked checkbox's checkmark color, checked toggle's thumb color,
    * radio button's background color around the dot.
    */
  var inputForegroundChecked: String = js.native
  /**
    * The color for icon ; e.g. SearchBox magnifying glass in rest state.
    */
  var inputIcon: String = js.native
  /**
    * The color for disabled icon ; e.g. SearchBox magnifying glass in disabled state.
    */
  var inputIconDisabled: String = js.native
  /**
    * The color for hovered icon ; e.g. SearchBox magnifying glass in hovered state.
    */
  var inputIconHovered: String = js.native
  /**
    * The placeholder background color of a checked control, e.g. slider background, spinner background.
    */
  var inputPlaceholderBackgroundChecked: String = js.native
  /**
    * The background color for the entire list.
    */
  var listBackground: String = js.native
  /**
    * The background color for a hovered list header.
    */
  var listHeaderBackgroundHovered: String = js.native
  /**
    * The background color for a pressed list header.
    */
  var listHeaderBackgroundPressed: String = js.native
  /**
    * The background color of a checked list item.
    */
  var listItemBackgroundChecked: String = js.native
  /**
    * The background color of a checked and hovered list item.
    */
  var listItemBackgroundCheckedHovered: String = js.native
  /**
    * The background color of a hovered list item.
    */
  var listItemBackgroundHovered: String = js.native
  /**
    * The background of a menu.
    */
  var menuBackground: String = js.native
  /**
    * The divider between menu items.
    */
  var menuDivider: String = js.native
  /**
    * The headers in menus that denote title of a section.
    */
  var menuHeader: String = js.native
  /**
    * The default colors of icons in menus.
    */
  var menuIcon: String = js.native
  /**
    * @deprecated
    * (Checked menu items no longer get a background color.)
    * The background of checked menu item; e.g. a menu item whose submenu is open, a selected dropdown item.
    */
  var menuItemBackgroundChecked: String = js.native
  /**
    * The background of a hovered menu item.
    */
  var menuItemBackgroundHovered: String = js.native
  /**
    * The background of a pressed menu item.
    */
  var menuItemBackgroundPressed: String = js.native
  /**
    * The text color of a menu item.
    */
  var menuItemText: String = js.native
  /**
    * The text color of a hovered menu item.
    */
  var menuItemTextHovered: String = js.native
  /**
    * Background of a primary button
    */
  var primaryButtonBackground: String = js.native
  /**
    * Background of a disabled primary button
    */
  var primaryButtonBackgroundDisabled: String = js.native
  /**
    * Background of a hovered primary button
    */
  var primaryButtonBackgroundHovered: String = js.native
  /**
    * Background of a pressed primary button; i.e. currently being clicked by mouse
    */
  var primaryButtonBackgroundPressed: String = js.native
  /**
    * Border of a primary button
    */
  var primaryButtonBorder: String = js.native
  /**
    * The border of a small input control in its resting unchecked state; e.g. the box of an unchecked checkbox.
    */
  var smallInputBorder: String = js.native
  /**
    * Background for success
    */
  var successBackground: String = js.native
  /**
    * The color of the border that provides contrast between an element, such as a card, and an emphasized background.
    */
  var variantBorder: String = js.native
  /**
    * Hover color of border that provides contrast between an element, such as a card, and an emphasized background.
    */
  var variantBorderHovered: String = js.native
  /**
    * Background for warning messages.
    */
  var warningBackground: String = js.native
  /**
    * Foreground color for warning highlights
    */
  var warningHighlight: String = js.native
}

object ISemanticColors {
  @scala.inline
  def apply(
    accentButtonBackground: String,
    accentButtonText: String,
    actionLink: String,
    actionLinkHovered: String,
    blockingBackground: String,
    bodyBackground: String,
    bodyBackgroundChecked: String,
    bodyBackgroundHovered: String,
    bodyDivider: String,
    bodyFrameBackground: String,
    bodyFrameDivider: String,
    bodyStandoutBackground: String,
    bodySubtext: String,
    bodyText: String,
    bodyTextChecked: String,
    buttonBackground: String,
    buttonBackgroundChecked: String,
    buttonBackgroundCheckedHovered: String,
    buttonBackgroundDisabled: String,
    buttonBackgroundHovered: String,
    buttonBackgroundPressed: String,
    buttonBorder: String,
    buttonBorderDisabled: String,
    buttonText: String,
    buttonTextChecked: String,
    buttonTextCheckedHovered: String,
    buttonTextDisabled: String,
    buttonTextHovered: String,
    buttonTextPressed: String,
    defaultStateBackground: String,
    disabledBackground: String,
    disabledBodySubtext: String,
    disabledBodyText: String,
    disabledBorder: String,
    disabledSubtext: String,
    disabledText: String,
    errorBackground: String,
    errorText: String,
    focusBorder: String,
    inputBackground: String,
    inputBackgroundChecked: String,
    inputBackgroundCheckedHovered: String,
    inputBorder: String,
    inputBorderHovered: String,
    inputFocusBorderAlt: String,
    inputForegroundChecked: String,
    inputIcon: String,
    inputIconDisabled: String,
    inputIconHovered: String,
    inputPlaceholderBackgroundChecked: String,
    inputPlaceholderText: String,
    inputText: String,
    inputTextHovered: String,
    link: String,
    linkHovered: String,
    listBackground: String,
    listHeaderBackgroundHovered: String,
    listHeaderBackgroundPressed: String,
    listItemBackgroundChecked: String,
    listItemBackgroundCheckedHovered: String,
    listItemBackgroundHovered: String,
    listText: String,
    listTextColor: String,
    menuBackground: String,
    menuDivider: String,
    menuHeader: String,
    menuIcon: String,
    menuItemBackgroundChecked: String,
    menuItemBackgroundHovered: String,
    menuItemBackgroundPressed: String,
    menuItemText: String,
    menuItemTextHovered: String,
    primaryButtonBackground: String,
    primaryButtonBackgroundDisabled: String,
    primaryButtonBackgroundHovered: String,
    primaryButtonBackgroundPressed: String,
    primaryButtonBorder: String,
    primaryButtonText: String,
    primaryButtonTextDisabled: String,
    primaryButtonTextHovered: String,
    primaryButtonTextPressed: String,
    smallInputBorder: String,
    successBackground: String,
    successText: String,
    variantBorder: String,
    variantBorderHovered: String,
    warningBackground: String,
    warningHighlight: String,
    warningText: String
  ): ISemanticColors = {
    val __obj = js.Dynamic.literal(accentButtonBackground = accentButtonBackground.asInstanceOf[js.Any], accentButtonText = accentButtonText.asInstanceOf[js.Any], actionLink = actionLink.asInstanceOf[js.Any], actionLinkHovered = actionLinkHovered.asInstanceOf[js.Any], blockingBackground = blockingBackground.asInstanceOf[js.Any], bodyBackground = bodyBackground.asInstanceOf[js.Any], bodyBackgroundChecked = bodyBackgroundChecked.asInstanceOf[js.Any], bodyBackgroundHovered = bodyBackgroundHovered.asInstanceOf[js.Any], bodyDivider = bodyDivider.asInstanceOf[js.Any], bodyFrameBackground = bodyFrameBackground.asInstanceOf[js.Any], bodyFrameDivider = bodyFrameDivider.asInstanceOf[js.Any], bodyStandoutBackground = bodyStandoutBackground.asInstanceOf[js.Any], bodySubtext = bodySubtext.asInstanceOf[js.Any], bodyText = bodyText.asInstanceOf[js.Any], bodyTextChecked = bodyTextChecked.asInstanceOf[js.Any], buttonBackground = buttonBackground.asInstanceOf[js.Any], buttonBackgroundChecked = buttonBackgroundChecked.asInstanceOf[js.Any], buttonBackgroundCheckedHovered = buttonBackgroundCheckedHovered.asInstanceOf[js.Any], buttonBackgroundDisabled = buttonBackgroundDisabled.asInstanceOf[js.Any], buttonBackgroundHovered = buttonBackgroundHovered.asInstanceOf[js.Any], buttonBackgroundPressed = buttonBackgroundPressed.asInstanceOf[js.Any], buttonBorder = buttonBorder.asInstanceOf[js.Any], buttonBorderDisabled = buttonBorderDisabled.asInstanceOf[js.Any], buttonText = buttonText.asInstanceOf[js.Any], buttonTextChecked = buttonTextChecked.asInstanceOf[js.Any], buttonTextCheckedHovered = buttonTextCheckedHovered.asInstanceOf[js.Any], buttonTextDisabled = buttonTextDisabled.asInstanceOf[js.Any], buttonTextHovered = buttonTextHovered.asInstanceOf[js.Any], buttonTextPressed = buttonTextPressed.asInstanceOf[js.Any], defaultStateBackground = defaultStateBackground.asInstanceOf[js.Any], disabledBackground = disabledBackground.asInstanceOf[js.Any], disabledBodySubtext = disabledBodySubtext.asInstanceOf[js.Any], disabledBodyText = disabledBodyText.asInstanceOf[js.Any], disabledBorder = disabledBorder.asInstanceOf[js.Any], disabledSubtext = disabledSubtext.asInstanceOf[js.Any], disabledText = disabledText.asInstanceOf[js.Any], errorBackground = errorBackground.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], focusBorder = focusBorder.asInstanceOf[js.Any], inputBackground = inputBackground.asInstanceOf[js.Any], inputBackgroundChecked = inputBackgroundChecked.asInstanceOf[js.Any], inputBackgroundCheckedHovered = inputBackgroundCheckedHovered.asInstanceOf[js.Any], inputBorder = inputBorder.asInstanceOf[js.Any], inputBorderHovered = inputBorderHovered.asInstanceOf[js.Any], inputFocusBorderAlt = inputFocusBorderAlt.asInstanceOf[js.Any], inputForegroundChecked = inputForegroundChecked.asInstanceOf[js.Any], inputIcon = inputIcon.asInstanceOf[js.Any], inputIconDisabled = inputIconDisabled.asInstanceOf[js.Any], inputIconHovered = inputIconHovered.asInstanceOf[js.Any], inputPlaceholderBackgroundChecked = inputPlaceholderBackgroundChecked.asInstanceOf[js.Any], inputPlaceholderText = inputPlaceholderText.asInstanceOf[js.Any], inputText = inputText.asInstanceOf[js.Any], inputTextHovered = inputTextHovered.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkHovered = linkHovered.asInstanceOf[js.Any], listBackground = listBackground.asInstanceOf[js.Any], listHeaderBackgroundHovered = listHeaderBackgroundHovered.asInstanceOf[js.Any], listHeaderBackgroundPressed = listHeaderBackgroundPressed.asInstanceOf[js.Any], listItemBackgroundChecked = listItemBackgroundChecked.asInstanceOf[js.Any], listItemBackgroundCheckedHovered = listItemBackgroundCheckedHovered.asInstanceOf[js.Any], listItemBackgroundHovered = listItemBackgroundHovered.asInstanceOf[js.Any], listText = listText.asInstanceOf[js.Any], listTextColor = listTextColor.asInstanceOf[js.Any], menuBackground = menuBackground.asInstanceOf[js.Any], menuDivider = menuDivider.asInstanceOf[js.Any], menuHeader = menuHeader.asInstanceOf[js.Any], menuIcon = menuIcon.asInstanceOf[js.Any], menuItemBackgroundChecked = menuItemBackgroundChecked.asInstanceOf[js.Any], menuItemBackgroundHovered = menuItemBackgroundHovered.asInstanceOf[js.Any], menuItemBackgroundPressed = menuItemBackgroundPressed.asInstanceOf[js.Any], menuItemText = menuItemText.asInstanceOf[js.Any], menuItemTextHovered = menuItemTextHovered.asInstanceOf[js.Any], primaryButtonBackground = primaryButtonBackground.asInstanceOf[js.Any], primaryButtonBackgroundDisabled = primaryButtonBackgroundDisabled.asInstanceOf[js.Any], primaryButtonBackgroundHovered = primaryButtonBackgroundHovered.asInstanceOf[js.Any], primaryButtonBackgroundPressed = primaryButtonBackgroundPressed.asInstanceOf[js.Any], primaryButtonBorder = primaryButtonBorder.asInstanceOf[js.Any], primaryButtonText = primaryButtonText.asInstanceOf[js.Any], primaryButtonTextDisabled = primaryButtonTextDisabled.asInstanceOf[js.Any], primaryButtonTextHovered = primaryButtonTextHovered.asInstanceOf[js.Any], primaryButtonTextPressed = primaryButtonTextPressed.asInstanceOf[js.Any], smallInputBorder = smallInputBorder.asInstanceOf[js.Any], successBackground = successBackground.asInstanceOf[js.Any], successText = successText.asInstanceOf[js.Any], variantBorder = variantBorder.asInstanceOf[js.Any], variantBorderHovered = variantBorderHovered.asInstanceOf[js.Any], warningBackground = warningBackground.asInstanceOf[js.Any], warningHighlight = warningHighlight.asInstanceOf[js.Any], warningText = warningText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISemanticColors]
  }
  @scala.inline
  implicit class ISemanticColorsOps[Self <: ISemanticColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccentButtonBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accentButtonBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockingBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockingBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyBackgroundChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyBackgroundChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyBackgroundHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyBackgroundHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyDivider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyDivider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyFrameBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFrameBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyFrameDivider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyFrameDivider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyStandoutBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyStandoutBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonBackgroundChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBackgroundChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonBackgroundCheckedHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBackgroundCheckedHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonBackgroundDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBackgroundDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonBackgroundHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBackgroundHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonBackgroundPressed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBackgroundPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonBorderDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonBorderDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultStateBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStateBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisabledBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFocusBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputBackgroundChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBackgroundChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputBackgroundCheckedHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBackgroundCheckedHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputBorderHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBorderHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputFocusBorderAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFocusBorderAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputForegroundChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputForegroundChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputIconDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIconDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputIconHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputIconHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputPlaceholderBackgroundChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPlaceholderBackgroundChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListHeaderBackgroundHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listHeaderBackgroundHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListHeaderBackgroundPressed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listHeaderBackgroundPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListItemBackgroundChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemBackgroundChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListItemBackgroundCheckedHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemBackgroundCheckedHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListItemBackgroundHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemBackgroundHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuDivider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuDivider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItemBackgroundChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemBackgroundChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItemBackgroundHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemBackgroundHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItemBackgroundPressed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemBackgroundPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItemText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItemTextHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemTextHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryButtonBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryButtonBackgroundDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonBackgroundDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryButtonBackgroundHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonBackgroundHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryButtonBackgroundPressed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonBackgroundPressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryButtonBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmallInputBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallInputBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariantBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariantBorderHovered(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantBorderHovered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarningHighlight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warningHighlight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

