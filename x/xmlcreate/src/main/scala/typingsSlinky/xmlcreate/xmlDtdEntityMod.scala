package typingsSlinky.xmlcreate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlcreate/lib/nodes/XmlDtdEntity", JSImport.Namespace)
@js.native
object xmlDtdEntityMod extends js.Object {
  @js.native
  trait XmlDtdEntity
    extends typingsSlinky.xmlcreate.xmlNodeMod.default {
    var _text: js.Any = js.native
    /**
      * Gets the text associated with the XML entity declaration.
      *
      * @return The text associated with the XML entity declaration.
      */
    /**
      * Sets the text associated with the XML entity declaration.
      *
      * @param text The text associated with the XML entity declaration.
      */
    var text: String = js.native
    /**
      * Throws an exception since {@link XmlDtdEntity} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      * @param index This parameter is unused.
      *
      * @returns This method does not return.
      */
    def insertChild(node: typingsSlinky.xmlcreate.xmlNodeMod.default): js.UndefOr[typingsSlinky.xmlcreate.xmlNodeMod.default] = js.native
    def insertChild(node: typingsSlinky.xmlcreate.xmlNodeMod.default, index: Double): js.UndefOr[typingsSlinky.xmlcreate.xmlNodeMod.default] = js.native
    /**
      * Throws an exception since {@link XmlDtdEntity} nodes cannot have any
      * children.
      *
      * @param node This parameter is unused.
      *
      * @returns This method does not return.
      */
    def removeChild(node: typingsSlinky.xmlcreate.xmlNodeMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends XmlDtdEntity {
    /**
      * Initializes a new instance of the {@link XmlDtdEntity} class.
      *
      * @param text The text associated with the XML entity declaration.
      */
    def this(text: String) = this()
  }
  
}

