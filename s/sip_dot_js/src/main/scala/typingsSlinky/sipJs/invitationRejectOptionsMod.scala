package typingsSlinky.sipJs

import typingsSlinky.sipJs.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invitationRejectOptionsMod {
  
  @js.native
  trait InvitationRejectOptions extends StObject {
    
    /**
      * Body
      */
    var body: js.UndefOr[String | Body] = js.native
    
    /**
      * Array of extra headers added to the response.
      */
    var extraHeaders: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Reason phrase for response.
      */
    var reasonPhrase: js.UndefOr[String] = js.native
    
    /**
      * Status code for response.
      */
    var statusCode: js.UndefOr[Double] = js.native
  }
  object InvitationRejectOptions {
    
    @scala.inline
    def apply(): InvitationRejectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvitationRejectOptions]
    }
    
    @scala.inline
    implicit class InvitationRejectOptionsMutableBuilder[Self <: InvitationRejectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String | Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      @scala.inline
      def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
      
      @scala.inline
      def setReasonPhrase(value: String): Self = StObject.set(x, "reasonPhrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonPhraseUndefined: Self = StObject.set(x, "reasonPhrase", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
}
