package typingsSlinky.select2.anon

import typingsSlinky.select2.mod.DataFormat
import typingsSlinky.select2.mod.GroupedDataFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var options: typingsSlinky.select2.mod.Options[DataFormat | GroupedDataFormat, _] = js.native
}

object Options {
  @scala.inline
  def apply(options: typingsSlinky.select2.mod.Options[DataFormat | GroupedDataFormat, _]): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: typingsSlinky.select2.mod.Options[DataFormat | GroupedDataFormat, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

