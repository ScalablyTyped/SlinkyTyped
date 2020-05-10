package typingsSlinky.umtrackWx.mod.UMA

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitParams extends js.Object {
  /**
    * @description
    * APP_KEY distributed by the Umeng<https://www.umeng.com/>
    */
  var appKey: String = js.native
  /**
    * @description If you need to get openid from the Umeng backend, please go to the Umeng backend to set the miniprogram's appId and secret
    */
  var autoGetOpenid: js.UndefOr[Boolean] = js.native
  /**
    * @description debug mode
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * @description
    * Whether or not to use openid for statistics, if this is false, the user statistics will be used by "Umeng" + random ID
    */
  var useOpenid: js.UndefOr[Boolean] = js.native
}

object InitParams {
  @scala.inline
  def apply(appKey: String): InitParams = {
    val __obj = js.Dynamic.literal(appKey = appKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitParams]
  }
  @scala.inline
  implicit class InitParamsOps[Self <: InitParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoGetOpenid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGetOpenid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGetOpenid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGetOpenid")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withUseOpenid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOpenid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseOpenid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useOpenid")(js.undefined)
        ret
    }
  }
  
}

