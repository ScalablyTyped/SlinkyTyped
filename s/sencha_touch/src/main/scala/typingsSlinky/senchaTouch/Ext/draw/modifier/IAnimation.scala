package typingsSlinky.senchaTouch.Ext.draw.modifier

import typingsSlinky.senchaTouch.Ext.draw.sprite.ISprite
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.senchaTouch.Ext.IClass because Already inherited
- typingsSlinky.senchaTouch.Ext.IBase because Already inherited
- typingsSlinky.senchaTouch.Ext.draw.modifier.IModifier because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined next, previous, sprite, getNext, getPrevious, getSprite, popUp, prepareAttributes, pushDown, setNext, setPrevious, setSprite */ @js.native
trait IAnimation extends IObservable {
  /** [Method] Remove special easings on the given attributes
  		* @param attrs Object The source attributes.
  		*/
  var clearDurationOn: js.UndefOr[js.Function1[/* attrs */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Remove special easings on the given attributes
  		* @param attrs String/Array The source attribute(s).
  		*/
  var clearEasingOn: js.UndefOr[js.Function1[/* attrs */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var customDuration: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var customEasings: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var duration: js.UndefOr[Double] = js.native
  /** [Config Option] (Function) */
  var easing: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of customDuration
  		* @returns Object
  		*/
  var getCustomDuration: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of customEasings
  		* @returns Object
  		*/
  var getCustomEasings: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of duration
  		* @returns Number
  		*/
  var getDuration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of easing
  		* @returns Function
  		*/
  var getEasing: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of next
  		* @returns Ext.draw.modifier.Modifier
  		*/
  var getNext: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Returns the value of previous
  		* @returns Ext.draw.modifier.Modifier
  		*/
  var getPrevious: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Method] Returns the value of sprite
  		* @returns Ext.draw.sprite.Sprite
  		*/
  var getSprite: js.UndefOr[js.Function0[ISprite]] = js.native
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var next: js.UndefOr[IModifier] = js.native
  /** [Method] Invoked when changes need to be popped up to the top
  		* @param attributes Object The source attributes.
  		* @param changes Object The changes to be popped up.
  		*/
  var popUp: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Validate attribute set before use
  		* @param attr Object The attribute to be validated. Note that it may be already initialized, so do not override properties that have already been used.
  		*/
  var prepareAttributes: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var previous: js.UndefOr[IModifier] = js.native
  /** [Method] Invoked when changes need to be pushed down to the sprite
  		* @param attr Object The source attributes.
  		* @param changes Object The changes to make. This object might be changed unexpectedly inside the method.
  		* @returns Mixed
  		*/
  var pushDown: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], _]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IAnimation: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Sets the value of customDuration
  		* @param customDuration Object The new value.
  		*/
  var setCustomDuration: js.UndefOr[js.Function1[/* customDuration */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of customEasings
  		* @param customEasings Object The new value.
  		*/
  var setCustomEasings: js.UndefOr[js.Function1[/* customEasings */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of duration
  		* @param duration Number The new value.
  		*/
  var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Set special duration on the given attributes
  		* @param attrs String/Array The source attributes.
  		* @param duration Number The special duration.
  		*/
  var setDurationOn: js.UndefOr[
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* duration */ js.UndefOr[Double], Unit]
  ] = js.native
  /** [Method] Sets the value of easing
  		* @param easing Function The new value.
  		*/
  var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Set special easings on the given attributes
  		* @param attrs String/Array The source attribute(s).
  		* @param easing String The special easings.
  		*/
  var setEasingOn: js.UndefOr[
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* easing */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] Sets the value of next
  		* @param next Ext.draw.modifier.Modifier The new value.
  		*/
  var setNext: js.UndefOr[js.Function1[/* next */ js.UndefOr[this.type], Unit]] = js.native
  /** [Method] Sets the value of previous
  		* @param previous Ext.draw.modifier.Modifier The new value.
  		*/
  var setPrevious: js.UndefOr[js.Function1[/* previous */ js.UndefOr[this.type], Unit]] = js.native
  /** [Method] Sets the value of sprite
  		* @param sprite Ext.draw.sprite.Sprite The new value.
  		*/
  var setSprite: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.native
  /** [Config Option] (Ext.draw.sprite.Sprite) */
  var sprite: js.UndefOr[ISprite] = js.native
  /** [Method] Stop all animations effected by this modifier */
  var stop: js.UndefOr[js.Function0[Unit]] = js.native
}

object IAnimation {
  @scala.inline
  def apply(): IAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimation]
  }
  @scala.inline
  implicit class IAnimationOps[Self <: IAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearDurationOn(value: /* attrs */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearDurationOn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClearDurationOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearDurationOn")(js.undefined)
        ret
    }
    @scala.inline
    def withClearEasingOn(value: /* attrs */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearEasingOn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClearEasingOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearEasingOn")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDuration(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomEasings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEasings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomEasings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEasings")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCustomDuration(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCustomDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCustomEasings(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomEasings")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetCustomEasings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCustomEasings")(js.undefined)
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
    def withGetEasing(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEasing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNext(value: () => IAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNext")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPrevious(value: () => IAnimation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrevious")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrevious")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSprite(value: () => ISprite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSprite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSprite")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: IModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withPopUp(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popUp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPopUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popUp")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepareAttributes(value: js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareAttributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPrepareAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepareAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevious(value: IModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(js.undefined)
        ret
    }
    @scala.inline
    def withPushDown(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPushDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushDown")(js.undefined)
        ret
    }
    @scala.inline
    def withRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = {
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
    def withSetCustomDuration(value: /* customDuration */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCustomDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCustomDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCustomDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSetCustomEasings(value: /* customEasings */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCustomEasings")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetCustomEasings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCustomEasings")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDurationOn(value: (/* attrs */ js.UndefOr[js.Any], /* duration */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDurationOn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetDurationOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDurationOn")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEasing(value: /* easing */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEasing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEasingOn(value: (/* attrs */ js.UndefOr[js.Any], /* easing */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEasingOn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetEasingOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEasingOn")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNext(value: /* next */ js.UndefOr[IAnimation] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNext")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPrevious(value: /* previous */ js.UndefOr[IAnimation] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrevious")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrevious")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSprite(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSprite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSprite")(js.undefined)
        ret
    }
    @scala.inline
    def withSprite(value: ISprite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSprite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sprite")(js.undefined)
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
  }
  
}

