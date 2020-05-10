package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenameLocation extends DocumentSpan {
  val prefixText: js.UndefOr[java.lang.String] = js.native
  val suffixText: js.UndefOr[java.lang.String] = js.native
}

object RenameLocation {
  @scala.inline
  def apply(fileName: java.lang.String, textSpan: TextSpan): RenameLocation = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenameLocation]
  }
  @scala.inline
  implicit class RenameLocationOps[Self <: RenameLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrefixText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixText")(js.undefined)
        ret
    }
    @scala.inline
    def withSuffixText(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuffixText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suffixText")(js.undefined)
        ret
    }
  }
  
}

