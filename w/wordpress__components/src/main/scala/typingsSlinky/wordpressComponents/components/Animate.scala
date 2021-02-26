package typingsSlinky.wordpressComponents.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.anon.ClassName
import typingsSlinky.wordpressComponents.anon.Origin
import typingsSlinky.wordpressComponents.anon.`0`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.`slide-in`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.appear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Animate {
  
  object AppearProps {
    
    @scala.inline
    def apply(children: ClassName => ReactElement, `type`: appear): Builder = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.wordpressComponents.animateMod.Animate.AppearProps]))
    }
    
    @JSImport("@wordpress/components", "Animate")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def options(value: Origin): this.type = set("options", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.wordpressComponents.animateMod.Animate.AppearProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object SlideInProps {
    
    @scala.inline
    def apply(children: ClassName => ReactElement, `type`: `slide-in`): Builder = {
      val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.wordpressComponents.animateMod.Animate.SlideInProps]))
    }
    
    @JSImport("@wordpress/components", "Animate")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def options(value: `0`): this.type = set("options", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.wordpressComponents.animateMod.Animate.SlideInProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
