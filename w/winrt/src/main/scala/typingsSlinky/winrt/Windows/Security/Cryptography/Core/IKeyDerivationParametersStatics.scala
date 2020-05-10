package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyDerivationParametersStatics extends js.Object {
  def buildForPbkdf2(pbkdf2Salt: IBuffer, iterationCount: Double): KeyDerivationParameters = js.native
  def buildForSP800108(label: IBuffer, context: IBuffer): KeyDerivationParameters = js.native
  def buildForSP80056a(
    algorithmId: IBuffer,
    partyUInfo: IBuffer,
    partyVInfo: IBuffer,
    suppPubInfo: IBuffer,
    suppPrivInfo: IBuffer
  ): KeyDerivationParameters = js.native
}

object IKeyDerivationParametersStatics {
  @scala.inline
  def apply(
    buildForPbkdf2: (IBuffer, Double) => KeyDerivationParameters,
    buildForSP800108: (IBuffer, IBuffer) => KeyDerivationParameters,
    buildForSP80056a: (IBuffer, IBuffer, IBuffer, IBuffer, IBuffer) => KeyDerivationParameters
  ): IKeyDerivationParametersStatics = {
    val __obj = js.Dynamic.literal(buildForPbkdf2 = js.Any.fromFunction2(buildForPbkdf2), buildForSP800108 = js.Any.fromFunction2(buildForSP800108), buildForSP80056a = js.Any.fromFunction5(buildForSP80056a))
    __obj.asInstanceOf[IKeyDerivationParametersStatics]
  }
  @scala.inline
  implicit class IKeyDerivationParametersStaticsOps[Self <: IKeyDerivationParametersStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuildForPbkdf2(value: (IBuffer, Double) => KeyDerivationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildForPbkdf2")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBuildForSP800108(value: (IBuffer, IBuffer) => KeyDerivationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildForSP800108")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBuildForSP80056a(value: (IBuffer, IBuffer, IBuffer, IBuffer, IBuffer) => KeyDerivationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildForSP80056a")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

