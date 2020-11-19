package typingsSlinky.shopifyPrime.scriptTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptTagOptions extends js.Object {
  
  /**
    * Filters the result to script tags with the given src.
    */
  var src: js.UndefOr[String] = js.native
}
object ScriptTagOptions {
  
  @scala.inline
  def apply(): ScriptTagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptTagOptions]
  }
  
  @scala.inline
  implicit class ScriptTagOptionsOps[Self <: ScriptTagOptions] (val x: Self) extends AnyVal {
    
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
}
