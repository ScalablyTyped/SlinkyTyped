package typingsSlinky.storybookApi.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.storybookApi.mod.Combo
import typingsSlinky.storybookApi.mod.ManagerConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Consumer {
  
  @scala.inline
  def apply[P](): Builder[P] = {
    val __props = js.Dynamic.literal()
    new Builder[P](js.Array(this.component, __props.asInstanceOf[ManagerConsumerProps[P]]))
  }
  
  @JSImport("@storybook/api", "Consumer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[P] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(value: ReactComponentClass[P] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunctionComponent(value: ReactComponentClass[P]): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filter(value: /* combo */ Combo => P): this.type = set("filter", js.Any.fromFunction1(value))
  }
  
  implicit def make[P](companion: Consumer.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[P](p: ManagerConsumerProps[P]): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
}
