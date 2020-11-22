package typingsSlinky.tuyaPanelKit.stackTypesMod

import typingsSlinky.tuyaPanelKit.anon.OmitSpringAnimationConfig
import typingsSlinky.tuyaPanelKit.anon.OmitTimingAnimationConfig
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.spring
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.timing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tuyaPanelKit.anon.Animation
  - typingsSlinky.tuyaPanelKit.anon.Config
*/
trait TransitionSpec extends js.Object
object TransitionSpec {
  
  @scala.inline
  def Animation(animation: spring, config: OmitSpringAnimationConfig): TransitionSpec = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionSpec]
  }
  
  @scala.inline
  def Config(animation: timing, config: OmitTimingAnimationConfig): TransitionSpec = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionSpec]
  }
}
