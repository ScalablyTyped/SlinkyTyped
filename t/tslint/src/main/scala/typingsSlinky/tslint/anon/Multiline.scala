package typingsSlinky.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multiline extends js.Object {
  var multiline: String = js.native
  var singleline: String = js.native
}

object Multiline {
  @scala.inline
  def apply(multiline: String, singleline: String): Multiline = {
    val __obj = js.Dynamic.literal(multiline = multiline.asInstanceOf[js.Any], singleline = singleline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multiline]
  }
  @scala.inline
  implicit class MultilineOps[Self <: Multiline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMultiline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingleline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

