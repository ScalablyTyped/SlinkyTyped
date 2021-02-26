package typingsSlinky.winrtUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaRotation extends StObject
/** Defines the direction and angle of a media rotation transform. */
@JSGlobal("Windows.Media.MediaProperties.MediaRotation")
@js.native
object MediaRotation extends StObject {
  
  /** Rotate 180 degrees clockwise. */
  @js.native
  sealed trait clockwise180Degrees extends MediaRotation
  
  /** Rotate 270 degrees clockwise. */
  @js.native
  sealed trait clockwise270Degrees extends MediaRotation
  
  /** Rotate 90 degrees clockwise. */
  @js.native
  sealed trait clockwise90Degrees extends MediaRotation
  
  /** No rotation. */
  @js.native
  sealed trait none extends MediaRotation
}
