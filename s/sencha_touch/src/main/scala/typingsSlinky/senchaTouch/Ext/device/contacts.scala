package typingsSlinky.senchaTouch.Ext.device

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contacts {
  
  @js.native
  trait IAbstract extends IObservable {
    
    /** [Method] Returns an Array of contact objects
      * @param config Object
      * @returns Object[] An array of contact objects.
      */
    var getContacts: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Array]] = js.native
    
    /** [Method] Returns the value of includeImages
      * @returns Boolean
      */
    var getIncludeImages: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns localized user readable label for a contact field i e
      * @param config Object
      * @returns String user readable string
      */
    var getLocalizedLabel: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], String]] = js.native
    
    /** [Method] Returns base64 encoded image thumbnail for a contact specified in config id This method is for Sencha Native Packager
      * @param config Object
      * @returns String base64 string
      */
    var getThumbnail: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], String]] = js.native
    
    /** [Config Option] (Boolean) */
    var includeImages: js.UndefOr[Boolean] = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IAbstract: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
      ] = js.native
    
    /** [Method] Sets the value of includeImages
      * @param includeImages Boolean The new value.
      */
    var setIncludeImages: js.UndefOr[js.Function1[/* includeImages */ js.UndefOr[Boolean], Unit]] = js.native
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
      def setGetContacts(value: /* config */ js.UndefOr[js.Any] => Array): Self = StObject.set(x, "getContacts", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetContactsUndefined: Self = StObject.set(x, "getContacts", js.undefined)
      
      @scala.inline
      def setGetIncludeImages(value: () => Boolean): Self = StObject.set(x, "getIncludeImages", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIncludeImagesUndefined: Self = StObject.set(x, "getIncludeImages", js.undefined)
      
      @scala.inline
      def setGetLocalizedLabel(value: /* config */ js.UndefOr[js.Any] => String): Self = StObject.set(x, "getLocalizedLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLocalizedLabelUndefined: Self = StObject.set(x, "getLocalizedLabel", js.undefined)
      
      @scala.inline
      def setGetThumbnail(value: /* config */ js.UndefOr[js.Any] => String): Self = StObject.set(x, "getThumbnail", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetThumbnailUndefined: Self = StObject.set(x, "getThumbnail", js.undefined)
      
      @scala.inline
      def setIncludeImages(value: Boolean): Self = StObject.set(x, "includeImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeImagesUndefined: Self = StObject.set(x, "includeImages", js.undefined)
      
      @scala.inline
      def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      @scala.inline
      def setSetIncludeImages(value: /* includeImages */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setIncludeImages", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetIncludeImagesUndefined: Self = StObject.set(x, "setIncludeImages", js.undefined)
    }
  }
  
  @js.native
  trait ICordova extends IAbstract
  object ICordova {
    
    @scala.inline
    def apply(): ICordova = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICordova]
    }
  }
  
  @js.native
  trait IPhoneGap extends IAbstract
  object IPhoneGap {
    
    @scala.inline
    def apply(): IPhoneGap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPhoneGap]
    }
  }
  
  @js.native
  trait ISencha extends IAbstract
  object ISencha {
    
    @scala.inline
    def apply(): ISencha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISencha]
    }
  }
}
