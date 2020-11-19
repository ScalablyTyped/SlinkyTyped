package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.alignmentToolbarMod.AlignmentToolbar.Props
import typingsSlinky.wordpressBlockEditor.anon.Align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AlignmentToolbar {
  
  @JSImport("@wordpress/editor", "AlignmentToolbar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def alignmentControlsVarargs(value: Align*): this.type = set("alignmentControls", js.Array(value :_*))
    
    @scala.inline
    def alignmentControls(value: js.Array[Align]): this.type = set("alignmentControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(onChange: js.UndefOr[String] => Unit): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
