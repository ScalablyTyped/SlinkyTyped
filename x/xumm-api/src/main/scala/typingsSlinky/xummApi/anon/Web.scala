package typingsSlinky.xummApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Web extends js.Object {
  var app: String | Null = js.native
  var web: String | Null = js.native
}

object Web {
  @scala.inline
  def apply(): Web = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Web]
  }
  @scala.inline
  implicit class WebOps[Self <: Web] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(null)
        ret
    }
    @scala.inline
    def withWeb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWebNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(null)
        ret
    }
  }
  
}

