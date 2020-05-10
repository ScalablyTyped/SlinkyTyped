package typingsSlinky.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWallaby extends js.Object {
  var compilers: js.UndefOr[IWallabyBuiltInCompilers] = js.native
  var defaults: js.UndefOr[js.Any] = js.native
  var localProjectDir: js.UndefOr[String] = js.native
  var projectCacheDir: js.UndefOr[String] = js.native
}

object IWallaby {
  @scala.inline
  def apply(): IWallaby = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWallaby]
  }
  @scala.inline
  implicit class IWallabyOps[Self <: IWallaby] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompilers(value: IWallabyBuiltInCompilers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilers")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalProjectDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localProjectDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalProjectDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localProjectDir")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectCacheDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectCacheDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectCacheDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectCacheDir")(js.undefined)
        ret
    }
  }
  
}

