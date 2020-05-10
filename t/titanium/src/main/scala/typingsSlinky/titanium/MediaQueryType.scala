package typingsSlinky.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specifier for a media library query. By default, filters perform an exact match.
  */
@js.native
trait MediaQueryType extends js.Object {
  /**
  	 * The album artist to filter on. Value should be a String.
  	 */
  var albumArtist: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.native
  /**
  	 * The album artist persistent ID to filter on. Value should be a Number.
  	 */
  var albumArtistPersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.native
  /**
  	 * The album persistent ID to filter on. Value should be a Number.
  	 */
  var albumPersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.native
  /**
  	 * The album title to filter on. Value should be a String.
  	 */
  var albumTitle: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.native
  /**
  	 * The artist to filter on. Value should be a String.
  	 */
  var artist: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.native
  /**
  	 * The composer to filter on. Value should be a String.
  	 */
  var composer: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.native
  /**
  	 * The composer persistent ID to filter on. Value should be a Number.
  	 */
  var composerPersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.native
  /**
  	 * The genre to filter on. Value should be a String.
  	 */
  var genre: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.native
  /**
  	 * The genre persistent ID to filter on. Value should be a Number.
  	 */
  var genrePersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.native
  /**
  	 * A constant that specifies the ordering of the result array.
  	 */
  var grouping: js.UndefOr[Double] = js.native
  /**
  	 * Filter by whether or not the item is a protected asset.
  	 * Value should be a Boolean.
  	 */
  var hasProtectedAsset: js.UndefOr[MediaQueryInfoType | Boolean] = js.native
  /**
  	 * Filter by whether or not the item is a cloud item.
  	 * Value should be a Boolean.
  	 */
  var isCloudItem: js.UndefOr[MediaQueryInfoType | Boolean] = js.native
  /**
  	 * Filter by whether or not the item is a compilation.
  	 * The value should be a Boolean.
  	 */
  var isCompilation: js.UndefOr[MediaQueryInfoType | Boolean] = js.native
  /**
  	 * The media type to filter on.
  	 */
  var mediaType: js.UndefOr[MediaQueryInfoType | Double] = js.native
  /**
  	 * The persistent ID to filter on. Value should be a Number.
  	 */
  var persistentID: js.UndefOr[MediaQueryInfoType | Double] = js.native
  /**
  	 * The play count to filter on. Value should be a Number.
  	 */
  var playCount: js.UndefOr[MediaQueryInfoType | Double] = js.native
  /**
  	 * The podcast persistent ID to filter on. Value should be a Number.
  	 */
  var podcastPersistentID: js.UndefOr[MediaQueryInfoType | Double] = js.native
  /**
  	 * The podcast title to filter on. Value should be a String.
  	 */
  var podcastTitle: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.native
  /**
  	 * The title to filter on. Value should be a String.
  	 */
  var title: js.UndefOr[MediaQueryInfoType | java.lang.String] = js.native
}

object MediaQueryType {
  @scala.inline
  def apply(): MediaQueryType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueryType]
  }
  @scala.inline
  implicit class MediaQueryTypeOps[Self <: MediaQueryType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbumArtist(value: MediaQueryInfoType | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumArtist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumArtist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumArtist")(js.undefined)
        ret
    }
    @scala.inline
    def withAlbumArtistPersistentID(value: MediaQueryInfoType | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumArtistPersistentID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumArtistPersistentID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumArtistPersistentID")(js.undefined)
        ret
    }
    @scala.inline
    def withAlbumPersistentID(value: MediaQueryInfoType | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumPersistentID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumPersistentID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumPersistentID")(js.undefined)
        ret
    }
    @scala.inline
    def withAlbumTitle(value: MediaQueryInfoType | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlbumTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withArtist(value: MediaQueryInfoType | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(js.undefined)
        ret
    }
    @scala.inline
    def withComposer(value: MediaQueryInfoType | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composer")(js.undefined)
        ret
    }
    @scala.inline
    def withComposerPersistentID(value: MediaQueryInfoType | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composerPersistentID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposerPersistentID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composerPersistentID")(js.undefined)
        ret
    }
    @scala.inline
    def withGenre(value: MediaQueryInfoType | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenre: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genre")(js.undefined)
        ret
    }
    @scala.inline
    def withGenrePersistentID(value: MediaQueryInfoType | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genrePersistentID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenrePersistentID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genrePersistentID")(js.undefined)
        ret
    }
    @scala.inline
    def withGrouping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grouping")(js.undefined)
        ret
    }
    @scala.inline
    def withHasProtectedAsset(value: MediaQueryInfoType | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasProtectedAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasProtectedAsset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasProtectedAsset")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCloudItem(value: MediaQueryInfoType | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCloudItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCloudItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCloudItem")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCompilation(value: MediaQueryInfoType | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompilation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCompilation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompilation")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaType(value: MediaQueryInfoType | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentID(value: MediaQueryInfoType | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentID")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayCount(value: MediaQueryInfoType | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playCount")(js.undefined)
        ret
    }
    @scala.inline
    def withPodcastPersistentID(value: MediaQueryInfoType | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podcastPersistentID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPodcastPersistentID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podcastPersistentID")(js.undefined)
        ret
    }
    @scala.inline
    def withPodcastTitle(value: MediaQueryInfoType | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podcastTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPodcastTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("podcastTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: MediaQueryInfoType | java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

