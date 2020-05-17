package typingsSlinky.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Video")
@js.native
object Video extends js.Object {
  @js.native
  class EmbedCodeConfiguration ()
    extends typingsSlinky.sharepoint.SP.Video.EmbedCodeConfiguration
  
  @js.native
  class VideoSet ()
    extends typingsSlinky.sharepoint.SP.ClientObject
  
  /* static members */
  @js.native
  object VideoSet extends js.Object {
    def createVideo(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      parentFolder: typingsSlinky.sharepoint.SP.Folder,
      name: String,
      ctid: typingsSlinky.sharepoint.SP.ContentTypeId
    ): typingsSlinky.sharepoint.SP.StringResult = js.native
    def getEmbedCode(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      videoPath: String,
      properties: typingsSlinky.sharepoint.SP.Video.EmbedCodeConfiguration
    ): typingsSlinky.sharepoint.SP.StringResult = js.native
    def migrateVideo[T](context: typingsSlinky.sharepoint.SP.ClientContext, videoFile: typingsSlinky.sharepoint.SP.File): typingsSlinky.sharepoint.SP.ListItem[T] = js.native
    def uploadVideo(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      list: typingsSlinky.sharepoint.SP.List[_],
      fileName: String,
      file: js.Array[_],
      overwriteIfExists: Boolean,
      parentFolderPath: String
    ): typingsSlinky.sharepoint.SP.StringResult = js.native
  }
  
}

