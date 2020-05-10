package typingsSlinky.undertaker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeOptions extends js.Object {
  /**
    * Whether or not the whole tree should be returned.
    * Default: false
    */
  var deep: js.UndefOr[Boolean] = js.native
}

object TreeOptions {
  @scala.inline
  def apply(): TreeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeOptions]
  }
  @scala.inline
  implicit class TreeOptionsOps[Self <: TreeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
  }
  
}

