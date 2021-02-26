package typingsSlinky.winrtUwp.Windows.Storage.Search

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents app content and properties that can be added to the ContentIndexer . */
@js.native
trait IIndexableContent extends StObject {
  
  /** Gets or sets the identifier for the content properties in the IIndexableContent object. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var id: String = js.native
  
  /** Gets the content properties. */
  var properties: IMap[String, _] = js.native
  
  /** Gets or sets a stream that provides full-text content. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var stream: IRandomAccessStream = js.native
  
  /** Specifies the type of content in the Stream . */
  var streamContentType: String = js.native
}
object IIndexableContent {
  
  @scala.inline
  def apply(id: String, properties: IMap[String, _], stream: IRandomAccessStream, streamContentType: String): IIndexableContent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], streamContentType = streamContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIndexableContent]
  }
  
  @scala.inline
  implicit class IIndexableContentMutableBuilder[Self <: IIndexableContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IMap[String, _]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: IRandomAccessStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamContentType(value: String): Self = StObject.set(x, "streamContentType", value.asInstanceOf[js.Any])
  }
}
