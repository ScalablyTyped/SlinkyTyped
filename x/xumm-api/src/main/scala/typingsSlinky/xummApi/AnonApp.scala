package typingsSlinky.xummApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApp extends js.Object {
  var app: js.UndefOr[String] = js.native
  var web: js.UndefOr[String] = js.native
}

object AnonApp {
  @scala.inline
  def apply(): AnonApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonApp]
  }
  @scala.inline
  implicit class AnonAppOps[Self <: AnonApp] (val x: Self) extends AnyVal {
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
    def withoutApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(js.undefined)
        ret
    }
    @scala.inline
    def withWeb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(js.undefined)
        ret
    }
  }
  
}

