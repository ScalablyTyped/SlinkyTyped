package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyDerivationAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: String): KeyDerivationAlgorithmProvider = js.native
}

object IKeyDerivationAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: String => KeyDerivationAlgorithmProvider): IKeyDerivationAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[IKeyDerivationAlgorithmProviderStatics]
  }
  @scala.inline
  implicit class IKeyDerivationAlgorithmProviderStaticsOps[Self <: IKeyDerivationAlgorithmProviderStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenAlgorithm(value: String => KeyDerivationAlgorithmProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAlgorithm")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

