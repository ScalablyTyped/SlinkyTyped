package typingsSlinky.senchaTouch.Ext.device

import typingsSlinky.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notification {
  
  @js.native
  trait IAbstract extends IBase {
    
    /** [Method] A simple way to show a notification
      * @param config Object An object which contains the following config options:
      */
    var show: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Vibrates the device  */
    var vibrate: js.UndefOr[js.Function0[Unit]] = js.native
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
      def setShow(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setVibrate(value: () => Unit): Self = StObject.set(x, "vibrate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
    }
  }
  
  @js.native
  trait ICordova extends IAbstract {
    
    /** [Method] Vibrates the device
      * @param time Object
      */
    @JSName("vibrate")
    var vibrate_ICordova: js.UndefOr[js.Function1[/* time */ js.UndefOr[js.Any], Unit]] = js.native
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
      def setVibrate(value: /* time */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "vibrate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
    }
  }
  
  @js.native
  trait IPhoneGap extends IAbstract {
    
    /** [Method] Vibrates the device
      * @param time Object
      */
    @JSName("vibrate")
    var vibrate_IPhoneGap: js.UndefOr[js.Function1[/* time */ js.UndefOr[js.Any], Unit]] = js.native
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
      def setVibrate(value: /* time */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "vibrate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVibrateUndefined: Self = StObject.set(x, "vibrate", js.undefined)
    }
  }
  
  @js.native
  trait ISencha extends IAbstract {
    
    /** [Method] A simple way to show a notification  */
    @JSName("show")
    var show_ISencha: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object ISencha {
    
    @scala.inline
    def apply(): ISencha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISencha]
    }
    
    @scala.inline
    implicit class ISenchaMutableBuilder[Self <: ISencha] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
  
  @js.native
  trait ISimulator extends IAbstract {
    
    /** [Method] A simple way to show a notification  */
    @JSName("show")
    var show_ISimulator: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object ISimulator {
    
    @scala.inline
    def apply(): ISimulator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISimulator]
    }
    
    @scala.inline
    implicit class ISimulatorMutableBuilder[Self <: ISimulator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    }
  }
}
