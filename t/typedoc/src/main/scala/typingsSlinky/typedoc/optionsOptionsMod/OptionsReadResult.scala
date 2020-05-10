package typingsSlinky.typedoc.optionsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsReadResult extends js.Object {
  var hasErrors: Boolean = js.native
  var inputFiles: js.Array[String] = js.native
}

object OptionsReadResult {
  @scala.inline
  def apply(hasErrors: Boolean, inputFiles: js.Array[String]): OptionsReadResult = {
    val __obj = js.Dynamic.literal(hasErrors = hasErrors.asInstanceOf[js.Any], inputFiles = inputFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsReadResult]
  }
  @scala.inline
  implicit class OptionsReadResultOps[Self <: OptionsReadResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFiles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

