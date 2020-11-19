package typingsSlinky.xmlcreate.xmlCharRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlCharRef[Parent] extends js.Object {
  
  var _char: js.Any = js.native
  
  var _hex: js.Any = js.native
  
  val _parent: js.Any = js.native
  
  val _validation: js.Any = js.native
  
  /**
    * Gets the character of this character reference.
    */
  def char: String = js.native
  /**
    * Sets the character of this character reference.
    */
  def char_=(char: String): Unit = js.native
  
  /**
    * Gets whether the decimal or hexadecimal representation should be used
    * for this character reference.
    */
  def hex: Boolean = js.native
  /**
    * Sets whether the decimal or hexadecimal representation should be used
    * for this character reference.
    */
  def hex_=(hex: Boolean): Unit = js.native
  
  /**
    * Returns the parent of this character reference.
    */
  def up(): Parent = js.native
}
