package typingsSlinky.xmlcreate

import typingsSlinky.xmlcreate.xmlAttributeMod.IXmlAttributeOptions
import typingsSlinky.xmlcreate.xmlAttributeMod.default
import typingsSlinky.xmlcreate.xmlAttributeTextMod.IXmlAttributeTextOptions
import typingsSlinky.xmlcreate.xmlCdataMod.IXmlCdataOptions
import typingsSlinky.xmlcreate.xmlCharDataMod.IXmlCharDataOptions
import typingsSlinky.xmlcreate.xmlCharRefMod.IXmlCharRefOptions
import typingsSlinky.xmlcreate.xmlCommentMod.IXmlCommentOptions
import typingsSlinky.xmlcreate.xmlDeclMod.IXmlDeclOptions
import typingsSlinky.xmlcreate.xmlDocumentMod.IXmlDocumentOptions
import typingsSlinky.xmlcreate.xmlDtdAttlistMod.IXmlDtdAttlistOptions
import typingsSlinky.xmlcreate.xmlDtdElementMod.IXmlDtdElementOptions
import typingsSlinky.xmlcreate.xmlDtdEntityMod.IXmlDtdEntityOptions
import typingsSlinky.xmlcreate.xmlDtdMod.IXmlDtdOptions
import typingsSlinky.xmlcreate.xmlDtdNotationMod.IXmlDtdNotationOptions
import typingsSlinky.xmlcreate.xmlDtdParamEntityRefMod.IXmlDtdParamEntityRefOptions
import typingsSlinky.xmlcreate.xmlElementMod.IXmlElementOptions
import typingsSlinky.xmlcreate.xmlEntityRefMod.IXmlEntityRefOptions
import typingsSlinky.xmlcreate.xmlProcInstMod.IXmlProcInstOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class XmlAttribute[Parent] protected () extends default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeOptions) = this()
  }
  
  @js.native
  class XmlAttributeText[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlAttributeTextMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeTextOptions) = this()
  }
  
  @js.native
  class XmlCdata[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlCdataMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCdataOptions) = this()
  }
  
  @js.native
  class XmlCharData[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlCharDataMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCharDataOptions) = this()
  }
  
  @js.native
  class XmlCharRef[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlCharRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCharRefOptions) = this()
  }
  
  @js.native
  class XmlComment[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlCommentMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCommentOptions) = this()
  }
  
  @js.native
  class XmlDecl[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlDeclMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDeclOptions) = this()
  }
  
  @js.native
  class XmlDocument protected ()
    extends typingsSlinky.xmlcreate.xmlDocumentMod.default {
    def this(options: IXmlDocumentOptions) = this()
  }
  
  @js.native
  class XmlDtd[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlDtdMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdOptions) = this()
  }
  
  @js.native
  class XmlDtdAttlist[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlDtdAttlistMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdAttlistOptions) = this()
  }
  
  @js.native
  class XmlDtdElement[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlDtdElementMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdElementOptions) = this()
  }
  
  @js.native
  class XmlDtdEntity[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlDtdEntityMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdEntityOptions) = this()
  }
  
  @js.native
  class XmlDtdNotation[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlDtdNotationMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdNotationOptions) = this()
  }
  
  @js.native
  class XmlDtdParamEntityRef[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlDtdParamEntityRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdParamEntityRefOptions) = this()
  }
  
  @js.native
  class XmlElement[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlElementMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlElementOptions) = this()
  }
  
  @js.native
  class XmlEntityRef[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlEntityRefMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlEntityRefOptions) = this()
  }
  
  @js.native
  class XmlProcInst[Parent] protected ()
    extends typingsSlinky.xmlcreate.xmlProcInstMod.default[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlProcInstOptions) = this()
  }
  
  def document(): typingsSlinky.xmlcreate.xmlDocumentMod.default = js.native
  def document(options: IXmlDocumentOptions): typingsSlinky.xmlcreate.xmlDocumentMod.default = js.native
}

