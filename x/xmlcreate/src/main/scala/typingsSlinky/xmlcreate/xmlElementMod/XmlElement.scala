package typingsSlinky.xmlcreate.xmlElementMod

import typingsSlinky.xmlcreate.optionsMod.IStringOptions
import typingsSlinky.xmlcreate.xmlAttributeMod.IXmlAttributeOptions
import typingsSlinky.xmlcreate.xmlCdataMod.IXmlCdataOptions
import typingsSlinky.xmlcreate.xmlCharDataMod.IXmlCharDataOptions
import typingsSlinky.xmlcreate.xmlCharRefMod.IXmlCharRefOptions
import typingsSlinky.xmlcreate.xmlCommentMod.IXmlCommentOptions
import typingsSlinky.xmlcreate.xmlEntityRefMod.IXmlEntityRefOptions
import typingsSlinky.xmlcreate.xmlProcInstMod.IXmlProcInstOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlElement[Parent] extends js.Object {
  
  val _attributeNames: js.Any = js.native
  
  val _children: js.Any = js.native
  
  var _name: js.Any = js.native
  
  val _parent: js.Any = js.native
  
  val _replaceInvalidCharsInName: js.Any = js.native
  
  val _useSelfClosingTagIfEmpty: js.Any = js.native
  
  val _validation: js.Any = js.native
  
  /**
    * Returns true if the specified nodes are all character references,
    * entity references, or character data.
    */
  var allSameLineNodes: js.Any = js.native
  
  /**
    * Adds an attribute to this element and returns the new attribute.
    */
  def attribute(options: IXmlAttributeOptions): typingsSlinky.xmlcreate.xmlAttributeMod.default[this.type] = js.native
  
  /**
    * Adds a CDATA section to this element and returns the new CDATA section.
    */
  def cdata(options: IXmlCdataOptions): typingsSlinky.xmlcreate.xmlCdataMod.default[this.type] = js.native
  
  /**
    * Adds character data to this element and returns the new character data.
    */
  def charData(options: IXmlCharDataOptions): typingsSlinky.xmlcreate.xmlCharDataMod.default[this.type] = js.native
  
  /**
    * Adds a character reference to this element and returns the new
    * character reference.
    */
  def charRef(options: IXmlCharRefOptions): typingsSlinky.xmlcreate.xmlCharRefMod.default[this.type] = js.native
  
  /**
    * Adds a comment to this element and returns the new comment.
    */
  def comment(options: IXmlCommentOptions): typingsSlinky.xmlcreate.xmlCommentMod.default[this.type] = js.native
  
  /**
    * Adds an element to this element and returns the new element.
    */
  def element(options: IXmlElementOptions): XmlElement[this.type] = js.native
  
  /**
    * Adds an entity reference to this element and returns the new entity
    * reference.
    */
  def entityRef(options: IXmlEntityRefOptions): typingsSlinky.xmlcreate.xmlEntityRefMod.default[this.type] = js.native
  
  /**
    * Gets the name of this element.
    */
  def name: String = js.native
  /**
    * Sets the name of this element.
    */
  def name_=(name: String): Unit = js.native
  
  /**
    * Returns true if the specified nodes are all character references,
    * entity references, or character data.
    */
  var onSameLine: js.Any = js.native
  
  /**
    * Adds a processing instruction to this element and returns the new
    * processing instruction.
    */
  def procInst(options: IXmlProcInstOptions): typingsSlinky.xmlcreate.xmlProcInstMod.default[this.type] = js.native
  
  def toString(options: IStringOptions): String = js.native
  
  /**
    * Returns an XML string representation of this element using the specified
    * options and initial indent.
    */
  var toStringWithIndent: js.Any = js.native
  
  /**
    * Returns the parent of this element.
    */
  def up(): Parent = js.native
}
