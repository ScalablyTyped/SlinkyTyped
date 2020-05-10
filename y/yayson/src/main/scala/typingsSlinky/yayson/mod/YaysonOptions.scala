package typingsSlinky.yayson.mod

import typingsSlinky.yayson.yaysonStrings.default
import typingsSlinky.yayson.yaysonStrings.sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YaysonOptions extends js.Object {
  var adapter: js.UndefOr[default | sequelize] = js.native
}

object YaysonOptions {
  @scala.inline
  def apply(): YaysonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YaysonOptions]
  }
  @scala.inline
  implicit class YaysonOptionsOps[Self <: YaysonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapter(value: default | sequelize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapter")(js.undefined)
        ret
    }
  }
  
}

