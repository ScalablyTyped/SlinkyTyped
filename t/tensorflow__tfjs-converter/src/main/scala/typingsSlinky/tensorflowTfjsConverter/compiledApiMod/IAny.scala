package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAny extends StObject {
  
  /** Any typeUrl */
  var typeUrl: js.UndefOr[String | Null] = js.native
  
  /** Any value */
  var value: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
}
object IAny {
  
  @scala.inline
  def apply(): IAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAny]
  }
  
  @scala.inline
  implicit class IAnyMutableBuilder[Self <: IAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeUrl(value: String): Self = StObject.set(x, "typeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUrlNull: Self = StObject.set(x, "typeUrl", null)
    
    @scala.inline
    def setTypeUrlUndefined: Self = StObject.set(x, "typeUrl", js.undefined)
    
    @scala.inline
    def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
