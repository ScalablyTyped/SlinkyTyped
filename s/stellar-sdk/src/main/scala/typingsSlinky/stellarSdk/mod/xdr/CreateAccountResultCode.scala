package typingsSlinky.stellarSdk.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.CreateAccountResultCode")
@js.native
class CreateAccountResultCode ()
  extends typingsSlinky.stellarBase.mod.xdr.CreateAccountResultCode

/* static members */
@JSImport("stellar-sdk", "xdr.CreateAccountResultCode")
@js.native
object CreateAccountResultCode extends js.Object {
  def createAccountAlreadyExist(): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountLowReserve(): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountMalformed(): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountSuccess(): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountUnderfunded(): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
}

