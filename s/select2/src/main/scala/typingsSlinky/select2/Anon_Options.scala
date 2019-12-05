package typingsSlinky.select2

import typingsSlinky.select2.select2Mod.DataFormat
import typingsSlinky.select2.select2Mod.GroupedDataFormat
import typingsSlinky.select2.select2Mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: Options[DataFormat | GroupedDataFormat, _]
}

object Anon_Options {
  @scala.inline
  def apply(options: Options[DataFormat | GroupedDataFormat, _]): Anon_Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Options]
  }
}

