package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelayRangeStart extends js.Object {
  var delayRangeStart: scala.Double = js.native
  var eventPipelineTime: scala.Double = js.native
  var events: scala.Double = js.native
  var eventsByEventType: scala.Double = js.native
  var eventsByEventTypePerUser: scala.Double = js.native
  var hourlyEventPipelineTime: scala.Double = js.native
  var hourlyEvents: scala.Double = js.native
  var hourlyEventsByEventTypePerUser: scala.Double = js.native
  var hourlyNotificationBySubscription: scala.Double = js.native
  var hourlyNotificationPipelineTime: scala.Double = js.native
  var hourlyNotifications: scala.Double = js.native
  var hourlyRangeStart: scala.Double = js.native
  var hourlyTotalPipelineTime: scala.Double = js.native
  var hourlyUnprocessedEventDelayByPublisher: scala.Double = js.native
  var hourlyUnprocessedEventsByPublisher: scala.Double = js.native
  var hourlyUnprocessedNotificationDelayByChannelByPublisher: scala.Double = js.native
  var hourlyUnprocessedNotificationsByChannelByPublisher: scala.Double = js.native
  var notificationByEventType: scala.Double = js.native
  var notificationByEventTypePerUser: scala.Double = js.native
  var notificationBySubscription: scala.Double = js.native
  var notificationFailureBySubscription: scala.Double = js.native
  var notificationPipelineTime: scala.Double = js.native
  var notifications: scala.Double = js.native
  var totalPipelineTime: scala.Double = js.native
  var unprocessedEventDelayByPublisher: scala.Double = js.native
  var unprocessedEventsByPublisher: scala.Double = js.native
  var unprocessedNotificationDelayByChannelByPublisher: scala.Double = js.native
  var unprocessedNotificationsByChannelByPublisher: scala.Double = js.native
  var unprocessedRangeStart: scala.Double = js.native
}

