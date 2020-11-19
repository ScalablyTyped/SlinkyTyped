package typingsSlinky.winrtUwp.global.Windows.Data.Xml

import typingsSlinky.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for the XSLT processor. */
@JSGlobal("Windows.Data.Xml.Xsl")
@js.native
object Xsl extends js.Object {
  
  /** Provides the methods needed by the Xslt processor. */
  @js.native
  class XsltProcessor protected ()
    extends typingsSlinky.winrtUwp.Windows.Data.Xml.Xsl.XsltProcessor {
    /**
      * Creates a new XsltProcessor object from the document provided.
      * @param document The XSLT to process.
      */
    def this(document: XmlDocument) = this()
  }
}
