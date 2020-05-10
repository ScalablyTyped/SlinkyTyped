package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCSrtpSdesParameters extends js.Object {
  var cryptoSuite: js.UndefOr[java.lang.String] = js.native
  var keyParams: js.UndefOr[js.Array[RTCSrtpKeyParam]] = js.native
  var sessionParams: js.UndefOr[js.Array[java.lang.String]] = js.native
  var tag: js.UndefOr[Double] = js.native
}

object RTCSrtpSdesParameters {
  @scala.inline
  def apply(): RTCSrtpSdesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCSrtpSdesParameters]
  }
  @scala.inline
  implicit class RTCSrtpSdesParametersOps[Self <: RTCSrtpSdesParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCryptoSuite(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCryptoSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cryptoSuite")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyParams(value: js.Array[RTCSrtpKeyParam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyParams")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionParams(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionParams")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

