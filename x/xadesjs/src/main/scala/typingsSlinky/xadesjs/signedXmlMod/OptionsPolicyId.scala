package typingsSlinky.xadesjs.signedXmlMod

import org.scalajs.dom.crypto.Algorithm
import typingsSlinky.std.AlgorithmIdentifier
import typingsSlinky.xmldsigjs.signedXmlMod.OptionsSignTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsPolicyId extends js.Object {
  var hash: AlgorithmIdentifier = js.native
  var identifier: OptionsPolicyIdentifier = js.native
  var qualifiers: js.UndefOr[js.Array[OptionsPolicyUserNotice | String]] = js.native
  var transforms: js.UndefOr[js.Array[OptionsSignTransform]] = js.native
}

object OptionsPolicyId {
  @scala.inline
  def apply(hash: AlgorithmIdentifier, identifier: OptionsPolicyIdentifier): OptionsPolicyId = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPolicyId]
  }
  @scala.inline
  implicit class OptionsPolicyIdOps[Self <: OptionsPolicyId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHashAlgorithm(value: Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: AlgorithmIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: OptionsPolicyIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQualifiers(value: js.Array[OptionsPolicyUserNotice | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQualifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qualifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withTransforms(value: js.Array[OptionsSignTransform]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transforms")(js.undefined)
        ret
    }
  }
  
}

