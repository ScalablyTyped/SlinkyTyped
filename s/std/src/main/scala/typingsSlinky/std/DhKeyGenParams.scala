package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DhKeyGenParams extends Algorithm {
  
  var generator: js.typedarray.Uint8Array = js.native
  
  var prime: js.typedarray.Uint8Array = js.native
}
object DhKeyGenParams {
  
  @scala.inline
  def apply(generator: js.typedarray.Uint8Array, name: java.lang.String, prime: js.typedarray.Uint8Array): DhKeyGenParams = {
    val __obj = js.Dynamic.literal(generator = generator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DhKeyGenParams]
  }
  
  @scala.inline
  implicit class DhKeyGenParamsOps[Self <: org.scalajs.dom.crypto.DhKeyGenParams] (val x: Self) extends AnyVal {
    
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
    def setGenerator(value: js.typedarray.Uint8Array): Self = this.set("generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrime(value: js.typedarray.Uint8Array): Self = this.set("prime", value.asInstanceOf[js.Any])
  }
}
