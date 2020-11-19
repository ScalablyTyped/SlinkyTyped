package typingsSlinky.xmlcreate.xmlDtdMod

import typingsSlinky.xmlcreate.optionsMod.IStringOptions
import typingsSlinky.xmlcreate.xmlCommentMod.IXmlCommentOptions
import typingsSlinky.xmlcreate.xmlDtdAttlistMod.IXmlDtdAttlistOptions
import typingsSlinky.xmlcreate.xmlDtdElementMod.IXmlDtdElementOptions
import typingsSlinky.xmlcreate.xmlDtdEntityMod.IXmlDtdEntityOptions
import typingsSlinky.xmlcreate.xmlDtdNotationMod.IXmlDtdNotationOptions
import typingsSlinky.xmlcreate.xmlDtdParamEntityRefMod.IXmlDtdParamEntityRefOptions
import typingsSlinky.xmlcreate.xmlProcInstMod.IXmlProcInstOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlDtd[Parent] extends js.Object {
  
  val _children: js.Any = js.native
  
  var _name: js.Any = js.native
  
  val _parent: js.Any = js.native
  
  var _pubId: js.Any = js.native
  
  var _sysId: js.Any = js.native
  
  val _validation: js.Any = js.native
  
  /**
    * Appends the XML string representation of a public or system identifier
    * to an existing string.
    */
  var appendId: js.Any = js.native
  
  /**
    * Adds an attribute-list declaration to this document type declaration
    * and returns the new attribute-list declaration.
    */
  def attlist(options: IXmlDtdAttlistOptions): typingsSlinky.xmlcreate.xmlDtdAttlistMod.default[this.type] = js.native
  
  /**
    * Adds a comment to this document type declaration and returns the
    * new comment.
    */
  def comment(options: IXmlCommentOptions): typingsSlinky.xmlcreate.xmlCommentMod.default[this.type] = js.native
  
  /**
    * Adds an element declaration to this document type declaration
    * and returns the new element declaration.
    */
  def element(options: IXmlDtdElementOptions): typingsSlinky.xmlcreate.xmlDtdElementMod.default[this.type] = js.native
  
  /**
    * Adds an entity declaration to this document type declaration
    * and returns the new entity declaration.
    */
  def entity(options: IXmlDtdEntityOptions): typingsSlinky.xmlcreate.xmlDtdEntityMod.default[this.type] = js.native
  
  /**
    * Gets the name of the DTD.
    */
  def name: String = js.native
  /**
    * Sets the name of the DTD.
    */
  def name_=(name: String): Unit = js.native
  
  /**
    * Adds a notation declaration to this document type declaration
    * and returns the new notation declaration.
    */
  def notation(options: IXmlDtdNotationOptions): typingsSlinky.xmlcreate.xmlDtdNotationMod.default[this.type] = js.native
  
  /**
    * Adds a parameter entity reference to this document type declaration
    * and returns the new parameter entity reference.
    */
  def paramEntityRef(options: IXmlDtdParamEntityRefOptions): typingsSlinky.xmlcreate.xmlDtdParamEntityRefMod.default[this.type] = js.native
  
  /**
    * Adds a processing instruction to this document type declaration
    * and returns the new processing instruction.
    */
  def procInst(options: IXmlProcInstOptions): typingsSlinky.xmlcreate.xmlProcInstMod.default[this.type] = js.native
  
  /**
    * Gets the public identifier of the DTD.
    */
  def pubId: js.UndefOr[String] = js.native
  /**
    * Sets the public identifier of the DTD.
    */
  def pubId_=(pubId: js.UndefOr[String]): Unit = js.native
  
  /**
    * Gets the system identifier of the DTD.
    */
  def sysId: js.UndefOr[String] = js.native
  /**
    * Sets the system identifier of the DTD.
    */
  def sysId_=(sysId: js.UndefOr[String]): Unit = js.native
  
  def toString(options: IStringOptions): String = js.native
  
  /**
    * Returns the parent of this attribute.
    */
  def up(): Parent = js.native
}
