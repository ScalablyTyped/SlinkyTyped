package typingsSlinky.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Helper
  type IBankAccount = typingsSlinky.stripe.mod.bankAccounts.IBankAccount
  type ICard = typingsSlinky.stripe.mod.cards.ICard
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
