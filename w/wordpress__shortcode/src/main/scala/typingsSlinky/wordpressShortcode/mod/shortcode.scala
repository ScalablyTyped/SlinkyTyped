package typingsSlinky.wordpressShortcode.mod

import typingsSlinky.wordpressShortcode.wordpressShortcodeStrings.`self-closing`
import typingsSlinky.wordpressShortcode.wordpressShortcodeStrings.closed
import typingsSlinky.wordpressShortcode.wordpressShortcodeStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait shortcode extends js.Object {
  
  var attrs: ShortcodeAttrs = js.native
  
  var content: js.UndefOr[String] = js.native
  
  /**
    * Get a shortcode attribute.
    *
    * Automatically detects whether `attr` is named or numeric and routes it accordingly.
    *
    * @param attr - Attribute key.
    *
    * @returns Attribute value.
    */
  def get(attr: String): js.UndefOr[String] = js.native
  def get(attr: Double): js.UndefOr[String] = js.native
  
  /**
    * Set a shortcode attribute.
    *
    * Automatically detects whether `attr` is named or numeric and routes it
    * accordingly.
    *
    * @param attr - Attribute key.
    * @param value - Attribute value.
    *
    * @returns Shortcode instance.
    */
  def set(attr: String, value: String): this.type = js.native
  def set(attr: Double, value: String): this.type = js.native
  
  /**
    * Transform the shortcode into a string.
    *
    * @returns String representation of the shortcode.
    */
  def string(): String = js.native
  
  var tag: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[closed | `self-closing` | single] = js.native
}
