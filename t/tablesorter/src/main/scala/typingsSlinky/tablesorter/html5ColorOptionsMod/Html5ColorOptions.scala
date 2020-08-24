package typingsSlinky.tablesorter.html5ColorOptionsMod

import typingsSlinky.tablesorter.defaultValueOptionsMod.DefaultValueOptions
import typingsSlinky.tablesorter.previewableOptionsMod.PreviewableOptions
import typingsSlinky.tablesorter.strictOptionsMod.StrictOptions
import typingsSlinky.tablesorter.testableOptionsMod.TestableOptions
import typingsSlinky.tablesorter.toggleableOptionsMod.ToggleableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html5ColorOptions
  extends DefaultValueOptions[String]
     with ToggleableOptions
     with StrictOptions
     with PreviewableOptions
     with TestableOptions

object Html5ColorOptions {
  @scala.inline
  def apply(): Html5ColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Html5ColorOptions]
  }
}

