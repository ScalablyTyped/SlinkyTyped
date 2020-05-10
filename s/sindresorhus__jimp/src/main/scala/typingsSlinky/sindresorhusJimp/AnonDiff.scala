package typingsSlinky.sindresorhusJimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDiff extends js.Object {
  var diff: typingsSlinky.sindresorhusJimp.Jimp.Jimp = js.native
  var percent: Double = js.native
}

object AnonDiff {
  @scala.inline
  def apply(diff: typingsSlinky.sindresorhusJimp.Jimp.Jimp, percent: Double): AnonDiff = {
    val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiff]
  }
  @scala.inline
  implicit class AnonDiffOps[Self <: AnonDiff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiff(value: typingsSlinky.sindresorhusJimp.Jimp.Jimp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

