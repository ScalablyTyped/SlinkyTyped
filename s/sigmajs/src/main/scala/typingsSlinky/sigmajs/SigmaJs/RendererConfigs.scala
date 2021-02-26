package typingsSlinky.sigmajs.SigmaJs

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RendererConfigs extends StObject {
  
  var container: js.UndefOr[Element] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object RendererConfigs {
  
  @scala.inline
  def apply(): RendererConfigs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererConfigs]
  }
  
  @scala.inline
  implicit class RendererConfigsMutableBuilder[Self <: RendererConfigs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
