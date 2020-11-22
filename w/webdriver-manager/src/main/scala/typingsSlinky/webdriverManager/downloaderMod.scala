package typingsSlinky.webdriverManager

import typingsSlinky.webdriverManager.mod.Binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/files/downloader", JSImport.Namespace)
@js.native
object downloaderMod extends js.Object {
  
  @js.native
  class Downloader () extends js.Object
  /* static members */
  @js.native
  object Downloader extends js.Object {
    
    /**
      * Http get the file. Check the content length of the file before writing the file.
      * If the content length does not match, remove it and download the file.
      *
      * @param binary The binary of interest.
      * @param fileName The file name.
      * @param outputDir The directory where files are downloaded and stored.
      * @param contentLength The content length of the existing file.
      * @param opt_proxy The proxy for downloading files.
      * @param opt_callback Callback method to be executed after the file is downloaded.
      * @returns Promise<boolean> Resolves true = downloaded. Resolves false = not downloaded.
      *          Rejected with an error.
      */
    def getFile(binary: Binary, fileUrl: String, fileName: String, outputDir: String, contentLength: Double): js.Promise[Boolean] = js.native
    def getFile(
      binary: Binary,
      fileUrl: String,
      fileName: String,
      outputDir: String,
      contentLength: Double,
      callback: js.Function
    ): js.Promise[Boolean] = js.native
  }
}
