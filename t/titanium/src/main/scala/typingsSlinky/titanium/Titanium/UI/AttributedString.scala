package typingsSlinky.titanium.Titanium.UI

import typingsSlinky.titanium.Attribute
import typingsSlinky.titanium.Titanium.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An attributed string proxy manages character strings and associated sets of attributes (for example,
  * font and foregroundcolor) that apply to individual characters or ranges of characters in the string.
  */
@js.native
trait AttributedString extends Proxy {
  
  /**
    * Adds an [attribute](Attribute) with the given name and value to the characters in the specified range.
    */
  def addAttribute(attribute: Attribute): Unit = js.native
  
  /**
    * An array of attributes to add.
    */
  var attributes: js.Array[Attribute] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.AttributedString.attributes> property.
    * @deprecated Access <Titanium.UI.AttributedString.attributes> instead.
    */
  def getAttributes(): js.Array[Attribute] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.AttributedString.text> property.
    * @deprecated Access <Titanium.UI.AttributedString.text> instead.
    */
  def getText(): String = js.native
  
  /**
    * Sets the value of the <Titanium.UI.AttributedString.attributes> property.
    * @deprecated Set the value using <Titanium.UI.AttributedString.attributes> instead.
    */
  def setAttributes(attributes: js.Array[Attribute]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.AttributedString.text> property.
    * @deprecated Set the value using <Titanium.UI.AttributedString.text> instead.
    */
  def setText(text: String): Unit = js.native
  
  /**
    * The text applied to the attributed string.
    */
  var text: String = js.native
}
