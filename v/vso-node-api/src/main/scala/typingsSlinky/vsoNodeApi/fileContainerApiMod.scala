package typingsSlinky.vsoNodeApi

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.typedRestClient.restClientMod.IRestResponse
import typingsSlinky.vsoNodeApi.fileContainerApiBaseMod.FileContainerApiBase
import typingsSlinky.vsoNodeApi.fileContainerApiBaseMod.IFileContainerApiBase
import typingsSlinky.vsoNodeApi.fileContainerInterfacesMod.FileContainerItem
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IHeaders
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsSlinky.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vso-node-api/FileContainerApi", JSImport.Namespace)
@js.native
object fileContainerApiMod extends js.Object {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.vsoNodeApi.clientApiBasesMod.ClientApiBase because Already inherited
  - typingsSlinky.vsoNodeApi.fileContainerApiBaseMod.IFileContainerApiBase because Already inherited
  - typingsSlinky.vsoNodeApi.fileContainerApiMod.IFileContainerApi because var conflicts: baseUrl, http, rest, userAgent, vsoClient. Inlined createItem, getItem, getItem, getItem, getItem, getItem, getItem, getItem, getItem */ @js.native
  class FileContainerApi protected () extends FileContainerApiBase {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
    
    def _createItem(
      customHeaders: IHeaders,
      contentStream: ReadableStream,
      containerId: Double,
      itemPath: String,
      scope: String,
      onResult: js.Function3[/* err */ js.Any, /* statusCode */ Double, /* Container */ FileContainerItem, Unit]
    ): Unit = js.native
    
    def createItem(
      contentStream: ReadableStream,
      uncompressedLength: Double,
      containerId: Double,
      itemPath: String,
      scope: String,
      options: js.Any
    ): js.Promise[FileContainerItem] = js.native
    
    /**
      * @param {number} containerId
      * @param {string} scope
      * @param {string} itemPath
      * @param {string} downloadFileName
      */
    def getItem(containerId: Double): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(
      containerId: Double,
      scope: js.UndefOr[scala.Nothing],
      itemPath: js.UndefOr[scala.Nothing],
      downloadFileName: String
    ): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: js.UndefOr[scala.Nothing], itemPath: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: js.UndefOr[scala.Nothing], itemPath: String, downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: String, itemPath: js.UndefOr[scala.Nothing], downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: String, itemPath: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: String, itemPath: String, downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
  }
  
  @js.native
  trait IFileContainerApi extends IFileContainerApiBase {
    
    def createItem(
      contentStream: ReadableStream,
      uncompressedLength: Double,
      containerId: Double,
      itemPath: String,
      scope: String,
      options: js.Any
    ): js.Promise[FileContainerItem] = js.native
    
    def getItem(containerId: Double): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(
      containerId: Double,
      scope: js.UndefOr[scala.Nothing],
      itemPath: js.UndefOr[scala.Nothing],
      downloadFileName: String
    ): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: js.UndefOr[scala.Nothing], itemPath: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: js.UndefOr[scala.Nothing], itemPath: String, downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: String, itemPath: js.UndefOr[scala.Nothing], downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: String, itemPath: String): js.Promise[IRestResponse[ReadableStream]] = js.native
    def getItem(containerId: Double, scope: String, itemPath: String, downloadFileName: String): js.Promise[IRestResponse[ReadableStream]] = js.native
  }
}
