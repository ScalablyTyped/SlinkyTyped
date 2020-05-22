package typingsSlinky.wordpressMediaUtils

import slinky.core.facade.ReactElement
import typingsSlinky.wordpressBlockEditor.mediaUploadMod.MediaUpload.Props
import typingsSlinky.wordpressMediaUtils.uploadMediaMod.UploadMediaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/media-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def uploadMedia(options: UploadMediaOptions): js.Promise[Unit] = js.native
  @js.native
  object MediaUpload extends js.Object {
    def apply[T /* <: Boolean */](props: Props[T]): ReactElement = js.native
  }
  
}

