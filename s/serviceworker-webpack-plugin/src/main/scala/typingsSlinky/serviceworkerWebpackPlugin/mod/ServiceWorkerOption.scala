package typingsSlinky.serviceworkerWebpackPlugin.mod

import typingsSlinky.webpack.mod.Stats.ToJsonOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerOption extends js.Object {
  var assets: js.Array[String] = js.native
  var jsonStats: js.UndefOr[ToJsonOutput] = js.native
}

object ServiceWorkerOption {
  @scala.inline
  def apply(assets: js.Array[String]): ServiceWorkerOption = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerOption]
  }
  @scala.inline
  implicit class ServiceWorkerOptionOps[Self <: ServiceWorkerOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsonStats(value: ToJsonOutput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonStats")(js.undefined)
        ret
    }
  }
  
}

