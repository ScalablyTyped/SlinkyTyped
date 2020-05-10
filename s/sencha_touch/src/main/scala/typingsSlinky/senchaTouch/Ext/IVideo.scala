package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVideo extends IMedia {
  /** [Method] Returns the value of posterUrl
  		* @returns String
  		*/
  var getPosterUrl: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Config Option] (String) */
  var posterUrl: js.UndefOr[java.lang.String] = js.native
  /** [Method] Sets the value of posterUrl
  		* @param posterUrl String The new value.
  		*/
  var setPosterUrl: js.UndefOr[js.Function1[/* posterUrl */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of url
  		* @param url String/Array The new value.
  		*/
  @JSName("setUrl")
  var setUrl_IVideo: js.UndefOr[js.Function1[/* url */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Updates the URL to the poster even if it is rendered
  		* @param newUrl Object
  		*/
  var updatePosterUrl: js.UndefOr[js.Function1[/* newUrl */ js.UndefOr[js.Any], Unit]] = js.native
}

object IVideo {
  @scala.inline
  def apply(): IVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVideo]
  }
  @scala.inline
  implicit class IVideoOps[Self <: IVideo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPosterUrl(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosterUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPosterUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosterUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPosterUrl(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posterUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosterUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posterUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPosterUrl(value: /* posterUrl */ js.UndefOr[java.lang.String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosterUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPosterUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosterUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUrl(value: /* url */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatePosterUrl(value: /* newUrl */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePosterUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdatePosterUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePosterUrl")(js.undefined)
        ret
    }
  }
  
}

