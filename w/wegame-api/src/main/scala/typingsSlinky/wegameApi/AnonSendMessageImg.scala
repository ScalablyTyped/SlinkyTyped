package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSendMessageImg extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 会话内消息卡片图片路径
    */
  var sendMessageImg: js.UndefOr[String] = js.native
  /**
    * 会话内消息卡片路径
    */
  var sendMessagePath: js.UndefOr[String] = js.native
  /**
    * 会话内消息卡片标题
    */
  var sendMessageTitle: js.UndefOr[String] = js.native
  /**
    * 会话来源
    */
  var sessionFrom: js.UndefOr[String] = js.native
  /**
    * 是否显示会话内消息卡片，设置此参数为 true，用户进入客服会话之后会收到一个消息卡片，通过以下三个参数设置卡片的内容
    */
  var showMessageCard: js.UndefOr[Boolean] = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object AnonSendMessageImg {
  @scala.inline
  def apply(): AnonSendMessageImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonSendMessageImg]
  }
  @scala.inline
  implicit class AnonSendMessageImgOps[Self <: AnonSendMessageImg] (val x: Self) extends AnyVal {
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
    def withSendMessageImg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessageImg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendMessageImg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessageImg")(js.undefined)
        ret
    }
    @scala.inline
    def withSendMessagePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendMessagePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessagePath")(js.undefined)
        ret
    }
    @scala.inline
    def withSendMessageTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessageTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendMessageTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendMessageTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMessageCard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMessageCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMessageCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMessageCard")(js.undefined)
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

