package typingsSlinky.shelljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchOptionsArray extends js.Object {
  var `-d`: js.UndefOr[String] = js.native
  var `-r`: js.UndefOr[String] = js.native
}

object TouchOptionsArray {
  @scala.inline
  def apply(): TouchOptionsArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchOptionsArray]
  }
  @scala.inline
  implicit class TouchOptionsArrayOps[Self <: TouchOptionsArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `with-d`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-d`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-d")(js.undefined)
        ret
    }
    @scala.inline
    def `with-r`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `without-r`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-r")(js.undefined)
        ret
    }
  }
  
}

