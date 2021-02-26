package typingsSlinky.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitModalOptions extends StObject {
  
  var `bg-close`: js.UndefOr[Boolean] = js.native
  
  var `cls-page`: js.UndefOr[String] = js.native
  
  var `cls-panel`: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String | Boolean] = js.native
  
  var `esc-close`: js.UndefOr[Boolean] = js.native
  
  var `sel-close`: js.UndefOr[String] = js.native
  
  var stack: js.UndefOr[Boolean] = js.native
}
object UIkitModalOptions {
  
  @scala.inline
  def apply(): UIkitModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitModalOptions]
  }
  
  @scala.inline
  implicit class UIkitModalOptionsMutableBuilder[Self <: UIkitModalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setBg-close`(value: Boolean): Self = StObject.set(x, "bg-close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBg-closeUndefined`: Self = StObject.set(x, "bg-close", js.undefined)
    
    @scala.inline
    def `setCls-page`(value: String): Self = StObject.set(x, "cls-page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCls-pageUndefined`: Self = StObject.set(x, "cls-page", js.undefined)
    
    @scala.inline
    def `setCls-panel`(value: String): Self = StObject.set(x, "cls-panel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCls-panelUndefined`: Self = StObject.set(x, "cls-panel", js.undefined)
    
    @scala.inline
    def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def `setEsc-close`(value: Boolean): Self = StObject.set(x, "esc-close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEsc-closeUndefined`: Self = StObject.set(x, "esc-close", js.undefined)
    
    @scala.inline
    def `setSel-close`(value: String): Self = StObject.set(x, "sel-close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSel-closeUndefined`: Self = StObject.set(x, "sel-close", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
  }
}
