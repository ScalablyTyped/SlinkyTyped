package typingsSlinky.web3Shh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostBase extends js.Object {
  var padding: js.UndefOr[Double] = js.native
  var payload: String = js.native
  var powTarget: js.UndefOr[Double] = js.native
  var powTime: js.UndefOr[Double] = js.native
  var sig: js.UndefOr[String] = js.native
  var targetPeer: js.UndefOr[Double] = js.native
  var topic: String = js.native
  var ttl: Double = js.native
}

object PostBase {
  @scala.inline
  def apply(payload: String, topic: String, ttl: Double): PostBase = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBase]
  }
  @scala.inline
  implicit class PostBaseOps[Self <: PostBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPowTarget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPowTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withPowTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPowTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("powTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSig(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sig")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPeer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPeer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPeer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPeer")(js.undefined)
        ret
    }
  }
  
}

