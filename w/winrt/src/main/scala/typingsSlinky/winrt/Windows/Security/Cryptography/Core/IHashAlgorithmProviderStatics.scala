package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashAlgorithmProviderStatics extends js.Object {
  def openAlgorithm(algorithm: String): HashAlgorithmProvider = js.native
}

object IHashAlgorithmProviderStatics {
  @scala.inline
  def apply(openAlgorithm: String => HashAlgorithmProvider): IHashAlgorithmProviderStatics = {
    val __obj = js.Dynamic.literal(openAlgorithm = js.Any.fromFunction1(openAlgorithm))
    __obj.asInstanceOf[IHashAlgorithmProviderStatics]
  }
  @scala.inline
  implicit class IHashAlgorithmProviderStaticsOps[Self <: IHashAlgorithmProviderStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpenAlgorithm(value: String => HashAlgorithmProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAlgorithm")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

