package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcatParams extends Algorithm {
  
  var algorithmId: js.typedarray.Uint8Array = js.native
  
  var hash: js.UndefOr[java.lang.String | org.scalajs.dom.crypto.Algorithm] = js.native
  
  var partyUInfo: js.typedarray.Uint8Array = js.native
  
  var partyVInfo: js.typedarray.Uint8Array = js.native
  
  var privateInfo: js.UndefOr[js.typedarray.Uint8Array] = js.native
  
  var publicInfo: js.UndefOr[js.typedarray.Uint8Array] = js.native
}
object ConcatParams {
  
  @scala.inline
  def apply(
    algorithmId: js.typedarray.Uint8Array,
    name: java.lang.String,
    partyUInfo: js.typedarray.Uint8Array,
    partyVInfo: js.typedarray.Uint8Array
  ): org.scalajs.dom.crypto.ConcatParams = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partyUInfo = partyUInfo.asInstanceOf[js.Any], partyVInfo = partyVInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[org.scalajs.dom.crypto.ConcatParams]
  }
  
  @scala.inline
  implicit class ConcatParamsMutableBuilder[Self <: org.scalajs.dom.crypto.ConcatParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithmId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "algorithmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: java.lang.String | org.scalajs.dom.crypto.Algorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setPartyUInfo(value: js.typedarray.Uint8Array): Self = StObject.set(x, "partyUInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartyVInfo(value: js.typedarray.Uint8Array): Self = StObject.set(x, "partyVInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateInfo(value: js.typedarray.Uint8Array): Self = StObject.set(x, "privateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateInfoUndefined: Self = StObject.set(x, "privateInfo", js.undefined)
    
    @scala.inline
    def setPublicInfo(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicInfoUndefined: Self = StObject.set(x, "publicInfo", js.undefined)
  }
}
