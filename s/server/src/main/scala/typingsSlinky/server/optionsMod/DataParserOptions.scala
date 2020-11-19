package typingsSlinky.server.optionsMod

import typingsSlinky.formidable.mod.Fields
import typingsSlinky.formidable.mod.Files
import typingsSlinky.formidable.mod.Part
import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataParserOptions extends js.Object {
  
  var bytesExpected: Double = js.native
  
  var bytesReceived: Double = js.native
  
  var encoding: String = js.native
  
  def handlePart(part: Part): Unit = js.native
  
  var hash: String | Boolean = js.native
  
  var keepExtensions: Boolean = js.native
  
  var maxFields: Double = js.native
  
  var maxFieldsSize: Double = js.native
  
  var multiples: Boolean = js.native
  
  def onPart(part: Part): Unit = js.native
  
  def parse(req: IncomingMessage): Unit = js.native
  def parse(
    req: IncomingMessage,
    callback: js.Function3[/* err */ js.Any, /* fields */ Fields, /* files */ Files, _]
  ): Unit = js.native
  
  var `type`: String = js.native
  
  var uploadDir: String = js.native
}
