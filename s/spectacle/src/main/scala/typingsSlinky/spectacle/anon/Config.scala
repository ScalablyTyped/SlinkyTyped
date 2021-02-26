package typingsSlinky.spectacle.anon

import typingsSlinky.spectacle.mod.TransitionEffect
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends TransitionEffect {
  
  var config: Record[String, Double | String] = js.native
  
  var enter: Record[String, Double | String] = js.native
  
  var from: Record[String, Double | String] = js.native
  
  var leave: Record[String, Double | String] = js.native
}
object Config {
  
  @scala.inline
  def apply(
    config: Record[String, Double | String],
    enter: Record[String, Double | String],
    from: Record[String, Double | String],
    leave: Record[String, Double | String]
  ): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], leave = leave.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: Record[String, Double | String]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnter(value: Record[String, Double | String]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: Record[String, Double | String]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeave(value: Record[String, Double | String]): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
  }
}
