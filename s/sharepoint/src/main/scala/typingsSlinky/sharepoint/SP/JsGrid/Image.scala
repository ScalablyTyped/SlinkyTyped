package typingsSlinky.sharepoint.SP.JsGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.microsoftAjax.Sys.UI.DomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Image extends js.Object {
  
  /** Renders the image with specified alternative text and on-click handler.
    If bHideTooltip == false, then alternative text is also shown as the tooltip (title attribute). */
  def Render(altText: String, clickFn: js.Function1[/* eventInfo */ DomEvent, Unit], bHideTooltip: Boolean): HTMLElement = js.native
  
  var bIsAnimated: Boolean = js.native
  
  var bIsClustered: Boolean = js.native
  
  var imgCssNames: String = js.native
  
  var imgSrc: String = js.native
  
  var optOuterCssNames: String = js.native
}
object Image {
  
  @scala.inline
  def apply(
    Render: (String, js.Function1[/* eventInfo */ DomEvent, Unit], Boolean) => HTMLElement,
    bIsAnimated: Boolean,
    bIsClustered: Boolean,
    imgCssNames: String,
    imgSrc: String,
    optOuterCssNames: String
  ): Image = {
    val __obj = js.Dynamic.literal(Render = js.Any.fromFunction3(Render), bIsAnimated = bIsAnimated.asInstanceOf[js.Any], bIsClustered = bIsClustered.asInstanceOf[js.Any], imgCssNames = imgCssNames.asInstanceOf[js.Any], imgSrc = imgSrc.asInstanceOf[js.Any], optOuterCssNames = optOuterCssNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    
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
    def setRender(value: (String, js.Function1[/* eventInfo */ DomEvent, Unit], Boolean) => HTMLElement): Self = this.set("Render", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBIsAnimated(value: Boolean): Self = this.set("bIsAnimated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBIsClustered(value: Boolean): Self = this.set("bIsClustered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgCssNames(value: String): Self = this.set("imgCssNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImgSrc(value: String): Self = this.set("imgSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptOuterCssNames(value: String): Self = this.set("optOuterCssNames", value.asInstanceOf[js.Any])
  }
}
