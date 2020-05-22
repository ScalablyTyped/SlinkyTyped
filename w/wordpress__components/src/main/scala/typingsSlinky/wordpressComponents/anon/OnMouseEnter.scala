package typingsSlinky.wordpressComponents.anon

import org.scalajs.dom.raw.HTMLSpanElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.error
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.success
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.validating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMouseEnter extends js.Object {
  /**
    * Function to call when onMouseEnter event triggered on token.
    */
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  /**
    * Function to call when onMouseLeave is triggered on token.
    */
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  /**
    * Applies styles to token.
    */
  var status: js.UndefOr[error | validating | success] = js.undefined
  /**
    * Adds a title to the token.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The value of the token.
    */
  var value: String
}

object OnMouseEnter {
  @scala.inline
  def apply(
    value: String,
    onMouseEnter: SyntheticMouseEvent[HTMLSpanElement] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[HTMLSpanElement] => Unit = null,
    status: error | validating | success = null,
    title: String = null
  ): OnMouseEnter = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMouseEnter]
  }
}

