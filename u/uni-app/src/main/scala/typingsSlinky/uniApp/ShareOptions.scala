package typingsSlinky.uniApp

import typingsSlinky.uniApp.uniAppStrings.`0`
import typingsSlinky.uniApp.uniAppStrings.`1`
import typingsSlinky.uniApp.uniAppStrings.`2`
import typingsSlinky.uniApp.uniAppStrings.`3`
import typingsSlinky.uniApp.uniAppStrings.`4`
import typingsSlinky.uniApp.uniAppStrings.`5`
import typingsSlinky.uniApp.uniAppStrings.qq
import typingsSlinky.uniApp.uniAppStrings.sinaweibo
import typingsSlinky.uniApp.uniAppStrings.weixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 跳转链接
    */
  var href: js.UndefOr[String] = js.native
  /**
    * 图片地址
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * 音视频地址
    */
  var mediaUrl: js.UndefOr[String] = js.native
  /**
    * 分享小程序
    */
  var miniProgram: js.UndefOr[MiniProgramShareOptions] = js.native
  /**
    * 分享服务提供商，通过uni.getProvider获取，如果不设置则弹出分享列表选择界面
    * - sinaweibo: 新浪微博分享
    * - qq: 分享到QQ好友
    * - weixin: 分享微信消息、朋友圈及微信小程序
    */
  var provider: js.UndefOr[sinaweibo | qq | weixin] = js.native
  /**
    * 场景。可取值“WXSceneSession”分享到聊天界面，“WXSenceTimeline”分享到朋友圈，“WXSceneFavorite”分享到微信收藏
    */
  var scene: js.UndefOr[String] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 摘要
    */
  var summary: js.UndefOr[String] = js.native
  /**
    * 标题
    */
  var title: js.UndefOr[String] = js.native
  /**
    * 分享类型。默认图文0，纯文字1，纯图片2，音乐3，视频4，小程序5。
    * - 0: 图文
    * - 1: 纯文字
    * - 2: 纯图片
    * - 3: 音乐
    * - 4: 视频
    * - 5: 小程序
    */
  var `type`: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5`] = js.native
}

object ShareOptions {
  @scala.inline
  def apply(): ShareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareOptions]
  }
  @scala.inline
  implicit class ShareOptionsOps[Self <: ShareOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withMiniProgram(value: MiniProgramShareOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniProgram")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiniProgram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miniProgram")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider(value: sinaweibo | qq | weixin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withScene(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScene: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(js.undefined)
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
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: `0` | `1` | `2` | `3` | `4` | `5`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

