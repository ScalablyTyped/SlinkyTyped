package typingsSlinky.std

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
  ): ConcatParams = {
    val __obj = js.Dynamic.literal(algorithmId = algorithmId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partyUInfo = partyUInfo.asInstanceOf[js.Any], partyVInfo = partyVInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatParams]
  }
  
  @scala.inline
  implicit class ConcatParamsOps[Self <: org.scalajs.dom.crypto.ConcatParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithmId(value: js.typedarray.Uint8Array): Self = this.set("algorithmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartyUInfo(value: js.typedarray.Uint8Array): Self = this.set("partyUInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartyVInfo(value: js.typedarray.Uint8Array): Self = this.set("partyVInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashAlgorithm(value: org.scalajs.dom.crypto.Algorithm): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: java.lang.String | org.scalajs.dom.crypto.Algorithm): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setPrivateInfo(value: js.typedarray.Uint8Array): Self = this.set("privateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateInfo: Self = this.set("privateInfo", js.undefined)
    
    @scala.inline
    def setPublicInfo(value: js.typedarray.Uint8Array): Self = this.set("publicInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicInfo: Self = this.set("publicInfo", js.undefined)
  }
}
