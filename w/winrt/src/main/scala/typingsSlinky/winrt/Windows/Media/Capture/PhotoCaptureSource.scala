package typingsSlinky.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhotoCaptureSource extends js.Object
@JSGlobal("Windows.Media.Capture.PhotoCaptureSource")
@js.native
object PhotoCaptureSource extends js.Object {
  
  @js.native
  sealed trait auto extends PhotoCaptureSource
  
  @js.native
  sealed trait photo extends PhotoCaptureSource
  
  @js.native
  sealed trait videoPreview extends PhotoCaptureSource
}
