package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.dateTimeMod.DateTimePicker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateTimePicker {
  
  @scala.inline
  def apply(onChange: /* currentDate */ String => Unit): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components", "DateTimePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def currentDate(value: String): this.type = set("currentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def is12Hour(value: Boolean): this.type = set("is12Hour", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
