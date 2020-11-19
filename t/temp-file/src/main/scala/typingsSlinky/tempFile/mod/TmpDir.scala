package typingsSlinky.tempFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("temp-file", "TmpDir")
@js.native
class TmpDir () extends js.Object {
  def this(debugName: String) = this()
  
  def cleanup(): js.Promise[_] = js.native
  
  def cleanupSync(): Unit = js.native
  
  def createTempDir(): js.Promise[String] = js.native
  def createTempDir(options: GetTempFileOptions): js.Promise[String] = js.native
  
  val debugName: js.Any = js.native
  
  def getTempDir(): js.Promise[String] = js.native
  def getTempDir(options: GetTempFileOptions): js.Promise[String] = js.native
  
  def getTempFile(): js.Promise[String] = js.native
  def getTempFile(options: js.UndefOr[scala.Nothing], isDir: Boolean): js.Promise[String] = js.native
  def getTempFile(options: GetTempFileOptions): js.Promise[String] = js.native
  def getTempFile(options: GetTempFileOptions, isDir: Boolean): js.Promise[String] = js.native
  
  var registered: js.Any = js.native
  
  def rootTempDir: js.Promise[String] = js.native
  
  var tempFiles: js.Any = js.native
}
