package typingsSlinky.stellarSdk.mod

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.AnonHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr")
@js.native
object xdr extends js.Object {
  @js.native
  class Asset ()
    extends typingsSlinky.stellarBase.mod.xdr.Asset
  
  @js.native
  class DecoratedSignature protected ()
    extends typingsSlinky.stellarBase.mod.xdr.DecoratedSignature {
    def this(keys: AnonHint) = this()
  }
  
  @js.native
  class Memo ()
    extends typingsSlinky.stellarBase.mod.xdr.Memo
  
  // tslint:disable-line:strict-export-declare-modifiers
  @js.native
  class Operation[T /* <: typingsSlinky.stellarBase.mod.Operation */] ()
    extends typingsSlinky.stellarBase.mod.xdr.Operation[T]
  
  @js.native
  class TransactionEnvelope ()
    extends typingsSlinky.stellarBase.mod.xdr.TransactionEnvelope
  
  @js.native
  class TransactionResult ()
    extends typingsSlinky.stellarBase.mod.xdr.TransactionResult
  
  @js.native
  class XDRStruct ()
    extends typingsSlinky.stellarBase.mod.xdr.XDRStruct
  
  /* static members */
  @js.native
  object Asset extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarBase.mod.xdr.Asset = js.native
  }
  
  /* static members */
  @js.native
  object DecoratedSignature extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarBase.mod.xdr.DecoratedSignature = js.native
  }
  
  /* static members */
  @js.native
  object Memo extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarBase.mod.xdr.Memo = js.native
  }
  
  /* static members */
  @js.native
  object Operation extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarBase.mod.xdr.Operation[typingsSlinky.stellarBase.mod.Operation] = js.native
  }
  
  /* static members */
  @js.native
  object TransactionEnvelope extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarBase.mod.xdr.TransactionEnvelope = js.native
  }
  
  /* static members */
  @js.native
  object TransactionResult extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarBase.mod.xdr.TransactionResult = js.native
  }
  
  /* static members */
  @js.native
  object XDRStruct extends js.Object {
    def fromXDR(xdr: Buffer): typingsSlinky.stellarBase.mod.xdr.XDRStruct = js.native
  }
  
}

