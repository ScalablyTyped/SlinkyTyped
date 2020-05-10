package typingsSlinky.senchaTouch.Ext.util

import typingsSlinky.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.senchaTouch.Ext.IClass because Already inherited
- typingsSlinky.senchaTouch.Ext.IBase because Already inherited
- typingsSlinky.senchaTouch.Ext.mixin.IIdentifiable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getId, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined 
- typingsSlinky.senchaTouch.Ext.util.IObservable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bubbleEvents, listeners, addAfterListener, addBeforeListener, addEvents, addListener, addManagedListener, clearListeners, enableBubble, fireAction, fireEvent, getBubbleEvents, getId, getListeners, hasListener, mon, mun, on, onAfter, onBefore, relayEvents, removeAfterListener, removeBeforeListener, removeListener, removeManagedListener, resumeEvents, setBubbleEvents, setListeners, suspendEvents, un, unAfter, unBefore */ @js.native
trait IBufferedCollection extends ICollection {
  /** [Method] Appends an after event handler
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  var addAfterListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Appends a before event handler
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  var addBeforeListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Adds the specified events to the list of events which this Observable may fire
  		* @param eventNames Object/String... Either an object with event names as properties with a value of true or the first event name string if multiple event names are being passed as separate parameters.
  		*/
  var addEvents: js.UndefOr[js.Function1[/* eventNames */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Appends an event handler to this object
  		* @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  This object may contain any of the following properties:
  		* @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
  		*/
  var addListener: js.UndefOr[
    js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		* @param options Object If the eventName parameter was an event name, this is the addListener options.
  		*/
  var addManagedListener: js.UndefOr[
    js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String/String[]) */
  var bubbleEvents: js.UndefOr[js.Any] = js.native
  /** [Method] Removes all listeners for this object  */
  var clearListeners: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
  		* @param events String/String[] The event name to bubble, or an Array of event names.
  		*/
  var enableBubble: js.UndefOr[js.Function1[/* events */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Fires the specified event with the passed parameters and execute a function action at the end if there are no liste
  		* @param eventName String The name of the event to fire.
  		* @param args Array Arguments to pass to handers.
  		* @param fn Function Action.
  		* @param scope Object Scope of fn.
  		* @returns Object
  		*/
  var fireAction: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[String], 
      /* args */ js.UndefOr[Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
  		* @param eventName String The name of the event to fire.
  		* @param args Object... Variable number of parameters are passed to handlers.
  		* @returns Boolean Returns false if any of the handlers return false.
  		*/
  var fireEvent: js.UndefOr[js.Function2[/* eventName */ String, /* repeated */ js.Any, Boolean]] = js.native
  /** [Method] Returns the value of bubbleEvents
  		* @returns String/String[]
  		*/
  var getBubbleEvents: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Retrieves the id of this component
  		* @returns any id
  		*/
  var getId: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of listeners
  		* @returns Object
  		*/
  var getListeners: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of pageSize
  		* @returns Number
  		*/
  var getPageSize: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of totalCount
  		* @returns Number
  		*/
  var getTotalCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Checks to see if this object has any listeners for a specified event
  		* @param eventName String The name of the event to check for
  		* @returns Boolean True if the event is being listened for, else false
  		*/
  var hasListener: js.UndefOr[js.Function1[/* eventName */ js.UndefOr[String], Boolean]] = js.native
  /** [Config Option] (Object) */
  var listeners: js.UndefOr[js.Any] = js.native
  /** [Method] Alias for addManagedListener
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		* @param options Object If the eventName parameter was an event name, this is the addListener options.
  		*/
  var mon: js.UndefOr[
    js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Alias for removeManagedListener
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		*/
  var mun: js.UndefOr[
    js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Alias for addListener
  		* @param eventName String/String[]/Object The name of the event to listen for. May also be an object who's property names are event names.
  		* @param fn Function/String The method the event invokes. Will be called with arguments given to fireEvent plus the options parameter described below.
  		* @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
  		* @param options Object An object containing handler configuration.  This object may contain any of the following properties:
  		* @param order String The order of when the listener should be added into the listener queue. Possible values are before, current and after.
  		*/
  var on: js.UndefOr[
    js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Method] Alias for addAfterListener
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  var onAfter: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Alias for addBeforeListener
  		* @param eventName String/String[]/Object The name of the event to listen for.
  		* @param fn Function/String The method the event invokes.
  		* @param scope Object The scope for fn.
  		* @param options Object An object containing handler configuration.
  		*/
  var onBefore: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  var relayEvents: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], this.type]
  ] = js.native
  /** [Method] Removes a before event handler
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  var removeAfterListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Removes a before event handler
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  var removeBeforeListener: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Removes an event handler
  		* @param eventName String/String[]/Object The type of event the handler was associated with.
  		* @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
  		* @param options Object Extra options object. See addListener for details.
  		* @param order String The order of the listener to remove. Possible values are before, current and after.
  		*/
  var removeListener: js.UndefOr[
    js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Method] Adds listeners to any Observable object or Element which are automatically removed when this Component is destroyed
  		* @param object Ext.mixin.Observable/HTMLElement The item to which to add a listener/listeners.
  		* @param eventName Object/String The event name, or an object containing event name properties.
  		* @param fn Function If the eventName parameter was an event name, this is the handler function.
  		* @param scope Object If the eventName parameter was an event name, this is the scope in which the handler function is executed.
  		*/
  var removeManagedListener: js.UndefOr[
    js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Resumes firing events see suspendEvents
  		* @param discardQueuedEvents Boolean Pass as true to discard any queued events.
  		*/
  var resumeEvents: js.UndefOr[js.Function1[/* discardQueuedEvents */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of bubbleEvents
  		* @param bubbleEvents String/String[] The new value.
  		*/
  var setBubbleEvents: js.UndefOr[js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of listeners
  		* @param listeners Object The new value.
  		*/
  var setListeners: js.UndefOr[js.Function1[/* listeners */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of pageSize
  		* @param pageSize Number The new value.
  		*/
  var setPageSize: js.UndefOr[js.Function1[/* pageSize */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of totalCount
  		* @param totalCount Number The new value.
  		*/
  var setTotalCount: js.UndefOr[js.Function1[/* totalCount */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Suspends the firing of all events  */
  var suspendEvents: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Alias for removeListener
  		* @param eventName String/String[]/Object The type of event the handler was associated with.
  		* @param fn Function/String The handler to remove. This must be a reference to the function passed into the addListener call.
  		* @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to addListener or the listener will not be removed.
  		* @param options Object Extra options object. See addListener for details.
  		* @param order String The order of the listener to remove. Possible values are before, current and after.
  		*/
  var un: js.UndefOr[
    js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  /** [Method] Alias for removeAfterListener
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  var unAfter: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Alias for removeBeforeListener
  		* @param eventName String/String[]/Object The name of the event the handler was associated with.
  		* @param fn Function/String The handler to remove.
  		* @param scope Object The scope originally specified for fn.
  		* @param options Object Extra options object.
  		*/
  var unBefore: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object IBufferedCollection {
  @scala.inline
  def apply(): IBufferedCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBufferedCollection]
  }
  @scala.inline
  implicit class IBufferedCollectionOps[Self <: IBufferedCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddAfterListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAfterListener")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAddAfterListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAfterListener")(js.undefined)
        ret
    }
    @scala.inline
    def withAddBeforeListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBeforeListener")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAddBeforeListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBeforeListener")(js.undefined)
        ret
    }
    @scala.inline
    def withAddEvents(value: /* eventNames */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAddEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withAddListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAddListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addListener")(js.undefined)
        ret
    }
    @scala.inline
    def withAddManagedListener(
      value: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addManagedListener")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAddManagedListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addManagedListener")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleEvents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withClearListeners(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClearListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableBubble(value: /* events */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBubble")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnableBubble: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableBubble")(js.undefined)
        ret
    }
    @scala.inline
    def withFireAction(
      value: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireAction")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutFireAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireAction")(js.undefined)
        ret
    }
    @scala.inline
    def withFireEvent(value: (/* eventName */ String, /* repeated */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFireEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBubbleEvents(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBubbleEvents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBubbleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBubbleEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withGetId(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetListeners(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListeners")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPageSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTotalCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTotalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withHasListener(value: /* eventName */ js.UndefOr[String] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasListener")(js.undefined)
        ret
    }
    @scala.inline
    def withListeners(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(js.undefined)
        ret
    }
    @scala.inline
    def withMon(
      value: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mon")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutMon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mon")(js.undefined)
        ret
    }
    @scala.inline
    def withMun(
      value: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mun")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutMun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mun")(js.undefined)
        ret
    }
    @scala.inline
    def withOn(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAfter(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBefore(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBefore")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IBufferedCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRelayEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveAfterListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAfterListener")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRemoveAfterListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAfterListener")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveBeforeListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBeforeListener")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRemoveBeforeListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeBeforeListener")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveListener(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutRemoveListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeListener")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveManagedListener(
      value: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeManagedListener")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRemoveManagedListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeManagedListener")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeEvents(value: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResumeEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBubbleEvents(value: /* bubbleEvents */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBubbleEvents")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBubbleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBubbleEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withSetListeners(value: /* listeners */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setListeners")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setListeners")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPageSize(value: /* pageSize */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPageSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSetTotalCount(value: /* totalCount */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTotalCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTotalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTotalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspendEvents(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendEvents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSuspendEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspendEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withUn(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("un")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutUn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("un")(js.undefined)
        ret
    }
    @scala.inline
    def withUnAfter(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unAfter")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutUnAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withUnBefore(
      value: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unBefore")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutUnBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unBefore")(js.undefined)
        ret
    }
  }
  
}

