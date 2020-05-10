package typingsSlinky.titanium.Titanium.App

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait iOSEventMap extends ProxyEventMap {
  var backgroundfetch: iOSBackgroundfetchEvent = js.native
  var backgroundtransfer: iOSBackgroundtransferEvent = js.native
  var continueactivity: iOSContinueactivityEvent = js.native
  var downloadcompleted: iOSDownloadcompletedEvent = js.native
  var downloadprogress: iOSDownloadprogressEvent = js.native
  var handleurl: iOSHandleurlEvent = js.native
  var localnotificationaction: iOSLocalnotificationactionEvent = js.native
  var notification: iOSNotificationEvent = js.native
  var remotenotificationaction: iOSRemotenotificationactionEvent = js.native
  var sessioncompleted: iOSSessioncompletedEvent = js.native
  var sessioneventscompleted: iOSSessioneventscompletedEvent = js.native
  var shortcutitemclick: iOSShortcutitemclickEvent = js.native
  var silentpush: iOSSilentpushEvent = js.native
  var traitcollectionchange: iOSTraitcollectionchangeEvent = js.native
  var uploadprogress: iOSUploadprogressEvent = js.native
  var usernotificationsettings: iOSUsernotificationsettingsEvent = js.native
  var watchkitextensionrequest: iOSWatchkitextensionrequestEvent = js.native
}

object iOSEventMap {
  @scala.inline
  def apply(
    backgroundfetch: iOSBackgroundfetchEvent,
    backgroundtransfer: iOSBackgroundtransferEvent,
    continueactivity: iOSContinueactivityEvent,
    downloadcompleted: iOSDownloadcompletedEvent,
    downloadprogress: iOSDownloadprogressEvent,
    handleurl: iOSHandleurlEvent,
    localnotificationaction: iOSLocalnotificationactionEvent,
    notification: iOSNotificationEvent,
    remotenotificationaction: iOSRemotenotificationactionEvent,
    sessioncompleted: iOSSessioncompletedEvent,
    sessioneventscompleted: iOSSessioneventscompletedEvent,
    shortcutitemclick: iOSShortcutitemclickEvent,
    silentpush: iOSSilentpushEvent,
    traitcollectionchange: iOSTraitcollectionchangeEvent,
    uploadprogress: iOSUploadprogressEvent,
    usernotificationsettings: iOSUsernotificationsettingsEvent,
    watchkitextensionrequest: iOSWatchkitextensionrequestEvent
  ): iOSEventMap = {
    val __obj = js.Dynamic.literal(backgroundfetch = backgroundfetch.asInstanceOf[js.Any], backgroundtransfer = backgroundtransfer.asInstanceOf[js.Any], continueactivity = continueactivity.asInstanceOf[js.Any], downloadcompleted = downloadcompleted.asInstanceOf[js.Any], downloadprogress = downloadprogress.asInstanceOf[js.Any], handleurl = handleurl.asInstanceOf[js.Any], localnotificationaction = localnotificationaction.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any], remotenotificationaction = remotenotificationaction.asInstanceOf[js.Any], sessioncompleted = sessioncompleted.asInstanceOf[js.Any], sessioneventscompleted = sessioneventscompleted.asInstanceOf[js.Any], shortcutitemclick = shortcutitemclick.asInstanceOf[js.Any], silentpush = silentpush.asInstanceOf[js.Any], traitcollectionchange = traitcollectionchange.asInstanceOf[js.Any], uploadprogress = uploadprogress.asInstanceOf[js.Any], usernotificationsettings = usernotificationsettings.asInstanceOf[js.Any], watchkitextensionrequest = watchkitextensionrequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[iOSEventMap]
  }
  @scala.inline
  implicit class iOSEventMapOps[Self <: iOSEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundfetch(value: iOSBackgroundfetchEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundfetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundtransfer(value: iOSBackgroundtransferEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundtransfer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContinueactivity(value: iOSContinueactivityEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueactivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadcompleted(value: iOSDownloadcompletedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadcompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadprogress(value: iOSDownloadprogressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadprogress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleurl(value: iOSHandleurlEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleurl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalnotificationaction(value: iOSLocalnotificationactionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localnotificationaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotification(value: iOSNotificationEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemotenotificationaction(value: iOSRemotenotificationactionEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remotenotificationaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessioncompleted(value: iOSSessioncompletedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessioncompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessioneventscompleted(value: iOSSessioneventscompletedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessioneventscompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortcutitemclick(value: iOSShortcutitemclickEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcutitemclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilentpush(value: iOSSilentpushEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silentpush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraitcollectionchange(value: iOSTraitcollectionchangeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traitcollectionchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadprogress(value: iOSUploadprogressEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadprogress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsernotificationsettings(value: iOSUsernotificationsettingsEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usernotificationsettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatchkitextensionrequest(value: iOSWatchkitextensionrequestEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watchkitextensionrequest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

