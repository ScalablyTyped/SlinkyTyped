package typingsSlinky.stellarBase.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.CreateAccountResultCode")
@js.native
class CreateAccountResultCode ()
  extends typingsSlinky.stellarBase.xdrMod.default.CreateAccountResultCode

/* static members */
@JSImport("stellar-base", "xdr.CreateAccountResultCode")
@js.native
object CreateAccountResultCode extends js.Object {
  def createAccountAlreadyExist(): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountLowReserve(): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountMalformed(): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountSuccess(): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
  def createAccountUnderfunded(): typingsSlinky.stellarBase.xdrMod.xdr.CreateAccountResultCode = js.native
}

