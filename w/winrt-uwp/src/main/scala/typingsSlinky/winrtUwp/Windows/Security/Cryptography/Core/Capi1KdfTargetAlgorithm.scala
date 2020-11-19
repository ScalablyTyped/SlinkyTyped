package typingsSlinky.winrtUwp.Windows.Security.Cryptography.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Capi1KdfTargetAlgorithm extends js.Object
/** Represents information about a target algorithm. */
@JSGlobal("Windows.Security.Cryptography.Core.Capi1KdfTargetAlgorithm")
@js.native
object Capi1KdfTargetAlgorithm extends js.Object {
  
  /** The target algorithm is AES. */
  @js.native
  sealed trait aes extends Capi1KdfTargetAlgorithm
  
  /** The target algorithm is not AES. */
  @js.native
  sealed trait notAes extends Capi1KdfTargetAlgorithm
}
