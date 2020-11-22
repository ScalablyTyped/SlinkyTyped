package typingsSlinky.tizenTvWebapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object billingMod {
  
  type BillingApplyInvoiceCallback = js.Function1[/* data */ typingsSlinky.tizenTvWebapis.billingMod.ApplyInvoiceData, scala.Unit]
  
  type BillingBuyDataSuccessCallback = js.Function1[/* data */ typingsSlinky.tizenTvWebapis.billingMod.BillingBuyData, scala.Unit]
  
  type BillingCancelSubscriptionCallback = js.Function1[
    /* data */ typingsSlinky.tizenTvWebapis.billingMod.CancelSubscriptionData, 
    scala.Unit
  ]
  
  type BillingGetServiceCountryAvailabilityCallback = js.Function1[
    /* data */ typingsSlinky.tizenTvWebapis.billingMod.ServiceCountryAvailabilityData, 
    scala.Unit
  ]
  
  type BillingGetUserPurchaseListCallback = js.Function1[/* data */ typingsSlinky.tizenTvWebapis.billingMod.UserPurchaseData, scala.Unit]
  
  type BillingIsServiceAvailableCallback = js.Function1[
    /* data */ typingsSlinky.tizenTvWebapis.billingMod.ServiceAvailableData, 
    scala.Unit
  ]
  
  type BillingProductsListCallback = js.Function1[/* data */ typingsSlinky.tizenTvWebapis.billingMod.ProductsListData, scala.Unit]
  
  type BillingVerifyInvoiceCallback = js.Function1[/* data */ typingsSlinky.tizenTvWebapis.billingMod.VerifyInvoiceData, scala.Unit]
}
