package typingsSlinky.winrtUwp.Windows.Media.PlayTo

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the SourceChangeRequested event. */
@js.native
trait SourceChangeRequestedEventArgs extends StObject {
  
  /** Gets the name of the album that contains the song in the audio stream. */
  var album: String = js.native
  
  /** Gets the author of the content in the media stream. */
  var author: String = js.native
  
  /** Gets the date that the content in the media stream was published. */
  var date: js.Date = js.native
  
  /** Gets the description of the content in the media stream. */
  var description: String = js.native
  
  /** Gets the names of the genres that the content in the media stream belongs to. */
  var genre: String = js.native
  
  /** Gets custom property names and values for the content in the media stream. */
  var properties: IMapView[String, _] = js.native
  
  /** Gets the rating for the content in the media stream. */
  var rating: Double = js.native
  
  /** Gets the media stream for the Play To receiver. */
  var stream: IRandomAccessStreamWithContentType = js.native
  
  /** Gets the thumbnail image for the content in the media stream. */
  var thumbnail: IRandomAccessStreamReference = js.native
  
  /** Gets the title of the content in the media stream. */
  var title: String = js.native
}
object SourceChangeRequestedEventArgs {
  
  @scala.inline
  def apply(
    album: String,
    author: String,
    date: js.Date,
    description: String,
    genre: String,
    properties: IMapView[String, _],
    rating: Double,
    stream: IRandomAccessStreamWithContentType,
    thumbnail: IRandomAccessStreamReference,
    title: String
  ): SourceChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class SourceChangeRequestedEventArgsMutableBuilder[Self <: SourceChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IMapView[String, _]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: IRandomAccessStreamWithContentType): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: IRandomAccessStreamReference): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
