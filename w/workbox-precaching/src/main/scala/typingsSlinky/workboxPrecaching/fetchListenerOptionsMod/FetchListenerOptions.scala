package typingsSlinky.workboxPrecaching.fetchListenerOptionsMod

import org.scalajs.dom.experimental.URL
import typingsSlinky.workboxPrecaching.AnonUrl
import typingsSlinky.workboxPrecaching.urlmanipulationMod.URLManipulation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchListenerOptions extends js.Object {
  var cleanURLs: js.UndefOr[Boolean] = js.native
  var directoryIndex: js.UndefOr[String] = js.native
  var ignoreURLParametersMatching: js.UndefOr[js.Array[js.RegExp]] = js.native
  var urlManipulation: js.UndefOr[URLManipulation] = js.native
}

object FetchListenerOptions {
  @scala.inline
  def apply(): FetchListenerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchListenerOptions]
  }
  @scala.inline
  implicit class FetchListenerOptionsOps[Self <: FetchListenerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleanURLs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanURLs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanURLs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanURLs")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectoryIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreURLParametersMatching(value: js.Array[js.RegExp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreURLParametersMatching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreURLParametersMatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreURLParametersMatching")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlManipulation(value: /* url */ AnonUrl => js.Array[URL]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlManipulation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUrlManipulation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlManipulation")(js.undefined)
        ret
    }
  }
  
}

