package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Header options can either be a Connect Account Secret Key,
    * or a hash with one or more of these keys: idempotency_key, stripe_account, api_key
    */
  type HeaderOptions = typingsSlinky.stripe.mod.IHeaderOptions | java.lang.String
  
  // Helper
  type IBankAccount = typingsSlinky.stripe.mod.bankAccounts.IBankAccount
  
  type ICard = typingsSlinky.stripe.mod.cards.ICard
  
  /**
    * A filter on the list based on this object field. The value can
    * be a string with an integer Unix timestamp, or it can be a
    * dictionary with the following options:
    */
  type IDateFilter = java.lang.String | typingsSlinky.stripe.anon.Gt
  
  /**
    * A set of key/value pairs that you can attach to an object. It can be useful for storing
    * additional information about the object in a structured format.
    */
  type IMetadata = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  /**
    * A set of key/value pairs that you can attach to an object. It can be useful for storing
    * additional information about the object in a structured format.
    */
  type IOptionsMetadata = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  
  type IResponseFn[R] = js.Function2[/* err */ typingsSlinky.stripe.mod.IStripeError, /* value */ R, scala.Unit]
  
  type ISource = typingsSlinky.stripe.mod.sources.ISource
}
