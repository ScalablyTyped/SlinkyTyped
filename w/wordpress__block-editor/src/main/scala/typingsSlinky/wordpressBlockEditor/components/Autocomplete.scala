package typingsSlinky.wordpressBlockEditor.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete.Completer
import typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete.Props
import typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete.RenderProps
import typingsSlinky.wordpressRichText.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Autocomplete {
  
  @scala.inline
  def apply[T](children: RenderProps => ReactElement | Null, completers: js.Array[Completer[T]]): Builder[T] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), completers = completers.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
  
  @JSImport("@wordpress/block-editor", "Autocomplete")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* value */ Value => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReplace(value: /* value */ Value => Unit): this.type = set("onReplace", js.Any.fromFunction1(value))
    
    @scala.inline
    def record(value: Value): this.type = set("record", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
