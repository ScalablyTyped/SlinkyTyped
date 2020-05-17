package typingsSlinky.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureInfo extends js.Object {
  var activeFormal: Double = js.native
  var actual: ActualSignatureInfo = js.native
  var formal: js.Array[FormalSignatureItemInfo] = js.native
}

object SignatureInfo {
  @scala.inline
  def apply(activeFormal: Double, actual: ActualSignatureInfo, formal: js.Array[FormalSignatureItemInfo]): SignatureInfo = {
    val __obj = js.Dynamic.literal(activeFormal = activeFormal.asInstanceOf[js.Any], actual = actual.asInstanceOf[js.Any], formal = formal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureInfo]
  }
  @scala.inline
  implicit class SignatureInfoOps[Self <: SignatureInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveFormal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeFormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActual(value: ActualSignatureInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormal(value: js.Array[FormalSignatureItemInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

