package typingsSlinky.soap.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExpressApp extends ServerType {
  var route: js.Any = js.native
  var use: js.Any = js.native
}

object IExpressApp {
  @scala.inline
  def apply(route: js.Any, use: js.Any): IExpressApp = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExpressApp]
  }
  @scala.inline
  implicit class IExpressAppOps[Self <: IExpressApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoute(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUse(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

