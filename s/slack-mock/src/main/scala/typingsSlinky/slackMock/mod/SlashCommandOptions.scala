package typingsSlinky.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlashCommandOptions[T] extends StObject {
  
  var body: js.UndefOr[T] = js.native
  
  var headers: js.UndefOr[SlashCommandHttpHeaders] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[SlashCommandUrl] = js.native
}
object SlashCommandOptions {
  
  @scala.inline
  def apply[T](): SlashCommandOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlashCommandOptions[T]]
  }
  
  @scala.inline
  implicit class SlashCommandOptionsMutableBuilder[Self <: SlashCommandOptions[_], T] (val x: Self with SlashCommandOptions[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(value: SlashCommandHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setUrl(value: SlashCommandUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
