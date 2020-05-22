package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete.Completer
import typingsSlinky.wordpressComponents.autocompleteMod.Autocomplete.Props
import typingsSlinky.wordpressRichText.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Autocomplete {
  @JSImport("@wordpress/components/autocomplete", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def onChange(value: /* value */ Value => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onReplace(value: /* value */ Value => Unit): this.type = set("onReplace", js.Any.fromFunction1(value))
    @scala.inline
    def record(value: Value): this.type = set("record", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T](completers: js.Array[Completer[T]]): Builder[T] = {
    val __props = js.Dynamic.literal(completers = completers.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
}

