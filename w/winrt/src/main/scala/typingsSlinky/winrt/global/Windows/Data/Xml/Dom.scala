package typingsSlinky.winrt.global.Windows.Data.Xml

import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Xml.Dom")
@js.native
object Dom extends js.Object {
  @js.native
  class DtdEntity ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.DtdEntity
  
  @js.native
  class DtdNotation ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.DtdNotation
  
  @js.native
  class XmlAttribute ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlAttribute
  
  @js.native
  class XmlCDataSection ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlCDataSection
  
  @js.native
  class XmlComment ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlComment
  
  @js.native
  class XmlDocument ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument
  
  @js.native
  class XmlDocumentFragment ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocumentFragment
  
  @js.native
  class XmlDocumentType ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocumentType
  
  @js.native
  class XmlDomImplementation ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDomImplementation
  
  @js.native
  class XmlElement ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlElement
  
  @js.native
  class XmlEntityReference ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlEntityReference
  
  @js.native
  class XmlLoadSettings ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlLoadSettings
  
  @js.native
  class XmlNamedNodeMap ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap
  
  @js.native
  class XmlNodeList ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlNodeList
  
  @js.native
  class XmlProcessingInstruction ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlProcessingInstruction
  
  @js.native
  class XmlText ()
    extends typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlText
  
  @js.native
  object NodeType extends js.Object {
    /* 2 */ val attributeNode: typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType.attributeNode with Double = js.native
    /* 8 */ val commentNode: typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType.commentNode with Double = js.native
    /* 4 */ val dataSectionNode: typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType.dataSectionNode with Double = js.native
    /* 11 */ val documentFragmentNode: typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType.documentFragmentNode with Double = js.native
    /* 9 */ val documentNode: typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType.documentNode with Double = js.native
    /* 10 */ val documentTypeNode: typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType.documentTypeNode with Double = js.native
    /* 1 */ val elementNode: typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType.elementNode with Double = js.native
    /* 6 */ val entityNode: typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType.entityNode with Double = js.native
    /* 5 */ val entityReferenceNode: typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType.entityReferenceNode with Double = js.native
    /* 0 */ val invalid: typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType.invalid with Double = js.native
    /* 12 */ val notationNode: typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType.notationNode with Double = js.native
    /* 7 */ val processingInstructionNode: typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType.processingInstructionNode with Double = js.native
    /* 3 */ val textNode: typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType.textNode with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.winrt.Windows.Data.Xml.Dom.NodeType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object XmlDocument extends js.Object {
    def loadFromFileAsync(file: IStorageFile): IAsyncOperation[typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
    def loadFromFileAsync(file: IStorageFile, loadSettings: typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlLoadSettings): IAsyncOperation[typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
    def loadFromUriAsync(uri: Uri): IAsyncOperation[typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
    def loadFromUriAsync(uri: Uri, loadSettings: typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlLoadSettings): IAsyncOperation[typingsSlinky.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
  }
  
}

