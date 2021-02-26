package typingsSlinky.wordpressEditor.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.anon.Dictk
import typingsSlinky.wordpressBlockEditor.anon.Instructions
import typingsSlinky.wordpressBlockEditor.mediaPlaceholderMod.MediaPlaceholder.Props
import typingsSlinky.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsSlinky.wordpressComponents.dropZoneMod.DropZone.HoverPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaPlaceholder {
  
  @scala.inline
  def apply[T /* <: Boolean */](onSelect: Dictk | js.Array[Dictk] => Unit): Builder[T] = {
    val __props = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
  
  @JSImport("@wordpress/editor", "MediaPlaceholder")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[T /* <: Boolean */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def addToGallery(value: Boolean): this.type = set("addToGallery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowedTypes(value: js.Array[String]): this.type = set("allowedTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowedTypesVarargs(value: String*): this.type = set("allowedTypes", js.Array(value :_*))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropZoneUIOnly(value: Boolean): this.type = set("dropZoneUIOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: Icon | ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isAppender(value: Boolean): this.type = set("isAppender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labels(value: Instructions): this.type = set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mediaPreview(value: ReactElement): this.type = set("mediaPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: T): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def notices(value: ReactElement): this.type = set("notices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCancel(value: () => Unit): this.type = set("onCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def onDoubleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onDoubleClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onError(value: /* message */ String => Unit): this.type = set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHTMLDrop(value: (/* html */ String, /* position */ HoverPosition) => Unit): this.type = set("onHTMLDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def onSelectURL(value: /* src */ String => Unit): this.type = set("onSelectURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def value(value: Double | js.Array[Double]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: Double*): this.type = set("value", js.Array(value :_*))
  }
  
  def withProps[T /* <: Boolean */](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
