package typingsSlinky.winrtUwp.Windows.Media

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides properties for video information that is displayed by SystemMediaTransportControlsDisplayUpdater class. */
@js.native
trait VideoDisplayProperties extends js.Object {
  /** Gets a modifiable list of strings representing genre names. */
  var genres: IVector[String] = js.native
  /** Gets or sets the subtitle of the video. */
  var subtitle: String = js.native
  /** Gets or sets the title of the video. */
  var title: String = js.native
}

object VideoDisplayProperties {
  @scala.inline
  def apply(genres: IVector[String], subtitle: String, title: String): VideoDisplayProperties = {
    val __obj = js.Dynamic.literal(genres = genres.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDisplayProperties]
  }
  @scala.inline
  implicit class VideoDisplayPropertiesOps[Self <: VideoDisplayProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenres(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genres")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
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

