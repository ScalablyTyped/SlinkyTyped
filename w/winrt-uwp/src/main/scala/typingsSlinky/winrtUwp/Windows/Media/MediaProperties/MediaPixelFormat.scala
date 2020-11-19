package typingsSlinky.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPixelFormat extends js.Object
/** Defines values for media pixel formats. */
@JSGlobal("Windows.Media.MediaProperties.MediaPixelFormat")
@js.native
object MediaPixelFormat extends js.Object {
  
  /** BGRA8 media pixel format. */
  @js.native
  sealed trait bgra8 extends MediaPixelFormat
  
  /** NV12 media pixel format. */
  @js.native
  sealed trait nv12 extends MediaPixelFormat
}
