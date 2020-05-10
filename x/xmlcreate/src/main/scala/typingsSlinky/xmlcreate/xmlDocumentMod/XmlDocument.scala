package typingsSlinky.xmlcreate.xmlDocumentMod

import typingsSlinky.xmlcreate.optionsMod.IStringOptions
import typingsSlinky.xmlcreate.xmlCommentMod.IXmlCommentOptions
import typingsSlinky.xmlcreate.xmlDeclMod.IXmlDeclOptions
import typingsSlinky.xmlcreate.xmlDtdMod.IXmlDtdOptions
import typingsSlinky.xmlcreate.xmlElementMod.IXmlElementOptions
import typingsSlinky.xmlcreate.xmlProcInstMod.IXmlProcInstOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDocument extends js.Object {
  val _children: js.Any = js.native
  val _validation: js.Any = js.native
  /**
    * Adds a comment to this document and returns the new comment.
    */
  def comment(options: IXmlCommentOptions): typingsSlinky.xmlcreate.xmlCommentMod.default[this.type] = js.native
  /**
    * Adds a declaration to this document and returns the new declaration.
    */
  def decl(): typingsSlinky.xmlcreate.xmlDeclMod.default[this.type] = js.native
  def decl(options: IXmlDeclOptions): typingsSlinky.xmlcreate.xmlDeclMod.default[this.type] = js.native
  /**
    * Adds a document type definition to this document and returns the new
    * document type definition.
    */
  def dtd(options: IXmlDtdOptions): typingsSlinky.xmlcreate.xmlDtdMod.default[this.type] = js.native
  /**
    * Adds the root element to this document and returns the element.
    */
  def element(options: IXmlElementOptions): typingsSlinky.xmlcreate.xmlElementMod.default[this.type] = js.native
  /**
    * Adds a processing instruction to this document and returns the new
    * processing instruction.
    */
  def procInst(options: IXmlProcInstOptions): typingsSlinky.xmlcreate.xmlProcInstMod.default[this.type] = js.native
  def toString(options: IStringOptions): String = js.native
}

