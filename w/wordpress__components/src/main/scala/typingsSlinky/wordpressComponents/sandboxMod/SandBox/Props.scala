package typingsSlinky.wordpressComponents.sandboxMod.SandBox

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticFocusEvent
import typingsSlinky.react.mod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * HTML for the document `<body>` of the sandbox.
    */
  var html: js.UndefOr[String] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  /**
    * Inline JS to apply to the sandboxed document.
    */
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Inline CSS to apply to the sandboxed document.
    */
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Text for the document `<title>` of the sandbox.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * `className` that is applied to both the sandbox `<html>` element and
    * `<body>` element.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    html: String = null,
    onFocus: SyntheticFocusEvent[Element] => Unit = null,
    scripts: js.Array[String] = null,
    styles: js.Array[String] = null,
    title: String = null,
    `type`: String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

