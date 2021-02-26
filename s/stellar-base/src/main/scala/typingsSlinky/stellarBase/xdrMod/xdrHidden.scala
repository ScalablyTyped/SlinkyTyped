package typingsSlinky.stellarBase.xdrMod

import typingsSlinky.node.Buffer
import typingsSlinky.stellarBase.mod.Operation
import typingsSlinky.stellarBase.stellarBaseStrings.base64
import typingsSlinky.stellarBase.stellarBaseStrings.hex
import typingsSlinky.stellarBase.stellarBaseStrings.raw
import typingsSlinky.stellarBase.xdrMod.xdr.MuxedAccount
import typingsSlinky.stellarBase.xdrMod.xdr.OperationBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Hidden namespace as hack to work around name collision.
object xdrHidden {
  
  // tslint:disable-line:strict-export-declare-modifiers
  @js.native
  trait Operation2[T /* <: Operation */] extends StObject {
    
    def body(): OperationBody = js.native
    def body(value: OperationBody): OperationBody = js.native
    
    def sourceAccount(): Null | MuxedAccount = js.native
    def sourceAccount(value: MuxedAccount): Null | MuxedAccount = js.native
    
    def toXDR(): Buffer = js.native
    @JSName("toXDR")
    def toXDR_base64(format: base64): String = js.native
    @JSName("toXDR")
    def toXDR_hex(format: hex): String = js.native
    @JSName("toXDR")
    def toXDR_raw(format: raw): Buffer = js.native
  }
}
