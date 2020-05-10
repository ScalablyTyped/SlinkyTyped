package typingsSlinky.typescriptServices

import typingsSlinky.typescriptServices.TypeScript.IndexSignatureInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndexSigs1 extends js.Object {
  var indexSigs1: IndexSignatureInfo = js.native
  var indexSigs2: IndexSignatureInfo = js.native
}

object AnonIndexSigs1 {
  @scala.inline
  def apply(indexSigs1: IndexSignatureInfo, indexSigs2: IndexSignatureInfo): AnonIndexSigs1 = {
    val __obj = js.Dynamic.literal(indexSigs1 = indexSigs1.asInstanceOf[js.Any], indexSigs2 = indexSigs2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndexSigs1]
  }
  @scala.inline
  implicit class AnonIndexSigs1Ops[Self <: AnonIndexSigs1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexSigs1(value: IndexSignatureInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexSigs1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndexSigs2(value: IndexSignatureInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexSigs2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

