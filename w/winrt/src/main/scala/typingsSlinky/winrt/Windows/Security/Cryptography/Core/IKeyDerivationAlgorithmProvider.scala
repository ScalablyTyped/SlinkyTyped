package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyDerivationAlgorithmProvider extends js.Object {
  var algorithmName: String = js.native
  def createKey(keyMaterial: IBuffer): CryptographicKey = js.native
}

object IKeyDerivationAlgorithmProvider {
  @scala.inline
  def apply(algorithmName: String, createKey: IBuffer => CryptographicKey): IKeyDerivationAlgorithmProvider = {
    val __obj = js.Dynamic.literal(algorithmName = algorithmName.asInstanceOf[js.Any], createKey = js.Any.fromFunction1(createKey))
    __obj.asInstanceOf[IKeyDerivationAlgorithmProvider]
  }
  @scala.inline
  implicit class IKeyDerivationAlgorithmProviderOps[Self <: IKeyDerivationAlgorithmProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithmName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithmName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateKey(value: IBuffer => CryptographicKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createKey")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

