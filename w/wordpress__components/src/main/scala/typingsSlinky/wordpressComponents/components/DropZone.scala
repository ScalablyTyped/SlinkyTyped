package typingsSlinky.wordpressComponents.components

import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.wordpressComponents.dropZoneMod.DropZone.HoverPosition
import typingsSlinky.wordpressComponents.dropZoneMod.DropZone.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropZone {
  
  @JSImport("@wordpress/components", "DropZone")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrop(value: (/* event */ DragEvent[HTMLDivElement], /* position */ HoverPosition) => Unit): this.type = set("onDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def onFilesDrop(value: (/* files */ js.Array[File], /* position */ HoverPosition) => Unit): this.type = set("onFilesDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def onHTMLDrop(value: (/* html */ String, /* position */ HoverPosition) => Unit): this.type = set("onHTMLDrop", js.Any.fromFunction2(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DropZone.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
