package typingsSlinky.stellarDashSdk.stellarDashSdkMod

import typingsSlinky.node.Buffer
import typingsSlinky.stellarDashBase.Anon_Hint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr")
@js.native
object xdr extends js.Object {
  @js.native
  class Asset ()
    extends typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Asset
  
  @js.native
  class DecoratedSignature protected ()
    extends typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.DecoratedSignature {
    def this(keys: Anon_Hint) = this()
  }
  
  @js.native
  class Memo ()
    extends typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Memo
  
  // tslint:disable-line:strict-export-declare-modifiers
  @js.native
  class Operation[T /* <: typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation */] ()
    extends typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[T]
  
  @js.native
  class TransactionEnvelope ()
    extends typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.TransactionEnvelope
  
  @js.native
  class TransactionResult ()
    extends typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.TransactionResult
  
  @js.native
  class XDRStruct ()
    extends typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.XDRStruct
  
  /* static members */
  @js.native
  object Asset extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Asset = js.native
  }
  
  /* static members */
  @js.native
  object DecoratedSignature extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.DecoratedSignature = js.native
  }
  
  /* static members */
  @js.native
  object Memo extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Memo = js.native
  }
  
  /* static members */
  @js.native
  object Operation extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.Operation[typingsSlinky.stellarDashBase.stellarDashBaseMod.Operation] = js.native
  }
  
  /* static members */
  @js.native
  object TransactionEnvelope extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.TransactionEnvelope = js.native
  }
  
  /* static members */
  @js.native
  object TransactionResult extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.TransactionResult = js.native
  }
  
  /* static members */
  @js.native
  object XDRStruct extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarDashBase.stellarDashBaseMod.xdr.XDRStruct = js.native
  }
  
}

