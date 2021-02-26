package typingsSlinky.senchaTouch.Ext.device

import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object media {
  
  @js.native
  trait IAbstract extends IObservable {
    
    /** [Method] Returns the value of src
      * @returns Object
      */
    var getSrc: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IAbstract: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
      ] = js.native
    
    /** [Method] Sets the value of src
      * @param src Object The new value.
      */
    var setSrc: js.UndefOr[js.Function1[/* src */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IAbstract {
    
    @scala.inline
    def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    @scala.inline
    implicit class IAbstractMutableBuilder[Self <: IAbstract] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetSrc(value: () => _): Self = StObject.set(x, "getSrc", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSrcUndefined: Self = StObject.set(x, "getSrc", js.undefined)
      
      @scala.inline
      def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      @scala.inline
      def setSetSrc(value: /* src */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setSrc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSrcUndefined: Self = StObject.set(x, "setSrc", js.undefined)
    }
  }
  
  @js.native
  trait ICordova extends IAbstract {
    
    /** [Property] (String) */
    var src: js.UndefOr[String] = js.native
  }
  object ICordova {
    
    @scala.inline
    def apply(): ICordova = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICordova]
    }
    
    @scala.inline
    implicit class ICordovaMutableBuilder[Self <: ICordova] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  @js.native
  trait IPhoneGap extends IAbstract {
    
    /** [Property] (String) */
    var src: js.UndefOr[String] = js.native
  }
  object IPhoneGap {
    
    @scala.inline
    def apply(): IPhoneGap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPhoneGap]
    }
    
    @scala.inline
    implicit class IPhoneGapMutableBuilder[Self <: IPhoneGap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
