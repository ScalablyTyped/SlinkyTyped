package typingsSlinky.xmlcreate.xmlAttributeMod

import typingsSlinky.xmlcreate.optionsMod.IStringOptions
import typingsSlinky.xmlcreate.xmlAttributeTextMod.IXmlAttributeTextOptions
import typingsSlinky.xmlcreate.xmlCharRefMod.IXmlCharRefOptions
import typingsSlinky.xmlcreate.xmlEntityRefMod.IXmlEntityRefOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlAttribute[Parent] extends js.Object {
  
  val _children: js.Any = js.native
  
  var _name: js.Any = js.native
  
  val _parent: js.Any = js.native
  
  val _replaceInvalidCharsInName: js.Any = js.native
  
  val _validation: js.Any = js.native
  
  /**
    * Adds a character reference to this attribute and returns the new
    * character reference.
    */
  def charRef(options: IXmlCharRefOptions): typingsSlinky.xmlcreate.xmlCharRefMod.default[this.type] = js.native
  
  /**
    * Adds an entity reference to this attribute and returns the new entity
    * reference.
    */
  def entityRef(options: IXmlEntityRefOptions): typingsSlinky.xmlcreate.xmlEntityRefMod.default[this.type] = js.native
  
  /**
    * Gets the name of this attribute.
    */
  def name: String = js.native
  /**
    * Sets the name of this attribute.
    */
  def name_=(name: String): Unit = js.native
  
  /**
    * Adds attribute text to this attribute and returns the new text.
    */
  def text(options: IXmlAttributeTextOptions): typingsSlinky.xmlcreate.xmlAttributeTextMod.default[this.type] = js.native
  
  def toString(options: IStringOptions): String = js.native
  
  /**
    * Returns the parent of this attribute.
    */
  def up(): Parent = js.native
}
