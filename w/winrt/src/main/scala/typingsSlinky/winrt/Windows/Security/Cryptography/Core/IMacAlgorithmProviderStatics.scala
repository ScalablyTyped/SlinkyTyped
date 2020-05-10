package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMacAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: String): MacAlgorithmProvider = js.native
}

object IMacAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: String => MacAlgorithmProvider): IMacAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[IMacAlgorithmProviderStatics]
  }
  @scala.inline
  implicit class IMacAlgorithmProviderStaticsOps[Self <: IMacAlgorithmProviderStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenAlgorithm(value: String => MacAlgorithmProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAlgorithm")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

