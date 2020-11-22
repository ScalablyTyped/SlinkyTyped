package typingsSlinky.twineSugarcube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PauseOnFadeToZero extends js.Object {
  
  /**
    * Determines whether the audio subsystem automatically pauses tracks that have been faded to 0 volume (silent).
    * @default true
    * @since 2.28.0
    * @example
    * Config.audio.pauseOnFadeToZero = false;
    */
  var pauseOnFadeToZero: Boolean = js.native
  
  /**
    * Determines whether the audio subsystem attempts to preload track metadata—meaning information about the track
    * (e.g., duration), not its audio frames.
    *
    * NOTE: It is unlikely that you will ever want to disable this setting.
    * @default true
    * @since 2.28.0
    * @example
    * Config.audio.preloadMetadata = false;
    */
  var preloadMetadata: Boolean = js.native
}
object PauseOnFadeToZero {
  
  @scala.inline
  def apply(pauseOnFadeToZero: Boolean, preloadMetadata: Boolean): PauseOnFadeToZero = {
    val __obj = js.Dynamic.literal(pauseOnFadeToZero = pauseOnFadeToZero.asInstanceOf[js.Any], preloadMetadata = preloadMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseOnFadeToZero]
  }
  
  @scala.inline
  implicit class PauseOnFadeToZeroOps[Self <: PauseOnFadeToZero] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPauseOnFadeToZero(value: Boolean): Self = this.set("pauseOnFadeToZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadMetadata(value: Boolean): Self = this.set("preloadMetadata", value.asInstanceOf[js.Any])
  }
}
