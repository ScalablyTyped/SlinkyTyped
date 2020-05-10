package typingsSlinky.yog2Kernel.mod

import typingsSlinky.express.mod.Express
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YogBootstrapOption extends js.Object {
  // 设置app，未设置则直接使用express
  var app: js.UndefOr[Express] = js.native
  // 设置conf目录
  var confPath: js.UndefOr[String] = js.native
  // 设置plugins目录
  var pluginsPath: js.UndefOr[String] = js.native
  // 设置yog根目录，默认使用启动文件的目录
  var rootPath: js.UndefOr[String] = js.native
}

object YogBootstrapOption {
  @scala.inline
  def apply(): YogBootstrapOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YogBootstrapOption]
  }
  @scala.inline
  implicit class YogBootstrapOptionOps[Self <: YogBootstrapOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: Express): Self = {
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
    def withConfPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confPath")(js.undefined)
        ret
    }
    @scala.inline
    def withPluginsPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginsPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginsPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginsPath")(js.undefined)
        ret
    }
    @scala.inline
    def withRootPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootPath")(js.undefined)
        ret
    }
  }
  
}

