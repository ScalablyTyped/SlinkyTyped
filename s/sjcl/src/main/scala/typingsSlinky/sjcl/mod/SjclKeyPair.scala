package typingsSlinky.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclKeyPair[P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */] extends js.Object {
  var pub: P = js.native
  var sec: S = js.native
}

object SjclKeyPair {
  @scala.inline
  def apply[P, S](pub: P, sec: S): SjclKeyPair[P, S] = {
    val __obj = js.Dynamic.literal(pub = pub.asInstanceOf[js.Any], sec = sec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclKeyPair[P, S]]
  }
  @scala.inline
  implicit class SjclKeyPairOps[Self[p, s] <: SjclKeyPair[p, s], P, S] (val x: Self[P, S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, S]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, S]) with Other]
    @scala.inline
    def withPub(value: P): Self[P, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSec(value: S): Self[P, S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

