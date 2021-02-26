package typingsSlinky.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resume Point Object
  * [resume point object](https://developer.spotify.com/documentation/web-api/reference/object-model/#resume-point-object)
  */
@js.native
trait ResumePointObject extends StObject {
  
  var full_played: Boolean = js.native
  
  var resume_position_ms: Double = js.native
}
object ResumePointObject {
  
  @scala.inline
  def apply(full_played: Boolean, resume_position_ms: Double): ResumePointObject = {
    val __obj = js.Dynamic.literal(full_played = full_played.asInstanceOf[js.Any], resume_position_ms = resume_position_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumePointObject]
  }
  
  @scala.inline
  implicit class ResumePointObjectMutableBuilder[Self <: ResumePointObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull_played(value: Boolean): Self = StObject.set(x, "full_played", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume_position_ms(value: Double): Self = StObject.set(x, "resume_position_ms", value.asInstanceOf[js.Any])
  }
}
