package typingsSlinky.unusedFilesWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ignore extends js.Object {
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
}

object Ignore {
  @scala.inline
  def apply(): Ignore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ignore]
  }
  @scala.inline
  implicit class IgnoreOps[Self <: Ignore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnore(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
  }
  
}

