package typingsSlinky.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.ComponentType
import typingsSlinky.std.Record
import typingsSlinky.wordpressBlockEditor.urlInputMod.URLInput.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlInputMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/url-input", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object URLInput {
    
    // TODO: if PostType is ever typed import it and use it here
    type PostType = Record[String, js.Any]
    
    @js.native
    trait Props extends StObject {
      
      /**
        * By default, the input will gain focus when it is rendered, as typically it is displayed
        * conditionally. For example when clicking on `URLInputButton` or editing a block.
        *
        * If you are not conditionally rendering this component set this property to `false`.
        * @defaultValue true
        */
      var autoFocus: js.UndefOr[Boolean] = js.native
      
      var children: js.UndefOr[scala.Nothing] = js.native
      
      /**
        * Adds and optional class to the parent `div` that wraps the URLInput field and popover.
        */
      var className: js.UndefOr[String] = js.native
      
      /**
        * Provides additional control over whether suggestions are disabled.
        *
        * @remarks
        * When hiding the URLInput using CSS (as is sometimes done for accessibility purposes), the
        * suggestions can still be displayed. This is because they're rendered in a popover in a
        * different part of the DOM, so any styles applied to the URLInput's container won't affect
        * the popover.
        *
        * This prop allows the suggestions list to be programmatically not rendered by passing a
        * boolean—it can be `true` to make sure suggestions aren't rendered, or `false`/`undefined`
        * to fall back to the default behaviour of showing suggestions when matching autocompletion
        * items are found.
        */
      var disableSuggestions: js.UndefOr[Boolean] = js.native
      
      var hasBorder: js.UndefOr[Boolean] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var isFullWidth: js.UndefOr[Boolean] = js.native
      
      /**
        * Called when the value changes. The second parameter is `null` unless the user selects a
        * post from the suggestions dropdown.
        */
      def onChange(url: String): Unit = js.native
      def onChange(url: String, post: PostType): Unit = js.native
      
      /**
        * This should be set to the attribute (or component state) property used to store the URL.
        */
      var value: String = js.native
    }
  }
}
