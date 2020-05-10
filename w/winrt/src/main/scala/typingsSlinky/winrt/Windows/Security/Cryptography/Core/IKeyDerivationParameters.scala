package typingsSlinky.winrt.Windows.Security.Cryptography.Core

import typingsSlinky.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKeyDerivationParameters extends js.Object {
  var iterationCount: Double = js.native
  var kdfGenericBinary: IBuffer = js.native
}

object IKeyDerivationParameters {
  @scala.inline
  def apply(iterationCount: Double, kdfGenericBinary: IBuffer): IKeyDerivationParameters = {
    val __obj = js.Dynamic.literal(iterationCount = iterationCount.asInstanceOf[js.Any], kdfGenericBinary = kdfGenericBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyDerivationParameters]
  }
  @scala.inline
  implicit class IKeyDerivationParametersOps[Self <: IKeyDerivationParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIterationCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterationCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKdfGenericBinary(value: IBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kdfGenericBinary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

