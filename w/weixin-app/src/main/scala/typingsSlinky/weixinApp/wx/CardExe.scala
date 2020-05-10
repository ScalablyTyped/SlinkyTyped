package typingsSlinky.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardExe
  extends BaseOptions[js.Any, js.Any] {
  // 仅自定义 code 模式的卡券须填写，非自定义 code 模式卡券不可填写，详情
  var code: js.UndefOr[String] = js.native
  /**
  		 * 卡券在第三方系统的实际领取时间，为东八区时间戳（UTC+8,精确到秒）。
  		 * 当卡券的有效期类为 DATE_TYPE_FIX_TERM 时专用，标识卡券的实际生效时间，
  		 * 用于解决商户系统内起始时间和领取微信卡券时间不同步的问题。
  		 */
  var fixed_begintimestamp: js.UndefOr[Double] = js.native
  /**
  		 * 随机字符串，由开发者设置传入，加强安全性（若不填写可能被重放请求）。随机字符串，不长于 32 位。
  		 * 推荐使用大小写字母和数字，不同添加请求的 nonce_str 须动态生成，若重复将会导致领取失败。
  		 */
  var nonce_str: js.UndefOr[String] = js.native
  // 指定领取者的openid，只有该用户能领取。 bind_openid 字段为 true 的卡券必须填写，bind_openid 字段为 false 不可填写。
  var openid: js.UndefOr[String] = js.native
  // 领取渠道参数，用于标识本次领取的渠道值。
  var outer_str: js.UndefOr[String] = js.native
  // 签名，商户将接口列表中的参数按照指定方式进行签名,签名方式使用 SHA1，具体签名方案参见：卡券签名
  var signature: String = js.native
  // 时间戳，东八区时间,UTC+8，单位为秒
  var timestamp: Double = js.native
}

object CardExe {
  @scala.inline
  def apply(signature: String, timestamp: Double): CardExe = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardExe]
  }
  @scala.inline
  implicit class CardExeOps[Self <: CardExe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed_begintimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_begintimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed_begintimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_begintimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce_str(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce_str")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce_str: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce_str")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openid")(js.undefined)
        ret
    }
    @scala.inline
    def withOuter_str(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outer_str")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOuter_str: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outer_str")(js.undefined)
        ret
    }
  }
  
}

