package typingsSlinky.slimerjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format extends js.Object {
  
  var format: js.UndefOr[String] = js.native
  
  var onlyViewport: js.UndefOr[Boolean] = js.native
  
  var quality: js.UndefOr[String] = js.native
  
  var ratio: js.UndefOr[Double] = js.native
}
object Format {
  
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setOnlyViewport(value: Boolean): Self = this.set("onlyViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyViewport: Self = this.set("onlyViewport", js.undefined)
    
    @scala.inline
    def setQuality(value: String): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
  }
}
