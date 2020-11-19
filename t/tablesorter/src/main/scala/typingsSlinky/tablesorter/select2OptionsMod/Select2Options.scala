package typingsSlinky.tablesorter.select2OptionsMod

import typingsSlinky.select2.mod.DataFormat
import typingsSlinky.select2.mod.GroupedDataFormat
import typingsSlinky.select2.mod.Options
import typingsSlinky.tablesorter.controlOptionsMod.ControlOptions
import typingsSlinky.tablesorter.defaultValueOptionsMod.DefaultValueOptions
import typingsSlinky.tablesorter.strictOptionsMod.StrictOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select2Options
  extends Options[DataFormat | GroupedDataFormat, js.Any]
     with ControlOptions
     with StrictOptions
     with DefaultValueOptions[String]
object Select2Options {
  
  @scala.inline
  def apply(): Select2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Select2Options]
  }
}
