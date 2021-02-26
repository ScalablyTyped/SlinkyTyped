package typingsSlinky.twilioChat

import typingsSlinky.twilioMcsClient.mod.McsClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaMod {
  
  /**
    * @classdesc A Media represents a media information for Message in a Channel.
    * @property {String} contentType - content type of media
    * @property {String} sid - The server-assigned unique identifier for Media
    * @property {Number} size - Size of media, bytes
    * @property {String} [filename] - file name if present, null otherwise
    */
  @JSImport("twilio-chat/lib/media", "Media")
  @js.native
  class Media protected () extends StObject {
    def this(data: MediaState, services: MediaServices) = this()
    
    def contentType: String = js.native
    
    def filename: String = js.native
    
    /**
      * Returns direct content URL for the media.
      *
      * This URL is impermanent, it will expire in several minutes and cannot be cached.
      * If the URL becomes expired, you need to request a new one.
      * Each call to this function produces a new temporary URL.
      *
      * @returns {Promise<String>}
      */
    def getContentTemporaryUrl(): js.Promise[String] = js.native
    
    var mcsMedia: js.Any = js.native
    
    var services: js.Any = js.native
    
    def sid: String = js.native
    
    def size: Double = js.native
    
    var state: js.Any = js.native
  }
  
  @js.native
  trait MediaServices extends StObject {
    
    var mcsClient: McsClient = js.native
  }
  object MediaServices {
    
    @scala.inline
    def apply(mcsClient: McsClient): MediaServices = {
      val __obj = js.Dynamic.literal(mcsClient = mcsClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaServices]
    }
    
    @scala.inline
    implicit class MediaServicesMutableBuilder[Self <: MediaServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMcsClient(value: McsClient): Self = StObject.set(x, "mcsClient", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MediaState extends StObject {
    
    var contentType: String = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var sid: String = js.native
    
    var size: Double = js.native
  }
  object MediaState {
    
    @scala.inline
    def apply(contentType: String, sid: String, size: Double): MediaState = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaState]
    }
    
    @scala.inline
    implicit class MediaStateMutableBuilder[Self <: MediaState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
