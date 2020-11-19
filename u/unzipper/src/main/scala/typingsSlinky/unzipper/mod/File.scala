package typingsSlinky.unzipper.mod

import typingsSlinky.node.Buffer
import typingsSlinky.unzipper.unzipperStrings.Directory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends js.Object {
  
  def buffer(): js.Promise[Buffer] = js.native
  def buffer(password: String): js.Promise[Buffer] = js.native
  
  var comment: String = js.native
  
  var compressedSize: Double = js.native
  
  var compressionMethod: Double = js.native
  
  var crc32: Double = js.native
  
  var diskNumber: Double = js.native
  
  var externalFileAttributes: Double = js.native
  
  var extra: js.Any = js.native
  
  var extraFieldLength: Double = js.native
  
  var fileCommentLength: Double = js.native
  
  var fileNameLength: Double = js.native
  
  var flags: Double = js.native
  
  var internalFileAttributes: Double = js.native
  
  var isUnicode: Double = js.native
  
  var lastModifiedDate: Double = js.native
  
  var lastModifiedTime: Double = js.native
  
  var offsetToLocalFileHeader: Double = js.native
  
  var path: String = js.native
  
  var pathBuffer: Buffer = js.native
  
  var signature: Double = js.native
  
  def stream(): Entry = js.native
  def stream(password: String): Entry = js.native
  
  var `type`: Directory | typingsSlinky.unzipper.unzipperStrings.File = js.native
  
  var uncompressedSize: Double = js.native
  
  var versionMadeBy: Double = js.native
  
  var versionsNeededToExtract: Double = js.native
}
