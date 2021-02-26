package typingsSlinky.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Header extends StObject {
  
  /**
    * Any text that comes after the software name/version.
    */
  var comments: String = js.native
  
  /**
    * (Client-only) An optional greeting message presented by the server.
    */
  var greeting: js.UndefOr[String] = js.native
  
  /**
    * The raw identification string sent by the remote party.
    */
  var identRaw: String = js.native
  
  /**
    * Contains various version information parsed from identRaw.
    */
  var versions: Versions = js.native
}
object Header {
  
  @scala.inline
  def apply(comments: String, identRaw: String, versions: Versions): Header = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], identRaw = identRaw.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreeting(value: String): Self = StObject.set(x, "greeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreetingUndefined: Self = StObject.set(x, "greeting", js.undefined)
    
    @scala.inline
    def setIdentRaw(value: String): Self = StObject.set(x, "identRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersions(value: Versions): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
  }
}
