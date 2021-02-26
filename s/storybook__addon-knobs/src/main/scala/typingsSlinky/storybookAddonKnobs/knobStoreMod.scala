package typingsSlinky.storybookAddonKnobs

import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import typingsSlinky.storybookAddonKnobs.anon.DefaultValue
import typingsSlinky.storybookAddonKnobs.anon.typeanygroupIdstringundef
import typingsSlinky.storybookAddonKnobs.typeDefsMod.Knob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object knobStoreMod {
  
  @JSImport("@storybook/addon-knobs/dist/KnobStore", JSImport.Default)
  @js.native
  class default () extends KnobStore
  
  type Callback = js.Function0[js.Any]
  
  @js.native
  trait KnobStore extends StObject {
    
    var callbacks: js.Array[Callback] = js.native
    
    def get(key: String): typeanygroupIdstringundef | DefaultValue = js.native
    
    def getAll(): Record[String, KnobStoreKnob] = js.native
    
    def has(key: String): Boolean = js.native
    
    def markAllUnused(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def set(key: String, value: KnobStoreKnob): Unit = js.native
    
    var store: Record[String, KnobStoreKnob] = js.native
    
    def subscribe(cb: Callback): Unit = js.native
    
    var timer: js.UndefOr[Double] = js.native
    
    def unsubscribe(cb: Callback): Unit = js.native
    
    def update(key: String, options: Partial[KnobStoreKnob]): Unit = js.native
  }
  object KnobStore {
    
    @scala.inline
    def apply(
      callbacks: js.Array[Callback],
      get: String => typeanygroupIdstringundef | DefaultValue,
      getAll: () => Record[String, KnobStoreKnob],
      has: String => Boolean,
      markAllUnused: () => Unit,
      reset: () => Unit,
      set: (String, KnobStoreKnob) => Unit,
      store: Record[String, KnobStoreKnob],
      subscribe: Callback => Unit,
      unsubscribe: Callback => Unit,
      update: (String, Partial[KnobStoreKnob]) => Unit
    ): KnobStore = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction0(getAll), has = js.Any.fromFunction1(has), markAllUnused = js.Any.fromFunction0(markAllUnused), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction2(set), store = store.asInstanceOf[js.Any], subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[KnobStore]
    }
    
    @scala.inline
    implicit class KnobStoreMutableBuilder[Self <: KnobStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: js.Array[Callback]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksVarargs(value: Callback*): Self = StObject.set(x, "callbacks", js.Array(value :_*))
      
      @scala.inline
      def setGet(value: String => typeanygroupIdstringundef | DefaultValue): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAll(value: () => Record[String, KnobStoreKnob]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMarkAllUnused(value: () => Unit): Self = StObject.set(x, "markAllUnused", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: (String, KnobStoreKnob) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStore(value: Record[String, KnobStoreKnob]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscribe(value: Callback => Unit): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
      
      @scala.inline
      def setUnsubscribe(value: Callback => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: (String, Partial[KnobStoreKnob]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  type KnobStoreKnob = Knob[_] with typingsSlinky.storybookAddonKnobs.anon.Callback
}
