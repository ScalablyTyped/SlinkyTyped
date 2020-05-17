package typingsSlinky.sindresorhusJimp.anon

import typingsSlinky.sindresorhusJimp.Jimp.Jimp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Diff extends js.Object {
  var diff: Jimp = js.native
  var percent: Double = js.native
}

object Diff {
  @scala.inline
  def apply(diff: Jimp, percent: Double): Diff = {
    val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff]
  }
  @scala.inline
  implicit class DiffOps[Self <: Diff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiff(value: Jimp): Self = {
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

