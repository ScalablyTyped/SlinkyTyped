package typingsSlinky.wordpressBlockEditor.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.anon.Dictk
import typingsSlinky.wordpressBlockEditor.anon.Open
import typingsSlinky.wordpressBlockEditor.mediaUploadMod.MediaUpload.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaUpload {
  
  @JSImport("@wordpress/block-editor", "MediaUpload")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T /* <: Boolean */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def addToGallery(value: Boolean): this.type = set("addToGallery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowedTypesVarargs(value: String*): this.type = set("allowedTypes", js.Array(value :_*))
    
    @scala.inline
    def allowedTypes(value: js.Array[String]): this.type = set("allowedTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gallery(value: Boolean): this.type = set("gallery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def modalClass(value: String): this.type = set("modalClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiple(value: T): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: Double*): this.type = set("value", js.Array(value :_*))
    
    @scala.inline
    def value(value: Double | js.Array[Double]): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: Boolean */](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T /* <: Boolean */](onSelect: /* value */ Dictk | js.Array[Dictk] => Unit, render: Open => ReactElement): Builder[T] = {
    val __props = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect), render = js.Any.fromFunction1(render))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
}
