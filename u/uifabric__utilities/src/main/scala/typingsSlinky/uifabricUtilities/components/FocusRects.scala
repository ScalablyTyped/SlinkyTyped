package typingsSlinky.uifabricUtilities.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.uifabricUtilities.anon.RootRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FocusRects {
  
  @JSImport("@uifabric/utilities", "FocusRects")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def rootRef(value: ReactRef[HTMLElement]): this.type = set("rootRef", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RootRef): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FocusRects.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
