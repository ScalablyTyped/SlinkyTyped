package typingsSlinky.xmldsigjs.rsaKeyMod

import org.scalajs.dom.crypto.Algorithm
import typingsSlinky.std.AlgorithmIdentifier
import typingsSlinky.std.RsaPssParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaPSSSignParams extends RsaPssParams {
  
  var hash: AlgorithmIdentifier = js.native
}
object RsaPSSSignParams {
  
  @scala.inline
  def apply(hash: AlgorithmIdentifier, name: String, saltLength: Double): RsaPSSSignParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPSSSignParams]
  }
  
  @scala.inline
  implicit class RsaPSSSignParamsOps[Self <: RsaPSSSignParams] (val x: Self) extends AnyVal {
    
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
    def setHashAlgorithm(value: Algorithm): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: AlgorithmIdentifier): Self = this.set("hash", value.asInstanceOf[js.Any])
  }
}
