package typingsSlinky.spotifyApi.SpotifyApi

import typingsSlinky.spotifyApi.spotifyApiStrings.C
import typingsSlinky.spotifyApi.spotifyApiStrings.P
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Copyright object
  * [copyright object](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait CopyrightObject extends StObject {
  
  var text: String = js.native
  
  var `type`: C | P = js.native
}
object CopyrightObject {
  
  @scala.inline
  def apply(text: String, `type`: C | P): CopyrightObject = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyrightObject]
  }
  
  @scala.inline
  implicit class CopyrightObjectMutableBuilder[Self <: CopyrightObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: C | P): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
