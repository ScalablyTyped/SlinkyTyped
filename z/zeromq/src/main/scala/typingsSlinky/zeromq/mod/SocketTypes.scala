package typingsSlinky.zeromq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketTypes extends js.Object {
  var dealer: Double = js.native
  var pair: Double = js.native
  var pub: Double = js.native
  var pull: Double = js.native
  var push: Double = js.native
  var rep: Double = js.native
  var req: Double = js.native
  var router: Double = js.native
  var stream: Double = js.native
  var sub: Double = js.native
  var xpub: Double = js.native
  var xrep: Double = js.native
  var xreq: Double = js.native
  var xsub: Double = js.native
}

object SocketTypes {
  @scala.inline
  def apply(
    dealer: Double,
    pair: Double,
    pub: Double,
    pull: Double,
    push: Double,
    rep: Double,
    req: Double,
    router: Double,
    stream: Double,
    sub: Double,
    xpub: Double,
    xrep: Double,
    xreq: Double,
    xsub: Double
  ): SocketTypes = {
    val __obj = js.Dynamic.literal(dealer = dealer.asInstanceOf[js.Any], pair = pair.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any], pull = pull.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], rep = rep.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any], xrep = xrep.asInstanceOf[js.Any], xreq = xreq.asInstanceOf[js.Any], xsub = xsub.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTypes]
  }
  @scala.inline
  implicit class SocketTypesOps[Self <: SocketTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDealer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPair(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pair")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPub(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPull(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSub(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXpub(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXrep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXreq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xreq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXsub(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsub")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

