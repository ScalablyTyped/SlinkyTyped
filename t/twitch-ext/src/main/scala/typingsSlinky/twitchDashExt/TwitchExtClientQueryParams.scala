package typingsSlinky.twitchDashExt

import typingsSlinky.twitchDashExt.twitchDashExtStrings.`false`
import typingsSlinky.twitchDashExt.twitchDashExtStrings.`true`
import typingsSlinky.twitchDashExt.twitchDashExtStrings.approved
import typingsSlinky.twitchDashExt.twitchDashExtStrings.component
import typingsSlinky.twitchDashExt.twitchDashExtStrings.config
import typingsSlinky.twitchDashExt.twitchDashExtStrings.dashboard
import typingsSlinky.twitchDashExt.twitchDashExtStrings.hosted_test
import typingsSlinky.twitchDashExt.twitchDashExtStrings.in_review
import typingsSlinky.twitchDashExt.twitchDashExtStrings.mobile
import typingsSlinky.twitchDashExt.twitchDashExtStrings.panel
import typingsSlinky.twitchDashExt.twitchDashExtStrings.pending_action
import typingsSlinky.twitchDashExt.twitchDashExtStrings.ready_for_review
import typingsSlinky.twitchDashExt.twitchDashExtStrings.released
import typingsSlinky.twitchDashExt.twitchDashExtStrings.testing
import typingsSlinky.twitchDashExt.twitchDashExtStrings.uploading
import typingsSlinky.twitchDashExt.twitchDashExtStrings.video_overlay
import typingsSlinky.twitchDashExt.twitchDashExtStrings.viewer
import typingsSlinky.twitchDashExt.twitchDashExtStrings.web
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
trait TwitchExtClientQueryParams extends js.Object {
  /**
  	 * The type of the anchor in which the extension is activated.
  	 */
  var anchor: component | panel | video_overlay
  /**
  	 * The user’s language setting.
  	 *
  	 * @example en
  	 */
  var language: String
  /**
  	 * The extension’s mode.
  	 */
  var mode: config | dashboard | viewer
  /**
  	 * The platform on which the Twitch client is running.
  	 */
  var platform: mobile | web
  /**
  	 * Indicates whether the extension is popped out.
  	 */
  var popout: `true` | `false`
  /**
  	 * The release state of the extension.
  	 */
  var state: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading
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
}

