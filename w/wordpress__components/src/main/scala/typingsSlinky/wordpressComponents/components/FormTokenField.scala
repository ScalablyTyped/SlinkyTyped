package typingsSlinky.wordpressComponents.components

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticFocusEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressComponents.formTokenFieldMod.FormTokenField.Props
import typingsSlinky.wordpressComponents.formTokenFieldMod.FormTokenField.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormTokenField {
  
  @JSImport("@wordpress/components", "FormTokenField")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayTransform(value: /* token */ String => String): this.type = set("displayTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def isBorderless(value: Boolean): this.type = set("isBorderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxSuggestions(value: Double): this.type = set("maxSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* value */ js.Array[Value] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[Element] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInputChange(value: /* token */ String => Unit): this.type = set("onInputChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def saveTransform(value: /* token */ String => String): this.type = set("saveTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def suggestions(value: js.Array[String]): this.type = set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def suggestionsVarargs(value: String*): this.type = set("suggestions", js.Array(value :_*))
    
    @scala.inline
    def tokenizeOnSpace(value: Boolean): this.type = set("tokenizeOnSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Array[Value]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: Value*): this.type = set("value", js.Array(value :_*))
  }
  
  implicit def make(companion: FormTokenField.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
