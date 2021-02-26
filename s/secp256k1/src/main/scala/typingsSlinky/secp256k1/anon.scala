package typingsSlinky.secp256k1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Recid extends StObject {
    
    var recid: Double = js.native
    
    var signature: js.typedarray.Uint8Array = js.native
  }
  object Recid {
    
    @scala.inline
    def apply(recid: Double, signature: js.typedarray.Uint8Array): Recid = {
      val __obj = js.Dynamic.literal(recid = recid.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Recid]
    }
    
    @scala.inline
    implicit class RecidMutableBuilder[Self <: Recid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecid(value: Double): Self = StObject.set(x, "recid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: js.typedarray.Uint8Array): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
}
