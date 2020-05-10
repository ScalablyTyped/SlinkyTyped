package typingsSlinky.textract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCmd extends js.Object {
  /**
    * `tesseract.lang` allows a quick means to provide the most popular tesseract option,
    * but if you need to configure more options, you can simply pass `cmd`.
    * `cmd` is the string that matches the command-line options you want to pass to tesseract.
    * For instance, to provide language and psm,
    * you would pass `{ tesseract: { cmd:"-l chi_sim -psm 10" } }`
    */
  var cmd: String = js.native
}

object AnonCmd {
  @scala.inline
  def apply(cmd: String): AnonCmd = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCmd]
  }
  @scala.inline
  implicit class AnonCmdOps[Self <: AnonCmd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCmd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

