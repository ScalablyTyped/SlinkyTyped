package typingsSlinky.xmldsigjs

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.xmlCore.mod.NamespaceManager
import typingsSlinky.xmlCore.xmlMod.XmlNodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs/build/types/canonicalizer", JSImport.Namespace)
@js.native
object canonicalizerMod extends js.Object {
  
  @js.native
  class XmlCanonicalizer protected () extends js.Object {
    def this(withComments: Boolean, excC14N: Boolean) = this()
    def this(withComments: Boolean, excC14N: Boolean, propagatedNamespaces: NamespaceManager) = this()
    
    def Canonicalize(node: Node): String = js.native
    
    def InclusiveNamespacesPrefixList: String = js.native
    def InclusiveNamespacesPrefixList_=(value: String): Unit = js.native
    
    var IsNamespaceInclusive: js.Any = js.native
    
    var IsNamespaceRendered: js.Any = js.native
    
    var IsTextNode: js.Any = js.native
    
    /* protected */ def NormalizeString(input: String, `type`: XmlNodeType): String = js.native
    /* protected */ def NormalizeString(input: Null, `type`: XmlNodeType): String = js.native
    
    /* protected */ def WriteAttributesAxis(node: Element): Unit = js.native
    
    /* protected */ def WriteCommentNode(node: Node): Unit = js.native
    
    /* protected */ def WriteDocumentNode(node: Node): Unit = js.native
    
    /* protected */ def WriteElementNode(node: Element): Unit = js.native
    
    /* protected */ def WriteNamespacesAxis(node: Element): Double = js.native
    
    /* protected */ def WriteNode(node: Node): Unit = js.native
    
    /* protected */ def WriteProcessingInstructionNode(node: Node): Unit = js.native
    
    /* protected */ def WriteTextNode(node: Node): Unit = js.native
    
    var document: Document = js.native
    
    var exclusive: Boolean = js.native
    
    var inclusiveNamespacesPrefixList: js.Array[String] = js.native
    
    var propagatedNamespaces: NamespaceManager = js.native
    
    var result: js.Array[String] = js.native
    
    var state: XmlCanonicalizerState = js.native
    
    var visibleNamespaces: NamespaceManager = js.native
    
    var withComments: Boolean = js.native
  }
  
  @js.native
  sealed trait XmlCanonicalizerState extends js.Object
  @js.native
  object XmlCanonicalizerState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[XmlCanonicalizerState with Double] = js.native
    
    @js.native
    sealed trait AfterDocElement extends XmlCanonicalizerState
    /* 2 */ @js.native
    object AfterDocElement extends TopLevel[AfterDocElement with Double]
    
    @js.native
    sealed trait BeforeDocElement extends XmlCanonicalizerState
    /* 0 */ @js.native
    object BeforeDocElement extends TopLevel[BeforeDocElement with Double]
    
    @js.native
    sealed trait InsideDocElement extends XmlCanonicalizerState
    /* 1 */ @js.native
    object InsideDocElement extends TopLevel[InsideDocElement with Double]
  }
}
