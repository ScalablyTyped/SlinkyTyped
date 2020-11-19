package typingsSlinky.secp256k1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignOptions extends js.Object {
  
  /**
    * Additional data for noncefn (RFC 6979 3.6) (32 bytes).
    *
    * By default is `null`.
    */
  var data: js.UndefOr[js.typedarray.Uint8Array] = js.native
  
  /** Nonce generator. By default it is rfc6979 */
  var noncefn: js.UndefOr[
    js.Function5[
      /* message */ js.typedarray.Uint8Array, 
      /* privateKey */ js.typedarray.Uint8Array, 
      /* algo */ js.typedarray.Uint8Array | Null, 
      /* data */ js.typedarray.Uint8Array | Null, 
      /* attempt */ Double, 
      js.typedarray.Uint8Array
    ]
  ] = js.native
}
object SignOptions {
  
  @scala.inline
  def apply(): SignOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignOptions]
  }
  
  @scala.inline
  implicit class SignOptionsOps[Self <: SignOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: js.typedarray.Uint8Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setNoncefn(
      value: (/* message */ js.typedarray.Uint8Array, /* privateKey */ js.typedarray.Uint8Array, /* algo */ js.typedarray.Uint8Array | Null, /* data */ js.typedarray.Uint8Array | Null, /* attempt */ Double) => js.typedarray.Uint8Array
    ): Self = this.set("noncefn", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteNoncefn: Self = this.set("noncefn", js.undefined)
  }
}
