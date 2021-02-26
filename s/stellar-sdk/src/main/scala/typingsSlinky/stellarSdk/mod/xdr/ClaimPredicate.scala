package typingsSlinky.stellarSdk.mod.xdr

import typingsSlinky.node.Buffer
import typingsSlinky.stellarSdk.stellarSdkStrings.base64
import typingsSlinky.stellarSdk.stellarSdkStrings.hex
import typingsSlinky.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.ClaimPredicate")
@js.native
class ClaimPredicate ()
  extends typingsSlinky.stellarBase.mod.xdr.ClaimPredicate
object ClaimPredicate {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.claimPredicateAnd")
  @js.native
  def claimPredicateAnd(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate]): typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.claimPredicateBeforeAbsoluteTime")
  @js.native
  def claimPredicateBeforeAbsoluteTime(value: typingsSlinky.stellarBase.xdrMod.xdr.Int64): typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.claimPredicateBeforeRelativeTime")
  @js.native
  def claimPredicateBeforeRelativeTime(value: typingsSlinky.stellarBase.xdrMod.xdr.Int64): typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.claimPredicateNot")
  @js.native
  def claimPredicateNot(): typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.claimPredicateNot")
  @js.native
  def claimPredicateNot(value: typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate): typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.claimPredicateOr")
  @js.native
  def claimPredicateOr(value: js.Array[typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate]): typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.claimPredicateUnconditional")
  @js.native
  def claimPredicateUnconditional(): typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.isValid")
  @js.native
  def isValid(value: typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.read")
  @js.native
  def read(io: Buffer): typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.toXDR")
  @js.native
  def toXDR(value: typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ClaimPredicate.write")
  @js.native
  def write(value: typingsSlinky.stellarBase.xdrMod.xdr.ClaimPredicate, io: Buffer): Unit = js.native
}
