package typingsSlinky.xmlJs.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XML2JSON extends XML2JS {
  var spaces: js.UndefOr[Double | String] = js.native
}

object XML2JSON {
  @scala.inline
  def apply(): XML2JSON = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XML2JSON]
  }
  @scala.inline
  implicit class XML2JSONOps[Self <: XML2JSON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpaces(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaces")(js.undefined)
        ret
    }
  }
  
}

