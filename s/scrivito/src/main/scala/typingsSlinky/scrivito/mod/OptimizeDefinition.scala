package typingsSlinky.scrivito.mod

import typingsSlinky.scrivito.scrivitoStrings.bottom
import typingsSlinky.scrivito.scrivitoStrings.center
import typingsSlinky.scrivito.scrivitoStrings.crop
import typingsSlinky.scrivito.scrivitoStrings.left
import typingsSlinky.scrivito.scrivitoStrings.resize
import typingsSlinky.scrivito.scrivitoStrings.right
import typingsSlinky.scrivito.scrivitoStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimizeDefinition extends js.Object {
  
  // Fix this being able to be filled when using fit = resize
  var crop: center | top | left | right | bottom = js.native
  
  var fit: resize | crop = js.native
  
  var height: Double | String = js.native
  
  var width: Double | String = js.native
}
object OptimizeDefinition {
  
  @scala.inline
  def apply(
    crop: center | top | left | right | bottom,
    fit: resize | crop,
    height: Double | String,
    width: Double | String
  ): OptimizeDefinition = {
    val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizeDefinition]
  }
  
  @scala.inline
  implicit class OptimizeDefinitionOps[Self <: OptimizeDefinition] (val x: Self) extends AnyVal {
    
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
    def setCrop(value: center | top | left | right | bottom): Self = this.set("crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFit(value: resize | crop): Self = this.set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
