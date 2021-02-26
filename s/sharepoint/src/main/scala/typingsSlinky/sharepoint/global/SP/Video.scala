package typingsSlinky.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Video {
  
  @JSGlobal("SP.Video.EmbedCodeConfiguration")
  @js.native
  class EmbedCodeConfiguration ()
    extends typingsSlinky.sharepoint.SP.Video.EmbedCodeConfiguration
  
  @JSGlobal("SP.Video.VideoSet")
  @js.native
  class VideoSet ()
    extends typingsSlinky.sharepoint.SP.ClientObject
  object VideoSet {
    
    /* static member */
    @JSGlobal("SP.Video.VideoSet.createVideo")
    @js.native
    def createVideo(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      parentFolder: typingsSlinky.sharepoint.SP.Folder,
      name: String,
      ctid: typingsSlinky.sharepoint.SP.ContentTypeId
    ): typingsSlinky.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Video.VideoSet.getEmbedCode")
    @js.native
    def getEmbedCode(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      videoPath: String,
      properties: typingsSlinky.sharepoint.SP.Video.EmbedCodeConfiguration
    ): typingsSlinky.sharepoint.SP.StringResult = js.native
    
    /* static member */
    @JSGlobal("SP.Video.VideoSet.migrateVideo")
    @js.native
    def migrateVideo[T](context: typingsSlinky.sharepoint.SP.ClientContext, videoFile: typingsSlinky.sharepoint.SP.File): typingsSlinky.sharepoint.SP.ListItem[T] = js.native
    
    /* static member */
    @JSGlobal("SP.Video.VideoSet.uploadVideo")
    @js.native
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
