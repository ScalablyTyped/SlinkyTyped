package typingsSlinky.winrtUwp.Windows.Security.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyCredentialStatus extends js.Object
/** Represents the status of a key credential request. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialStatus")
@js.native
object KeyCredentialStatus extends js.Object {
  
  /** The credential already exists. */
  @js.native
  sealed trait credentialAlreadyExists extends KeyCredentialStatus
  
  /** The credential could not be found. */
  @js.native
  sealed trait notFound extends KeyCredentialStatus
  
  /** The security device was locked. */
  @js.native
  sealed trait securityDeviceLocked extends KeyCredentialStatus
  
  /** The operation was successful. */
  @js.native
  sealed trait success extends KeyCredentialStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknownError extends KeyCredentialStatus
  
  /** The request was cancelled by the user. */
  @js.native
  sealed trait userCanceled extends KeyCredentialStatus
  
  /** The user prefers to enter a password. */
  @js.native
  sealed trait userPrefersPassword extends KeyCredentialStatus
}
