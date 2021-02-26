package typingsSlinky.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Publisher extends StObject {
  
  var displayName: String = js.native
  
  var emailAddress: js.Array[String] = js.native
  
  var extensions: js.Array[PublishedExtension] = js.native
  
  var flags: PublisherFlags = js.native
  
  var lastUpdated: js.Date = js.native
  
  var links: PublisherLinks = js.native
  
  var longDescription: String = js.native
  
  var publisherId: String = js.native
  
  var publisherName: String = js.native
  
  var shortDescription: String = js.native
}
object Publisher {
  
  @scala.inline
  def apply(
    displayName: String,
    emailAddress: js.Array[String],
    extensions: js.Array[PublishedExtension],
    flags: PublisherFlags,
    lastUpdated: js.Date,
    links: PublisherLinks,
    longDescription: String,
    publisherId: String,
    publisherName: String,
    shortDescription: String
  ): Publisher = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], longDescription = longDescription.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], shortDescription = shortDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Publisher]
  }
  
  @scala.inline
  implicit class PublisherMutableBuilder[Self <: Publisher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: js.Array[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressVarargs(value: String*): Self = StObject.set(x, "emailAddress", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[PublishedExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsVarargs(value: PublishedExtension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: PublisherFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: PublisherLinks): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherId(value: String): Self = StObject.set(x, "publisherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
  }
}
