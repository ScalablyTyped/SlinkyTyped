package typingsSlinky.spectacle.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.anon.AnimationsWhenGoingBack
import typingsSlinky.spectacle.anon.CurrentSlide
import typingsSlinky.spectacle.mod.TransitionEffect
import typingsSlinky.spectacle.spectacleStrings.arrows
import typingsSlinky.spectacle.spectacleStrings.space
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Deck {
  
  @JSImport("spectacle", "Deck")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def animationsWhenGoingBack(value: Boolean): this.type = set("animationsWhenGoingBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyboardControls(value: arrows | space): this.type = set("keyboardControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def template(value: /* options */ CurrentSlide => ReactElement): this.type = set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: Record[String, _]): this.type = set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionEffect(value: TransitionEffect): this.type = set("transitionEffect", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Deck.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AnimationsWhenGoingBack): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
