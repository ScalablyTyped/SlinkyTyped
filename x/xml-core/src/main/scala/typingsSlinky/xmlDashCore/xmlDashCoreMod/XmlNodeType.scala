package typingsSlinky.xmlDashCore.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XmlNodeType extends js.Object

@JSImport("xml-core", "XmlNodeType")
@js.native
object XmlNodeType extends js.Object {
  @js.native
  sealed trait Attribute extends XmlNodeType
  
  @js.native
  sealed trait CDATA extends XmlNodeType
  
  @js.native
  sealed trait Comment extends XmlNodeType
  
  @js.native
  sealed trait Document extends XmlNodeType
  
  @js.native
  sealed trait DocumentFragment extends XmlNodeType
  
  @js.native
  sealed trait DocumentType extends XmlNodeType
  
  @js.native
  sealed trait Element extends XmlNodeType
  
  @js.native
  sealed trait EndElement extends XmlNodeType
  
  @js.native
  sealed trait EndEntity extends XmlNodeType
  
  @js.native
  sealed trait Entity extends XmlNodeType
  
  @js.native
  sealed trait EntityReference extends XmlNodeType
  
  @js.native
  sealed trait None extends XmlNodeType
  
  @js.native
  sealed trait Notation extends XmlNodeType
  
  @js.native
  sealed trait ProcessingInstruction extends XmlNodeType
  
  @js.native
  sealed trait SignificantWhitespace extends XmlNodeType
  
  @js.native
  sealed trait Text extends XmlNodeType
  
  @js.native
  sealed trait Whitespace extends XmlNodeType
  
  @js.native
  sealed trait XmlDeclaration extends XmlNodeType
  
  /* 2 */ val Attribute: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.Attribute with Double = js.native
  /* 4 */ val CDATA: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.CDATA with Double = js.native
  /* 8 */ val Comment: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.Comment with Double = js.native
  /* 9 */ val Document: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.Document with Double = js.native
  /* 11 */ val DocumentFragment: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.DocumentFragment with Double = js.native
  /* 10 */ val DocumentType: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.DocumentType with Double = js.native
  /* 1 */ val Element: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.Element with Double = js.native
  /* 15 */ val EndElement: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.EndElement with Double = js.native
  /* 16 */ val EndEntity: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.EndEntity with Double = js.native
  /* 6 */ val Entity: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.Entity with Double = js.native
  /* 5 */ val EntityReference: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.EntityReference with Double = js.native
  /* 0 */ val None: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.None with Double = js.native
  /* 12 */ val Notation: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.Notation with Double = js.native
  /* 7 */ val ProcessingInstruction: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.ProcessingInstruction with Double = js.native
  /* 14 */ val SignificantWhitespace: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.SignificantWhitespace with Double = js.native
  /* 3 */ val Text: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.Text with Double = js.native
  /* 13 */ val Whitespace: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.Whitespace with Double = js.native
  /* 17 */ val XmlDeclaration: typingsSlinky.xmlDashCore.xmlDashCoreMod.XmlNodeType.XmlDeclaration with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[XmlNodeType with Double] = js.native
}

