package typingsSlinky.xsdSchemaValidator

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.xsdSchemaValidator.anon.File
import typingsSlinky.xsdSchemaValidator.anon.Messages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xsd-schema-validator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def validateXML(
    xml: String,
    pathToXsd: String,
    callback: js.Function2[/* err */ js.Error, /* result */ Messages, Unit]
  ): Unit = js.native
  def validateXML(
    xml: ReadableStream,
    pathToXsd: String,
    callback: js.Function2[/* err */ js.Error, /* result */ Messages, Unit]
  ): Unit = js.native
  def validateXML(
    xml: File,
    pathToXsd: String,
    callback: js.Function2[/* err */ js.Error, /* result */ Messages, Unit]
  ): Unit = js.native
}
