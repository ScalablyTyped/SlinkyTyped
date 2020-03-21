package typingsSlinky.tablesorter.html5ColorOptionsMod

import typingsSlinky.tablesorter.defaultValueOptionsMod.DefaultValueOptions
import typingsSlinky.tablesorter.previewableOptionsMod.PreviewableOptions
import typingsSlinky.tablesorter.strictOptionsMod.StrictOptions
import typingsSlinky.tablesorter.testableOptionsMod.TestableOptions
import typingsSlinky.tablesorter.toggleableOptionsMod.ToggleableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Html5ColorOptions
  extends DefaultValueOptions[String]
     with ToggleableOptions
     with StrictOptions
     with PreviewableOptions
     with TestableOptions

object Html5ColorOptions {
  @scala.inline
  def apply(
    addToggle: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    skipTest: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    valueToHeader: js.UndefOr[Boolean] = js.undefined
  ): Html5ColorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addToggle)) __obj.updateDynamic("addToggle")(addToggle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(skipTest)) __obj.updateDynamic("skipTest")(skipTest.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(valueToHeader)) __obj.updateDynamic("valueToHeader")(valueToHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Html5ColorOptions]
  }
}

