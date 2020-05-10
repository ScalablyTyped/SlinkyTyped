package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelayRangeStart extends js.Object {
  var delayRangeStart: Double = js.native
  var eventPipelineTime: Double = js.native
  var events: Double = js.native
  var eventsByEventType: Double = js.native
  var eventsByEventTypePerUser: Double = js.native
  var hourlyEventPipelineTime: Double = js.native
  var hourlyEvents: Double = js.native
  var hourlyEventsByEventTypePerUser: Double = js.native
  var hourlyNotificationBySubscription: Double = js.native
  var hourlyNotificationPipelineTime: Double = js.native
  var hourlyNotifications: Double = js.native
  var hourlyRangeStart: Double = js.native
  var hourlyTotalPipelineTime: Double = js.native
  var hourlyUnprocessedEventDelayByPublisher: Double = js.native
  var hourlyUnprocessedEventsByPublisher: Double = js.native
  var hourlyUnprocessedNotificationDelayByChannelByPublisher: Double = js.native
  var hourlyUnprocessedNotificationsByChannelByPublisher: Double = js.native
  var notificationByEventType: Double = js.native
  var notificationByEventTypePerUser: Double = js.native
  var notificationBySubscription: Double = js.native
  var notificationFailureBySubscription: Double = js.native
  var notificationPipelineTime: Double = js.native
  var notifications: Double = js.native
  var totalPipelineTime: Double = js.native
  var unprocessedEventDelayByPublisher: Double = js.native
  var unprocessedEventsByPublisher: Double = js.native
  var unprocessedNotificationDelayByChannelByPublisher: Double = js.native
  var unprocessedNotificationsByChannelByPublisher: Double = js.native
  var unprocessedRangeStart: Double = js.native
}

object AnonDelayRangeStart {
  @scala.inline
  def apply(
    delayRangeStart: Double,
    eventPipelineTime: Double,
    events: Double,
    eventsByEventType: Double,
    eventsByEventTypePerUser: Double,
    hourlyEventPipelineTime: Double,
    hourlyEvents: Double,
    hourlyEventsByEventTypePerUser: Double,
    hourlyNotificationBySubscription: Double,
    hourlyNotificationPipelineTime: Double,
    hourlyNotifications: Double,
    hourlyRangeStart: Double,
    hourlyTotalPipelineTime: Double,
    hourlyUnprocessedEventDelayByPublisher: Double,
    hourlyUnprocessedEventsByPublisher: Double,
    hourlyUnprocessedNotificationDelayByChannelByPublisher: Double,
    hourlyUnprocessedNotificationsByChannelByPublisher: Double,
    notificationByEventType: Double,
    notificationByEventTypePerUser: Double,
    notificationBySubscription: Double,
    notificationFailureBySubscription: Double,
    notificationPipelineTime: Double,
    notifications: Double,
    totalPipelineTime: Double,
    unprocessedEventDelayByPublisher: Double,
    unprocessedEventsByPublisher: Double,
    unprocessedNotificationDelayByChannelByPublisher: Double,
    unprocessedNotificationsByChannelByPublisher: Double,
    unprocessedRangeStart: Double
  ): AnonDelayRangeStart = {
    val __obj = js.Dynamic.literal(delayRangeStart = delayRangeStart.asInstanceOf[js.Any], eventPipelineTime = eventPipelineTime.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], eventsByEventType = eventsByEventType.asInstanceOf[js.Any], eventsByEventTypePerUser = eventsByEventTypePerUser.asInstanceOf[js.Any], hourlyEventPipelineTime = hourlyEventPipelineTime.asInstanceOf[js.Any], hourlyEvents = hourlyEvents.asInstanceOf[js.Any], hourlyEventsByEventTypePerUser = hourlyEventsByEventTypePerUser.asInstanceOf[js.Any], hourlyNotificationBySubscription = hourlyNotificationBySubscription.asInstanceOf[js.Any], hourlyNotificationPipelineTime = hourlyNotificationPipelineTime.asInstanceOf[js.Any], hourlyNotifications = hourlyNotifications.asInstanceOf[js.Any], hourlyRangeStart = hourlyRangeStart.asInstanceOf[js.Any], hourlyTotalPipelineTime = hourlyTotalPipelineTime.asInstanceOf[js.Any], hourlyUnprocessedEventDelayByPublisher = hourlyUnprocessedEventDelayByPublisher.asInstanceOf[js.Any], hourlyUnprocessedEventsByPublisher = hourlyUnprocessedEventsByPublisher.asInstanceOf[js.Any], hourlyUnprocessedNotificationDelayByChannelByPublisher = hourlyUnprocessedNotificationDelayByChannelByPublisher.asInstanceOf[js.Any], hourlyUnprocessedNotificationsByChannelByPublisher = hourlyUnprocessedNotificationsByChannelByPublisher.asInstanceOf[js.Any], notificationByEventType = notificationByEventType.asInstanceOf[js.Any], notificationByEventTypePerUser = notificationByEventTypePerUser.asInstanceOf[js.Any], notificationBySubscription = notificationBySubscription.asInstanceOf[js.Any], notificationFailureBySubscription = notificationFailureBySubscription.asInstanceOf[js.Any], notificationPipelineTime = notificationPipelineTime.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], totalPipelineTime = totalPipelineTime.asInstanceOf[js.Any], unprocessedEventDelayByPublisher = unprocessedEventDelayByPublisher.asInstanceOf[js.Any], unprocessedEventsByPublisher = unprocessedEventsByPublisher.asInstanceOf[js.Any], unprocessedNotificationDelayByChannelByPublisher = unprocessedNotificationDelayByChannelByPublisher.asInstanceOf[js.Any], unprocessedNotificationsByChannelByPublisher = unprocessedNotificationsByChannelByPublisher.asInstanceOf[js.Any], unprocessedRangeStart = unprocessedRangeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelayRangeStart]
  }
  @scala.inline
  implicit class AnonDelayRangeStartOps[Self <: AnonDelayRangeStart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayRangeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayRangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventPipelineTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPipelineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsByEventType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsByEventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsByEventTypePerUser(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsByEventTypePerUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyEventPipelineTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyEventPipelineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyEvents(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyEventsByEventTypePerUser(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyEventsByEventTypePerUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyNotificationBySubscription(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyNotificationBySubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyNotificationPipelineTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyNotificationPipelineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyNotifications(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyRangeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyRangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyTotalPipelineTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyTotalPipelineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyUnprocessedEventDelayByPublisher(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyUnprocessedEventDelayByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyUnprocessedEventsByPublisher(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyUnprocessedEventsByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyUnprocessedNotificationDelayByChannelByPublisher(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyUnprocessedNotificationDelayByChannelByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourlyUnprocessedNotificationsByChannelByPublisher(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyUnprocessedNotificationsByChannelByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationByEventType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationByEventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationByEventTypePerUser(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationByEventTypePerUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationBySubscription(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationBySubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationFailureBySubscription(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationFailureBySubscription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotificationPipelineTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationPipelineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifications(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalPipelineTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPipelineTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedEventDelayByPublisher(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedEventDelayByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedEventsByPublisher(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedEventsByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedNotificationDelayByChannelByPublisher(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedNotificationDelayByChannelByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedNotificationsByChannelByPublisher(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedNotificationsByChannelByPublisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprocessedRangeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprocessedRangeStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

