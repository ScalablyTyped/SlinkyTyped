package typingsSlinky.wordpressBlockEditor.richTextMod.RichTextToolbarButton

import slinky.core.TagMod
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.access
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.alt
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ctrl
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.ctrlShift
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.primary
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.primaryAlt
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.primaryShift
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.secondary
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.shift
import typingsSlinky.wordpressBlockEditor.wordpressBlockEditorStrings.shiftAlt
import typingsSlinky.wordpressComponents.anon.PartialProps
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsSlinky.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends typingsSlinky.wordpressComponents.toolbarButtonMod.ToolbarButton.Props {
  var name: js.UndefOr[String] = js.undefined
  var shortcutCharacter: js.UndefOr[String] = js.undefined
  var shortcutType: js.UndefOr[
    primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    icon: Icon,
    onClick: () => Unit,
    title: String,
    children: TagMod[Any] = null,
    className: String = null,
    containerClassName: String = null,
    extraProps: PartialProps = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    shortcut: ShortcutType = null,
    shortcutCharacter: String = null,
    shortcutType: primary | primaryShift | primaryAlt | secondary | access | ctrl | alt | ctrlShift | shift | shiftAlt = null,
    subscript: String = null
  ): Props = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut.asInstanceOf[js.Any])
    if (shortcutCharacter != null) __obj.updateDynamic("shortcutCharacter")(shortcutCharacter.asInstanceOf[js.Any])
    if (shortcutType != null) __obj.updateDynamic("shortcutType")(shortcutType.asInstanceOf[js.Any])
    if (subscript != null) __obj.updateDynamic("subscript")(subscript.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

