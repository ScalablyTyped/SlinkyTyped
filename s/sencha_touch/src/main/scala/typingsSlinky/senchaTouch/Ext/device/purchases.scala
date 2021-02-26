package typingsSlinky.senchaTouch.Ext.device

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.IBase
import typingsSlinky.senchaTouch.Ext.data.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object purchases {
  
  @js.native
  trait IProduct extends IModel {
    
    /** [Method] Returns the value of fields
      * @returns Array
      */
    @JSName("getFields")
    var getFields_IProduct: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Will attempt to purchase this product
      * @param config Object
      */
    var purchase: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of fields
      * @param fields Array The new value.
      */
    @JSName("setFields")
    var setFields_IProduct: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Unit]] = js.native
  }
  object IProduct {
    
    @scala.inline
    def apply(): IProduct = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProduct]
    }
    
    @scala.inline
    implicit class IProductMutableBuilder[Self <: IProduct] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFields(value: () => Array): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFieldsUndefined: Self = StObject.set(x, "getFields", js.undefined)
      
      @scala.inline
      def setPurchase(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "purchase", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPurchaseUndefined: Self = StObject.set(x, "purchase", js.undefined)
      
      @scala.inline
      def setSetFields(value: /* fields */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFieldsUndefined: Self = StObject.set(x, "setFields", js.undefined)
    }
  }
  
  @js.native
  trait IPurchase extends IModel {
    
    /** [Method] Attempts to mark this purchase as complete
      * @param config Object
      */
    var complete: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Returns the value of fields
      * @returns Array
      */
    @JSName("getFields")
    var getFields_IPurchase: js.UndefOr[js.Function0[Array]] = js.native
    
    /** [Method] Sets the value of fields
      * @param fields Array The new value.
      */
    @JSName("setFields")
    var setFields_IPurchase: js.UndefOr[js.Function1[/* fields */ js.UndefOr[Array], Unit]] = js.native
  }
  object IPurchase {
    
    @scala.inline
    def apply(): IPurchase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPurchase]
    }
    
    @scala.inline
    implicit class IPurchaseMutableBuilder[Self <: IPurchase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setGetFields(value: () => Array): Self = StObject.set(x, "getFields", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFieldsUndefined: Self = StObject.set(x, "getFields", js.undefined)
      
      @scala.inline
      def setSetFields(value: /* fields */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFieldsUndefined: Self = StObject.set(x, "setFields", js.undefined)
    }
  }
  
  @js.native
  trait ISencha extends IBase {
    
    /** [Method] Checks if the current user is able to make payments
      * @param config Object
      */
    var canMakePayments: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Returns a Ext data Store instance of all purchases delivered to the current user
      * @param config Object
      */
    var getCompletedPurchases: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Returns a Ext data Store instance of all products available to purchase
      * @param config Object
      */
    var getProducts: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Returns a Ext data Store instance of all purchases the current user has been charged
      * @param config Object
      */
    var getPurchases: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
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
      def setCanMakePayments(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "canMakePayments", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanMakePaymentsUndefined: Self = StObject.set(x, "canMakePayments", js.undefined)
      
      @scala.inline
      def setGetCompletedPurchases(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getCompletedPurchases", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCompletedPurchasesUndefined: Self = StObject.set(x, "getCompletedPurchases", js.undefined)
      
      @scala.inline
      def setGetProducts(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getProducts", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetProductsUndefined: Self = StObject.set(x, "getProducts", js.undefined)
      
      @scala.inline
      def setGetPurchases(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getPurchases", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPurchasesUndefined: Self = StObject.set(x, "getPurchases", js.undefined)
    }
  }
}
