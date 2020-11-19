package typingsSlinky.winrtUwp.Windows.Media.Casting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CastingPlaybackTypes extends js.Object
/** Indicates the capabilities of a particular casting device. */
@JSGlobal("Windows.Media.Casting.CastingPlaybackTypes")
@js.native
object CastingPlaybackTypes extends js.Object {
  
  /** The casting device supports audio playback. */
  @js.native
  sealed trait audio extends CastingPlaybackTypes
  
  /** The casting device does not support playback. */
  @js.native
  sealed trait none extends CastingPlaybackTypes
  
  /** The casting device supports image playback. */
  @js.native
  sealed trait picture extends CastingPlaybackTypes
  
  /** The casting device supports video playback. */
  @js.native
  sealed trait video extends CastingPlaybackTypes
}
