package typingsSlinky.zoneJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a way to configure the interception of zone events.
  *
  * Only the `name` property is required (all other are optional).
  */
@js.native
trait ZoneSpec extends js.Object {
  /**
    * The name of the zone. Useful when debugging Zones.
    */
  var name: String = js.native
  /**
    * Allows interception of task cancellation.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param task The argument passed into the `cancelTask` method.
    */
  var onCancelTask: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* task */ Task, 
      _
    ]
  ] = js.native
  /**
    * Allows the interception of zone forking.
    *
    * When the zone is being forked, the request is forwarded to this method for interception.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param zoneSpec The argument passed into the `fork` method.
    */
  var onFork: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* zoneSpec */ ZoneSpec, 
      Zone
    ]
  ] = js.native
  /**
    * Allows interception of the error handling.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param error The argument passed into the `handleError` method.
    */
  var onHandleError: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* error */ js.Any, 
      Boolean
    ]
  ] = js.native
  /**
    * Notifies of changes to the task queue empty status.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param hasTaskState
    */
  var onHasTask: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* hasTaskState */ HasTaskState, 
      Unit
    ]
  ] = js.native
  /**
    * Allows interception of the wrapping of the callback.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param delegate The argument passed into the `wrap` method.
    * @param source The argument passed into the `wrap` method.
    */
  var onIntercept: js.UndefOr[
    js.Function5[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* delegate */ js.Function, 
      /* source */ String, 
      js.Function
    ]
  ] = js.native
  /**
    * Allows interception of the callback invocation.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param delegate The argument passed into the `run` method.
    * @param applyThis The argument passed into the `run` method.
    * @param applyArgs The argument passed into the `run` method.
    * @param source The argument passed into the `run` method.
    */
  var onInvoke: js.UndefOr[
    js.Function7[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* delegate */ js.Function, 
      /* applyThis */ js.Any, 
      /* applyArgs */ js.UndefOr[js.Array[_]], 
      /* source */ js.UndefOr[String], 
      _
    ]
  ] = js.native
  var onInvokeTask: js.UndefOr[
    js.Function6[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* task */ Task, 
      /* applyThis */ js.Any, 
      /* applyArgs */ js.UndefOr[js.Array[_]], 
      _
    ]
  ] = js.native
  /**
    * Allows interception of task scheduling.
    *
    * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
    * @param currentZone The current [Zone] where the current interceptor has been declared.
    * @param targetZone The [Zone] which originally received the request.
    * @param task The argument passed into the `scheduleTask` method.
    */
  var onScheduleTask: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* task */ Task, 
      Task
    ]
  ] = js.native
  /**
    * A set of properties to be associated with Zone. Use [Zone.get] to retrieve them.
    */
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object ZoneSpec {
  @scala.inline
  def apply(name: String): ZoneSpec = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneSpec]
  }
  @scala.inline
  implicit class ZoneSpecOps[Self <: ZoneSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnCancelTask(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* task */ Task) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancelTask")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnCancelTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCancelTask")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFork(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* zoneSpec */ ZoneSpec) => Zone
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFork")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnFork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFork")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHandleError(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* error */ js.Any) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHandleError")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnHandleError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHandleError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHasTask(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* hasTaskState */ HasTaskState) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHasTask")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnHasTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHasTask")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIntercept(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* delegate */ js.Function, /* source */ String) => js.Function
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIntercept")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnIntercept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIntercept")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvoke(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* delegate */ js.Function, /* applyThis */ js.Any, /* applyArgs */ js.UndefOr[js.Array[_]], /* source */ js.UndefOr[String]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvoke")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withoutOnInvoke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvoke")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvokeTask(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* task */ Task, /* applyThis */ js.Any, /* applyArgs */ js.UndefOr[js.Array[_]]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvokeTask")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withoutOnInvokeTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvokeTask")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScheduleTask(
      value: (/* parentZoneDelegate */ ZoneDelegate, /* currentZone */ Zone, /* targetZone */ Zone, /* task */ Task) => Task
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScheduleTask")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnScheduleTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScheduleTask")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

