package typingsSlinky.wordpressEditor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressEditor.wordpressEditorBooleans.`false`
import typingsSlinky.wordpressEditor.wordpressEditorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PostPublishButton {
  object SubmitProps {
    @JSImport("@wordpress/editor", "PostPublishButton")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def focusOnMount(value: Boolean): this.type = set("focusOnMount", value.asInstanceOf[js.Any])
      @scala.inline
      def forceIsDirty(value: Boolean): this.type = set("forceIsDirty", value.asInstanceOf[js.Any])
      @scala.inline
      def forceIsSaving(value: Boolean): this.type = set("forceIsSaving", value.asInstanceOf[js.Any])
      @scala.inline
      def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
      @scala.inline
      def isToggle(value: `false`): this.type = set("isToggle", value.asInstanceOf[js.Any])
      @scala.inline
      def onSubmit(value: () => Unit): this.type = set("onSubmit", js.Any.fromFunction0(value))
    }
    
    def withProps(p: typingsSlinky.wordpressEditor.postPublishButtonMod.PostPublishButton.SubmitProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: SubmitProps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object ToggleProps {
    @JSImport("@wordpress/editor", "PostPublishButton")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def focusOnMount(value: Boolean): this.type = set("focusOnMount", value.asInstanceOf[js.Any])
      @scala.inline
      def forceIsDirty(value: Boolean): this.type = set("forceIsDirty", value.asInstanceOf[js.Any])
      @scala.inline
      def forceIsSaving(value: Boolean): this.type = set("forceIsSaving", value.asInstanceOf[js.Any])
      @scala.inline
      def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.wordpressEditor.postPublishButtonMod.PostPublishButton.ToggleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(isToggle: `true`, onToggle: () => Unit): Builder = {
        val __props = js.Dynamic.literal(isToggle = isToggle.asInstanceOf[js.Any], onToggle = js.Any.fromFunction0(onToggle))
        new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.wordpressEditor.postPublishButtonMod.PostPublishButton.ToggleProps]))
    }
  }
  
}

