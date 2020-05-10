package typingsSlinky.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMedia extends IComponent {
  /** [Config Option] (Boolean) */
  var autoPause: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoResume: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableControls: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of autoPause
  		* @returns Boolean
  		*/
  var getAutoPause: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of autoResume
  		* @returns Boolean
  		*/
  var getAutoResume: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the current time of the media in seconds
  		* @returns Number
  		*/
  var getCurrentTime: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the duration of the media in seconds
  		* @returns Number
  		*/
  var getDuration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of enableControls
  		* @returns Boolean
  		*/
  var getEnableControls: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of loop
  		* @returns Boolean
  		*/
  var getLoop: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of media
  		* @returns Ext.Element
  		*/
  var getMedia: js.UndefOr[js.Function0[IElement]] = js.native
  /** [Method] Returns the value of muted
  		* @returns Boolean
  		*/
  var getMuted: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of preload
  		* @returns Boolean
  		*/
  var getPreload: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of url
  		* @returns String
  		*/
  var getUrl: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Method] Returns the value of volume
  		* @returns Number
  		*/
  var getVolume: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns if the media is currently playing
  		* @returns Boolean playing true if the media is playing.
  		*/
  var isPlaying: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Boolean) */
  var loop: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.Element) */
  var media: js.UndefOr[IElement] = js.native
  /** [Config Option] (Boolean) */
  var muted: js.UndefOr[Boolean] = js.native
  /** [Method] Pauses media playback  */
  var pause: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Starts or resumes media playback  */
  var play: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var preload: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of autoPause
  		* @param autoPause Boolean The new value.
  		*/
  var setAutoPause: js.UndefOr[js.Function1[/* autoPause */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of autoResume
  		* @param autoResume Boolean The new value.
  		*/
  var setAutoResume: js.UndefOr[js.Function1[/* autoResume */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of enableControls
  		* @param enableControls Boolean The new value.
  		*/
  var setEnableControls: js.UndefOr[js.Function1[/* enableControls */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of loop
  		* @param loop Boolean The new value.
  		*/
  var setLoop: js.UndefOr[js.Function1[/* loop */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of media
  		* @param media Ext.Element The new value.
  		*/
  var setMedia: js.UndefOr[js.Function1[/* media */ js.UndefOr[IElement], Unit]] = js.native
  /** [Method] Sets the value of muted
  		* @param muted Boolean The new value.
  		*/
  var setMuted: js.UndefOr[js.Function1[/* muted */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of preload
  		* @param preload Boolean The new value.
  		*/
  var setPreload: js.UndefOr[js.Function1[/* preload */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of url
  		* @param url String The new value.
  		*/
  var setUrl: js.UndefOr[js.Function1[/* url */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Method] Sets the value of volume
  		* @param volume Number The new value.
  		*/
  var setVolume: js.UndefOr[js.Function1[/* volume */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Stops media playback and returns to the beginning  */
  var stop: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Toggles the media playback state  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Updates the controls of the video element
  		* @param enableControls Object
  		*/
  var updateEnableControls: js.UndefOr[js.Function1[/* enableControls */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Updates the loop setting of the media element
  		* @param loop Object
  		*/
  var updateLoop: js.UndefOr[js.Function1[/* loop */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the URL of the media element
  		* @param newUrl Object
  		*/
  var updateUrl: js.UndefOr[js.Function1[/* newUrl */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number) */
  var volume: js.UndefOr[Double] = js.native
}

object IMedia {
  @scala.inline
  def apply(): IMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMedia]
  }
  @scala.inline
  implicit class IMediaOps[Self <: IMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPause(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPause")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoResume(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResume")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableControls(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableControls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableControls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoPause(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoPause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoPause")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAutoResume(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoResume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAutoResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAutoResume")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCurrentTime(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCurrentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEnableControls(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnableControls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEnableControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEnableControls")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLoop(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLoop")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMedia(value: () => IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMedia")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMedia")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMuted(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMuted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMuted")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPreload(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreload")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUrl(value: () => java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetVolume(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVolume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPlaying(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlaying")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withMuted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("muted")(js.undefined)
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.undefined)
        ret
    }
    @scala.inline
    def withPlay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("play")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoPause(value: /* autoPause */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoPause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoPause")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAutoResume(value: /* autoResume */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoResume")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAutoResume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutoResume")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEnableControls(value: /* enableControls */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnableControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEnableControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEnableControls")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLoop(value: /* loop */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLoop")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMedia(value: /* media */ js.UndefOr[IElement] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMedia")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMedia")(js.undefined)
        ret
    }
    @scala.inline
    def withSetMuted(value: /* muted */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMuted")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetMuted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMuted")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPreload(value: /* preload */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreload")(js.undefined)
        ret
    }
    @scala.inline
    def withSetUrl(value: /* url */ js.UndefOr[java.lang.String] => Unit): Self = {
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
    def withSetVolume(value: /* volume */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVolume")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateEnableControls(value: /* enableControls */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEnableControls")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateEnableControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEnableControls")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateLoop(value: /* loop */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLoop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateLoop")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateUrl(value: /* newUrl */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
  }
  
}

