package typingsSlinky.winrtUwp.Windows.Media.PlayTo

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the SourceChangeRequested event. */
@js.native
trait SourceChangeRequestedEventArgs extends js.Object {
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
  implicit class SourceChangeRequestedEventArgsOps[Self <: SourceChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenre(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IMapView[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStream(value: IRandomAccessStreamWithContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: IRandomAccessStreamReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

