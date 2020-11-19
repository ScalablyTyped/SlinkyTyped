package typingsSlinky.tunnelSsh.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cipher extends js.Object {
  
  var cipher: js.UndefOr[js.Array[String]] = js.native
  
  var compress: js.UndefOr[js.Array[String]] = js.native
  
  var hmac: js.UndefOr[js.Array[String]] = js.native
  
  var key: js.UndefOr[js.Array[String]] = js.native
  
  var serverHostKey: js.UndefOr[js.Array[String]] = js.native
}
object Cipher {
  
  @scala.inline
  def apply(): Cipher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cipher]
  }
  
  @scala.inline
  implicit class CipherOps[Self <: Cipher] (val x: Self) extends AnyVal {
    
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
    def setCipherVarargs(value: String*): Self = this.set("cipher", js.Array(value :_*))
    
    @scala.inline
    def setCipher(value: js.Array[String]): Self = this.set("cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCipher: Self = this.set("cipher", js.undefined)
    
    @scala.inline
    def setCompressVarargs(value: String*): Self = this.set("compress", js.Array(value :_*))
    
    @scala.inline
    def setCompress(value: js.Array[String]): Self = this.set("compress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    
    @scala.inline
    def setHmacVarargs(value: String*): Self = this.set("hmac", js.Array(value :_*))
    
    @scala.inline
    def setHmac(value: js.Array[String]): Self = this.set("hmac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHmac: Self = this.set("hmac", js.undefined)
    
    @scala.inline
    def setKeyVarargs(value: String*): Self = this.set("key", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: js.Array[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setServerHostKeyVarargs(value: String*): Self = this.set("serverHostKey", js.Array(value :_*))
    
    @scala.inline
    def setServerHostKey(value: js.Array[String]): Self = this.set("serverHostKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerHostKey: Self = this.set("serverHostKey", js.undefined)
  }
}
