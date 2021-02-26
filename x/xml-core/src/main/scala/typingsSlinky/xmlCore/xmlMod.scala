package typingsSlinky.xmlCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlMod {
  
  @JSImport("xml-core/dist/types/xml", "APPLICATION_XML")
  @js.native
  val APPLICATION_XML: /* "application/xml" */ String = js.native
  
  @JSImport("xml-core/dist/types/xml", "DEFAULT_NAMESPACE_URI")
  @js.native
  val DEFAULT_NAMESPACE_URI: /* "" */ String = js.native
  
  @JSImport("xml-core/dist/types/xml", "DEFAULT_PREFIX")
  @js.native
  val DEFAULT_PREFIX: /* "" */ String = js.native
  
  @js.native
  sealed trait XmlNodeType extends StObject
  @JSImport("xml-core/dist/types/xml", "XmlNodeType")
  @js.native
  object XmlNodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[XmlNodeType with Double] = js.native
    
    @js.native
    sealed trait Attribute extends XmlNodeType
    /* 2 */ val Attribute: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Attribute with Double = js.native
    
    @js.native
    sealed trait CDATA extends XmlNodeType
    /* 4 */ val CDATA: typingsSlinky.xmlCore.xmlMod.XmlNodeType.CDATA with Double = js.native
    
    @js.native
    sealed trait Comment extends XmlNodeType
    /* 8 */ val Comment: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Comment with Double = js.native
    
    @js.native
    sealed trait Document extends XmlNodeType
    /* 9 */ val Document: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Document with Double = js.native
    
    @js.native
    sealed trait DocumentFragment extends XmlNodeType
    /* 11 */ val DocumentFragment: typingsSlinky.xmlCore.xmlMod.XmlNodeType.DocumentFragment with Double = js.native
    
    @js.native
    sealed trait DocumentType extends XmlNodeType
    /* 10 */ val DocumentType: typingsSlinky.xmlCore.xmlMod.XmlNodeType.DocumentType with Double = js.native
    
    @js.native
    sealed trait Element extends XmlNodeType
    /* 1 */ val Element: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Element with Double = js.native
    
    @js.native
    sealed trait EndElement extends XmlNodeType
    /* 15 */ val EndElement: typingsSlinky.xmlCore.xmlMod.XmlNodeType.EndElement with Double = js.native
    
    @js.native
    sealed trait EndEntity extends XmlNodeType
    /* 16 */ val EndEntity: typingsSlinky.xmlCore.xmlMod.XmlNodeType.EndEntity with Double = js.native
    
    @js.native
    sealed trait Entity extends XmlNodeType
    /* 6 */ val Entity: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Entity with Double = js.native
    
    @js.native
    sealed trait EntityReference extends XmlNodeType
    /* 5 */ val EntityReference: typingsSlinky.xmlCore.xmlMod.XmlNodeType.EntityReference with Double = js.native
    
    @js.native
    sealed trait None extends XmlNodeType
    /* 0 */ val None: typingsSlinky.xmlCore.xmlMod.XmlNodeType.None with Double = js.native
    
    @js.native
    sealed trait Notation extends XmlNodeType
    /* 12 */ val Notation: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Notation with Double = js.native
    
    @js.native
    sealed trait ProcessingInstruction extends XmlNodeType
    /* 7 */ val ProcessingInstruction: typingsSlinky.xmlCore.xmlMod.XmlNodeType.ProcessingInstruction with Double = js.native
    
    @js.native
    sealed trait SignificantWhitespace extends XmlNodeType
    /* 14 */ val SignificantWhitespace: typingsSlinky.xmlCore.xmlMod.XmlNodeType.SignificantWhitespace with Double = js.native
    
    @js.native
    sealed trait Text extends XmlNodeType
    /* 3 */ val Text: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Text with Double = js.native
    
    @js.native
    sealed trait Whitespace extends XmlNodeType
    /* 13 */ val Whitespace: typingsSlinky.xmlCore.xmlMod.XmlNodeType.Whitespace with Double = js.native
    
    @js.native
    sealed trait XmlDeclaration extends XmlNodeType
    /* 17 */ val XmlDeclaration: typingsSlinky.xmlCore.xmlMod.XmlNodeType.XmlDeclaration with Double = js.native
  }
}
