package typingsSlinky.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for Windows music file properties. */
@js.native
trait SystemMusicProperties extends js.Object {
  /** Gets the name of the System.Music.AlbumArtist property (one of the Windows music file properties). */
  var albumArtist: String = js.native
  /** Gets the name of the System.Music.AlbumTitle property (one of the Windows music file properties). */
  var albumTitle: String = js.native
  /** Gets the name of the System.Music.Artist property (one of the Windows music file properties). */
  var artist: String = js.native
  /** Gets the name of the System.Music.Composer property (one of the Windows music file properties). */
  var composer: String = js.native
  /** Gets the name of the System.Music.Conductor property (one of the Windows music file properties). */
  var conductor: String = js.native
  /** Gets the name of the System.Music.DisplayArtist property (one of the Windows music file properties). */
  var displayArtist: String = js.native
  /** Gets the name of the System.Music.Genre property (one of the Windows music file properties). */
  var genre: String = js.native
  /** Gets the name of the System.Music.TrackNumber property (one of the Windows music file properties). */
  var trackNumber: String = js.native
}

object SystemMusicProperties {
  @scala.inline
  def apply(
    albumArtist: String,
    albumTitle: String,
    artist: String,
    composer: String,
    conductor: String,
    displayArtist: String,
    genre: String,
    trackNumber: String
  ): SystemMusicProperties = {
    val __obj = js.Dynamic.literal(albumArtist = albumArtist.asInstanceOf[js.Any], albumTitle = albumTitle.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], composer = composer.asInstanceOf[js.Any], conductor = conductor.asInstanceOf[js.Any], displayArtist = displayArtist.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], trackNumber = trackNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMusicProperties]
  }
  @scala.inline
  implicit class SystemMusicPropertiesOps[Self <: SystemMusicProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbumArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumArtist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlbumTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComposer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConductor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conductor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayArtist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayArtist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenre(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genre")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

