package typingsSlinky.titanium.Titanium.Network

import typingsSlinky.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BonjourServiceEventMap extends ProxyEventMap {
  var publish: BonjourServicePublishEvent = js.native
  var resolve: BonjourServiceResolveEvent = js.native
  var stop: BonjourServiceStopEvent = js.native
}

object BonjourServiceEventMap {
  @scala.inline
  def apply(
    publish: BonjourServicePublishEvent,
    resolve: BonjourServiceResolveEvent,
    stop: BonjourServiceStopEvent
  ): BonjourServiceEventMap = {
    val __obj = js.Dynamic.literal(publish = publish.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourServiceEventMap]
  }
  @scala.inline
  implicit class BonjourServiceEventMapOps[Self <: BonjourServiceEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublish(value: BonjourServicePublishEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResolve(value: BonjourServiceResolveEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: BonjourServiceStopEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

