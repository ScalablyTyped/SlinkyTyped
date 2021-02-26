package typingsSlinky.tuyaPanelKit.stackTypesMod

import typingsSlinky.tuyaPanelKit.anon.OmitSpringAnimationConfig
import typingsSlinky.tuyaPanelKit.anon.OmitTimingAnimationConfig
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.spring
import typingsSlinky.tuyaPanelKit.tuyaPanelKitStrings.timing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tuyaPanelKit.anon.Animation
  - typingsSlinky.tuyaPanelKit.anon.Config
*/
trait TransitionSpec extends StObject
object TransitionSpec {
  
  @scala.inline
  def Animation(animation: spring, config: OmitSpringAnimationConfig): typingsSlinky.tuyaPanelKit.anon.Animation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.Animation]
  }
  
  @scala.inline
  def Config(animation: timing, config: OmitTimingAnimationConfig): typingsSlinky.tuyaPanelKit.anon.Config = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.tuyaPanelKit.anon.Config]
  }
}