object DelayRangeStart {
  @scala.inline
  def apply(
    delayRangeStart: scala.Double,
    eventPipelineTime: scala.Double,
    events: scala.Double,
    eventsByEventType: scala.Double,
    eventsByEventTypePerUser: scala.Double,
    hourlyEventPipelineTime: scala.Double,
    hourlyEvents: scala.Double,
    hourlyEventsByEventTypePerUser: scala.Double,
    hourlyNotificationBySubscription: scala.Double,
    hourlyNotificationPipelineTime: scala.Double,
    hourlyNotifications: scala.Double,
    hourlyRangeStart: scala.Double,
    hourlyTotalPipelineTime: scala.Double,
    hourlyUnprocessedEventDelayByPublisher: scala.Double,
    hourlyUnprocessedEventsByPublisher: scala.Double,
    hourlyUnprocessedNotificationDelayByChannelByPublisher: scala.Double,
    hourlyUnprocessedNotificationsByChannelByPublisher: scala.Double,
    notificationByEventType: scala.Double,
    notificationByEventTypePerUser: scala.Double,
    notificationBySubscription: scala.Double,
    notificationFailureBySubscription: scala.Double,
    notificationPipelineTime: scala.Double,
    notifications: scala.Double,
    totalPipelineTime: scala.Double,
    unprocessedEventDelayByPublisher: scala.Double,
    unprocessedEventsByPublisher: scala.Double,
    unprocessedNotificationDelayByChannelByPublisher: scala.Double,
    unprocessedNotificationsByChannelByPublisher: scala.Double,
    unprocessedRangeStart: scala.Double
  ): DelayRangeStart = {
    val __obj = js.Dynamic.literal(delayRangeStart = delayRangeStart.asInstanceOf[js.Any], eventPipelineTime = eventPipelineTime.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], eventsByEventType = eventsByEventType.asInstanceOf[js.Any], eventsByEventTypePerUser = eventsByEventTypePerUser.asInstanceOf[js.Any], hourlyEventPipelineTime = hourlyEventPipelineTime.asInstanceOf[js.Any], hourlyEvents = hourlyEvents.asInstanceOf[js.Any], hourlyEventsByEventTypePerUser = hourlyEventsByEventTypePerUser.asInstanceOf[js.Any], hourlyNotificationBySubscription = hourlyNotificationBySubscription.asInstanceOf[js.Any], hourlyNotificationPipelineTime = hourlyNotificationPipelineTime.asInstanceOf[js.Any], hourlyNotifications = hourlyNotifications.asInstanceOf[js.Any], hourlyRangeStart = hourlyRangeStart.asInstanceOf[js.Any], hourlyTotalPipelineTime = hourlyTotalPipelineTime.asInstanceOf[js.Any], hourlyUnprocessedEventDelayByPublisher = hourlyUnprocessedEventDelayByPublisher.asInstanceOf[js.Any], hourlyUnprocessedEventsByPublisher = hourlyUnprocessedEventsByPublisher.asInstanceOf[js.Any], hourlyUnprocessedNotificationDelayByChannelByPublisher = hourlyUnprocessedNotificationDelayByChannelByPublisher.asInstanceOf[js.Any], hourlyUnprocessedNotificationsByChannelByPublisher = hourlyUnprocessedNotificationsByChannelByPublisher.asInstanceOf[js.Any], notificationByEventType = notificationByEventType.asInstanceOf[js.Any], notificationByEventTypePerUser = notificationByEventTypePerUser.asInstanceOf[js.Any], notificationBySubscription = notificationBySubscription.asInstanceOf[js.Any], notificationFailureBySubscription = notificationFailureBySubscription.asInstanceOf[js.Any], notificationPipelineTime = notificationPipelineTime.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], totalPipelineTime = totalPipelineTime.asInstanceOf[js.Any], unprocessedEventDelayByPublisher = unprocessedEventDelayByPublisher.asInstanceOf[js.Any], unprocessedEventsByPublisher = unprocessedEventsByPublisher.asInstanceOf[js.Any], unprocessedNotificationDelayByChannelByPublisher = unprocessedNotificationDelayByChannelByPublisher.asInstanceOf[js.Any], unprocessedNotificationsByChannelByPublisher = unprocessedNotificationsByChannelByPublisher.asInstanceOf[js.Any], unprocessedRangeStart = unprocessedRangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayRangeStart]
  }
  @scala.inline
  implicit class DelayRangeStartOps[Self <: DelayRangeStart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayRangeStart(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayRangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventPipelineTime(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPipelineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsByEventType(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsByEventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsByEventTypePerUser(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsByEventTypePerUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyEventPipelineTime(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyEventPipelineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyEvents(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyEventsByEventTypePerUser(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyEventsByEventTypePerUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyNotificationBySubscription(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyNotificationBySubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyNotificationPipelineTime(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyNotificationPipelineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyNotifications(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyRangeStart(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyRangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyTotalPipelineTime(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyTotalPipelineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyUnprocessedEventDelayByPublisher(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyUnprocessedEventDelayByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyUnprocessedEventsByPublisher(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyUnprocessedEventsByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyUnprocessedNotificationDelayByChannelByPublisher(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyUnprocessedNotificationDelayByChannelByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyUnprocessedNotificationsByChannelByPublisher(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyUnprocessedNotificationsByChannelByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationByEventType(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationByEventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationByEventTypePerUser(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationByEventTypePerUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationBySubscription(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationBySubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationFailureBySubscription(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationFailureBySubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationPipelineTime(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationPipelineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifications(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalPipelineTime(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPipelineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedEventDelayByPublisher(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedEventDelayByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedEventsByPublisher(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedEventsByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedNotificationDelayByChannelByPublisher(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedNotificationDelayByChannelByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedNotificationsByChannelByPublisher(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedNotificationsByChannelByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedRangeStart(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedRangeStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

