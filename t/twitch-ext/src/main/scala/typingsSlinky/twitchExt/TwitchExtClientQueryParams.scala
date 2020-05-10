package typingsSlinky.twitchExt

import typingsSlinky.twitchExt.twitchExtStrings.`false`
import typingsSlinky.twitchExt.twitchExtStrings.`true`
import typingsSlinky.twitchExt.twitchExtStrings.approved
import typingsSlinky.twitchExt.twitchExtStrings.component
import typingsSlinky.twitchExt.twitchExtStrings.config
import typingsSlinky.twitchExt.twitchExtStrings.dashboard
import typingsSlinky.twitchExt.twitchExtStrings.hosted_test
import typingsSlinky.twitchExt.twitchExtStrings.in_review
import typingsSlinky.twitchExt.twitchExtStrings.mobile
import typingsSlinky.twitchExt.twitchExtStrings.panel
import typingsSlinky.twitchExt.twitchExtStrings.pending_action
import typingsSlinky.twitchExt.twitchExtStrings.ready_for_review
import typingsSlinky.twitchExt.twitchExtStrings.released
import typingsSlinky.twitchExt.twitchExtStrings.testing
import typingsSlinky.twitchExt.twitchExtStrings.uploading
import typingsSlinky.twitchExt.twitchExtStrings.video_overlay
import typingsSlinky.twitchExt.twitchExtStrings.viewer
import typingsSlinky.twitchExt.twitchExtStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The extension window receives the following query parameters, which indicate
  * information about the extension environment that isn’t subject to change over
  * the frame’s life cycle.
  *
  * @see https://dev.twitch.tv/docs/extensions/reference/#client-query-parameters
  */
@js.native
trait TwitchExtClientQueryParams extends js.Object {
  /**
  	 * The type of the anchor in which the extension is activated.
  	 */
  var anchor: component | panel | video_overlay = js.native
  /**
  	 * The user’s language setting.
  	 *
  	 * @example en
  	 */
  var language: String = js.native
  /**
  	 * The extension’s mode.
  	 */
  var mode: config | dashboard | viewer = js.native
  /**
  	 * The platform on which the Twitch client is running.
  	 */
  var platform: mobile | web = js.native
  /**
  	 * Indicates whether the extension is popped out.
  	 */
  var popout: `true` | `false` = js.native
  /**
  	 * The release state of the extension.
  	 */
  var state: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading = js.native
}

object TwitchExtClientQueryParams {
  @scala.inline
  def apply(
    anchor: component | panel | video_overlay,
    language: String,
    mode: config | dashboard | viewer,
    platform: mobile | web,
    popout: `true` | `false`,
    state: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading
  ): TwitchExtClientQueryParams = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], popout = popout.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtClientQueryParams]
  }
  @scala.inline
  implicit class TwitchExtClientQueryParamsOps[Self <: TwitchExtClientQueryParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: component | panel | video_overlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: config | dashboard | viewer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: mobile | web): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopout(value: `true` | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(
      value: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

