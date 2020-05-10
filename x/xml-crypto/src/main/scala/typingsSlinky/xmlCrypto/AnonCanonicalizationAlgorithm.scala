package typingsSlinky.xmlCrypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCanonicalizationAlgorithm extends js.Object {
  var canonicalizationAlgorithm: js.UndefOr[String] = js.native
  var idAttribute: js.UndefOr[String] = js.native
  var implicitTransforms: js.UndefOr[js.Array[String]] = js.native
  var signatureAlgorithm: js.UndefOr[String] = js.native
}

object AnonCanonicalizationAlgorithm {
  @scala.inline
  def apply(): AnonCanonicalizationAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCanonicalizationAlgorithm]
  }
  @scala.inline
  implicit class AnonCanonicalizationAlgorithmOps[Self <: AnonCanonicalizationAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanonicalizationAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalizationAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanonicalizationAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalizationAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withIdAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withImplicitTransforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplicitTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitTransforms")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(js.undefined)
        ret
    }
  }
  
}

