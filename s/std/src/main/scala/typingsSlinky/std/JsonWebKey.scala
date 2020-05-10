package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonWebKey extends js.Object {
  var alg: js.UndefOr[java.lang.String] = js.native
  var crv: js.UndefOr[java.lang.String] = js.native
  var d: js.UndefOr[java.lang.String] = js.native
  var dp: js.UndefOr[java.lang.String] = js.native
  var dq: js.UndefOr[java.lang.String] = js.native
  var e: js.UndefOr[java.lang.String] = js.native
  var ext: js.UndefOr[scala.Boolean] = js.native
  var k: js.UndefOr[java.lang.String] = js.native
  var key_ops: js.UndefOr[js.Array[java.lang.String]] = js.native
  var kty: js.UndefOr[java.lang.String] = js.native
  var n: js.UndefOr[java.lang.String] = js.native
  var oth: js.UndefOr[js.Array[org.scalajs.dom.crypto.RsaOtherPrimesInfo]] = js.native
  var p: js.UndefOr[java.lang.String] = js.native
  var q: js.UndefOr[java.lang.String] = js.native
  var qi: js.UndefOr[java.lang.String] = js.native
  var use: js.UndefOr[java.lang.String] = js.native
  var x: js.UndefOr[java.lang.String] = js.native
  var y: js.UndefOr[java.lang.String] = js.native
}

object JsonWebKey {
  @scala.inline
  def apply(): JsonWebKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonWebKey]
  }
  @scala.inline
  implicit class JsonWebKeyOps[Self <: org.scalajs.dom.crypto.JsonWebKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlg(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alg")(js.undefined)
        ret
    }
    @scala.inline
    def withCrv(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crv")(js.undefined)
        ret
    }
    @scala.inline
    def withD(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.undefined)
        ret
    }
    @scala.inline
    def withDp(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dp")(js.undefined)
        ret
    }
    @scala.inline
    def withDq(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dq")(js.undefined)
        ret
    }
    @scala.inline
    def withE(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(js.undefined)
        ret
    }
    @scala.inline
    def withExt(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
    @scala.inline
    def withK(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(js.undefined)
        ret
    }
    @scala.inline
    def withKey_ops(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_ops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey_ops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key_ops")(js.undefined)
        ret
    }
    @scala.inline
    def withKty(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kty")(js.undefined)
        ret
    }
    @scala.inline
    def withN(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(js.undefined)
        ret
    }
    @scala.inline
    def withOth(value: js.Array[org.scalajs.dom.crypto.RsaOtherPrimesInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oth")(js.undefined)
        ret
    }
    @scala.inline
    def withP(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p")(js.undefined)
        ret
    }
    @scala.inline
    def withQ(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q")(js.undefined)
        ret
    }
    @scala.inline
    def withQi(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qi")(js.undefined)
        ret
    }
    @scala.inline
    def withUse(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

