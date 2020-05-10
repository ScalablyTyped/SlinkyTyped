package typingsSlinky.wegameApi

import typingsSlinky.wegameApi.wegameApiStrings.develop
import typingsSlinky.wegameApi.wegameApiStrings.release
import typingsSlinky.wegameApi.wegameApiStrings.trial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  appId  :string,   path ? :string,   extraData ? :unknown,   envVersion ? :'develop' | 'trial' | 'release'} & wegame-api.wx.types.Callbacks */
@js.native
trait appIdstringpathstringextr extends js.Object {
  /**
    * 要打开的小程序 appId
    */
  var appId: String = js.native
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 要打开的小程序版本。仅在当前小程序为开发版或体验版时此参数有效。如果当前小程序是正式版，则打开的小程序必定是正式版。默认值release
    * develop	开发版
    * trial	体验版
    * release	正式版
    */
  var envVersion: js.UndefOr[develop | trial | release] = js.native
  /**
    * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch，App.onShow 中获取到这份数据。如果跳转的是小游戏，可以在 wx.onShow、wx.getLaunchOptionsSync 中可以获取到这份数据数据。
    */
  var extraData: js.UndefOr[js.Any] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 打开的页面路径，如果为空则打开首页。path 中 ? 后面的部分会成为 query，在小程序的 App.onLaunch、App.onShow
    * 和 Page.onLoad 的回调函数或小游戏的 wx.onShow 回调函数、wx.getLaunchOptionsSync 中可以获取到 query 数据。
    * 对于小游戏，可以只传入 query 部分，来实现传参效果，如：传入 "?foo=bar"。
    */
  var path: js.UndefOr[String] = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object appIdstringpathstringextr {
  @scala.inline
  def apply(appId: String): appIdstringpathstringextr = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[appIdstringpathstringextr]
  }
  @scala.inline
  implicit class appIdstringpathstringextrOps[Self <: appIdstringpathstringextr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvVersion(value: develop | trial | release): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraData")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

