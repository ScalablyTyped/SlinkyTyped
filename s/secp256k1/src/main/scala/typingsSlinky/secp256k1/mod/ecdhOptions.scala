package typingsSlinky.secp256k1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ecdhOptions extends js.Object {
  
  var data: js.UndefOr[js.typedarray.Uint8Array] = js.native
  
  var hashfn: js.UndefOr[
    js.Function3[
      /* x */ js.typedarray.Uint8Array, 
      /* y */ js.typedarray.Uint8Array, 
      /* data */ js.typedarray.Uint8Array, 
      js.typedarray.Uint8Array
    ]
  ] = js.native
  
  var xbuf: js.UndefOr[js.typedarray.Uint8Array] = js.native
  
  var ybuf: js.UndefOr[js.typedarray.Uint8Array] = js.native
}
object ecdhOptions {
  
  @scala.inline
  def apply(): ecdhOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ecdhOptions]
  }
  
  @scala.inline
  implicit class ecdhOptionsOps[Self <: ecdhOptions] (val x: Self) extends AnyVal {
    
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
    def setHashfn(
      value: (/* x */ js.typedarray.Uint8Array, /* y */ js.typedarray.Uint8Array, /* data */ js.typedarray.Uint8Array) => js.typedarray.Uint8Array
    ): Self = this.set("hashfn", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHashfn: Self = this.set("hashfn", js.undefined)
    
    @scala.inline
    def setXbuf(value: js.typedarray.Uint8Array): Self = this.set("xbuf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXbuf: Self = this.set("xbuf", js.undefined)
    
    @scala.inline
    def setYbuf(value: js.typedarray.Uint8Array): Self = this.set("ybuf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYbuf: Self = this.set("ybuf", js.undefined)
  }
}
