package typingsSlinky.stellarBase.mod.Operation

import typingsSlinky.stellarBase.mod.OperationOptions.SetOptions
import typingsSlinky.stellarBase.mod.SignerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "Operation.setOptions")
@js.native
object setOptions extends js.Object {
  def apply[T /* <: SignerOptions */](options: SetOptions[T]): typingsSlinky.stellarBase.mod.xdr.Operation[SetOptions_[T]] = js.native
}

