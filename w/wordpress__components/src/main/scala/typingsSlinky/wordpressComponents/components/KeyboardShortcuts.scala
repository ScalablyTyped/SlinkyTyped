package typingsSlinky.wordpressComponents.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.std.Record
import typingsSlinky.wordpressComponents.wordpressComponentsBooleans.`true`
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.keydown
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.keypress
import typingsSlinky.wordpressComponents.wordpressComponentsStrings.keyup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeyboardShortcuts {
  
  object PropsWithChildren {
    
    @scala.inline
    def apply(shortcuts: Record[String, js.Function0[Unit]]): Builder = {
      val __props = js.Dynamic.literal(shortcuts = shortcuts.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithChildren]))
    }
    
    @JSImport("@wordpress/components", "KeyboardShortcuts")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def bindGlobal(value: Boolean): this.type = set("bindGlobal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def eventName(value: keydown | keypress | keyup): this.type = set("eventName", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithChildren): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object PropsWithoutChildren {
    
    @scala.inline
    def apply(bindGlobal: `true`, shortcuts: Record[String, js.Function0[Unit]]): Builder = {
      val __props = js.Dynamic.literal(bindGlobal = bindGlobal.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithoutChildren]))
    }
    
    @JSImport("@wordpress/components", "KeyboardShortcuts")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      
      @scala.inline
      def eventName(value: keydown | keypress | keyup): this.type = set("eventName", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts.PropsWithoutChildren): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
