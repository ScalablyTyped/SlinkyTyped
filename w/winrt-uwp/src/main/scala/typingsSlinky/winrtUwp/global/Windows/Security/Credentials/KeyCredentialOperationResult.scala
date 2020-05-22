package typingsSlinky.winrtUwp.global.Windows.Security.Credentials

import typingsSlinky.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a key credential operation. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialOperationResult")
@js.native
abstract class KeyCredentialOperationResult ()
  extends typingsSlinky.winrtUwp.Windows.Security.Credentials.KeyCredentialOperationResult {
  /** Gets the result of the key credential operation. */
  /* CompleteClass */
  override var result: IBuffer = js.native
  /** Gets the status of the key credential. */
  /* CompleteClass */
  override var status: typingsSlinky.winrtUwp.Windows.Security.Credentials.KeyCredentialStatus = js.native
}

