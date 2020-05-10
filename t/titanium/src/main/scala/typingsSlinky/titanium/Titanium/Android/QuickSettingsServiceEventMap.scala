package typingsSlinky.titanium.Titanium.Android

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickSettingsServiceEventMap extends ProxyEventMap {
  var pause: QuickSettingsServicePauseEvent = js.native
  var resume: QuickSettingsServiceResumeEvent = js.native
  var start: QuickSettingsServiceStartEvent = js.native
  var startlistening: QuickSettingsServiceStartlisteningEvent = js.native
  var stop: QuickSettingsServiceStopEvent = js.native
  var stoplistening: QuickSettingsServiceStoplisteningEvent = js.native
  var taskremoved: QuickSettingsServiceTaskremovedEvent = js.native
  var tileadded: QuickSettingsServiceTileaddedEvent = js.native
  var tiledialogcancelled: QuickSettingsServiceTiledialogcancelledEvent = js.native
  var tiledialognegative: QuickSettingsServiceTiledialognegativeEvent = js.native
  var tiledialogneutral: QuickSettingsServiceTiledialogneutralEvent = js.native
  var tiledialogoptionselected: QuickSettingsServiceTiledialogoptionselectedEvent = js.native
  var tiledialogpositive: QuickSettingsServiceTiledialogpositiveEvent = js.native
  var tileremoved: QuickSettingsServiceTileremovedEvent = js.native
}

object QuickSettingsServiceEventMap {
  @scala.inline
  def apply(
    pause: QuickSettingsServicePauseEvent,
    resume: QuickSettingsServiceResumeEvent,
    start: QuickSettingsServiceStartEvent,
    startlistening: QuickSettingsServiceStartlisteningEvent,
    stop: QuickSettingsServiceStopEvent,
    stoplistening: QuickSettingsServiceStoplisteningEvent,
    taskremoved: QuickSettingsServiceTaskremovedEvent,
    tileadded: QuickSettingsServiceTileaddedEvent,
    tiledialogcancelled: QuickSettingsServiceTiledialogcancelledEvent,
    tiledialognegative: QuickSettingsServiceTiledialognegativeEvent,
    tiledialogneutral: QuickSettingsServiceTiledialogneutralEvent,
    tiledialogoptionselected: QuickSettingsServiceTiledialogoptionselectedEvent,
    tiledialogpositive: QuickSettingsServiceTiledialogpositiveEvent,
    tileremoved: QuickSettingsServiceTileremovedEvent
  ): QuickSettingsServiceEventMap = {
    val __obj = js.Dynamic.literal(pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startlistening = startlistening.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], stoplistening = stoplistening.asInstanceOf[js.Any], taskremoved = taskremoved.asInstanceOf[js.Any], tileadded = tileadded.asInstanceOf[js.Any], tiledialogcancelled = tiledialogcancelled.asInstanceOf[js.Any], tiledialognegative = tiledialognegative.asInstanceOf[js.Any], tiledialogneutral = tiledialogneutral.asInstanceOf[js.Any], tiledialogoptionselected = tiledialogoptionselected.asInstanceOf[js.Any], tiledialogpositive = tiledialogpositive.asInstanceOf[js.Any], tileremoved = tileremoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickSettingsServiceEventMap]
  }
  @scala.inline
  implicit class QuickSettingsServiceEventMapOps[Self <: QuickSettingsServiceEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPause(value: QuickSettingsServicePauseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResume(value: QuickSettingsServiceResumeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: QuickSettingsServiceStartEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartlistening(value: QuickSettingsServiceStartlisteningEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startlistening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: QuickSettingsServiceStopEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoplistening(value: QuickSettingsServiceStoplisteningEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoplistening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaskremoved(value: QuickSettingsServiceTaskremovedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taskremoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileadded(value: QuickSettingsServiceTileaddedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileadded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiledialogcancelled(value: QuickSettingsServiceTiledialogcancelledEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiledialogcancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiledialognegative(value: QuickSettingsServiceTiledialognegativeEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiledialognegative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiledialogneutral(value: QuickSettingsServiceTiledialogneutralEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiledialogneutral")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiledialogoptionselected(value: QuickSettingsServiceTiledialogoptionselectedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiledialogoptionselected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiledialogpositive(value: QuickSettingsServiceTiledialogpositiveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiledialogpositive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileremoved(value: QuickSettingsServiceTileremovedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileremoved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

