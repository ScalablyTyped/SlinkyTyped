package typingsSlinky.std

import typingsSlinky.std.stdBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object providing methods which are not dependent on any particular document. Such an object is returned by the Document.implementation property. */
@js.native
trait DOMImplementation extends js.Object {
  
  def createDocument(): XMLDocument = js.native
  def createDocument(namespace: java.lang.String): XMLDocument = js.native
  def createDocument(namespace: java.lang.String, qualifiedName: java.lang.String): XMLDocument = js.native
  def createDocument(
    namespace: java.lang.String,
    qualifiedName: java.lang.String,
    doctype: org.scalajs.dom.raw.DocumentType
  ): XMLDocument = js.native
  def createDocument(namespace: java.lang.String, qualifiedName: Null, doctype: org.scalajs.dom.raw.DocumentType): XMLDocument = js.native
  def createDocument(namespace: Null, qualifiedName: java.lang.String): XMLDocument = js.native
  def createDocument(namespace: Null, qualifiedName: java.lang.String, doctype: org.scalajs.dom.raw.DocumentType): XMLDocument = js.native
  def createDocument(namespace: Null, qualifiedName: Null, doctype: org.scalajs.dom.raw.DocumentType): XMLDocument = js.native
  
  def createDocumentType(qualifiedName: java.lang.String, publicId: java.lang.String, systemId: java.lang.String): org.scalajs.dom.raw.DocumentType = js.native
  
  def createHTMLDocument(): org.scalajs.dom.raw.Document = js.native
  def createHTMLDocument(title: java.lang.String): org.scalajs.dom.raw.Document = js.native
  
  /** @deprecated */
  def hasFeature(args: js.Any*): `true` = js.native
}
