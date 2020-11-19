package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A Node containing a doctype. */
@js.native
trait DocumentType extends ChildNode {
  
  val name: java.lang.String = js.native
  
  @JSName("ownerDocument")
  val ownerDocument_DocumentType: org.scalajs.dom.raw.Document = js.native
  
  val publicId: java.lang.String = js.native
  
  val systemId: java.lang.String = js.native
}
